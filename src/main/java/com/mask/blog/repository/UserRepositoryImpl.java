package com.mask.blog.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.mask.blog.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	//用于计数
	private static AtomicLong counter = new AtomicLong();
	
	//将用户信息存储在内存中，未使用数据库
	private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();
	
	public User saveOrUpdateUser(User user) {
		Long id = user.getId();
		if (id == null) {	//新建
			id = counter.incrementAndGet();
			user.setId(id);
		}
		this.userMap.put(id, user);
		return user;
	}

	public void deleteUser(Long id) {
		this.userMap.remove(id);
	}

	public User getUserById(Long id) {
		return this.userMap.get(id);
	}

	public List<User> listUsers() {
		return new ArrayList<User>(this.userMap.values());
	}
	
}
