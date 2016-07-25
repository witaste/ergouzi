package cn.zno.weixin.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zno.weixin.service.WeixinMsgService;
import cn.zno.weixin.service.WeixinService;
import me.chanjar.weixin.common.api.WxConsts;

@Service
public class WeixinServiceImpl implements WeixinService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private WeixinMsgService weixinMsgService;

	/**
	 * @see https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140453&token=&lang=zh_CN
	 * */
	public void handleMsg(Map<String, String> requestMap) {
		
		logger.debug(requestMap.toString());
		
		boolean isEvent = requestMap.containsKey("Event");
		// ∮接收事件推送 
		if(isEvent){
			String Event = requestMap.get("Event");
			if(WxConsts.EVT_SUBSCRIBE.equals(Event)){
				
			}else if (WxConsts.EVT_UNSUBSCRIBE.equals(Event)){
				
			}else if (WxConsts.EVT_SCAN.equals(Event)){
				
			}else if (WxConsts.EVT_CLICK.equals(Event)){
				
			}else if (WxConsts.EVT_VIEW.equals(Event)){
				
			}
		}
		// ∮接收普通消息
		else{
			String MsgType = requestMap.get("MsgType");
			if(WxConsts.XML_MSG_TEXT.equals(MsgType)){
				this.handleText(requestMap);
			}else if (WxConsts.XML_MSG_IMAGE.equals(MsgType)){
				
			}
		}
	}

	
	private void handleText(Map<String, String> requestMap){
		weixinMsgService.handleText(requestMap);
	}
}
