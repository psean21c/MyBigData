package com.ccc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ccc.domain.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
  
  User findByFirstname(String fname);
  
  User findByLastname(String lname);
}
