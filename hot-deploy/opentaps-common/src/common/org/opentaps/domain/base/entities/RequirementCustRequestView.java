package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity RequirementCustRequestView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectRequirementCustRequestViews", query="SELECT RR.CUST_REQUEST_ID AS \"custRequestId\",RR.CUST_REQUEST_ITEM_SEQ_ID AS \"custRequestItemSeqId\",RR.REQUIREMENT_ID AS \"requirementId\",RQ.REQUIREMENT_TYPE_ID AS \"requirementTypeId\",RQ.DESCRIPTION AS \"description\",RQ.PRODUCT_ID AS \"productId\",RQ.ESTIMATED_BUDGET AS \"estimatedBudget\",RQ.QUANTITY AS \"quantity\",RQ.REQUIREMENT_START_DATE AS \"requirementStartDate\",RQ.REQUIRED_BY_DATE AS \"requiredByDate\",RI.STATUS_ID AS \"statusId\",RI.PRIORITY AS \"priority\",RI.MAXIMUM_AMOUNT AS \"maximumAmount\" FROM REQUIREMENT_CUST_REQUEST RR INNER JOIN REQUIREMENT RQ ON RR.REQUIREMENT_ID = RQ.REQUIREMENT_ID INNER JOIN CUST_REQUEST_ITEM RI ON RR.CUST_REQUEST_ID = RI.CUST_REQUEST_ID AND RR.CUST_REQUEST_ITEM_SEQ_ID = RI.CUST_REQUEST_ITEM_SEQ_ID", resultSetMapping="RequirementCustRequestViewMapping")
@SqlResultSetMapping(name="RequirementCustRequestViewMapping", entities={
@EntityResult(entityClass=RequirementCustRequestView.class, fields = {
@FieldResult(name="custRequestId", column="custRequestId")
,@FieldResult(name="custRequestItemSeqId", column="custRequestItemSeqId")
,@FieldResult(name="requirementId", column="requirementId")
,@FieldResult(name="requirementTypeId", column="requirementTypeId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="estimatedBudget", column="estimatedBudget")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="requirementStartDate", column="requirementStartDate")
,@FieldResult(name="requiredByDate", column="requiredByDate")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="priority", column="priority")
,@FieldResult(name="maximumAmount", column="maximumAmount")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class RequirementCustRequestView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "RR.CUST_REQUEST_ID");
        fields.put("custRequestItemSeqId", "RR.CUST_REQUEST_ITEM_SEQ_ID");
        fields.put("requirementId", "RR.REQUIREMENT_ID");
        fields.put("requirementTypeId", "RQ.REQUIREMENT_TYPE_ID");
        fields.put("description", "RQ.DESCRIPTION");
        fields.put("productId", "RQ.PRODUCT_ID");
        fields.put("estimatedBudget", "RQ.ESTIMATED_BUDGET");
        fields.put("quantity", "RQ.QUANTITY");
        fields.put("requirementStartDate", "RQ.REQUIREMENT_START_DATE");
        fields.put("requiredByDate", "RQ.REQUIRED_BY_DATE");
        fields.put("statusId", "RI.STATUS_ID");
        fields.put("priority", "RI.PRIORITY");
        fields.put("maximumAmount", "RI.MAXIMUM_AMOUNT");
fieldMapColumns.put("RequirementCustRequestView", fields);
}
  public static enum Fields implements EntityFieldInterface<RequirementCustRequestView> {
    custRequestId("custRequestId"),
    custRequestItemSeqId("custRequestItemSeqId"),
    requirementId("requirementId"),
    requirementTypeId("requirementTypeId"),
    description("description"),
    productId("productId"),
    estimatedBudget("estimatedBudget"),
    quantity("quantity"),
    requirementStartDate("requirementStartDate"),
    requiredByDate("requiredByDate"),
    statusId("statusId"),
    priority("priority"),
    maximumAmount("maximumAmount");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String custRequestId;
    
   private String custRequestItemSeqId;
    
   private String requirementId;
    
   private String requirementTypeId;
    
   private String description;
    
   private String productId;
    
   private BigDecimal estimatedBudget;
    
   private BigDecimal quantity;
    
   private Timestamp requirementStartDate;
    
   private Timestamp requiredByDate;
    
   private String statusId;
    
   private Long priority;
    
   private BigDecimal maximumAmount;

  /**
   * Default constructor.
   */
  public RequirementCustRequestView() {
      super();
      this.baseEntityName = "RequirementCustRequestView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("custRequestItemSeqId");this.primaryKeyNames.add("requirementId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestItemSeqId");this.allFieldsNames.add("requirementId");this.allFieldsNames.add("requirementTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("productId");this.allFieldsNames.add("estimatedBudget");this.allFieldsNames.add("quantity");this.allFieldsNames.add("requirementStartDate");this.allFieldsNames.add("requiredByDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("priority");this.allFieldsNames.add("maximumAmount");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public RequirementCustRequestView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    private void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemSeqId the custRequestItemSeqId to set
     */
    private void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    private void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }
    /**
     * Auto generated value setter.
     * @param requirementTypeId the requirementTypeId to set
     */
    private void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    private void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedBudget the estimatedBudget to set
     */
    private void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    private void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param requirementStartDate the requirementStartDate to set
     */
    private void setRequirementStartDate(Timestamp requirementStartDate) {
        this.requirementStartDate = requirementStartDate;
    }
    /**
     * Auto generated value setter.
     * @param requiredByDate the requiredByDate to set
     */
    private void setRequiredByDate(Timestamp requiredByDate) {
        this.requiredByDate = requiredByDate;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    private void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param priority the priority to set
     */
    private void setPriority(Long priority) {
        this.priority = priority;
    }
    /**
     * Auto generated value setter.
     * @param maximumAmount the maximumAmount to set
     */
    private void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestId() {
        return this.custRequestId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestItemSeqId() {
        return this.custRequestItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementId() {
        return this.requirementId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementTypeId() {
        return this.requirementTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedBudget() {
        return this.estimatedBudget;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRequirementStartDate() {
        return this.requirementStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRequiredByDate() {
        return this.requiredByDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPriority() {
        return this.priority;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaximumAmount() {
        return this.maximumAmount;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        setRequirementId((String) mapValue.get("requirementId"));
        setRequirementTypeId((String) mapValue.get("requirementTypeId"));
        setDescription((String) mapValue.get("description"));
        setProductId((String) mapValue.get("productId"));
        setEstimatedBudget(convertToBigDecimal(mapValue.get("estimatedBudget")));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setRequirementStartDate((Timestamp) mapValue.get("requirementStartDate"));
        setRequiredByDate((Timestamp) mapValue.get("requiredByDate"));
        setStatusId((String) mapValue.get("statusId"));
        setPriority((Long) mapValue.get("priority"));
        setMaximumAmount(convertToBigDecimal(mapValue.get("maximumAmount")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestItemSeqId", getCustRequestItemSeqId());
        mapValue.put("requirementId", getRequirementId());
        mapValue.put("requirementTypeId", getRequirementTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("productId", getProductId());
        mapValue.put("estimatedBudget", getEstimatedBudget());
        mapValue.put("quantity", getQuantity());
        mapValue.put("requirementStartDate", getRequirementStartDate());
        mapValue.put("requiredByDate", getRequiredByDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("priority", getPriority());
        mapValue.put("maximumAmount", getMaximumAmount());
        return mapValue;
    }


}
