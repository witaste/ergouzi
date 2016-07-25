package cn.zno.weixin.util;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.chanjar.weixin.common.util.crypto.SHA1;

/**
 * 消息工具类
 * 
 */
public class WeixinUtils {

	private final static Logger logger = LoggerFactory.getLogger(WeixinUtils.class);

	/**
	 * <p>
	 * 验证签名
	 * </p>
	 * 
	 * 1）将token、timestamp、nonce三个参数进行字典序排序<br>
	 * 2）将三个参数字符串拼接成一个字符串进行sha1加密<br>
	 * 3）开发者获得加密后的字符串可与signature对比，标识该请求来源于微信<br>
	 * 
	 * @param token
	 * @param timestamp
	 * @param nonce
	 * @param signature
	 * @return boolean
	 */
	public static boolean checkSignature(String token, String timestamp, String nonce, String signature) {
		
		if (token == null || timestamp == null || nonce == null || signature == null)
			return false;
		
		String[] tmpArr = new String[] { token, timestamp, nonce };
		String tmpStr = null;
		try {
			tmpStr = SHA1.gen(tmpArr);
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage(), e);
		}
		if (tmpStr != null && tmpStr.equals(signature)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 解析微信发来的请求（XML）
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> parseXml(HttpServletRequest request) throws IOException {
		ServletInputStream inputStream = request.getInputStream();
		SAXReader reader = new SAXReader();
		Map<String, String> resultMap = null;
		try {
			// 这个 doc 不会是 null
			Document document = reader.read(inputStream);
			Element rootElement = document.getRootElement();
			List<Element> eList = rootElement.elements();
			resultMap = new HashMap<String, String>();
			for (Element e : eList) {
				resultMap.put(e.getName(), e.getText());
			}
			logger.debug(resultMap.get("Content"));
		} catch (DocumentException e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (inputStream != null)
				inputStream.close();
		}
		return resultMap;
	}

}
