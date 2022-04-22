package com.interview.openhouseinterview.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Properties {

  private int _locationX;
  private int _locationY;
  private String _viewedId;
  private String _pageFrom;
  private String _pageTo;

  public int getLocationX() {
    return _locationX;
  }

  public void setLocationX(int locationX) {
     _locationX = locationX;
  }

  public int getLocationY() {
    return _locationY;
  }

  public void setLocationY(int locationY) {
    _locationY = locationY;
 }

  public String getViewID() {
    return _viewedId;
  }

  public void setViewID(String viewedId) {
     _viewedId = viewedId;
  }

  public String getPageFrom( ) {
    return _pageFrom;
  }

  public void setPageFrom(String pageFrom) {
     _pageFrom = pageFrom;
  }

  public String getPageTo() {
    return _pageTo;
  }

  public void setPageTo(String pageTo) {
     _pageTo = pageTo;
  }
}
