package cn.zno.weixin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zno.weixin.service.WeixinService;
import cn.zno.weixin.util.WeixinUtils;

@Controller
public class WeixinController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private WeixinService weixinService;

	/**
	 *<p>桥</p> 
	 * 
	 * 一、接入微信<br>
	 * 二、与用户消息交互<br>
	 * 
	 * @throws IOException
	 * 
	 * @see https://mp.weixin.qq.com/wiki
	 */
	@RequestMapping(value = "/wx/server.do")
	public void server(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		String method = request.getMethod();
		String toPrint = null;

		// *********************************************************************************
		// * 开发者提交信息后，微信服务器将发送GET请求到填写的服务器地址URL上，GET请求携带参数如下表所示：
		// *********************************************************************************

		if (method.equals(HttpGet.METHOD_NAME)) {
			// 接入参数
			String token = "ttttttttta";
			String timestamp = request.getParameter("timestamp");
			String nonce = request.getParameter("nonce");
			String signature = request.getParameter("signature");
			String echostr = request.getParameter("echostr");
			boolean passed = WeixinUtils.checkSignature(token, timestamp, nonce, signature);
			// 验证通过
			if (passed) {
				toPrint = echostr;
			}
		}

		// ****************************************************************************
		// * 当普通微信用户向公众账号发消息时，微信服务器将POST消息的XML数据包到开发者填写的URL上。
		// ****************************************************************************

		else if (method.equals(HttpPost.METHOD_NAME)) {
			// xml 转 map
			Map<String, String> paramMap = WeixinUtils.parseXml(request);
			// 业务处理
			weixinService.handleMsg(paramMap);
			toPrint = paramMap.get("result");
		}

		logger.debug(toPrint);
		
		try {
			if (toPrint != null && !"".equals(toPrint)) {
				out.print(toPrint);
			}
		} finally {
			out.close();
		}

	}
}
