package com.ccc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "phx_identity_choice")
public class Choice implements Serializable{

  
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "id")
  private Long id;

  @NotNull
  @Column(name = "question_id", nullable = false)
  private Long questionId;
  
  @NotNull
  @Column(name = "choice", nullable = false)
  private String question;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  
  
}
