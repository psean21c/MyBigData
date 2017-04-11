package com.ccc.service.mapper.impl;

import org.springframework.stereotype.Component;

import com.ccc.domain.User;
import com.ccc.service.dto.UserDTO;
import com.ccc.service.mapper.UserMapper;

@Component
public class UserMapperImpl  implements UserMapper {

  @Override
  public UserDTO userDTO(User user) {
    if (user == null)  return null;
    
    UserDTO userDTO = new UserDTO();   
    userDTO.setId(user.getId());
    userDTO.setEmail(userDTO.getEmail());
    userDTO.setFirstname(user.getFirstname());
    userDTO.setLastname(userDTO.getLastname());
    
    return userDTO;
  }

  @Override
  public User userDTOToUser(UserDTO userDTO) {
    if (userDTO == null)  return null;
    
    User user = new User();
    user.setId(userDTO.getId());
    user.setEmail(userDTO.getEmail());
    user.setFirstname(userDTO.getFirstname());
    user.setLastname(userDTO.getLastname());
    return user;
  }

}
