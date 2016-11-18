package org.thoughtworks.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.thoughtworks.service.HelloWorldService;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldResourceTest {
  @InjectMocks HelloWorldResource helloWorldResource;

  @Mock HelloWorldService helloWorldService;

  @Test
  public void shouldSayHello() {
    helloWorldResource.sayHelloWorld();
    verify(helloWorldService).sayHello();
  }
}