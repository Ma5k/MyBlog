package com.mask.blog.service;

import com.mask.blog.domain.Comment;

/**
 * 评论服务接口
 * @author Mask
 *
 */
public interface CommentService {
	/**
	 * 根据id获取 Comment
	 * @param id
	 * @return
	 */
	Comment getCommentById(Long id);
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	void removeComment(Long id);
}