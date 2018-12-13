package com.mask.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mask.blog.domain.User;

/**
 * User 服务接口
 * @author Mask
 *
 */
public interface UserService {
	/**
	 * 新增、编辑、保存用户
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	User registerUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	void removeUser(Long id);
	
	/**
	 * 根据id获取用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 根据用户名进行分页模糊查询
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<User> listUsersByNameLike(String name, Pageable pageable);
}
