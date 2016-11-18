package org.thoughtworks.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.thoughtworks.configuration.SampleApplicationConfiguration;
import org.thoughtworks.resource.HelloWorldResource;
import org.thoughtworks.service.HelloWorldService;

public class SampleApplication extends Application<SampleApplicationConfiguration> {

  private HelloWorldResource helloWorldResource;
  private HelloWorldService helloWorldService;

  public static void main(String[] args) throws Exception {
    new SampleApplication().run(args);
  }

  @Override public void initialize(Bootstrap<SampleApplicationConfiguration> bootstrap) {
    helloWorldService = new HelloWorldService();

    helloWorldResource = new HelloWorldResource(helloWorldService);
  }

  @Override public void run(SampleApplicationConfiguration configuration, Environment environment) throws Exception {
    registerResource(environment, helloWorldResource);
  }

  private void registerResource(Environment environment, Object... resources) {
    for (Object resource : resources) {
      environment.jersey().register(resource);
    }
  }
}
