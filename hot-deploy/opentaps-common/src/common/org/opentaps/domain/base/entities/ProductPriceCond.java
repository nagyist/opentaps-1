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
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductPriceCond.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PRICE_COND")
public class ProductPriceCond extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPriceRuleId", "PRODUCT_PRICE_RULE_ID");
        fields.put("productPriceCondSeqId", "PRODUCT_PRICE_COND_SEQ_ID");
        fields.put("inputParamEnumId", "INPUT_PARAM_ENUM_ID");
        fields.put("operatorEnumId", "OPERATOR_ENUM_ID");
        fields.put("condValue", "COND_VALUE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPriceCond", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPriceCond> {
    productPriceRuleId("productPriceRuleId"),
    productPriceCondSeqId("productPriceCondSeqId"),
    inputParamEnumId("inputParamEnumId"),
    operatorEnumId("operatorEnumId"),
    condValue("condValue"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ProductPriceCondPkBridge.class)
     private ProductPriceCondPk id = new ProductPriceCondPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductPriceCondPk</code>
     */
      public ProductPriceCondPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductPriceCondPk</code> value to set
    */   
      public void setId(ProductPriceCondPk id) {
         this.id = id;
      }
   @Column(name="INPUT_PARAM_ENUM_ID")
   private String inputParamEnumId;
   @Column(name="OPERATOR_ENUM_ID")
   private String operatorEnumId;
   @Column(name="COND_VALUE")
   private String condValue;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PRICE_RULE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPriceRule productPriceRule = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INPUT_PARAM_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration inputParamEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OPERATOR_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration operatorEnumeration = null;

  /**
   * Default constructor.
   */
  public ProductPriceCond() {
      super();
      this.baseEntityName = "ProductPriceCond";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPriceRuleId");this.primaryKeyNames.add("productPriceCondSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPriceRuleId");this.allFieldsNames.add("productPriceCondSeqId");this.allFieldsNames.add("inputParamEnumId");this.allFieldsNames.add("operatorEnumId");this.allFieldsNames.add("condValue");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPriceCond(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productPriceRuleId the productPriceRuleId to set
     */
    public void setProductPriceRuleId(String productPriceRuleId) {
        id.setProductPriceRuleId(productPriceRuleId);
    }
    /**
     * Auto generated value setter.
     * @param productPriceCondSeqId the productPriceCondSeqId to set
     */
    public void setProductPriceCondSeqId(String productPriceCondSeqId) {
        id.setProductPriceCondSeqId(productPriceCondSeqId);
    }
    /**
     * Auto generated value setter.
     * @param inputParamEnumId the inputParamEnumId to set
     */
    public void setInputParamEnumId(String inputParamEnumId) {
        this.inputParamEnumId = inputParamEnumId;
    }
    /**
     * Auto generated value setter.
     * @param operatorEnumId the operatorEnumId to set
     */
    public void setOperatorEnumId(String operatorEnumId) {
        this.operatorEnumId = operatorEnumId;
    }
    /**
     * Auto generated value setter.
     * @param condValue the condValue to set
     */
    public void setCondValue(String condValue) {
        this.condValue = condValue;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPriceRuleId() {
        return this.id.getProductPriceRuleId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPriceCondSeqId() {
        return this.id.getProductPriceCondSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInputParamEnumId() {
        return this.inputParamEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOperatorEnumId() {
        return this.operatorEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCondValue() {
        return this.condValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ProductPriceRule</code> by the relation named <code>ProductPriceRule</code>.
     * @return the <code>ProductPriceRule</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPriceRule getProductPriceRule() throws RepositoryException {
        if (this.productPriceRule == null) {
            this.productPriceRule = getRelatedOne(ProductPriceRule.class, "ProductPriceRule");
        }
        return this.productPriceRule;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>InputParamEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getInputParamEnumeration() throws RepositoryException {
        if (this.inputParamEnumeration == null) {
            this.inputParamEnumeration = getRelatedOne(Enumeration.class, "InputParamEnumeration");
        }
        return this.inputParamEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>OperatorEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getOperatorEnumeration() throws RepositoryException {
        if (this.operatorEnumeration == null) {
            this.operatorEnumeration = getRelatedOne(Enumeration.class, "OperatorEnumeration");
        }
        return this.operatorEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param productPriceRule the productPriceRule to set
    */
    public void setProductPriceRule(ProductPriceRule productPriceRule) {
        this.productPriceRule = productPriceRule;
    }
    /**
     * Auto generated value setter.
     * @param inputParamEnumeration the inputParamEnumeration to set
    */
    public void setInputParamEnumeration(Enumeration inputParamEnumeration) {
        this.inputParamEnumeration = inputParamEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param operatorEnumeration the operatorEnumeration to set
    */
    public void setOperatorEnumeration(Enumeration operatorEnumeration) {
        this.operatorEnumeration = operatorEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPriceRuleId((String) mapValue.get("productPriceRuleId"));
        setProductPriceCondSeqId((String) mapValue.get("productPriceCondSeqId"));
        setInputParamEnumId((String) mapValue.get("inputParamEnumId"));
        setOperatorEnumId((String) mapValue.get("operatorEnumId"));
        setCondValue((String) mapValue.get("condValue"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productPriceRuleId", getProductPriceRuleId());
        mapValue.put("productPriceCondSeqId", getProductPriceCondSeqId());
        mapValue.put("inputParamEnumId", getInputParamEnumId());
        mapValue.put("operatorEnumId", getOperatorEnumId());
        mapValue.put("condValue", getCondValue());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
