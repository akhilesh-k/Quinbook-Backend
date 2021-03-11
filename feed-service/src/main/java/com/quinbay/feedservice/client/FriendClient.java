package com.quinbay.feedservice.client;

import com.quinbay.feedservice.dto.FriendsSocialDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author akhileshk
 * @since 10/03/2021 20:49PM
 **/
@FeignClient(name="fetchfriends-client",url="10.177.68.60:8082")
public interface FriendClient {
	@RequestMapping(method= RequestMethod.POST, path="/fetchUserSocial")
	FriendsSocialDTO fetchFriendList(@RequestParam("userName") String UserName);
}
