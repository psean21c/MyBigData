package com.ccc.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ccc.domain.User;
import com.ccc.repository.UserRepository;
import com.ccc.service.UserService;
import com.ccc.service.dto.UserDTO;
import com.ccc.service.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

  
  @Inject
  private UserRepository userRepository;

  @Inject
  private UserMapper userMapper;
  
  @Override
  public UserDTO findFirstname(String fname) {
    User user = userRepository.findByFirstname(fname);
    UserDTO userDTO = userMapper.userDTO(user);
    return userDTO;
  }

  @Override
  public UserDTO findLastname(String lname) {
    User user = userRepository.findByLastname(lname);
    UserDTO userDTO = userMapper.userDTO(user);
    
    return userDTO;
  }


}
