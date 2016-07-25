package cn.zno.weixin.service;

import java.util.Map;

public interface WeixinService {

	/**
	 * 处理微信消息业务
	 * 
	 * @param requestMap
	 * 
	 */
	void handleMsg(Map<String, String> requestMap);
	
}
