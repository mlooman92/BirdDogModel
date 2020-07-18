/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.util.List;

/**
 * Metadata containing the definition of the Item Types implemented in the system.
 * @author mlooman
 */
public interface ItemType {

  /**
   * Name of the <i>Item Type Name</i> attribute<br><b>Definition:</b>  Unique name that identifies the Item Type
   */
  public static final String PROP_ITEM_TYPE_NAME = "itemTypeName";

  /**
   * Name of the <i>Item Type Abbreviation Code</i> attribute<br><b>Definition:</b>  A three letter code that is unique to the Item Type
   */
  public static final String PROP_ITEM_TYPE_ABBREVIATION_CODE = "itemTypeAbbreviationCode";

  /**
   * Name of the <i>Item Type Definition Text</i> attribute<br><b>Definition:</b>  A detailed description of the Item Type
   */
  public static final String PROP_ITEM_TYPE_DEFINITION_TEXT = "itemTypeDefinitionText";

  /**
   * Name of the <i>Item Type Supertype</i> attribute<br><b>Definition:</b>  Identifies the Supertype from which the Item Type is derived.
   */
  public static final String PROP_ITEM_TYPE_SUPERTYPE = "itemTypeSupertype";

  /**
   * Name of the <i>Item Type Subtype List</i> attribute<br><b>Definition:</b>  List containing the direct subtypes derived from this Item Type.
   */
  public static final String PROP_ITEM_TYPE_SUBTYPE_LIST = "itemTypeSubtypeList";

  /**
   * Name of the <i>Item Type Tree String</i> attribute<br><b>Definition:</b>  String representing the Item Type's derivation from the Top Level Item type
   */
  public static final String PROP_ITEM_TYPE_TREE_STRING = "itemTypeTreeString";

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_NAME} attribute
   * @return String of the <i>Item Type Name</i>
   */
  
  public String getItemTypeName();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_NAME} attribute
   * @param itemTypeName New value for the <i>Item Type Name</i>
   */
  public void setItemTypeName(String itemTypeName);

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_ABBREVIATION_CODE} attribute
   * @return String of the <i>Item Type Abbreviation Code</i>
   */
  public String getItemTypeAbbreviationCode();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_ABBREVIATION_CODE} attribute
   * @param itemTypeAbbreviationCode  New value for the <i>Item Type Abbreviation Code</i>
   */
  public void setItemTypeAbbreviationCode(String itemTypeAbbreviationCode);

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_DEFINITION_TEXT} attribute
   * @return String of the <i>Item Type Definition Text</i>
   */
  public String getItemTypeDefinitionText();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_DEFINITION_TEXT} attribute
   * @param itemTypeDefinitionText New value for the <i>Item Type Definition Text</i>
   */
  public void setItemTypeDefinitionText(String itemTypeDefinitionText);

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_SUPERTYPE} attribute
   * @return ItemType from which this Item Type is derived.
   */
  public ItemType getItemTypeSupertype();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_SUPERTYPE} attribute
   * @param itemTypeSupertype New value for the <i>Item Type Supertype</i>
   */
  public void setItemTypeSupertype(ItemType itemTypeSupertype);

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_SUBTYPE_LIST} attribute
   * @return List&lt;ItemType&gt; of Subtypes derived from this Item Type
   */
  public List<ItemType> getItemTypeSubtypeList();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_SUBTYPE_LIST} attribute
   * @param itemTypeSubtypeList  New value(s) for the <i>Item Type Subtype List</i>
   */
  public void setItemTypeSubtypeList(List<ItemType> itemTypeSubtypeList);

  /**
   * Getter for the {@link #PROP_ITEM_TYPE_TREE_STRING} attribute
   * @return String representing the Derivation of the Item Type from the Root Type
   */
  public String getItemTypeTreeString();

  /**
   * Setter for the {@link #PROP_ITEM_TYPE_TREE_STRING} attribute
   * @param itemTypeTreeString New Value for the <i>Item Type Tree String</i>
   */
  public void setItemTypeTreeString(String itemTypeTreeString);

  
  //<editor-fold desc="class attributes and methods" defaultstate="collapsed">
//  private String itemTypeName;
//  private String itemTypeAbbreviationCode;
//  private String itemTypeDefinitionText;
//  private ItemType itemTypeSupertype;
//  private List<ItemType> itemTypeSubtypeList;
//  private String itemTypeTreeString;
  
//  public ItemType(){
//    
//  }
//  
//  public ItemType(String itemTypeName){
//    this.itemTypeName = itemTypeName;
//  }
//
//  public ItemType(String itemTypeName, String itemTypeAbbreviationCode, String itemTypeDefinitionText, ItemType itemTypeSupertype, String itemTypeTreeString) {
//    this.itemTypeName = itemTypeName;
//    this.itemTypeAbbreviationCode = itemTypeAbbreviationCode;
//    this.itemTypeDefinitionText = itemTypeDefinitionText;
//    this.itemTypeSupertype = itemTypeSupertype;
//    this.itemTypeTreeString = itemTypeTreeString;
//  }
//
//  public String getItemTypeName() {
//    return itemTypeName;
//  }
//
//  public void setItemTypeName(String itemTypeName) {
//    this.itemTypeName = itemTypeName;
//  }
//
//  public String getItemTypeAbbreviationCode() {
//    return itemTypeAbbreviationCode;
//  }
//
//  public void setItemTypeAbbreviationCode(String itemTypeAbbreviationCode) {
//    this.itemTypeAbbreviationCode = itemTypeAbbreviationCode;
//  }
//
//  public String getItemTypeDefinitionText() {
//    return itemTypeDefinitionText;
//  }
//
//  public void setItemTypeDefinitionText(String itemTypeDefinitionText) {
//    this.itemTypeDefinitionText = itemTypeDefinitionText;
//  }
//
//  public ItemType getItemTypeSupertype() {
//    return itemTypeSupertype;
//  }
//
//  public void setItemTypeSupertype(ItemType itemTypeSupertype) {
//    this.itemTypeSupertype = itemTypeSupertype;
//  }
//
//  public List<ItemType> getItemTypeSubtypeList() {
//    return itemTypeSubtypeList;
//  }
//
//  public void setItemTypeSubtypeList(List<ItemType> itemTypeSubtypeList) {
//    this.itemTypeSubtypeList = itemTypeSubtypeList;
//  }
//
//  public String getItemTypeTreeString() {
//    return itemTypeTreeString;
//  }
//
//  public void setItemTypeTreeString(String itemTypeTreeString) {
//    this.itemTypeTreeString = itemTypeTreeString;
//  }
  //</editor-fold>
}
