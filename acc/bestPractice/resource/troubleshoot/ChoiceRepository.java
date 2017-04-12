package com.ccc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ccc.domain.Choice;

@Transactional
public interface ChoiceRepository  extends JpaRepository<Choice, Long> {

  Choice findByQuestion(String c);
  
}
