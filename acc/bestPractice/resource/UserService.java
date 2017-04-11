package com.ccc.service;

import com.ccc.service.dto.UserDTO;

public interface UserService {
  //
  UserDTO findFirstname(String fname);
  UserDTO findLastname(String lname);
}
