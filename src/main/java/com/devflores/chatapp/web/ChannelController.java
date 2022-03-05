package com.devflores.chatapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.devflores.chatapp.domain.User;
import com.devflores.chatapp.service.ChannelService;
import com.devflores.chatapp.service.UserService;

@Controller
public class ChannelController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ChannelService channelService;
	
	@GetMapping("/welcome")
	public String displayWelcomePage(ModelMap model) {
		 if (channelService.fetchAllChannels().size() == 0) {
			 channelService.createGeneralChannel();
		 }
		 model.addAttribute("channels", channelService.fetchAllChannels());
		return "welcome";
	}
	
	@PostMapping("/welcome")
	public String postUserToDatabase (User user) {
		userService.saveuser(user);
		 return "redirect:/welcome";
	}
	

}
