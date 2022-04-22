package com.interview.openhouseinterview.services;

import com.interview.openhouseinterview.domain.Log;
import com.interview.openhouseinterview.repository.LogRepository;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

public interface LogService {

  Log findLogByUserId(String userId);
  Log findLogByTimeRange(String startTime, String endTime);
  Log findLogByLogType(String logType);
  void addLog(Log log);
}
