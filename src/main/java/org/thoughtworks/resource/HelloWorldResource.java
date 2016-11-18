package org.thoughtworks.resource;

import org.thoughtworks.service.HelloWorldService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.ok;

/*
 * Contains routing/controller logic to link Request to Response
 */
@Path(value = "/helloWorld")
public class HelloWorldResource {
  private HelloWorldService helloWorldService;

  public HelloWorldResource(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  @GET
  public Response sayHelloWorld() {
    return ok(helloWorldService.sayHello()).build();
  }
}
