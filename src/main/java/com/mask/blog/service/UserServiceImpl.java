package com.mask.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mask.blog.domain.User;
import com.mask.blog.repository.UserRepository;

/**
 * User服务
 * @author Mask
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public User saveOrUpdateUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public void removeUser(Long id) {
		userRepository.delete(id);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public Page<User> listUsersByNameLike(String name, Pageable pageable) {
		name = "%" + name + "%";
		Page<User> users = userRepository.findByNameLike(name, pageable);
		return users;
	}

}
