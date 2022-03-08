package com.devflores.chatapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.devflores.chatapp.domain.Channel;
import com.devflores.chatapp.domain.User;
import com.devflores.chatapp.service.ChannelService;
import com.devflores.chatapp.service.MessageService;
import com.devflores.chatapp.service.UserService;

@Controller
public class ChannelController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ChannelService channelService;
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/welcome")
	public String displayWelcomePage(ModelMap model) {
		 if (channelService.fetchAllChannels().size() == 0) {
			 Channel channel = channelService.createGeneralChannel();
			 messageService.addMessagesToChannel(channel);
		 }
		 model.addAttribute("channels", channelService.fetchAllChannels());
		 model.addAttribute("channel", new Channel());
		return "welcome";
	}
	
	@PostMapping("/welcome")
	public String postUserToDatabase (@RequestBody User user) {
		userService.saveuser(user);
		 return "redirect:/welcome";
	}
	
	@PostMapping("/welcome/creteNewChannel")
	public String createNewChannel(Channel channel) {
		channelService.createNewChannel(channel);
		return "redirect:/welcome";
	}
	
	@GetMapping("/channel/{channelId}")
	public String loadChannel (@PathVariable Integer channelId) {
	
		return "channel";
	}
		

}
