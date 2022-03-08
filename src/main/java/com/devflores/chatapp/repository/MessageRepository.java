package com.devflores.chatapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.domain.Message;

@Repository
public class MessageRepository {

	private HashMap<Integer,List<Message>> messageRepo = new HashMap<>();
	//Channel Id = Key
	//Messages for Channel =  value
	
	public void addMessagesToChannel(Channel channel) {
		List<Message> messages = new ArrayList<>();
		messageRepo.put(channel.getChannelId(),messages);
	}
	
	public List<Message> fetchMessagesbyChannelId(Channel channel) {
		return messageRepo.get(channel.getChannelId());
	}
	
}
