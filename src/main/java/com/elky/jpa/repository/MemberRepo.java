package com.elky.jpa.repository;

import com.elky.jpa.model.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {
}
