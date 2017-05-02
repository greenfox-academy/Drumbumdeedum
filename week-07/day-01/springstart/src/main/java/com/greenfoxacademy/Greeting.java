package com.greenfoxacademy;

import lombok.Getter;

@Getter
public class Greeting {
  long id;
  String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
}
