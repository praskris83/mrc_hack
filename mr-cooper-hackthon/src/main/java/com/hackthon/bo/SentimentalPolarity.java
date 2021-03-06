package com.hackthon.bo;

public enum SentimentalPolarity {

  POSITIVE("Positive", 0.5), NEGATIVE("Negative", 0.5), NEUTRAL("Negetive", 0.0);
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Double getConfidenceScoreCutOff() {
    return confidenceScoreCutOff;
  }

  public void setConfidenceScoreCutOff(Double confidenceScoreCutOff) {
    this.confidenceScoreCutOff = confidenceScoreCutOff;
  }

  private SentimentalPolarity(String value, Double confidenceScoreCutOff) {
    this.value = value;
    this.confidenceScoreCutOff = confidenceScoreCutOff;
  }

  private String value;
  
  private Double confidenceScoreCutOff;
  
  public SentimentalPolarity getSentimentalPolarity(String value) {
    
    for (SentimentalPolarity polarity : SentimentalPolarity.values()) {
      if(polarity.value.equalsIgnoreCase(value)) {
        return polarity;
      }
    }
    return null;
  }
}
