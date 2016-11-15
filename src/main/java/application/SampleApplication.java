package application;

import configuration.SampleApplicationConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SampleApplication extends Application<SampleApplicationConfiguration> {

  public static void main(String[] args) throws Exception {
    new SampleApplication().run();
  }

  @Override public void run(SampleApplicationConfiguration configuration, Environment environment) throws Exception {

  }
}
