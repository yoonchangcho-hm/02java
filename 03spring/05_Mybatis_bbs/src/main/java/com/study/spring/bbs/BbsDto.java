package com.study.spring.bbs;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BbsDto {
	private int id;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime created_at; // TIMESTAMP → String


	// Getters and Setters
}
