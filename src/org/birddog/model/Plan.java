/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import org.birddog.model.exceptions.InvalidTransitionException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * {@link org.birddog.model.Activity} subtype which may be scheduled in advance.
 * @author mlooman
 */
public interface Plan extends Activity {

  /**
   *Name of the <i>Plan Transitions</i> attribute<br><b>Definition:</b> The set of {@link org.birddog.model.PlanTransition}s that have occurred to the Plan.
   */
  public static final String PROP_PLAN_TRANSITION = "planTransitions";

  /**
   *Name of the <i>Plan Status Updates</i> attribute<br><b>Definition:</b> The set of {@link org.birddog.model.PlanStatusUpdate}s that have been recorded for thePlan.
   */
  public static final String PROP_PLAN_STATUS_UPDATES = "planStatusUpdates";

  /**
   *Name of the <i>Plan State Name</i> attribute<br><b>Definition:</b> The name of the current condition of the Plan.
   */
  public static final String PROP_PLAN_STATE_NAME = "planStateName";

  /**
   *Name of the <i>Plan Reason Name</i> attribute<br><b>Definition:</b> The name of the cause for the last state change ({@link org.birddog.model.Transition}) for the Plan.
   */
  public static final String PROP_PLAN_REASON_NAME = "planReasonName";
  
  /**
   *Name of the <i>Plan Scheduled Start Datetime</i> attribute<br><b>Definition:</b> Datetime at which the Plan is scheduled to begin.
   */
  public static final String PROP_PLAN_SCHEDULED_START_DATETIME = "planScheduledStartDatetime";

  /**
   *Name of the <i>Plan Scheduled End Datetime</i> attribute<br><b>Definition:</b> Datetime at which the Plan is scheduled to be completed.
   */
  public static final String PROP_PLAN_SCHEDULED_END_DATETIME = "planScheduledEndDatetime";

  /**
   *Name of the <i>Plan Assigned Actor Person</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Person} which has responsibility for completing the Plan.
   */
  public static final String PROP_PLAN_ASSIGNED_ACTOR_PERSON = "planAssignedActorPerson";

  /**
   *Name of the <i>Plan Owner Party</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Party} for whom the Plan is being completed.
   */
  public static final String PROP_PLAN_OWNER_PARTY = "planOwnerParty";

  /**
   *Name of the <i>Plan WBS Sequence</i> attribute<br><b>Definition:</b> An int value for sorting sibling Plans in a Work Breakdown Structure (WBS).
   */
  public static final String PROP_PLAN_WBS_SEQUENCE ="planWbsSequence";

  /**
   *Name of the <i>Plan WBS Number</i> attribute<br><b>Definition:</b> An outline number (e.g., 1.2.3) which identifies the Plans place within a Work Breakdown Structure (WBS).
   */
  public static final String PROP_PLAN_WBS_NUMBER ="planWbsNumber";

  /**
   *Name of the <i>Plan WBS Sort Number</i> attribute<br><b>Definition:</b> A string value related to the {@link #PROP_PLAN_WBS_NUMBER} such that sorting the strings arranges the Plans in a Hierarchical structure corresponding to the Work Breakdown Structure (WBS)
   */
  public static final String PROP_PLAN_WBS_SORT_NUMBER ="planWbsSortNumber";

  /**
   *Name of the <i>Plan WBS Parent Plan</i> attribute<br><b>Definition:</b> Identifies the Plan's parent in the Work Breakdown Structure (WBS).
   */
  public static final String PROP_PLAN_WBS_PARENT_PLAN ="planWbsParentPlan";

  /**
   *Name of the <i>Plan WBS Children List</i> attribute<br><b>Definition:</b> List&lt;Plan&gt; of Plans which are WBS Children of the Plan.
   */
  public static final String PROP_PLAN_WBS_CHILDREN_LIST ="planWbsChildrenList";
    
  /**
   * Name of the <i>Plan Default Labor</i> attribute<br><b>Definition:</b> Identifies the {@link org.birddog.model.Labor} charge code used by default to charge work performed on this Plan
   */
  public static final String PROP_PLAN_DEFAULT_LABOR = "planDefaultLabor";
  /**
   * Name of the <i>Performance Plan List</i> attribute<br><b>Definition:</b> List of Performance elements documenting work performed on the Plan.
   */
  public static final String PROP_PERFORMANCE_PLAN_LIST = "performancePlanList";
  /**
   *Getter for the {@link #PROP_PLAN_TRANSITION}
   * @return List&lt;PlanTransition&gt;
   */
  public List<PlanTransition> getPlanTransitions();

  /**
   *Getter for the {@link #PROP_PLAN_STATUS_UPDATES}
   * @return List&lt;PlanStatusUpdate&gt;
   */
  public List<PlanStatusUpdate> getPlanStatusUpdates();

  /**
   *Changes the current state of the Plan by applying a defined Transition.  A new {@link org.birddog.model.PlanTransition} entry must be added to the Plan's history.
   * @param transition {@link org.birddog.model.Transition} to be applied to the Plan
   * @param transitionDatetime LocalDateTime at which the transition occurred.
   * @throws org.birddog.model.exceptions.InvalidTransitionException Thrown when the {@link org.birddog.model.Transition} is not in the allowed list for the Plan's {@link org.birddog.model.ItemType} and current State.
   */
  public void changeState(Transition transition, LocalDateTime transitionDatetime) throws InvalidTransitionException;

  /**
   *Changes the current state of the Plan based on a new State and Transition Reason.  A new {@link org.birddog.model.PlanTransition} entry must be added to the Plan's history.
   * @param planStateName New State Name
   * @param planReasonName Reason for the Transition
   * @param planTransitionDatetime LocalDateTime at which the transition occurred.
   * @throws org.birddog.model.exceptions.InvalidTransitionException Thrown when the {@link org.birddog.model.Transition} is not in the allowed list for the Plan's {@link org.birddog.model.ItemType} and current State.
   */
  public void changeState(String planStateName, String planReasonName, LocalDateTime planTransitionDatetime) throws InvalidTransitionException;

  /**
   *Getter for the {@link #PROP_PLAN_STATE_NAME} attribute.  (NOTE: There is not corresponding Setter as one of the changeState() methods should be used to set this value.)
   * @return String
   */
  public String getPlanStateName();

  /**
   **Getter for the {@link #PROP_PLAN_REASON_NAME} attribute.  (NOTE: There is not corresponding Setter as one of the changeState() methods should be used to set this value.)
   * @return String
   */
  public String getPlanReasonName();

  /**
   *Getter for the {@link #PROP_PLAN_SCHEDULED_START_DATETIME} attribute.
   * @return LocalDateTime
   */
  public LocalDateTime getPlanScheduledStartDatetime();

  /**
   *Setter for the {@link #PROP_PLAN_SCHEDULED_START_DATETIME} attribute
   * @param planScheduledStartDatetime New value
   */
  public void setPlanScheduledStartDatetime(LocalDateTime planScheduledStartDatetime);

  /**
   *Getter for the {@link #PROP_PLAN_SCHEDULED_END_DATETIME} attribute
   * @return LocalDateTime
   */
  public LocalDateTime getPlanScheduledEndDatetime();

  /**
   *Setter for the {@link #PROP_PLAN_SCHEDULED_END_DATETIME} attribute
   * @param planScheduledEndDatetime New Value
   */
  public void setPlanScheduledEndDatetime(LocalDateTime planScheduledEndDatetime);
  
  /**
   *Getter for the {@link #PROP_PLAN_ASSIGNED_ACTOR_PARTY} attribute
   * @return {@link org.birddog.model.Party}
   */
  public Person getPlanAssignedActorPerson();

  /**
   *Setter for the {@link #PROP_PLAN_ASSIGNED_ACTOR_PARTY} attribute
   * @param planAssignedActorPerson New value
   */
  public void setPlanAssignedActorPerson(Person planAssignedActorPerson);

  /**
   *Getter for the {@link #PROP_PLAN_OWNER_PARTY} attribute
   * @return {@link org.birddog.model.Party}
   */
  public Party getPlanOwnerParty();

  /**
   *Setter for the {@link #PROP_PLAN_OWNER_PARTY} attribute
   * @param planOwnerParty New value
   */
  public void setPlanOwnerParty(Party planOwnerParty);

  /**
   *Getter for the {@link #PROP_PLAN_WBS_SEQUENCE} attribute
   * @return int
   */
  public int getPlanWbsSequence();

  /**
   *Setter for the {@link #PROP_PLAN_WBS_SEQUENCE} attribute
   * @param planWbsSequence New value
   */
  public void setPlanWbsSequence(int planWbsSequence);

  /**
   *Getter for the {@link #PROP_PLAN_WBS_NUMBER} attribute
   * @return String
   */
  public String getPlanWbsNumber();

  /**
   *Setter for the {@link #PROP_PLAN_WBS_NUMBER} attribute
   * @param planWbsNumber New value
   */
  public void setPlanWbsNumber(String planWbsNumber);

  /**
   *Getter for the {@link #PROP_PLAN_WBS_SORT_NUMBER} attribute
   * @return String
   */
  public String getPlanWbsSortNumber();

  /**
   *Setter for the {@link #PROP_PLAN_WBS_SORT_NUMBER} attribute
   * @param planWbsSortNumber New value
   */
  public void setPlanWbsSortNumber(String planWbsSortNumber);

  /**
   *Getter for the {@link #PROP_PLAN_WBS_PARENT_PLAN} attribute
   * @return {@link org.birddog.model.Plan}
   */
  public Plan getPlanWbsParentPlan();

  /**
   *Setter for the {@link #PROP_PLAN_WBS_PARENT_PLAN} attribute
   * @param planWbsParentPlan New Value
   */
  public void setPlanWbsParentPlan(Plan planWbsParentPlan);

  /**
   *Getter for the {@link #PROP_PLAN_WBS_CHILDREN_LIST} attribute
   * @return List&lt;{@link org.birddog.model.Plan}&gt;
   */
  public List<Plan> getPlanWbsChildrenList();

  /**
   *Setter for the {@link #PROP_PLAN_WBS_CHILDREN_LIST} attribute
   * @param planWbsChildrenList New value
   */
  public void setPlanWbsChildrenList(List<Plan> planWbsChildrenList);

  /**
   * Getter for the {@link #PROP_PLAN_DEFAULT_LABOR} attribute
   * @return {@link Labor}
   */
  public Labor getPlanDefaultLabor();
  
  /**
   * Setter for the {@link #PROP_PLAN_DEFAULT_LABOR} attribute
   * @param labor New Value
   */
   public void setPlanDefaultLabor(Labor labor);
   
   /**
    * Getter for the {@link #PROP_PERFORMANCE_PLAN_LIST
    * @return List&lt{@link Performance}&gt
    */
   public List<Performance> getPerformancePlanList();
   
   /**
    * Setter for the {@link #PROP_PERFORMANCE_PLAN_LIST
    * @param performancePlanList New value
    */
   public void setPerformancePlanList(List<Performance> performancePlanList);
}
