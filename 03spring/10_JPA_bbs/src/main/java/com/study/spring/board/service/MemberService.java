package com.study.spring.board.service;

import org.springframework.stereotype.Service;

import com.study.spring.board.dto.MemberJoinDto;
import com.study.spring.member.entitiy.Member;
import com.study.spring.member.entitiy.Member.MemberBuilder;
import com.study.spring.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

		private final MemberRepository memberrepository;
		
		public Long join(MemberJoinDto dto) {
			
			if(MemberRepository.findByEmail(dto.getEmail()) !=null) {
				throw new IllegalArgumentException("이미 가입된 이메일입니다.");
			}
			
			MemberBuilder member = Member.builder()
					.name(dto.getName())
					.email(dto.getEmail())
					.password(dto.getPassword())
					.build();
					
			return memberRepository.save(member).getId();
		}
		
}
