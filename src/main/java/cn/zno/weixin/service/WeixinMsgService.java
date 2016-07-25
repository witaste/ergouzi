package cn.zno.weixin.service;

import java.util.Map;

public interface WeixinMsgService {
	void handleText(Map<String, String> requestMap);
}
