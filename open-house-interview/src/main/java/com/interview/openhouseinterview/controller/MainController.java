package com.interview.openhouseinterview.controller;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.openhouseinterview.domain.Log;
import com.interview.openhouseinterview.services.LogService;
import com.interview.openhouseinterview.services.LogServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openHouseAi")
public class MainController {
  
  @Autowired
  private LogService _logService;

  /**
   * http://localhost:8080/openHouseAi/log
   * @return a log
   */
  @GetMapping("/log")
  public Log getLog(@RequestBody Log log){
    return log;
  }

  /**
   * Example: http://localhost:8080/openHouseAi/log?ABC123XYZ
   * @return a single log given the user ID
   */
  @GetMapping("/log/{userId}")
  public Log getLogsById(@PathVariable() String userId){
    return _logService.findLogByUserId(userId);
  }

  @PostMapping("/log")
  public void createLog(@RequestBody Log log){
    _logService.addLog(log);
  }



  // If we are expecting a list of log then we would use this
  //
  // @GetMapping("/logs")
  // public List<Log> getAllLogs(@RequestBody List<Log> log){
  //   return log;
  // }

  
}
