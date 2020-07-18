/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.time.LocalDateTime;

/**
 * Anything that occurs at a point in time.
 * @author mlooman
 */
public interface Event extends Item {

  /**
   * Name of the <i>Event Datetime</i> attribute<br><b>Definition:</b>  Date and time at which the Event occurs/occurred.
   */
  public static final String PROP_EVENT_DATETIME = "eventDatetime";
  
  /**
   * Getter for the {@link #PROP_EVENT_DATETIME} attribute
   * @return LocalDateTime when the Event occurs/occurred.
   */
  public LocalDateTime getEventDatetime();

  /**
   * Setter for the {@link PROP_EVENT_DATETIME} attribute
   * @param eventDatetime New value for the date &amp; time of the Event
   */
  public void setEventDatetime(LocalDateTime eventDatetime);
//<editor-fold desc="Class Definition" defaultstate="collapsed">
//private LocalDateTime eventDatetime;
//
//  public Event() {
//  }
//
//  public Event(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Event(LocalDateTime eventDatetime) {
//    super();
//    this.eventDatetime = eventDatetime;
//  }
//  
//  public Event(Integer itemIdentifier , LocalDateTime eventDatetime) {
//    super(itemIdentifier);
//    this.eventDatetime = eventDatetime;
//  }
//  
//  public LocalDateTime getEventDatetime() {
//    return eventDatetime;
//  }
//
//  public void setEventDatetime(LocalDateTime eventDatetime) {
//    this.eventDatetime = eventDatetime;
//  }
//</editor-fold>  
  
 }