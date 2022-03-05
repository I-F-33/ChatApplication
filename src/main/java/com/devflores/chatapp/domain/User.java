package com.devflores.chatapp.domain;

import java.util.List;


public class User {

	private List<Channel> channels;
	private List<Message> messsages;
	private Integer userId;
	private String userName;
	
	//need to save messages to channel
	
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
	public List<Message> getMesssages() {
		return messsages;
	}
	public void setMesssages(List<Message> messsages) {
		this.messsages = messsages;
	}
	
}
