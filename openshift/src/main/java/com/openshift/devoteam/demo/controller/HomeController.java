package com.openshift.devoteam.demo.controller;

import com.openshift.devoteam.demo.model.WelcomeMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

  @GetMapping()
  public WelcomeMessage getHomeMessage(){
    return new WelcomeMessage("Hello Oussama");
  }

  @PostMapping()
  public WelcomeMessage setHomeMessage(@RequestBody WelcomeMessage welcomeMessage){
    return welcomeMessage;
  }

}
