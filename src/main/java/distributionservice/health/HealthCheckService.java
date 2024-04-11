package distributionservice.health;

import com.codahale.metrics.health.HealthCheck;

public class HealthCheckService extends HealthCheck {

  @Override
  protected Result check() throws Exception {
    return Result.healthy("I am doing good.");
  }
}
