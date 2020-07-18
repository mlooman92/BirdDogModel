/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A {@link org.birddog.model.Project} subtype with the sale of a service or product as its goal.
 * @author mlooman
 */
public interface Opportunity extends Project {

  /**
   * Name of the <i>Opportunity Current Primary Customer Party</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Party} to whom the Opportunity is trying to sell.
   */
  public static final String PROP_OPPORTUNITY_CURRENT_PRIMARY_CUSTOMER_PARTY = "opportunityCurrentPrimaryCustomerParty";

  /**
   * Name of the <i>Opportunity Fusion Number</i> attribute<br><b>Definition:</b> The identifier of the Opportunity within the CRM sales management system
   */
  public static final String PROP_OPPORTUNITY_FUSION_NUMBER = "opportunityFusionNumber";

  /**
   * Name of the <i>Opportunity Amount</i> attribute<br><b>Definition:</b> The value of the sales.
   */
  public static final String PROP_OPPORTUNITY_AMOUNT = "opportunityAmount";

  /**
   * Name of the <i>Opportunity Probability Percentage</i> attribute<br><b>Definition:</b> The likelihood that the Opportunity will close.
   */
  public static final String PROP_OPPORTUNITY_PROBABILITY_PERCENTAGE = "opportunityProbabilityPercentage";

  /**
   * Name of the <i>Opportunity Fusion Status</i> attribute<br><b>Definition:</b> The status of the associated Opportunity within the CRM sales management system.
   */
  public static final String PROP_OPPORTUNITY_FUSION_STATUS_NAME = "opportunityFusionStatusName";
  
  /**
   * Name of the <i>Opportunity Fusion Data As of Datetime</i> attribute<br><b>Definition:</b> The date on which the CRM Management System data was last loaded into Bird Dog
   */
  public static final String PROP_OPPORTUNITY_FUSION_DATA_ASOF_DATETIME = "opportunityFusionDataAsofDatetime";
  
  /**
   * Getter for the {@link #PROP_OPPORTUNITY_CURRENT_PRIMARY_CUSTOMER_PARTY} attribute
   * @return {@link org.birddog.model.Party}
   */
  public Party getOpportunityCurrentPrimaryCustomerParty();

  /**
   * Setter for the {@link #PROP_OPPORTUNITY_CURRENT_PRIMARY_CUSTOMER_PARTY} attribute
   * @param opportunityCurrentPrimaryCustomerParty New Value
   */
  public void setOpportunityCurrentPrimaryCustomerParty(Party opportunityCurrentPrimaryCustomerParty);

  /**
   * Getter for the {@link #PROP_OPPORTUNITY_FUSION_NUMBER}
   * @return String
   */
  public String getOpportunityFusionNumber();

  /**
   * Setter for the {@link #PROP_OPPORTUNITY_FUSION_NUMBER}
   * @param opportunityFusionNumber New Value
   */
  public void setOpportunityFusionNumber(String opportunityFusionNumber);

  /**
   * Getter for the {@link #PROP_OPPORTUNITY_AMOUNT}
   * @return BigDecimal
   */
  public BigDecimal getOpportunityAmount();

  /**
   * Setter for the {@link #PROP_OPPORTUNITY_AMOUNT}
   * @param opportunityAmount New value
   */
  public void setOpportunityAmount(BigDecimal opportunityAmount);

  /**
   * Getter for the {@link #PROP_OPPORTUNITY_PROBABILITY_PERCENTAGE}
   * @return Float
   */
  public Float getOpportunityProbabilityPercentage();

  /**
   * Setter for the attribute {@link #PROP_OPPORTUNITY_PROBABILITY_PERCENTAGE}
   * @param opportunityProbabilityPercentage New Value
   */
  public void setOpportunityProbabilityPercentage(Float opportunityProbabilityPercentage);  

  /**
   * Getter for the attribute {@link #PROP_OPPORTUNITY_FUSION_STATUS_NAME}
   * @return String
   */
  public String getOpportunityFusionStatusName();
  
  /**
   * Setter for the attribute {@link #PROP_OPPORTUNITY_FUSION_STATUS_NAME}
   * @param opportunityFusionStatusName New Value
   */
  public void setOpportunityFusionStatusName(String opportunityFusionStatusName);
  
  /**
   * Getter for the attribute {@link #PROP_OPPORTUNITY_FUSION_DATA_ASOF_DATETIME}
   * @return String
   */
  public LocalDateTime getOpportunityFusionDataAsofDatetime();
   
  /**
   * Setter for the attribute {@link #PROP_OPPORTUNITY_FUSION_DATA_ASOF_DATETIME}
   * @param opportunityFusionDataAsofDatetime New Value
   */
  public void setOpportunityFusionDataAsofDatetime(LocalDateTime opportunityFusionDataAsofDatetime); 
  
//<editor-fold desc="Class Defintitions" defaultstate="collapsed">
//  private Party opportunityCurrentPrimaryCustomerParty;
//  private String opportunityFusionNumber;
//  private Double opportunityAmount;
//  private Float opportunityProbabilityPercentage;
//
//  public Opportunity() {
//  }
//
//  public Opportunity(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Opportunity(Integer itemIdentifier, ItemType itemType, String activityDescription, LocalDateTime activityActualStartDatetime, LocalDateTime activityActualEndDatetime, String activityNotesText, String projectTag, String projectSummaryText, Party opportunityCurrentPrimaryCustomerParty, String opportunityFusionNumber, Double opportunityAmount, Float opportunityProbabilityPercentage) {
//    super(itemIdentifier, itemType, activityDescription, activityActualStartDatetime, activityActualEndDatetime, activityNotesText, projectTag, projectSummaryText);
//    this.opportunityCurrentPrimaryCustomerParty = opportunityCurrentPrimaryCustomerParty;
//    this.opportunityFusionNumber = opportunityFusionNumber;
//    this.opportunityAmount = opportunityAmount;
//    this.opportunityProbabilityPercentage = opportunityProbabilityPercentage;
//  }
//
//  public Party getOpportunityCurrentPrimaryCustomerParty() {
//    return opportunityCurrentPrimaryCustomerParty;
//  }
//
//  public void setOpportunityCurrentPrimaryCustomerParty(Party opportunityCurrentPrimaryCustomerParty) {
//    this.opportunityCurrentPrimaryCustomerParty = opportunityCurrentPrimaryCustomerParty;
//  }
//
//  public String getOpportunityFusionNumber() {
//    return opportunityFusionNumber;
//  }
//
//  public void setOpportunityFusionNumber(String opportunityFusionNumber) {
//    this.opportunityFusionNumber = opportunityFusionNumber;
//  }
//
//  public Double getOpportunityAmount() {
//    return opportunityAmount;
//  }
//
//  public void setOpportunityAmount(Double opportunityAmount) {
//    this.opportunityAmount = opportunityAmount;
//  }
//
//  public Float getOpportunityProbabilityPercentage() {
//    return opportunityProbabilityPercentage;
//  }
//
//  public void setOpportunityProbabilityPercentage(Float opportunityProbabilityPercentage) {
//    this.opportunityProbabilityPercentage = opportunityProbabilityPercentage;
//  }
//</editor-fold>
  
}
