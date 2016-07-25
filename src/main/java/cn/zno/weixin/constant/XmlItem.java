package cn.zno.weixin.constant;

/**
 * xml 分两类：<br>
 * 1.消息<br>
 * 2.事件<br>
 * 
 * ①_②_③_④_⑤<br>
 * 
 * ①代表文本类型<br>
 * ②代表（1 or 2）<br>
 * ③代表类型（大小写敏感）<br>
 * ④代表顺序<br>
 * ⑤代表参数key（大小写敏感）<br>
 * 
 * */
public class XmlItem {
	
	public static final String XML_COMMON_ToUserName = "ToUserName";
	public static final String XML_COMMON_FromUserName = "FromUserName";
	public static final String XML_COMMON_CreateTime = "CreateTime";
	public static final String XML_COMMON_MsgType = "MsgType";
	public static final String XML_COMMON_Event = "Event";
	public static final String XML_COMMON_EventKey = "EventKey";
	public static final String XML_COMMON_Ticket = "Ticket";
	
	public static final String XML_MSG_text_1_ToUserName = "ToUserName";
	public static final String XML_MSG_text_2_FromUserName = "FromUserName";
	public static final String XML_MSG_text_3_CreateTime = "CreateTime";
	public static final String XML_MSG_text_4_MsgType = "MsgType";
	public static final String XML_MSG_text_5_Content = "Content";
	public static final String XML_MSG_text_6_MsgId = "MsgId";
	
	public static final String XML_MSG_image_1_ToUserName = "ToUserName";
	public static final String XML_MSG_image_2_FromUserName = "FromUserName";
	public static final String XML_MSG_image_3_CreateTime = "CreateTime";
	public static final String XML_MSG_image_4_MsgType = "MsgType";
	public static final String XML_MSG_image_5_PicUrl = "PicUrl";
	public static final String XML_MSG_image_6_MediaId = "MediaId";
	public static final String XML_MSG_image_7_MsgId = "MsgId";
	
	public static final String XML_MSG_voice_1_ToUserName = "ToUserName";
	public static final String XML_MSG_voice_2_FromUserName = "FromUserName";
	public static final String XML_MSG_voice_3_CreateTime = "CreateTime";
	public static final String XML_MSG_voice_4_MsgType = "MsgType";
	public static final String XML_MSG_voice_5_MediaId = "MediaId";
	public static final String XML_MSG_voice_6_Format = "Format";
	public static final String XML_MSG_voice_7_MsgId = "MsgId";
	
	public static final String XML_MSG_video_1_ToUserName = "ToUserName";
	public static final String XML_MSG_video_2_FromUserName = "FromUserName";
	public static final String XML_MSG_video_3_CreateTime = "CreateTime";
	public static final String XML_MSG_video_4_MsgType = "MsgType";
	public static final String XML_MSG_video_5_MediaId = "MediaId";
	public static final String XML_MSG_video_6_ThumbMediaId = "ThumbMediaId";
	public static final String XML_MSG_video_7_MsgId = "MsgId";

	public static final String XML_MSG_shortvideo_1_ToUserName = "ToUserName";
	public static final String XML_MSG_shortvideo_2_FromUserName = "FromUserName";
	public static final String XML_MSG_shortvideo_3_CreateTime = "CreateTime";
	public static final String XML_MSG_shortvideo_4_MsgType = "MsgType";
	public static final String XML_MSG_shortvideo_5_MediaId = "MediaId";
	public static final String XML_MSG_shortvideo_6_ThumbMediaId = "ThumbMediaId";
	public static final String XML_MSG_shortvideo_7_MsgId = "MsgId";

	public static final String XML_MSG_location_1_ToUserName = "ToUserName";
	public static final String XML_MSG_location_2_FromUserName = "FromUserName";
	public static final String XML_MSG_location_3_CreateTime = "CreateTime";
	public static final String XML_MSG_location_4_MsgType = "MsgType";
	public static final String XML_MSG_location_5_Location_X = "Location_X";
	public static final String XML_MSG_location_6_Location_Y = "Location_Y";
	public static final String XML_MSG_location_7_Scale = "Scale";
	public static final String XML_MSG_location_8_Label = "Label";
	public static final String XML_MSG_location_9_MsgId = "MsgId";
	
	public static final String XML_MSG_link_1_ToUserName = "ToUserName";
	public static final String XML_MSG_link_2_FromUserName = "FromUserName";
	public static final String XML_MSG_link_3_CreateTime = "CreateTime";
	public static final String XML_MSG_link_4_MsgType = "MsgType";
	public static final String XML_MSG_link_5_Title = "Title";
	public static final String XML_MSG_link_6_Description = "Description";
	public static final String XML_MSG_link_7_Url = "Url";
	public static final String XML_MSG_link_8_MsgId = "MsgId";
	
	public static final String XML_EVENT_subscribe_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_subscribe_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_subscribe_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_subscribe_3_MsgType = "MsgType";
	public static final String XML_EVENT_subscribe_4_Event = "Event";
	public static final String XML_EVENT_subscribe_5_EventKey = "EventKey";
	public static final String XML_EVENT_subscribe_6_Ticket = "Ticket";

	public static final String XML_EVENT_unsubscribe_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_unsubscribe_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_unsubscribe_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_unsubscribe_3_MsgType = "MsgType";
	public static final String XML_EVENT_unsubscribe_4_Event = "Event";
	public static final String XML_EVENT_unsubscribe_5_EventKey = "EventKey";
	public static final String XML_EVENT_unsubscribe_6_Ticket = "Ticket";
	
	public static final String XML_EVENT_SCAN_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_SCAN_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_SCAN_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_SCAN_3_MsgType = "MsgType";
	public static final String XML_EVENT_SCAN_4_Event = "Event";
	public static final String XML_EVENT_SCAN_5_EventKey = "EventKey";
	public static final String XML_EVENT_SCAN_6_Ticket = "Ticket";
	
	public static final String XML_EVENT_LOCATION_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_LOCATION_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_LOCATION_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_LOCATION_4_MsgType = "MsgType";
	public static final String XML_EVENT_LOCATION_5_Event = "Event";
	public static final String XML_EVENT_LOCATION_6_Latitude = "Latitude";
	public static final String XML_EVENT_LOCATION_6_Longitude = "Longitude";
	public static final String XML_EVENT_LOCATION_8_Precision = "Precision";
	
	public static final String XML_EVENT_CLICK_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_CLICK_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_CLICK_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_CLICK_4_MsgType = "MsgType";
	public static final String XML_EVENT_CLICK_5_Event = "Event";
	public static final String XML_EVENT_CLICK_6_EventKey = "EventKey";
	
	public static final String XML_EVENT_VIEW_1_ToUserName = "ToUserName";
	public static final String XML_EVENT_VIEW_2_FromUserName = "FromUserName";
	public static final String XML_EVENT_VIEW_3_CreateTime = "CreateTime";
	public static final String XML_EVENT_VIEW_4_MsgType = "MsgType";
	public static final String XML_EVENT_VIEW_5_Event = "Event";
	public static final String XML_EVENT_VIEW_6_EventKey = "EventKey";
	
	
	
	
	
	
	
	
	
	
}
