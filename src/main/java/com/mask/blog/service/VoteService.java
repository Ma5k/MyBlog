package com.mask.blog.service;

import com.mask.blog.domain.Vote;

/**
 * 点赞服务接口
 * @author Mask
 *
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Vote getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
