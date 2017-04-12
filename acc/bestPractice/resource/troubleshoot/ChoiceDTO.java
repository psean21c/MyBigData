package com.ccc.service.dto;

import javax.validation.constraints.NotNull;

public class ChoiceDTO {
  
  private Long id;

  @NotNull
  private String question;

  @NotNull
  private Long questionId;
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }
}
