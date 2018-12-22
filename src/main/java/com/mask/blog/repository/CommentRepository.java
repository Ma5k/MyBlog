package com.mask.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mask.blog.domain.Comment;

/**
 * 评论仓库
 * @author Mask
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
