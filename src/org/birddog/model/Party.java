/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 * An entity that can own property, enter into contracts or perform actions
 * @author mlooman
 */
public interface Party extends Item{

  /**
   *  Name of the <i>Party Primary URI String</i> attribute<br><b>Definition</b>: URI (email or website) that is used to uniquely identify the Party to users and external systems.
   */
  public static final String PROP_PARTY_PRIMARY_URI_STRING = "partyPrimaryUriString";

  /**
   *  Name of the <i>Party Name</i> attribute<br><b>Definition</b>: Full Name of the Party
   */
  public static final String PROP_PARTY_NAME = "partyName";

  /**
   *  Name of the <i>Party Alternative Name</i> attribute<br><b>Definition</b>: Alternative name for the Party
   */
  public static final String PROP_PARTY_ALTERNATIVE_NAME = "partyAlternativeName";

  /**
   * Getter for the {@link #PROP_PARTY_PRIMARY_URI_STRING} attribute
   * @return String value of the Party's URI
   */
  public String getPartyPrimaryUriString();

  /**
   * Setter for the {@link #PROP_PARTY_PRIMARY_URI_STRING} attribute
   * @param partyPrimaryUriString  The new value of the Party's URI.
   */
  public void setPartyPrimaryUriString(String partyPrimaryUriString);

  /**
   * Getter for the {@link #PROP_PARTY_NAME} attribute
   * @return String value of the Party's Full name
   */
  public String getPartyName();

  /**
   * Setter for the {@link #PROP_PARTY_NAME} attribute
   * @param partyName  The new value of the Party's Full name
   */
  public void setPartyName(String partyName);

  /**
   * Getter for the {@link #PROP_PARTY_ALTERNATIVE_NAME} attribute
   * @return String value of the Party's Alternative Name
   */
  public String getPartyAlternativeName();

  /**
   * Setter for the {@link #PROP_PARTY_ALTERNATIVE_NAME} attribute
   * @param partyAlternativeName The new value of the Party's Alternative Name
   */
  public void setPartyAlternativeName(String partyAlternativeName);


//<editor-fold desc="Class Definition" defaultstate="collapsed">
//private String partyPrimaryUriString;
//private String partyName;
//private String partyAlternativeName;
//private RelationshipType partyCurrentUserRelationshipType;
//
//  public Party() {
//  }
//
//  public Party(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//
//  public Party(Integer itemIdentifier, ItemType itemType, String partyPrimaryUriString, String partyName, String partyAlternativeName, RelationshipType partyCurrentUserRelationshipType) {
//    super(itemIdentifier, itemType);
//    this.partyPrimaryUriString = partyPrimaryUriString;
//    this.partyName = partyName;
//    this.partyAlternativeName = partyAlternativeName;
//    this.partyCurrentUserRelationshipType = partyCurrentUserRelationshipType;
//  }
//
//  public String getPartyPrimaryUriString() {
//    return partyPrimaryUriString;
//  }
//
//  public void setPartyPrimaryUriString(String partyPrimaryUriString) {
//    this.partyPrimaryUriString = partyPrimaryUriString;
//  }
//
//  public String getPartyName() {
//    return partyName;
//  }
//
//  public void setPartyName(String partyName) {
//    this.partyName = partyName;
//  }
//
//  public String getPartyAlternativeName() {
//    return partyAlternativeName;
//  }
//
//  public void setPartyAlternativeName(String partyAlternativeName) {
//    this.partyAlternativeName = partyAlternativeName;
//  }
//
//  public RelationshipType getPartyCurrentUserRelationshipType() {
//    return partyCurrentUserRelationshipType;
//  }
//
//  public void setPartyCurrentUserRelationshipType(RelationshipType partyCurrentUserRelationshipType) {
//    this.partyCurrentUserRelationshipType = partyCurrentUserRelationshipType;
//  }
//</editor-fold>

}
