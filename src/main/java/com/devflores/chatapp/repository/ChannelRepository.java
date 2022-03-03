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

	private Map<Channel, List<Message>> channelRepo;

	private void setGeneralChannel () {
		Channel generalChannel = new Channel();
		generalChannel.setChannelId(channelRepo.size()+ 1);
		generalChannel.setChannelName("General");
		List<Message> generalMessages = new ArrayList<>();
		channelRepo.put(generalChannel, generalMessages);
	}
	public Set<Channel> fetchAllChannels () {
		return channelRepo.keySet();
				   
	}


	
}
