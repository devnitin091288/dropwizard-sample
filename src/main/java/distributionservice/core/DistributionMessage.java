package distributionservice.core;

import distributionservice.api.DistributionResource;

public class DistributionMessage {

  public DistributionMessage(String message) {
    this.text = message;
  }

  private String text ;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
