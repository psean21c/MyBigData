package com.ccc.service.impl;

import javax.inject.Inject;

import com.ccc.domain.Choice;
import com.ccc.repository.ChoiceRepository;
import com.ccc.service.ChoiceService;
import com.ccc.service.dto.ChoiceDTO;
import com.ccc.service.mapper.ChoiceMapper;

public class ChoiceServiceImpl implements ChoiceService {

  @Inject
  private ChoiceRepository choiceRepository;
  
  @Inject
  private ChoiceMapper choiceMapper;
  

  @Override
  public ChoiceDTO findQuestion(String c) {
    Choice choice = choiceRepository.findByQuestion(c);
    ChoiceDTO choiceDTO = choiceMapper.choieDTO(choice);
    return choiceDTO;
  }

}
