/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.time.LocalDateTime;

/**
 *
 * @author mlooman
 */
public interface PlanStatusUpdate extends Datum {

  /**
   *Name of the <i>Status Update Datetime</i> attribute<br><b>Definition:</b> The date and time at which the information in the StatusUpdate is true.  Normally, the time at which the Update was written.
   */
  public static final String PROP_STATUS_UPDATE_DATETIME = "statusUpdateDatetime";

  /**
   *Name of the <i>Status Update Text</i> attribute<br><b>Definition:</b> The text containing the status update.
   */
  public static final String PROP_STATUS_UPDATE_TEXT = "statusUpdateText";

  /**
   *Name of the <i>Status Update Applies to Plan</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Plan} about which the Status Update was written.
   */
  public static final String PROP_STATUS_UPDATE_APPLIES_TO_PLAN = "statusUpdateAppliesToPlan";
  
  /**
   *Getter for the {@link #PROP_STATUS_UPDATE_DATETIME} attribute
   * @return LocalDateTime
   */
  public LocalDateTime getStatusUpdateDatetime();

  /**
   *Setter for the {@link #PROP_STATUS_UPDATE_DATETIME} attribute
   * @param statusUpdateDatetime New value
   */
  public void setStatusUpdateDatetime(LocalDateTime statusUpdateDatetime);

  /**
   *Getter for the {@link #PROP_STATUS_UPDATE_TEXT} attribute
   * @return String
   */
  public String getStatusUpdateText();

  /**
   *Setter for the {@link #PROP_STATUS_UPDATE_TEXT} attribute
   * @param statusUpdateText New Value
   */
  public void setStatusUpdateText(String statusUpdateText);

  /**
   *Getter for the {@link #PROP_STATUS_UPDATE_APPLIES_TO_PLAN} attribute
   * @return {@link org.birddog.model.Plan}
   */
  public Plan getStatusUpdateAppliesToPlan();

  /**
   *Setter for the {@link #PROP_STATUS_UPDATE_APPLIES_TO_PLAN} attribute
   * @param statusUpdateAppliesToPlan New Value
   */
  public void setStatusUpdateAppliesToPlan(Plan statusUpdateAppliesToPlan);
}
