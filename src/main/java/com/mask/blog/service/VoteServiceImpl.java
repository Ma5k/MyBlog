package com.mask.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mask.blog.domain.Vote;
import com.mask.blog.repository.VoteRepository;

/**
 * 点赞服务实现类
 * @author Mask
 *
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;
	
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

	@Override
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}

}
