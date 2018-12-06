package com.mask.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.mask.blog.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
