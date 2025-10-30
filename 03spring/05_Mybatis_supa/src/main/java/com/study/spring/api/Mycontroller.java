package com.study.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@Autowired
	IPostDao postDao;

	@GetMapping("/")
	public String root() {
		return "hello RESTfull API";
	}

	@GetMapping("/api/posts")
	public List<PostDto> postView() {
//		List<PostDto> postView = postDao.listDao();
		return postDao.listDao();
	}
}
