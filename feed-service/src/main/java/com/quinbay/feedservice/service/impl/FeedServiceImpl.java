package com.quinbay.feedservice.service.impl;

import com.quinbay.feedservice.client.FriendClient;
import com.quinbay.feedservice.client.PostClient;
import com.quinbay.feedservice.dto.Friend;
import com.quinbay.feedservice.dto.FriendsSocialDTO;
import com.quinbay.feedservice.entity.FeedEntity;
import com.quinbay.feedservice.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements FeedService {
	@Autowired
	FriendClient friendClient;

	@Autowired
	PostClient postClient;

	FriendsSocialDTO friendsSocialDTO;
	List<FeedEntity> feedEntity;

	@Override
	public List<FeedEntity> getFriendProfile(String userName) {

		friendsSocialDTO = friendClient.fetchFriendList(userName);
		return fetchPost(friendsSocialDTO.getFriendList());
	}

	public List<FeedEntity> fetchPost(List<Friend> friendList) {
		for(Friend friend: friendList) {
			String userName = friend.getUserName();
			feedEntity = postClient.getFeedPost(userName);
		}
		return feedEntity;
	}


}
