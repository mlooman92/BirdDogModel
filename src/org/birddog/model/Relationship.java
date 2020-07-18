/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 *An association of two {@link org.birddog.model.Item}s
 * @author mlooman
 */
public interface Relationship {

  /**
   *Name of the <i>Item Identifier</i> attribute<br><b>Definition:</b>  Unique identifier for the Relationship
   */
  public static final String PROP_RELATIONSHIP_IDENTIFIER = "relationshipIdentifier";

  /**
   *Name of the <i>Relationship Type Name</i> attribute<br><b>Definition:</b> Metadata which defines the characteristics of the relationship
   */
  public static final String PROP_RELATIONSHIP_TYPE = "relationshipType";

  /**
   *Name of the <i>Relationship Primary Item</i> attribute<br><b>Definition:</b> The principal {@link org.birddog.model.Item} in the relationship.  Primacy is only used for properly understanding the forward and inverse relationship expressions.
   */
  public static final String PROP_RELATIONSHIP_PRIMARY_ITEM = "relationshipPrimaryItem";

  /**
   *Name of the <i>Relationship Related Item</i> attribute<br><b>Definition:</b> The secondary {@link org.birddog.model.Item} in the relationship.
   */
  public static final String PROP_RELATIONSHIP_RELATED_ITEM = "relationshipRelatedItem";

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_IDENTIFIER} attribute
   * @return Integer
   */
  public Integer getRelationshipIdentifier();	

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_IDENTIFIER} attribute
   * @param relationshipIdentifier New value
   */
  public void setRelationshipIdentifier(Integer relationshipIdentifier);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE} attribute
   * @return {@link org.birddog.model.RelationshipType}
   */
  public RelationshipType getRelationshipType();	

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE} attribute
   * @param relationshipType New value
   */
  public void setRelationshipType(RelationshipType relationshipType);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_PRIMARY_ITEM} attribute
   * @return {@link org.birddog.model.Item}
   */
  public Item getRelationshipPrimaryItem();	

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_PRIMARY_ITEM} attribute
   * @param relationshipPrimaryItem New value
   */
  public void setRelationshipPrimaryItem(Item relationshipPrimaryItem);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_RELATED_ITEM} attribute
   * @return {@link org.birddog.model.Item}
   */
  public Item getRelationshipRelatedItem();	

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_RELATED_ITEM} attribute
   * @param relationshipRelatedItem New value
   */
  public void setRelationshipRelatedItem(Item relationshipRelatedItem);

}
