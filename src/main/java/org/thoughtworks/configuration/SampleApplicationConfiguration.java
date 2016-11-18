package org.thoughtworks.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class SampleApplicationConfiguration extends Configuration {
  @NotEmpty
  @JsonProperty
  private String applicationName;
}
