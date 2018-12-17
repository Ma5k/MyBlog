package com.mask.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mask.blog.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
