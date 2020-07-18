/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Top Level data type for all Entities in the system.
 * @author mlooman
 */
public interface Item {
  
  /**
   * Name of the <i>Item Identifier</i> attribute<br><b>Definition:</b>  Unique identifier for the entity
   */
  public static final String PROP_ITEM_IDENTIFIER = "itemIdentifier";

  /**
   * Name of the <i>Item Type</i> attribute<br><b>Definition:</b>  Metadata which identifies the Item's type
   */
  public static final String PROP_ITEM_TYPE = "itemType";

  /**
   *  Name of the <i>Item Notes</i> attribute<br><b>Definition</b>:  Notes which amplify, or add information pertinent to the Item.
   */
  public static final String PROP_ITEM_NOTES_TEXT = "itemNotesText";
  
  /**
   * Getter for the {@link #PROP_ITEM_IDENTIFIER} attribute
   * @return An Integer value of the Unique Identifier
   */
  public Integer getItemIdentifier();

  /**
   * Setter for the {@link #PROP_ITEM_IDENTIFIER} attribute
   * @param itemIdentifier New Value
   */
  public void setItemIdentifier(Integer itemIdentifier);

  /**
   * Getter of the {@link #PROP_ITEM_TYPE} attribute
   * @return {@link org.birddog.model.ItemType}
   */
  public ItemType getItemType();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE} attribute
   * @param itemType New Value
   */
  public void setItemType(ItemType itemType);
  
  /**
   * Setter for the {@link #PROP_ITEM_TYPE} attribute based on the name of the Item Type
   * @param itemTypeName Name of the Item Type to apply
   */
  public void setItemType(String itemTypeName);
 
  /**
   * Getter for the {@link #PROP_ITEM_NOTES_TEXT} attribute
   * @return String
   */
  public String getItemNotesText();

  /**
   * Setter for the {@link #PROP_ITEM_NOTES_TEXT} attribute
   * @param itemNotesText New Value
   */
  public void setItemNotesText(String itemNotesText);
  
  public void addPropertyChangeListener(PropertyChangeListener listener);
  public void removePropertyChangeListener(PropertyChangeListener listener);
  public void firePropertyChange(PropertyChangeEvent event);
  public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue);
  public void firePropertyChange(String propertyName, int oldValue, int newValue);
  public void firePropertyChange(String propertyName, Object oldValue, Object newValue);
        
//<editor-fold desc="Class Definition" defaultstate="collapsed">
//  private Integer itemIdentifier;
//  private ItemType itemType;
//
//  public Integer getItemIdentifier(){
//   return itemIdentifier; 
//  }
//  
//  public void setItemIdentifier(Integer itemIdentifier){
//    this.itemIdentifier = itemIdentifier;
//  }
//  
//  public ItemType getItemType(){
//    return itemType;
//  }  
//  
//  public void setItemType(ItemType itemType){
//    this.itemType = itemType;
//  }
//  
//  public Item(){    
//  }
//  
//  public Item(Integer itemIdentifier){
//    this.itemIdentifier = itemIdentifier;    
//  }
//  public Item(Integer itemIdentifier, ItemType itemType){
//    this.itemIdentifier = itemIdentifier;
//    this.itemType = itemType;
//  }
//</editor-fold>  
}
