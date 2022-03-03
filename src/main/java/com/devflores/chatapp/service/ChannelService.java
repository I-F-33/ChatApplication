package com.devflores.chatapp.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.repository.ChannelRepository;

@Service
public class ChannelService {

	@Autowired
	private ChannelRepository channelRepo;
	
	public Set<Channel> fetchAllChannels () {
		return channelRepo.fetchAllChannels();
	}
	public void createGeneralChannel () {
		channelRepo.setGeneralChannel();
	}
	
}
