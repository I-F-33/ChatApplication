package com.devflores.chatapp.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.domain.User;

@Repository
public class ChannelRepository {

	private Map<User, List<Channel>> channeRepo;



	
}
