package com.sleeping.dragon.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DragonController {

  @RequestMapping(value="/sleep/{timeInMilliSeconds}", method = RequestMethod.GET)
  public boolean sleep(@PathVariable("timeInMilliSeconds") int timeInMilliSeconds) throws InterruptedException {
    Thread.sleep(timeInMilliSeconds);
    return true;
  }
}
