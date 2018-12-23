package com.mask.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mask.blog.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
