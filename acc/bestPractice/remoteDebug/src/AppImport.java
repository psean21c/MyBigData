package com.ccc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "AppsForImport")
public class AppImport implements Serializable{
  
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  
  @NotNull
  @Column(name = "DT_ApplicationNumber", nullable = false)
  private String appNumber;
  


  public AppImport() {}

  public AppImport(String appNumber) {
    this.appNumber = appNumber;

  }

  public AppImport(Long id, String appNumber) {
    this.id = id;
    this.appNumber = appNumber;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAppNumber() {
    return appNumber;
  }

  public void setAppNumber(String appNumber) {
    this.appNumber = appNumber;
  }


}


