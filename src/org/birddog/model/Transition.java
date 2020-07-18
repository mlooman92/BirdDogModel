/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import org.birddog.model.exceptions.InvalidItemTypeException;

/**
 * Event subtype describing a change from one state to another.  Includes a denormalization by including the {@link org.birddog.model.ItemType} for which the Transition may occur.
 * @author mlooman
 */
public interface Transition extends Datum {

  /**
   *Name of the <i>Transition Applies to Plan Type</i> attribute<br><b>Definition:</b> Identifies the {@link org.birddog.model.ItemType} for which the Transition may occur. (NOTE: This attribute should be validated to be a Plan type or subtype of Plan
   */
  public static final String PROP_TRANSITION_APPLIES_TO_PLAN_TYPE = "transitionAppliesToPlanType";

  /**
   *Name of the <i>Transition From State name</i> attribute<br><b>Definition:</b> The source condition from which the transition occurs
   */
  public static final String PROP_TRANSITION_FROM_STATE_NAME = "transitionFromStateName";

  /**
   *Name of the <i>Transition To State Name</i> attribute<br><b>Definition:</b> The target condition to which the transition occurs.
   */
  public static final String PROP_TRANSITION_TO_STATE_NAME = "transitionToStateName";

  /**
   *Name of the <i>Transition Reason Name</i> attribute<br><b>Definition:</b> The cause for the transition.
   */
  public static final String PROP_TRANSITION_REASON_NAME = "transitionReasonName";

  /**
   * Name of the <i>Transition Is Active Flag</i> attribute<br><b>Definition:</b> Boolean value that indicates the Transition can be applied to events.  A negative value indicates the Transition exists for historical records.
   */
  public static final String PROP_TRANSITION_IS_ACTIVE_FLAG = "transitionIsActiveFlag";
  
  public static final String PROP_TRANSITION_FROM_STATE_ORDINAL = "transitionFromStateOrdinal";
  public static final String PROP_TRANSITION_TO_STATE_ORDINAL = "transitionToStateOrdinal";
  public static final String PROP_TRANSITION_REASON_ORDINAL = "transitionReasonOrdinal";
  
  /**
   *Getter for the {@link #PROP_ITEM_TYPE} attribute.
   * @return {@link org.birddog.model.ItemType}
   */
  public ItemType getTransitionAppliesToPlanType();

  /**
   *Setter for the {@link #PROP_ITEM_TYPE} attribute.
   * @param transitionAppliesToPlanType New Value
   * @throws org.birddog.model.exceptions.InvalidItemTypeException Thrown when the {@link org.birddog.model.ItemType} is not a subtype of Plan
   */
  public void setTransitionAppliesToPlanType(ItemType transitionAppliesToPlanType) throws InvalidItemTypeException;

  /**
   *Getter for the {@link #PROP_TRANSITION_FROM_STATE_NAME} attribute.
   * @return String
   */
  public String getTransitionFromStateName();

  /**
   *Setter for the {@link #PROP_TRANSITION_FROM_STATE_NAME} attribute
   * @param transitionFromStateName New Value
   */
  public void setTransitionFromStateName(String transitionFromStateName);

  /**
   *Getter for the {@link #PROP_TRANSITION_TO_STATE_NAME} attribute
   * @return String
   */
  public String getTransitionToStateName();

  /**
   *Setter for the {@link #PROP_TRANSITION_TO_STATE_NAME} attribute
   * @param transitionToStateName New Value
   */
  public void setTransitionToStateName(String transitionToStateName);

  /**
   *Getter for the {@link #PROP_TRANSITION_REASON_NAME} attribute
   * @return String
   */
  public String getTransitionReasonName();

  /**
   *Setter for the {@link #PROP_TRANSITION_REASON_NAME} attribute
   * @param transitionReasonName New value
   */
  public void setTransitionReasonName(String transitionReasonName);
  
  public int getTransitionFromStateOrdinal();
  public void setTransitionFromStateOrdinal(int transitionFromStateOrdinal);
  public int getTransitionToStateOrdinal();
  public void setTransitionToStateOrdinal(int transtionToStateOrdinal);
  public int getTransitionReasonOrdinal();
  public void setTransitionReasonOrdinal(int transitionReasonOrdinal);
  
  /**
   *Getter for the {@link #PROP_TRANSITION_IS_ACTIVE_FLAG} attribute.
   * @return boolean
   */
  public boolean getTransitionIsActiveFlag();
  
  /**
   *Setter for the {@link #PROP_TRANSITION_IS_ACTIVE_FLAG} attribute.
   * @param transitionIsActiveFlag New value
   */
  public void setTransitionIsActiveFlag(boolean transitionIsActiveFlag);

//<editor-fold desc="Class Definition" defaultstate="collapsed">
//  private ItemType transitionAppliesToPlanType;
//  private String transitionFromStateName;
//  private String transitionToStateName;
//  private String transitionReasonName;
//
//  public Transition() {
//  }
//
//  public Transition(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Transition(Integer itemIdentifier, ItemType transitionAppliesToPlanType, String transitionFromStateName, String transitionToStateName, String transitionReasonName) {
//    super(itemIdentifier);
//    this.transitionAppliesToPlanType = transitionAppliesToPlanType;
//    this.transitionFromStateName = transitionFromStateName;
//    this.transitionToStateName = transitionToStateName;
//    this.transitionReasonName = transitionReasonName;
//  }
//
//  public ItemType getTransitionAppliesToPlanType() {
//    return transitionAppliesToPlanType;
//  }
//
//  public void setTransitionAppliesToPlanType(ItemType transitionAppliesToPlanType) {
//    this.transitionAppliesToPlanType = transitionAppliesToPlanType;
//  }
//
//  public String getTransitionFromStateName() {
//    return transitionFromStateName;
//  }
//
//  public void setTransitionFromStateName(String transitionFromStateName) {
//    this.transitionFromStateName = transitionFromStateName;
//  }
//
//  public String getTransitionToStateName() {
//    return transitionToStateName;
//  }
//
//  public void setTransitionToStateName(String transitionToStateName) {
//    this.transitionToStateName = transitionToStateName;
//  }
//
//  public String getTransitionReasonName() {
//    return transitionReasonName;
//  }
//
//  public void setTransitionReasonName(String transitionReasonName) {
//    this.transitionReasonName = transitionReasonName;
//  }
//</editor-fold>
  
}
