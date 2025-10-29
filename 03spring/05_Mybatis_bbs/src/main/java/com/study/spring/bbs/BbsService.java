package com.study.spring.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

    @Autowired
    IBbsDao dao;

    // 게시글 목록 조회
    public List<BbsDto> getList() {
        return dao.listDao();
    }

    // 게시글 수 조회
    public int count() {
        return dao.countDao();
    }

    // 게시글 상세 조회
    public BbsDto view(String id) {
        return dao.viewDao(id);
    }

    // 게시글 작성
    public int write(String writer, String title, String content) {
        return dao.writeDao(writer, title, content);
    }

    // 게시글 삭제
    public int delete(String id) {
        return dao.deleteDao(id);
    }
}
