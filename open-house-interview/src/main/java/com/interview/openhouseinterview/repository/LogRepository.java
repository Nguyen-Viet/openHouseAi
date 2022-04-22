package com.interview.openhouseinterview.repository;

import java.util.List;

import com.interview.openhouseinterview.domain.Log;

public class LogRepository {

  private List<Log> _logs;

  public void add(Log log){
    _logs.add(log);
  }
  
}
