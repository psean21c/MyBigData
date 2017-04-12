package com.ccc.service.mapper.impl;

import com.ccc.domain.Choice;
import com.ccc.service.dto.ChoiceDTO;
import com.ccc.service.mapper.ChoiceMapper;

public class ChoiceMapperImpl implements ChoiceMapper {

  @Override
  public ChoiceDTO choieDTO(Choice choice) {
    if(choice == null) return null;
    
    ChoiceDTO choiceDTO = new ChoiceDTO();
//    choiceDTO.setChoice(choice.getChoice());
    choiceDTO.setQuestion(choice.getQuestion());
    choiceDTO.setId(choice.getId());
    choiceDTO.setQuestionId(choice.getId());
    
    return choiceDTO;
  }

  @Override
  public Choice choiceDTOToChoice(ChoiceDTO choiceDTO) {
    if(choiceDTO ==null) return null;
    
    Choice choice = new Choice();
//    choice.setChoice(choiceDTO.getChoice());
    choice.setQuestion(choiceDTO.getQuestion());
    choice.setId(choiceDTO.getId());
    choice.setQuestionId(choiceDTO.getQuestionId());
    return choice;
  }

}
