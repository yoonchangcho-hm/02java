package com.study.spring.testboard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.spring.board.entity.Board;
import com.study.spring.board.repository.BoardRepository;
import com.study.spring.board.repository.ImageRepository;
import com.study.spring.member.entitiy.Member;
import com.study.spring.member.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class TestBoard {

	@Autowired
	MemberRepository memberRepository;	
	
	@Autowired
	BoardRepository boardRepository;
	
	@Autowired
	ImageRepository imageRepository;

	@Test
	public void insertBoard() {
	    Member member = memberRepository.findById(1L)
	    		 .orElseThrow(()-> new IllegalArgumentException("멤버가 없어요"));
	    
	  
//	    Board board = new Board();
//	    	board.setTitle("안녕하세요");
//	    	board.setContent("만나서반값습니다.");
//	    	board.setName("조윤창");	    
//	    	board.setMember(member);
	    
	    	Board board =Board.builder()
	    			.title("안녕")
	    			.content("내용")
	    			.name("이순신")
	    			.member(member)
	    			.build();
	    	
	    	
	    	Board saveBoard = boardRepository.save(board);
	    	log.info("글작성" + saveBoard);
	    	log.info("아이디" + member);	
	}
}
