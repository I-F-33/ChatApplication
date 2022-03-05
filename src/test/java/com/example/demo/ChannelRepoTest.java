package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devflores.chatapp.repository.ChannelRepository;
import com.devflores.chatapp.service.ChannelService;

class ChannelRepoTest {

	
	@Test
	void ListSiz4eShouldReturn3() {
		ChannelRepository repo = new ChannelRepository();
		repo.setGeneralChannel();
		
		assertEquals(1, repo.fetchAllChannels().size());
	}
	
	@Test
	void ChannelIDShouldReturn() {
		
		ChannelRepository repo = new ChannelRepository();
		repo.setGeneralChannel();
		
		ChannelService service = new ChannelService();
		service.
	}

}
