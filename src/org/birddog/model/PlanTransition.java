/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 * Associates a state transition that has occurred to a Plan.<br>Plan Transition extends {@link org.birddog.model.Event} entity, but includes a relationships to the associated {@link org.birddog.model.Plan} and {@link org.birddog.model.Transition}.  Therefore, this entity is not strictly in conformance with the 3NF Data Model.
 * @author mlooman
 */
public interface PlanTransition extends Event {

  /**
   * Name of the <i>Transition Applies to Plan</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Plan} which experienced this {@link org.birddog.model.Transition}.
   */
  public static final String PROP_TRANSITION_APPLIES_TO_PLAN = "transitionAppliesToPlan";

  /**
   * Name of the <i>Transition</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Transition} which has occurred to the related {@link org.birddog.model.Plan}.
   */
  public static final String PROP_TRANSITION = "transition";
    
  /**
   *Getter for the {@link #PROP_TRANSITION_APPLIES_TO_PLAN} attribute
   * @return {@link org.birddog.model.Plan}
   */
  public Plan getTransitionAppliesToPlan();

  /**
   *Setter for the {@link #PROP_TRANSITION_APPLIES_TO_PLAN} attribute
   * @param transitionAppliesToPlan New Value
   */
  public void setTransitionAppliesToPlan(Plan transitionAppliesToPlan);

  /**
   *Getter for the {@link #PROP_TRANSITION} attribute
   * @return {@link org.birddog.model.Transition}
   */
  public Transition getTransition();
  
  /**
   * Setter for the {@link #PROP_TRANSITION} attribute
   * @param transition New Value
   */
  public void setTransition(Transition transition);
}
