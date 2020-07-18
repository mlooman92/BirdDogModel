/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 * Denormalization of 3NF data model. This is an extension of Relationship between Party and 
 * Datum, where the Datum is the alias name associated with the Party
 * @author mlooman
 */
public interface PartyAlias extends Datum {
  /** 
   * Name of the <i>Party</i> attribute<br><b>Definition:</b> The {@link org.birddog.model.Party} to which the Alias applies
   */
  public static final String PROP_PARTY = "party";

  /**
   * Name of the <i>Alias Name</i> attribute<br><b>Definition:</b> An alternative name for the associated {@link org.birddog.model.Party}
   */
  public static final String PROP_ALIAS_NAME = "aliasName";

  /**
   * Getter for the {@link #PROP_PARTY} attribute
   * @return {@link org.birddog.model.Party}
   */
  public Party getParty();

  /**
   * Setter for the {@link #PROP_PARTY} attribute
   * @param party New value
   */
  public void setParty(Party party);

  /**
   * Getter for the {@link #PROP_ALIAS_NAME} attribute
   * @return String
   */
  public String getAliasName();

  /**
   * Setter for the {{@link #PROP_ALIAS_NAME} attribute
   * @param aliasName New Value
   */
  public void setAliasName(String aliasName);
//<editor-fold desc="Class Definition" defaultstate="collapsed">
//  private Party party;
//  private String aliasName;
//  
//  public PartyAlias(){
//    
//  }
//  public PartyAlias(Party party, String aliasName){
//    this.party = party;
//    this.aliasName = aliasName;
//  }
//
//  public Party getParty() {
//    return party;
//  }
//
//  public void setParty(Party party) {
//    this.party = party;
//  }
//
//  public String getAliasName() {
//    return aliasName;
//  }
//
//  public void setAliasName(String aliasName) {
//    this.aliasName = aliasName;
//  }
//</editor-fold>
          
}
