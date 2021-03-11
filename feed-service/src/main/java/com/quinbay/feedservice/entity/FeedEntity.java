package com.quinbay.feedservice.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
public class FeedEntity {

	private String userName;
	private String postId;
	private String postCaption;
	private List<String> postImages;
	private Integer likes;
	private Integer dislikes;
	private List <User> postLike;
	private List<User> postDislikes;
	private Date date;
	private String location;
}
