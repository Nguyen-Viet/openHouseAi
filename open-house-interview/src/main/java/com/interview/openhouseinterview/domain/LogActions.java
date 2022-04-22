package com.interview.openhouseinterview.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class LogActions {

  private String _time;
  private String _type;
  private Properties _properties;
  
  public String getTime() {
    return _time;
  }

  public void setTime(String time) {
    _time = time;
  }

  public String getType() {
    return _type;
  }

  public void setType(String type) {
    _type = type;
  }

  public Properties getProperties() {
    return _properties;
  }

  public void setProperties(Properties properties) {
    _properties = properties;
  }
}
