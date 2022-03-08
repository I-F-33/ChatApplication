package com.devflores.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.repository.ChannelRepository;

@Service
public class ChannelService {

	@Autowired
	private ChannelRepository channelRepo;
	
	public List<Channel> fetchAllChannels () {
		return channelRepo.fetchAllChannels();
	}
	public Channel createGeneralChannel () {
		return channelRepo.setGeneralChannel();
	}
	public Channel createNewChannel(Channel channel) {
		return channelRepo.createNewChannel(channel);
	}
	
	
}
