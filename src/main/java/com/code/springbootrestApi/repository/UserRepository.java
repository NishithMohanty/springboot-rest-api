package com.code.springbootrestApi.repository;

import com.code.springbootrestApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
