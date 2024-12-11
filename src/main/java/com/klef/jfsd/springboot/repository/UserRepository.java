package com.klef.jfsd.springboot.repository;

import com.klef.jfsd.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}