/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import org.birddog.model.exceptions.DuplicateValueException;

/**
 * A subtype of {@link org.birddog.model.Plan} consisting of a defined goal and discreet tasks, events, appointments, etc., even through such items may not be defined for a Project.
 * @author mlooman
 */
public interface Project extends Plan {

  /**
   *Name of the <i>Project Tag</i> attribute<br><b>Definition:</b> A short phrase used to uniquely identify the Project to a user.
   */
  public static final String PROP_PROJECT_TAG = "projectTag";

  /**
   *Name of the <i>Project Summary Text</i> attribute<br><b>Definition:</b> A brief explanation of the goals and/or purpose of the Project.
   */
  public static final String PROP_PROJECT_SUMMARY_TEXT = "projectSummaryText";

  /**
   *Name of the <i>Project At Risk Flag</i> attribute<br><b>Definition:</b> A positive value indicates that the project has problems that need to be brought to management attention.
   */
  public static final String PROP_PROJECT_AT_RISK_FLAG = "projectAtRiskFlag";
  
  /**
   * Name of the <i>Project Is Cloud Related Flag</i> attribute<br><b>Definition:</b> A positive value indicates that the project is related to a Cloud product or service.
   */
  public static final String PROP_PROJECT_IS_CLOUD_RELATED_FLAG = "projectCloudRelatedFlag";

 /**
   *Getter for the {@link #PROP_PROJECT_TAG} attribute
   * @return String
   */
  public String getProjectTag();

  /**
   *Setter for the {@link #PROP_PROJECT_TAG} attribute
   * @param projectTag New value
   * @throws org.birddog.model.exceptions.DuplicateValueException Throw when the provided ProjectTag exists for another Project in the data set.
   */
  public void setProjectTag(String projectTag) throws DuplicateValueException;

  /**
   *Getter for the {@link #PROP_PROJECT_SUMMARY_TEXT} attribute
   * @return String
   */
  public String getProjectSummaryText();

  /**
   *Setter for the {@link #PROP_PROJECT_SUMMARY_TEXT} attribute
   * @param projectSummaryText New value
   */
  public void setProjectSummaryText(String projectSummaryText);  

  /**
   *Getter for the {@link #PROP_PROJECT_AT_RISK_FLAG} attribute
   * @return String
   */
  public boolean isProjectAtRiskFlag();

  /**
   *Setter for the {@link #PROP_PROJECT_AT_RISK_FLAG} attribute
   * @param projectAtRiskFlag New value
   */
  public void setProjectAtRiskFlag(boolean projectAtRiskFlag);  

    /**
   *Getter for the {@link #PROP_PROJECT_IS_CLOUD_RELATED_FLAG} attribute
   * @return boolean
   */
  public boolean isProjectCloudRelatedFlag();

  /**
   *Setter for the {@link #PROP_PROJECT_IS_CLOUD_RELATED_FLAG} attribute
   * @param projectCloudRelatedFlag New value
   */
  public void setProjectCloudRelatedFlag(boolean projectCloudRelatedFlag);
}
