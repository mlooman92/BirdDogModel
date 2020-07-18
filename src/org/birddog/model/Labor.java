/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.util.List;

/**
 * Asset subtype used to track work time.
 * @author mlooman
 */
public interface Labor extends Asset {

  /**
   * Name for <i>Labor Is Chargeable Flag</i> attribute<br><b>Definition:</b>  Flag indicating that the Labor code can be used for charging time on the User's time card.
   */
  public static final String PROP_LABOR_IS_CHARGEABLE_FLAG = "laborIsChargeableFlag";

  /**
   * Name for <i>Labor Include in Work Hours Flag</i> attribute<br><b>Definition</b>: Indicates that the Labor account is used for Work Time charging
   */
  public static final String PROP_LABOR_INCLUDE_IN_WORK_HOURS_FLAG = "laborIncludeInWorkHoursFlag";

  /**
   * Name for <i>Labor Tree String</i> attribute<br><b>Definition:</b>  String that displays the rollup of the Labor Account to higher Level accounts
   */
  public static final String PROP_LABOR_TREE_STRING = "laborTreeString";

  /**
   * Name for <i>Labor Parent Labor</i> attribute<br><b>Definition:</b>  The Labor Account into which this Labor Account rolls up
   */
  public static final String PROP_LABOR_PARENT_LABOR = "laborParentLabor";

  /**
   * Name for the <i>Labor Performance List</i> attribute<br><b>Definition</b>:  A list of the Performance entries whose time has been accounted to this Labor Account
   */
  public static final String PROP_LABOR_PERFORMANCE_LIST = "laborPerformanceList";

  /**
   * Name for the <i>Labor Is Default For Plan List</i> attribute<br><b>Definition:</b>  A list of Plan Activities whose associated Performance will be accounted to the Labor Account by default.
   */
  public static final String PROP_LABOR_IS_DEFAULT_FOR_PLAN_LIST = "laborIsDefaultForPlanList";

  /**
   * Name for the <i>Labor Record Against Labor</i> attribute<br><b>Definition:</b>  The Labor Account which is used to charge Labor for Performance entries assigned to this Labor Account.
   */
  public static final String PROP_LABOR_RECORD_AGAINST_LABOR = "laborRecordAgainstLabor";

  /**
   * Name for the <i>Labor Records Labor For List</i> attribute<br><b>Definition:</b> List of Labor accounts for which this Labor Account is used to charge related work.
   */
  public static final String PROP_LABOR_RECORDS_LABOR_FOR_LIST = "laborRecordsLaborForList";

  /**
   * Getter for the {@link #PROP_LABOR_IS_CHARGEABLE_FLAG} attribute
   * @return boolean Flag indicating work can be charged to this Labor Account
   */
  public boolean getLaborIsChargeableFlag();

  /**
   * Setter for the {@link #PROP_LABOR_IS_CHARGEABLE_FLAG} attribute
   * @param laborIsChargeableFlag New value for the <i>Labor Is Chargeable Flag</i>
   */
  public void setLaborIsChargeableFlag(boolean laborIsChargeableFlag);

  /**
   * Getter for the {@link #PROP_LABOR_INCLUDE_IN_WORK_HOURS_FLAG} attribute
   * @return boolean
   */
  public boolean getLaborIncludeInWorkHoursFlag();

  /**
   * Setter for the {@link #PROP_LABOR_INCLUDE_IN_WORK_HOURS_FLAG} attribute
   * @param laborIncludeInWorkHoursFlag New Value
   */
  public void setLaborIncludeInWorkHoursFlag(boolean laborIncludeInWorkHoursFlag);

  /**
   * Getter for the {@link #PROP_LABOR_TREE_STRING} attribute
   * @return String
   */
  public String getLaborTreeString();

  /**
   * Setter for the {@link #PROP_LABOR_TREE_STRING} attribute
   * @param laborTreeString New value
   */
  public void setLaborTreeString(String laborTreeString);

  /**
   * Getter for the {@link #PROP_LABOR_PARENT_LABOR} attribute
   * @return Labor
   */
  public Labor getLaborParentLabor();

  /**
   * Setter for the {@link #PROP_LABOR_PARENT_LABOR} attribute
   * @param laborParentLabor New value
   */
  public void setLaborParentLabor(Labor laborParentLabor);

  /**
   * Getter for the {@link #PROP_LABOR_PERFORMANCE_LIST} attribute
   * @return List&lt;Performance&gt;
   */
  public List<Performance> getLaborPerformanceList();

  /**
   * Setter for the {@link #PROP_LABOR_PERFORMANCE_LIST} attribute
   * @param laborPerformanceList New Value
   */
  public void setLaborPerformanceList(List<Performance> laborPerformanceList);

  /**
   * Getter for the {@link #PROP_LABOR_IS_DEFAULT_FOR_PLAN_LIST} attribute
   * @return List&lt;{@link org.birddog.model.Plan}&gt;
   */
  public List<Plan> getLaborIsDefaultForPlanList();

  /**
   * Setter for the {@link #PROP_LABOR_IS_DEFAULT_FOR_PLAN_LIST} attribute
   * @param laborIsDefaultForPlanList New Value
   */
  public void setLaborIsDefaultForPlanList(List<Plan> laborIsDefaultForPlanList);

  /**
   * Getter for the {@link #PROP_LABOR_RECORD_AGAINST_LABOR} attribute
   * @return {@link org.birddog.model.Labor}
   */
  public Labor getLaborRecordAgainstLabor();

  /**
   * Setter for the {@link #PROP_LABOR_RECORD_AGAINST_LABOR} attribute
   * @param laborRecordAgainstLabor New Value
   */
  public void setLaborRecordAgainstLabor(Labor laborRecordAgainstLabor);

  /**
   * Getter for the {@link #PROP_LABOR_RECORDS_LABOR_FOR_LIST} attribute
   * @return List&lt;{@link org.birddog.model.Labor}&gt;
   */
  public List<Labor> getLaborRecordsLaborForList();

  /**
   * Setter form the {@link #PROP_LABOR_RECORDS_LABOR_FOR_LIST} attribute
   * @param laborRecordsLaborForList New Value
   */
  public void setLaborRecordsLaborForList(List<Labor> laborRecordsLaborForList);
//<editor-fold desc="Class Definition" defaultstate="collapsed">
//  private boolean laborIsChargeableFlag;
//  private boolean laborIncludeInWorkHoursFlag;
//  private String laborTreeString;
//  private Labor laborParentLabor;
//  private List<Performance> laborPerformanceList;
//  private List<Plan> laborIsDefaultForPlanList;
//  private Labor laborRecordAgainstLabor;
//  private List<Labor> laborRecordsLaborForList;
//
//  public Labor() {
//  }
//
//  public Labor(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Labor(Integer itemIdentifier, ItemType itemType , String assetName , boolean laborIsChargeableFlag, boolean laborIncludeInWorkHoursFlag, String laborTreeString, Labor laborParentLabor, List<Performance> laborPerformanceList, List<Plan> laborIsDefaultForPlanList, Labor laborRecordAgainstLabor, List<Labor> laborRecordsLaborForList) {
//    super(itemIdentifier,itemType,assetName);
//    this.laborIsChargeableFlag = laborIsChargeableFlag;
//    this.laborIncludeInWorkHoursFlag = laborIncludeInWorkHoursFlag;
//    this.laborTreeString = laborTreeString;
//    this.laborParentLabor = laborParentLabor;
//    this.laborPerformanceList = laborPerformanceList;
//    this.laborIsDefaultForPlanList = laborIsDefaultForPlanList;
//    this.laborRecordAgainstLabor = laborRecordAgainstLabor;
//    this.laborRecordsLaborForList = laborRecordsLaborForList;
//  }
//
//  public boolean isLaborIsChargeableFlag() {
//    return laborIsChargeableFlag;
//  }
//
//  public void setLaborIsChargeableFlag(boolean laborIsChargeableFlag) {
//    this.laborIsChargeableFlag = laborIsChargeableFlag;
//  }
//
//  public boolean isLaborIncludeInWorkHoursFlag() {
//    return laborIncludeInWorkHoursFlag;
//  }
//
//  public void setLaborIncludeInWorkHoursFlag(boolean laborIncludeInWorkHoursFlag) {
//    this.laborIncludeInWorkHoursFlag = laborIncludeInWorkHoursFlag;
//  }
//
//  public String getLaborTreeString() {
//    return laborTreeString;
//  }
//
//  public void setLaborTreeString(String laborTreeString) {
//    this.laborTreeString = laborTreeString;
//  }
//
//  public Labor getLaborParentLabor() {
//    return laborParentLabor;
//  }
//
//  public void setLaborParentLabor(Labor laborParentLabor) {
//    this.laborParentLabor = laborParentLabor;
//  }
//
//  public List<Performance> getLaborPerformanceList() {
//    return laborPerformanceList;
//  }
//
//  public void setLaborPerformanceList(List<Performance> laborPerformanceList) {
//    this.laborPerformanceList = laborPerformanceList;
//  }
//
//  public List<Plan> getLaborIsDefaultForPlanList() {
//    return laborIsDefaultForPlanList;
//  }
//
//  public void setLaborIsDefaultForPlanList(List<Plan> laborIsDefaultForPlanList) {
//    this.laborIsDefaultForPlanList = laborIsDefaultForPlanList;
//  }
//
//  public Labor getLaborRecordAgainstLabor() {
//    return laborRecordAgainstLabor;
//  }
//
//  public void setLaborRecordAgainstLabor(Labor laborRecordAgainstLabor) {
//    this.laborRecordAgainstLabor = laborRecordAgainstLabor;
//  }
//
//  public List<Labor> getLaborRecordsLaborForList() {
//    return laborRecordsLaborForList;
//  }
//
//  public void setLaborRecordsLaborForList(List<Labor> laborRecordsLaborForList) {
//    this.laborRecordsLaborForList = laborRecordsLaborForList;
//  }
//</editor-fold>
  
}
