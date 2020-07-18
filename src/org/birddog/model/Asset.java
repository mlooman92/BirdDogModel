/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 * Any entity that has value.
 * @author mlooman
 */
public interface Asset extends Item {

  /**
   * Name of the <i>Asset Name</i> attribute<br><b>Definition</b>:  Name used to identify an Asset to users
   */
  public static final String PROP_ASSET_NAME = "assetName";

  /**
   * Getter for {@link #PROP_ASSET_NAME} attribute
   * @return String value of the <i>asset name</i>
   */
  public String getAssetName();

  /**
   * Setter for the {@link #PROP_ASSET_NAME} attribute
   * @param assetName  The new value of the <i>asset name</i>
   */
  public void setAssetName(String assetName);
  //<editor-fold desc="Class definition" defaultstate="collapsed">
//  private String assetName;
//
//  public Asset() {
//  }
//
//  public Asset(Integer itemIdentifier) {
//    super(itemIdentifier);
//  }
//  
//  public Asset(Integer itemIdentifier, ItemType itemType , String assetName){
//    super(itemIdentifier,itemType);
//    this.assetName = assetName;
//  }
//
//  public String getAssetName() {
//    return assetName;
//  }
//
//  public void setAssetName(String assetName) {
//    this.assetName = assetName;
//  }
//</editor-fold>
}
