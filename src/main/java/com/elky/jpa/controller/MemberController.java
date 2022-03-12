package com.elky.jpa.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import com.elky.jpa.model.Member;
import com.elky.jpa.protocol.MemberDto;
import com.elky.jpa.service.MemberService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
	private final MemberService memberService;

	@PostConstruct
	private void init() {
		MemberDto member = new MemberDto();
		member.setName("a");
		member.setAddress("a");
		saveMember(member);

		MemberDto member1 = new MemberDto();
		member.setName("b");
		member.setAddress("b");
		saveMember(member1);
	}

	@GetMapping
	public List<Member> selectMembers() {
		return memberService.selectMembers();
	}

	@GetMapping("/{id}")
	public Member getMember(@PathVariable Long id) {
		return memberService.getMember(id);
	}

	@PostMapping
	public Member saveMember(@RequestBody MemberDto member) {
		return memberService.saveMember(member);
	}

	@PutMapping("/{id}")
	public Member updateMember(@PathVariable Long id, @RequestBody MemberDto member) {
		return memberService.updateMember(id, member);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteMember(@PathVariable Long id) {
		memberService.deleteMember(id);
	}
}
