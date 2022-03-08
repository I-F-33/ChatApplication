package com.devflores.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.domain.Message;
import com.devflores.chatapp.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepo;
	
	public void addMessagesToChannel(Channel channel) {
		messageRepo.addMessagesToChannel(channel);
	}
	
	public List<Message> fetchChannelMessagesByChannel (Channel channel) {
		 return messageRepo.fetchMessagesbyChannelId(channel);
	}
	

	
	
}
