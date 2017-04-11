package com.ccc.service.mapper;

import com.ccc.domain.User;
import com.ccc.service.dto.UserDTO;

public interface UserMapper {
  UserDTO userDTO(User user);

  User userDTOToUser(UserDTO userDTO);
}

