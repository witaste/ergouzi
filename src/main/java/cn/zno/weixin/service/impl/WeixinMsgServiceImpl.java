package cn.zno.weixin.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.zno.weixin.constant.XmlItem;
import cn.zno.weixin.service.WeixinMsgService;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.bean.WxMpXmlOutTextMessage;

@Service
public class WeixinMsgServiceImpl implements WeixinMsgService {

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void handleText(Map<String, String> requestMap) {
		
		String ToUserName = requestMap.get(XmlItem.XML_MSG_text_1_ToUserName);
		String FromUserName = requestMap.get(XmlItem.XML_MSG_text_2_FromUserName);
		String Content = requestMap.get(XmlItem.XML_MSG_text_5_Content);
		
		WxMpXmlOutTextMessage wxMpXmlOutTextMessage = new WxMpXmlOutTextMessage();
		
		wxMpXmlOutTextMessage.setToUserName(FromUserName);
		wxMpXmlOutTextMessage.setFromUserName(ToUserName);
		wxMpXmlOutTextMessage.setCreateTime(new Date().getTime());
		wxMpXmlOutTextMessage.setMsgType(WxConsts.XML_MSG_TEXT);
		wxMpXmlOutTextMessage.setContent("hello !" + Content);
		
		String result = wxMpXmlOutTextMessage.toXml();
		requestMap.put("result", result);
	}

}
