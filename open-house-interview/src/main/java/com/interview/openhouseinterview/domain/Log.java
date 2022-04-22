package com.interview.openhouseinterview.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Log {
  
  private String _userId;
  private String _sessionId;
  private List<LogActions> _actions;

  public String getUserId() {
    return _userId;
  }

  public String setUserId(String userId) {
    return _userId = userId;
  }

  public String getSessionId() {
    return _sessionId;
  }
  
  public String setSessionId(String sessionId) {
    return _sessionId = sessionId;
  }

  public List<LogActions> getActions() {
    return _actions;
  }

  public void setActions(List<LogActions> actions) {
    _actions = actions;
  }





  
}
