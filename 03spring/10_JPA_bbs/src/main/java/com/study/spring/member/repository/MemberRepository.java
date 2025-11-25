package com.study.spring.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.spring.member.entitiy.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

	static Object findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
