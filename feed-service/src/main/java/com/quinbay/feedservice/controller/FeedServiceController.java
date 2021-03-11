package com.quinbay.feedservice.controller;

import com.quinbay.feedservice.entity.FeedEntity;
import com.quinbay.feedservice.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/feed")
public class FeedServiceController {

	@Autowired
	private FeedService feedService;

	@GetMapping("/fetchUserSocial")
	List<FeedEntity> getFriendProfile(@RequestParam("userName") String userName) {
		return feedService.getFriendProfile(userName);
	}

////	TODO:sending friend list to user service and post service.
//	@GetMapping("/fetchQuinbookPost")
//	List<FeedEntity> fetchQuinbookPosts(@RequestParam("userName") String userName){
//		feedService.f
//	}





}
