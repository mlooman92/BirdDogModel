/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

/**
 *Metadata defining the kinds of Relationships that may exist in the data
 * @author mlooman
 */
public interface RelationshipType extends ItemType {

  /**
   *Name of the <i>Relationship Type Primary Item Type</i> attribute<br><b>Definition:</b> Identifies the {@link org.birddog.model.ItemType} of Items which may occupy the Primary position in the relationship
   * 
   */
  public static final String PROP_RELATIONSHIP_TYPE_PRIMARY_ITEM_TYPE = "relationshipTypePrimaryItemType";

  /**
   **Name of the <i>Relationship Type Related Item Type</i> attribute<br><b>Definition:</b> Identifies the {@link org.birddog.model.ItemType} of Items which may occupy the Secondary position in the relationship
   */
  public static final String PROP_RELATIONSHIP_TYPE_RELATED_ITEM_TYPE = "relationshipTypeRelatedItemType";

  /**
   *Name of the <i>Relationship Type Expression String</i> attribute<br><b>Definition:</b> Expression which links the primary item to the related item
   */
  public static final String PROP_RELATIONSHIP_TYPE_EXPRESSION_STRING = "relationshipTypeExpressionString";

  /**
   *Name of the <i>Relationship Type Inverse Expression String</i> attribute<br><b>Definition:</b> Expression which links the Related item to the Primary Item.
   */
  public static final String PROP_RELATIONSHIP_TYPE_INVERSE_EXPRESSION_STRING = "relationshipTypeInverseExpressionString";

  /**
   *Name of the <i>Relationship Type Cardinality Code</i> attribute<br><b>Definition:</b> Indication of the relative number of relationships one side can be in with the other side, i.e., One-To-Many, One-To-One, Many-To-One or Many-To-Many
   */
  public static final String PROP_RELATIONSHIP_TYPE_CARDINALITY_CODE = "relationshipTypeCardinalityCode";

  public enum RelationshipCardinality{ONE_TO_ONE,ONE_TO_MANY,MANY_TO_ONE,MANY_TO_MANY};
  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE_PRIMARY_ITEM_TYPE} attribute
   * @return {@link org.birddog.model.ItemType}
   */
  public ItemType getRelationshipTypePrimaryItemType();

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE_PRIMARY_ITEM_TYPE} attribute
   * @param relationshipTypePrimaryItemType New Value
   */
  public void setRelationshipTypePrimaryItemType(ItemType relationshipTypePrimaryItemType);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE_RELATED_ITEM_TYPE} attribute
   * @return {@link org.birddog.model.ItemType}
   */
  public ItemType getRelationshipTypeRelatedItemType();

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE_RELATED_ITEM_TYPE} attribute
   * @param relationshipTypeRelatedItemType New value
   */
  public void setRelationshipTypeRelatedItemType(ItemType relationshipTypeRelatedItemType);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE_EXPRESSION_STRING} attribute
   * @return String
   */
  public String getRelationshipTypeExpressionString();

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE_EXPRESSION_STRING} attribute
   * @param relationshipTypeExpressionString New value
   */
  public void setRelationshipTypeExpressionString(String relationshipTypeExpressionString);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE_INVERSE_EXPRESSION_STRING} attribute
   * @return String
   */
  public String getRelationshipTypeInverseExpressionString();

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE_INVERSE_EXPRESSION_STRING} attribute
   * @param relationshipTypeInverseExpressionString New Value
   */
  public void setRelationshipTypeInverseExpressionString(String relationshipTypeInverseExpressionString);

  /**
   *Getter for the {@link #PROP_RELATIONSHIP_TYPE_CARDINALITY_CODE} attribute
   * @return RelationshipCardinality
   */
  public RelationshipCardinality getRelationshipTypeCardinalityCode();

  /**
   *Setter for the {@link #PROP_RELATIONSHIP_TYPE_CARDINALITY_CODE} attribute
   * @param relationshipTypeCardinalityCode New value
   */
  public void setRelationshipTypeCardinalityCode(RelationshipCardinality relationshipTypeCardinalityCode);

}
