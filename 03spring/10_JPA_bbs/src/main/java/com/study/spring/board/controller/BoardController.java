package com.study.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.board.dto.BoardListDto;
import com.study.spring.board.entity.Board;
import com.study.spring.board.service.BoardService;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/api")
    public String root() {
        return "test";
    }

    @GetMapping("/api/board")
    public List<Board> getBoardList() {
        return boardService.getBoardList(); // 실제 서비스 메서드 호출
    }
    
    public List<BoardListDto> getBoardListDto(){
    	return boardService.getBoardDto();
    }
    
    @GetMapping("/api/board/{id}")
    public Board getBoardView(
    		@PathVariable("id") Long id
    		) {
    	return boardService.getBoard(null);
    	
    }
    
}