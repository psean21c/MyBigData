package com.ccc.web.rest;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccc.exception.BadRequestException;
import com.ccc.exception.ServiceException;
import com.ccc.exception.ServiceUnavailableException;
import com.ccc.service.UserService;
import com.ccc.service.dto.UserDTO;
import com.codahale.metrics.annotation.Timed;


@RestController
@RequestMapping(UserResource.PATH)
public class UserResource {
 
  public static final String PATH = "/api/v2";

  @Autowired
  private UserService userService;
  
  @GetMapping("/userinfo/{name}")
  @Timed
  public ResponseEntity<UserDTO> getUser(@PathVariable String name)
  throws BadRequestException, ServiceUnavailableException, ServiceException {
    
    //UserDTO user = userService.findName(name);
    UserDTO user = userService.findFirstname(name);
    return Optional.ofNullable(user).map(result -> new ResponseEntity<>(result, HttpStatus.OK))
    .orElse(new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE));
  }


}
