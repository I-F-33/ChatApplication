package com.devflores.chatapp.domain;

import java.util.List;

public class channel {

	private Integer ChannelId;
	private String channelName;
	private List<Message> messages;
	
	public Integer getChannelId() {
		return ChannelId;
	}
	public void setChannelId(Integer channelId) {
		ChannelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	} 
}
