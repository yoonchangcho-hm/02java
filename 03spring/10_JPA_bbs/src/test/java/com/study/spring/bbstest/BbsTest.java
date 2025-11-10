package com.study.spring.bbstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.spring.bbs.Bbs;
import com.study.spring.bbs.BbsRepository;

@SpringBootTest
public class BbsTest {

	@Autowired
	public BbsRepository bbsRepo;

	@Test
	public void bbsInsert() {

	 for(int i=1;i<=3;i++) {
		 
		 Bbs bbs = new Bbs();
		 bbs.setName("홍길동"+i);
		 bbs.setTitle("안녕하세요"+i);
		 bbs.setContent("안녕, 만나서 반가워");		
		 
		 bbsRepo.save(bbs);
	 }

//		Bbs bbs = new Bbs(null,"han","test1","test",null,null);
//		bbsRepo.save(bbs);
//		
//		Bbs bbs1 = Bbs.builder()
//				.name("이순신")
//				.title("만나")
//				.content("하이")
//				.build();
//		
//		bbsRepo.save(bbs1);
		
	}
}
