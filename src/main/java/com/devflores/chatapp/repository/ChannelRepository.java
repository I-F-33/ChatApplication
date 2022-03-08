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

	public Channel setGeneralChannel () {
		Channel generalChannel = new Channel();
		generalChannel.setChannelId(idCounter++);
		generalChannel.setChannelName("General");
		channelRepo.add(generalChannel);
		return generalChannel;
	}
	public List<Channel> fetchAllChannels () {
		return channelRepo;
				   
	}
	
	public Channel createNewChannel(Channel channel) {
		channel.setChannelId(idCounter++);
		List<Message> messages = new ArrayList<>();
		channel.setMessages(messages);
		channelRepo.add(channel);
		return channel;
	}
	
	


	
}
