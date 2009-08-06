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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductManufacturingRule.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_MANUFACTURING_RULE")
public class ProductManufacturingRule extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("ruleId", "RULE_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("productIdFor", "PRODUCT_ID_FOR");
        fields.put("productIdIn", "PRODUCT_ID_IN");
        fields.put("ruleSeqId", "RULE_SEQ_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("productIdInSubst", "PRODUCT_ID_IN_SUBST");
        fields.put("productFeature", "PRODUCT_FEATURE");
        fields.put("ruleOperator", "RULE_OPERATOR");
        fields.put("quantity", "QUANTITY");
        fields.put("description", "DESCRIPTION");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductManufacturingRule", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductManufacturingRule> {
    ruleId("ruleId"),
    productId("productId"),
    productIdFor("productIdFor"),
    productIdIn("productIdIn"),
    ruleSeqId("ruleSeqId"),
    fromDate("fromDate"),
    productIdInSubst("productIdInSubst"),
    productFeature("productFeature"),
    ruleOperator("ruleOperator"),
    quantity("quantity"),
    description("description"),
    thruDate("thruDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductManufacturingRule_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductManufacturingRule_GEN")
   @Id
   @Column(name="RULE_ID")
   private String ruleId;
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="PRODUCT_ID_FOR")
   private String productIdFor;
   @Column(name="PRODUCT_ID_IN")
   private String productIdIn;
   @Column(name="RULE_SEQ_ID")
   private String ruleSeqId;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="PRODUCT_ID_IN_SUBST")
   private String productIdInSubst;
   @Column(name="PRODUCT_FEATURE")
   private String productFeature;
   @Column(name="RULE_OPERATOR")
   private String ruleOperator;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID_FOR", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product productForProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID_IN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product productInProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID_IN_SUBST", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product productSubstProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_FEATURE", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductFeature relatedProductFeature = null;

  /**
   * Default constructor.
   */
  public ProductManufacturingRule() {
      super();
      this.baseEntityName = "ProductManufacturingRule";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("ruleId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("ruleId");this.allFieldsNames.add("productId");this.allFieldsNames.add("productIdFor");this.allFieldsNames.add("productIdIn");this.allFieldsNames.add("ruleSeqId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("productIdInSubst");this.allFieldsNames.add("productFeature");this.allFieldsNames.add("ruleOperator");this.allFieldsNames.add("quantity");this.allFieldsNames.add("description");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductManufacturingRule(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param ruleId the ruleId to set
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param productIdFor the productIdFor to set
     */
    public void setProductIdFor(String productIdFor) {
        this.productIdFor = productIdFor;
    }
    /**
     * Auto generated value setter.
     * @param productIdIn the productIdIn to set
     */
    public void setProductIdIn(String productIdIn) {
        this.productIdIn = productIdIn;
    }
    /**
     * Auto generated value setter.
     * @param ruleSeqId the ruleSeqId to set
     */
    public void setRuleSeqId(String ruleSeqId) {
        this.ruleSeqId = ruleSeqId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param productIdInSubst the productIdInSubst to set
     */
    public void setProductIdInSubst(String productIdInSubst) {
        this.productIdInSubst = productIdInSubst;
    }
    /**
     * Auto generated value setter.
     * @param productFeature the productFeature to set
     */
    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }
    /**
     * Auto generated value setter.
     * @param ruleOperator the ruleOperator to set
     */
    public void setRuleOperator(String ruleOperator) {
        this.ruleOperator = ruleOperator;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
    public String getRuleId() {
        return this.ruleId;
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
     * @return <code>String</code>
     */
    public String getProductIdFor() {
        return this.productIdFor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductIdIn() {
        return this.productIdIn;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRuleSeqId() {
        return this.ruleSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductIdInSubst() {
        return this.productIdInSubst;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeature() {
        return this.productFeature;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRuleOperator() {
        return this.ruleOperator;
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
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
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
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>ProductForProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProductForProduct() throws RepositoryException {
        if (this.productForProduct == null) {
            this.productForProduct = getRelatedOne(Product.class, "ProductForProduct");
        }
        return this.productForProduct;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>ProductInProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProductInProduct() throws RepositoryException {
        if (this.productInProduct == null) {
            this.productInProduct = getRelatedOne(Product.class, "ProductInProduct");
        }
        return this.productInProduct;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>ProductSubstProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProductSubstProduct() throws RepositoryException {
        if (this.productSubstProduct == null) {
            this.productSubstProduct = getRelatedOne(Product.class, "ProductSubstProduct");
        }
        return this.productSubstProduct;
    }
    /**
     * Auto generated method that gets the related <code>ProductFeature</code> by the relation named <code>ProductFeature</code>.
     * @return the <code>ProductFeature</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductFeature getRelatedProductFeature() throws RepositoryException {
        if (this.relatedProductFeature == null) {
            this.relatedProductFeature = getRelatedOne(ProductFeature.class, "ProductFeature");
        }
        return this.relatedProductFeature;
    }

    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param productForProduct the productForProduct to set
    */
    public void setProductForProduct(Product productForProduct) {
        this.productForProduct = productForProduct;
    }
    /**
     * Auto generated value setter.
     * @param productInProduct the productInProduct to set
    */
    public void setProductInProduct(Product productInProduct) {
        this.productInProduct = productInProduct;
    }
    /**
     * Auto generated value setter.
     * @param productSubstProduct the productSubstProduct to set
    */
    public void setProductSubstProduct(Product productSubstProduct) {
        this.productSubstProduct = productSubstProduct;
    }
    /**
     * Auto generated value setter.
     * @param relatedProductFeature the relatedProductFeature to set
    */
    public void setRelatedProductFeature(ProductFeature relatedProductFeature) {
        this.relatedProductFeature = relatedProductFeature;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRuleId((String) mapValue.get("ruleId"));
        setProductId((String) mapValue.get("productId"));
        setProductIdFor((String) mapValue.get("productIdFor"));
        setProductIdIn((String) mapValue.get("productIdIn"));
        setRuleSeqId((String) mapValue.get("ruleSeqId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setProductIdInSubst((String) mapValue.get("productIdInSubst"));
        setProductFeature((String) mapValue.get("productFeature"));
        setRuleOperator((String) mapValue.get("ruleOperator"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setDescription((String) mapValue.get("description"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("ruleId", getRuleId());
        mapValue.put("productId", getProductId());
        mapValue.put("productIdFor", getProductIdFor());
        mapValue.put("productIdIn", getProductIdIn());
        mapValue.put("ruleSeqId", getRuleSeqId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("productIdInSubst", getProductIdInSubst());
        mapValue.put("productFeature", getProductFeature());
        mapValue.put("ruleOperator", getRuleOperator());
        mapValue.put("quantity", getQuantity());
        mapValue.put("description", getDescription());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
