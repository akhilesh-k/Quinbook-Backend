package com.quinbay.feedservice.client;

import com.quinbay.feedservice.entity.FeedEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="fetchpost-client",url="10.177.68.40:8090/QuinBookPost")
public interface PostClient {
	@GetMapping("/getAllPostByUserName/{userName}")
	List<FeedEntity> getFeedPost(@PathVariable("userName") String userName);
}

