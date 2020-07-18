/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.time.LocalDateTime;

/**
 * Item Type for anything that occurs over a period of time.
 * @author mlooman
 */
public interface Activity extends Item {

  /**
   * Name of the <i>Activity Description</i> attribute<br><b>Definition:</b>  Phrase which briefly explains what the activity is, typically using active verb predicates.
   */
  public static final String PROP_ACTIVITY_DESCRIPTION = "activityDescription";

  /**
   * Name of the <i>Activity Actual Start Datetime</i> attribute<br><b>Definition:</b>  Date and time at which the Activity actually began.
   */
  public static final String PROP_ACTIVITY_ACTUAL_START_DATETIME = "activityActualStartDatetime";

  /**
   *  Name of the <i>Activity Actual End Datetime</i> attribute<br><b>Definition</b>:  Date and time at which the Activity actually ended
   */
  public static final String PROP_ACTIVITY_ACTUAL_END_DATETIME = "activityActualEndDatetime";

  
  /**
   * Getter for the {@link #PROP_ACTIVITY_DESCRIPTION} attribute
   * @return The String describing the Activity
   */
  public String getActivityDescription();

  /**
   * Setter for the {@link #PROP_ACTIVITY_DESCRIPTION} attribute
   * @param activityDescription New value for the <i>Activity Description</i>
   */
  public void setActivityDescription(String activityDescription);

  /**
   * Getter for the {@link #PROP_ACTIVITY_ACTUAL_START_DATETIME} attribute
   * @return the LocalDateTime value of the <i>Activity Actual Start Datetime</i>
   */
  public LocalDateTime getActivityActualStartDatetime();

  /**
   * Setter for the {@link #PROP_ACTIVITY_ACTUAL_START_DATETIME} attribute
   * @param activityActualStartDatetime The New value for the <i>activity actual start datetime</i>
   */
  public void setActivityActualStartDatetime(LocalDateTime activityActualStartDatetime);

  /**
   * Getter for the {@link #PROP_ACTIVITY_ACTUAL_END_DATETIME} attribute
   * @return the LocalDateTime of the <i>activity actual end datetime</i>
   */
  public LocalDateTime getActivityActualEndDatetime();

  /**
   * Setter for the {@link #PROP_ACTIVITY_ACTUAL_END_DATETIME} attribute
   * @param activityActualEndDatetime The new value of the <i>activity actual end datetime</i>
   */
  public void setActivityActualEndDatetime(LocalDateTime activityActualEndDatetime);


//<editor-fold desc="Class Definition" defaultstate="collapsed">
  
//  private String activityDescription;
//  private LocalDateTime activityActualStartDatetime;
//  private LocalDateTime activityActualEndDatetime;
//  private String activityNotesText;
//
//  public Activity() {
//  }
//
//  public Activity(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Activity(Integer itemIdentifier, ItemType itemType, String activityDescription, LocalDateTime activityActualStartDatetime, LocalDateTime activityActualEndDatetime, String activityNotesText ) {
//    super(itemIdentifier, itemType);
//    this.activityDescription = activityDescription;
//    this.activityActualStartDatetime = activityActualStartDatetime;
//    this.activityActualEndDatetime = activityActualEndDatetime;
//    this.activityNotesText = activityNotesText;
//  }
//  
//  public String getActivityDescription() {
//    return activityDescription;
//  }
//
//  public void setActivityDescription(String activityDescription) {
//    this.activityDescription = activityDescription;
//  }
//
//  public LocalDateTime getActivityActualStartDatetime() {
//    return activityActualStartDatetime;
//  }
//
//  public void setActivityActualStartDatetime(LocalDateTime activityActualStartDatetime) {
//    this.activityActualStartDatetime = activityActualStartDatetime;
//  }
//
//  public LocalDateTime getActivityActualEndDatetime() {
//    return activityActualEndDatetime;
//  }
//
//  public void setActivityActualEndDatetime(LocalDateTime activityActualEndDatetime) {
//    this.activityActualEndDatetime = activityActualEndDatetime;
//  }
//
//  public String getActivityNotesText() {
//    return activityNotesText;
//  }
//
//  public void setActivityNotesText(String activityNotesText) {
//    this.activityNotesText = activityNotesText;
//  }
//</editor-fold>          
  
}
