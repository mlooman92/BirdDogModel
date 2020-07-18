/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Record of the continuous execution of an {@link org.birddog.model.Activity}
 * @author mlooman
 */
public interface Performance extends Activity {

  /**
   * Name of the <i>Performance Location Code</i> attribute<br><b>Definition:</b> A two letter state abbreviation indicating where the Performance occurred.
   */
  public static final String PROP_PERFORMANCE_LOCATION_CODE = "performanceLocationCode";

  /**
   * Name of the <i>Performance Labor</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Labor} code to which the effort associated with this Performance will be charged.
   */
  public static final String PROP_PERFORMANCE_LABOR = "performanceLabor";

  /**
   *  Name of the <i>Performance Plan</i> attribute<br><b>Definition</b>: The {@link org.birddog.model.Plan} which is progressed by this Performance.
   */
  public static final String PROP_PERFORMANCE_PLAN = "performancePlan";

  /**
   * Name of the <i>Performance Week Ending</i> attribute<br><b>Definition:</b> (READ ONLY) The LocalDateTime value of the Week Ending Date derived from the {@link org.birddog.model.Activity#PROP_ACTIVITY_ACTUAL_START_DATETIME} attribute value.
   */
  public static final String PROP_PERFORMANCE_WEEK_ENDING = "performanceWeekEnding";

  /**
   * Name of the <i>Performance Date Only</i> attribute<br><b>Definition:</b> (READ ONLY) The LocalDateTime of the Date part of the {@link org.birddog.model.Activity#PROP_ACTIVITY_ACTUAL_START_DATETIME} attribute value.
   */
  public static final String PROP_PERFORMANCE_DATE_ONLY = "performanceDateOnly";

  /**
   * Name of the <i>Performance Duration</i> attribute<br><b>Definition:</b> (READ ONLY) The Duration of the Performance as calculated by subtracting the {@link org.birddog.model.Activity#PROP_ACTIVITY_ACTUAL_START_DATETIME} from the {@link org.birddog.model.Activity#PROP_ACTIVITY_ACTUAL_END_DATETIME}
   */
  public static final String PROP_PERFORMANCE_DURATION = "performanceDuration";

  /**
   * Getter for the {@link #PROP_PERFORMANCE_LOCATION_CODE} attribute
   * @return String
   */
  public String getPerformanceLocationCode();

  /**
   * Setter for the {@link #PROP_PERFORMANCE_LOCATION_CODE} attribute
   * @param performanceLocationCode New Value
   */
  public void setPerformanceLocationCode(String performanceLocationCode);

  /**
   * Getter for the {@link #PROP_PERFORMANCE_LABOR} attribute
   * @return {@link org.birddog.model.Labor}
   */
  public Labor getPerformanceLabor();

  /**
   * Setter for the {@link #PROP_PERFORMANCE_LABOR} attribute
   * @param performanceLabor New Value
   */
  public void setPerformanceLabor(Labor performanceLabor);

  /**
   * Getter for the {@link #PROP_PERFORMANCE_PLAN} attribute
   * @return {@link org.birddog.model.Plan}
   */
  public Plan getPerformancePlan();

  /**
   * Setter for the {@link #PROP_PERFORMANCE_PLAN} attribute
   * @param performancePlan New Value
   */
  public void setPerformancePlan(Plan performancePlan);

  /**
   * Getter for the {@link #PROP_PERFORMANCE_WEEK_ENDING} attribute
   * @return LocalDateTime
   */
  public LocalDateTime getPerformanceWeekEnding();

  /**
   * Getter for the {@link #PROP_PERFORMANCE_WEEK_ENDING} attribute based on an arbitrary DayOfWeek value
   * @param weekEndingDay DayOfWeek indicating which day the work week ends.
   * @return LocalDateTime
   */
  public LocalDateTime getPerformanceWeekEnding(DayOfWeek weekEndingDay);

  /**
   * Getter for the {@link #PROP_PERFORMANCE_DATE_ONLY} attribute
   * @return LocalDateTime with only a Date Value.
   */
  public LocalDateTime getPerformanceDateOnly();

  /**
   * Getter for the {@link #PROP_PERFORMANCE_DURATION} attribute
   * @return {@link java.time.Duration}
   */
  public Duration getPerformanceDuration();
//<editor-fold desc="Class Definition" defaultstate="collapsed">
//  private String performanceLocationCode;
//  private Labor performanceLabor;
//  private Plan performancePlan;
//  private LocalDateTime performanceWeekEnding;
//  private LocalDateTime performanceDateOnly;
//  private Duration performanceDuration;
//
//  public Performance() {
//    super();
//  }
//
//  public Performance(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Performance(String performanceLocationCode, Labor performanceLabor, Plan performancePlan, Integer itemIdentifier, ItemType itemType, String activityDescription, LocalDateTime activityActualStartDatetime, LocalDateTime activityActualEndDatetime, String activityNotesText) {
//    super(itemIdentifier, itemType, activityDescription, activityActualStartDatetime, activityActualEndDatetime, activityNotesText);
//    this.performanceLocationCode = performanceLocationCode;
//    this.performanceLabor = performanceLabor;
//    this.performancePlan = performancePlan;
//  }
//
//  public String getPerformanceLocationCode() {
//    return performanceLocationCode;
//  }
//
//  public void setPerformanceLocationCode(String performanceLocationCode) {
//    this.performanceLocationCode = performanceLocationCode;
//  }
//
//  public Labor getPerformanceLabor() {
//    return performanceLabor;
//  }
//
//  public void setPerformanceLabor(Labor performanceLabor) {
//    this.performanceLabor = performanceLabor;
//  }
//
//  public Plan getPerformancePlan() {
//    return performancePlan;
//  }
//
//  public void setPerformancePlan(Plan performancePlan) {
//    this.performancePlan = performancePlan;
//  }
//  
//    public LocalDateTime getPerformanceWeekEnding(){
//    return Performance.this.getPerformanceWeekEnding(DayOfWeek.FRIDAY);  // TODO: Replace the static value with a user configurable value
//  }  
//  
//  public LocalDateTime getPerformanceWeekEnding(DayOfWeek weekEndingDay){
//    int difference = weekEndingDay.getValue() - super.getActivityActualStartDatetime().getDayOfWeek().getValue();
//    LocalDateTime weekEndingDate = super.getActivityActualStartDatetime().plusDays(difference).withHour(0);
//    return weekEndingDate;
//  }
//  
//  public LocalDateTime getPerformanceDateOnly(){
//    return super.getActivityActualStartDatetime().withHour(0);
//  }
//  
//  public Duration getPerformanceDuration(){
//    LocalDateTime endDatetime;
//    if(super.getActivityActualEndDatetime()==null){
//      endDatetime = LocalDateTime.now();
//    } else {
//      endDatetime = super.getActivityActualEndDatetime();
//    }
//    return Duration.between(super.getActivityActualStartDatetime(),endDatetime);    
//  }
// </editor-fold>
}
