package com.study.spring.posts;

import java.util.List;
import org.apache.ibatis.annotations.*;

@Mapper
public interface IPostsDao {

    @Select("SELECT * FROM post ORDER BY id DESC")
    List<PostsDto> findAll();

    @Select("SELECT * FROM post WHERE id = #{id}")
    PostsDto findById(Long id);

    @Insert("INSERT INTO post(author_name, title, content, created_at) VALUES (#{author_name}, #{title}, #{content}, NOW())")
    void create(PostsDto request);

    @Update("UPDATE post SET title = #{title}, author_name = #{author_name}, content = #{content} WHERE id = #{id}")
    int update(PostsDto request);

    @Delete("DELETE FROM post WHERE id = #{id}")
    int delete(Long id);
}