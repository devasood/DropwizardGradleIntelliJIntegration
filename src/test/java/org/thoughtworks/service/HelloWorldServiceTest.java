package org.thoughtworks.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceTest extends HelloWorldService {
  @Test
  public void shouldSayHello() {
    assertEquals(HELLO_WORLD, sayHello());
  }
}