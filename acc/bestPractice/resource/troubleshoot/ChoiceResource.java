package com.ccc.web.rest;

import java.util.Optional;

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
import com.codahale.metrics.annotation.Timed;
import com.ccc.service.ChoiceService;
import com.ccc.service.dto.ChoiceDTO;

@RestController
@RequestMapping(ChoiceResource.PATH)
public class ChoiceResource {
  public static final String PATH = "/api/v2";

  @Autowired
  private ChoiceService choiceService;
  
  @GetMapping("/userinfo/{id}")
  @Timed
  public ResponseEntity<ChoiceDTO> getChoice(@PathVariable String c)
  throws BadRequestException, ServiceUnavailableException, ServiceException {
    
    ChoiceDTO choice = choiceService.findQuestion(c);
    return Optional.ofNullable(choice).map(result -> new ResponseEntity<>(result, HttpStatus.OK))
    .orElse(new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE));
  }

  
}

