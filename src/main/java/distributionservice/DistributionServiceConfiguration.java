package distributionservice;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.*;
import jakarta.validation.constraints.*;

public class DistributionServiceConfiguration extends Configuration {
    // TODO: implement service configuration
  @NotEmpty
  private String template;

  @NotEmpty
  private String defaultName;

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public String getDefaultName() {
    return defaultName;
  }

  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }
}
