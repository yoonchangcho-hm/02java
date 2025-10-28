package com.study.spring.bbs;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBbsDao {

    List<BbsDto> listDao();

    int countDao();

    BbsDto viewDao(@Param("id") String id);

    void writeDao(@Param("writer") String writer,
                  @Param("title") String title,
                  @Param("content") String content);

    void deleteDao(@Param("id") String id);
}