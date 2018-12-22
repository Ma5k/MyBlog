package com.mask.blog.service;

import com.mask.blog.domain.Authority;

/**
 * 权限服务接口
 * @author Mask
 *
 */
public interface AuthorityService {
	/**
	 * 根据ID查询Authority
	 * @param id
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
