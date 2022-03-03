package com.devflores.chatapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String displayWelcomePage(Model modelMap) {
		if (channelService.fetchAllChannels() == null) {
			channelService.createGeneralChannel();
		}
		userService.fetchUserbyId(null)
		modelMap.addAttribute("user", );
		return "welcome";
	}
	
	@PostMapping("/welcome")
	public String postUserToDatabase (User user) {
		User savedUser = userService.saveuser(user);
		 return "redirect:/welcome";
	}
	

}
