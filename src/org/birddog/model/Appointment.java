/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 * A plan that occurs at a scheduled place and time.
 * @author mlooman
 */
public interface Appointment extends Plan {

  /**
   * Name of the <i>Appointment Location Description</i> attribute<br><b>Definition:</b>  A brief description of the location of the appointment.
   */
  public static final String PROP_APPOINTMENT_LOCATION_DESCRIPTION = "appointmentLocationDescription";

  /**
   * Getter for the {@link #PROP_APPOINTMENT_LOCATION_DESCRIPTION} attribute
   * @return the string value of the <i>appointment location description</i>
   */
  public String getAppointmentLocationDescription();

  /**
   * Setter for the {@link #PROP_APPOINTMENT_LOCATION_DESCRIPTION} attribute
   * @param appointmentLocationDescription New Value for the <i>appointment location description</i>
   */
  public void setAppointmentLocationDescription(String appointmentLocationDescription); 
  
//  <editor-fold desc="Class definition" defaultstate="collapsed">
//  private String appointmentLocationDescription;
//
//  public Appointment(){
//    
//  }
//  public Appointment(Integer itemIdentifier){
//    super(itemIdentifier);
//  }
//
//  public Appointment(Integer itemIdentifier, ItemType itemType, String activityDescription, LocalDateTime activityActualStartDatetime, LocalDateTime activityActualEndDatetime, String activityNotesText, List<PlanTransition> planTransitions, Transition planCurrentTransition, LocalDateTime planScheduledStartDatetime, LocalDateTime planScheduledEndDatetime, String appointmentLocationDescription) {
//    super(itemIdentifier, itemType, activityDescription, activityActualStartDatetime, activityActualEndDatetime, activityNotesText, planTransitions, planCurrentTransition, planScheduledStartDatetime, planScheduledEndDatetime);
//    this.appointmentLocationDescription = appointmentLocationDescription;
//  }
//  
//  public String getAppointmentLocationDescription() {
//    return appointmentLocationDescription;
//  }
//
//  public void setAppointmentLocationDescription(String appointmentLocationDescription) {
//    this.appointmentLocationDescription = appointmentLocationDescription;
//  }
// </editor-fold> 
  
}
