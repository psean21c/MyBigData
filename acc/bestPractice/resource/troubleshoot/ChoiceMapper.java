package com.ccc.service.mapper;

import com.ccc.domain.Choice;
import com.ccc.service.dto.ChoiceDTO;

public interface ChoiceMapper {
  ChoiceDTO choieDTO(Choice choice);

  Choice choiceDTOToChoice(ChoiceDTO choiceDTO);
}
