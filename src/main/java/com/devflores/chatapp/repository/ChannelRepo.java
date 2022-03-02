package com.devflores.chatapp.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.devflores.chatapp.domain.Message;

@Repository
public class ChannelRepo {

	private HashMap<String, List<Message>> channelMessages;

	public HashMap<String, List<Message>> getChannelMessages() {
		return channelMessages;
	}

	public void setChannelMessages(HashMap<String, List<Message>> channelMessages) {
		this.channelMessages = channelMessages;
	}
}
