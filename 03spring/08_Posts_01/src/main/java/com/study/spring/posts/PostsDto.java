package com.study.spring.posts;

import java.time.OffsetDateTime;

public class PostsDto {

    private Long id;
    private String title;
    private String author_name;
    private String content;
    private OffsetDateTime created_at;

    public PostsDto() {}

    public PostsDto(Long id, String title, String author_name, String content, OffsetDateTime created_at) {
        this.id = id;
        this.title = title;
        this.author_name = author_name;
        this.content = content;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(OffsetDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "PostsDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author_name='" + author_name + '\'' +
                ", content='" + content + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}