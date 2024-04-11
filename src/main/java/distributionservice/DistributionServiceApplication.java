package distributionservice;

import distributionservice.api.DistributionResource;
import distributionservice.health.HealthCheckService;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DistributionServiceApplication extends Application<DistributionServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DistributionServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "DistributionService";
    }

    @Override
    public void initialize(final Bootstrap<DistributionServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DistributionServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.healthChecks().register("myhealth",new HealthCheckService());
        environment.jersey().register(new DistributionResource(configuration));
    }

}
