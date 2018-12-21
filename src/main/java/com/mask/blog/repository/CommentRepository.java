package com.mask.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mask.blog.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
