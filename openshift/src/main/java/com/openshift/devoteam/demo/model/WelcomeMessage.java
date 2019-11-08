package com.openshift.devoteam.demo.model;

public class WelcomeMessage {

  private String message;

  public WelcomeMessage(String message){
    this.message = message;
  }

  public WelcomeMessage(){

  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
