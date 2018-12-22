package com.mask.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mask.blog.domain.Authority;

/**
 * 权限仓库
 * @author Mask
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
