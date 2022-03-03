package com.devflores.chatapp.domain;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Channel {

	private Integer channelId;
	private String channelName;
	private List<Message> messages;
	
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
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
