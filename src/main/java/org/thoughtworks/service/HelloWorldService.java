package org.thoughtworks.service;

import javax.inject.Singleton;
/*
 * Abstracts logic for saying hello world
 */
@Singleton
public class HelloWorldService {
  public static final String HELLO_WORLD = "Hello World!";

  public String sayHello() {
    return HELLO_WORLD;
  }
}
