package com.mask.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mask.blog.domain.Comment;
import com.mask.blog.repository.CommentRepository;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	@Transactional
	public void removeComment(Long id) {
		commentRepository.delete(id);
	}
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.findOne(id);
	}

}
