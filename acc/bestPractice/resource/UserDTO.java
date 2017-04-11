package com.ccc.service.dto;

import javax.validation.constraints.NotNull;

public class UserDTO {
  
  private Long id;

  @NotNull
  private String firstname;

  @NotNull
  private String lastname;

  @NotNull
  private String email;

  
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  
  
}
