package com.devflores.chatapp.domain;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class User {

	private List<Channel> channels;
	private Integer userId;
	private String userName;
	
	//need to save messages to channel
	private void setGeneralChannel () {
		Channel generalChannel = new Channel();
		generalChannel.setChannelId(1);
		generalChannel.setChannelName("General");
		channels.add(generalChannel);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	
}
