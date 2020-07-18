/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.util.List;

/**
 * {@link org.birddog.model.Party} subtype for human beings
 * @author mlooman
 */
public interface Person extends Party {

  /**
   * Name of the <i>Person Family Name</i> attribute<br><b>Definition:</b> The family (or last) name of the individual.
   */
  public static final String PROP_PERSON_FAMILY_NAME = "personFamilyName";

  /**
   * Name of the <i>Person Given Name</i> attribute<br><b>Definition:</b> The given (or first) name of the individual.
   */
  public static final String PROP_PERSON_GIVEN_NAME = "personGivenName";

  /**
   * Name of the <i>Person Direct Manager Person</i> attribute<br><b>Definition:</b> {@link org.birddog.model.Person} who is this Person's direct Manager, that is to whom this person reports
   */
  public static final String PROP_PERSON_DIRECT_MANAGER_PERSON = "personDirectManagerPerson";

  /**
   * Name of the <i>Person Direct Reports List</i> attribute<br><b>Definition:</b> List of people who report directly to the Person
   */
  public static final String PROP_PERSON_DIRECT_REPORTS_LIST = "personDirectReportsList";
  

  /**
   * Getter for the {@link #PROP_PERSON_FAMILY_NAME} attribute
   * @return String
   */
  public String getPersonFamilyName();

  /**
   * Setter for the {@link #PROP_PERSON_FAMILY_NAME} attribute
   * @param personFamilyName New value
   */
  public void setPersonFamilyName(String personFamilyName);

  /**
   * Getter for the {@link #PROP_PERSON_GIVEN_NAME} attribute
   * @return String
   */
  public String getPersonGivenName();

  /**
   * Setter for the {@link #PROP_PERSON_GIVEN_NAME} attribute
   * @param personGivenName New Value
   */
  public void setPersonGivenName(String personGivenName);

  /**
   * Getter for the {@link #PROP_PERSON_DIRECT_MANAGER_PERSON} attribute
   * @return {@link org.birddog.model.Person}
   */
  public Person getPersonDirectManagerPerson();

  /**
   * Setter for the {@link #PROP_PERSON_DIRECT_MANAGER_PERSON} attribute
   * @param personDirectManagerPerson New Value
   */
  public void setPersonDirectManagerPerson(Person personDirectManagerPerson);

  /**
   * Getter for the {@link #PROP_PERSON_DIRECT_REPORTS_LIST} attribute
   * @return List&lt;Person&gt;
   */
  public List<Person> getPersonDirectReportsList();
  
  /**
   * Setter for the {@link #PROP_PERSON_DIRECT_REPORTS_LIST} attribute
   * @param personDirectReportsList New Value
   */
  public void setPersonDirectReportsList(List<Person> personDirectReportsList);

}
