package com.devflores.chatapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.domain.Message;
import com.devflores.chatapp.domain.User;

@Repository
public class ChannelRepository {

	private List<Channel> channelRepo = new ArrayList<>();;
	Integer idCounter = 1;

	public void setGeneralChannel () {
		Channel generalChannel = new Channel();
		generalChannel.setChannelId(idCounter++);
		generalChannel.setChannelName("General");
		List<Message> generalMessages = new ArrayList<>();
		generalChannel.setMessages(generalMessages);
		channelRepo.add(generalChannel);
	}
	public List<Channel> fetchAllChannels () {
		return channelRepo;
				   
	}


	
}
