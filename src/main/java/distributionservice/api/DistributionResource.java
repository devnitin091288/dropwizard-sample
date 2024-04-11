package distributionservice.api;

import distributionservice.DistributionServiceConfiguration;
import distributionservice.core.DistributionMessage;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.apache.commons.lang3.StringUtils;

@Path("/distribution")
@Produces(MediaType.APPLICATION_JSON)
public class DistributionResource {

  @Inject
  private DistributionServiceConfiguration distributionServiceConfiguration;
  public DistributionResource(DistributionServiceConfiguration configuration) {
    this.distributionServiceConfiguration = configuration;
  }

  @GET
  public DistributionMessage getMessage(@QueryParam("name") String name) {
    String derivedName = !StringUtils.isBlank(name) ? name : distributionServiceConfiguration.getDefaultName();
    String message = String.format(distributionServiceConfiguration.getTemplate(),derivedName);
    return new DistributionMessage(message);
  }
}
