package com.interview.openhouseinterview.services;

import com.interview.openhouseinterview.domain.Log;
import com.interview.openhouseinterview.repository.LogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService{

  @Autowired
  private LogRepository _logRepository;

  public LogServiceImpl() {
  }

  @Override
  public void addLog(Log log) {
    _logRepository.add(log);
  }

  @Override
  public Log findLogByUserId(String userId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Log findLogByTimeRange(String startTime, String endTime) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Log findLogByLogType(String logType) {
    // TODO Auto-generated method stub
    return null;
  }
}
