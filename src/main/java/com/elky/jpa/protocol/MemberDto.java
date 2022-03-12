package com.elky.jpa.protocol;

import com.elky.jpa.model.Member;

import lombok.Data;

@Data
public class MemberDto {
	private String name;
	private String address;

	public Member toModel() {
		return Member.builder()
			.name(this.name)
			.address(this.address).build();
	}
}
