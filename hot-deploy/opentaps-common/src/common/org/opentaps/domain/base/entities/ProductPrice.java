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
 * Auto generated base entity ProductPrice.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PRICE")
public class ProductPrice extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("productPriceTypeId", "PRODUCT_PRICE_TYPE_ID");
        fields.put("productPricePurposeId", "PRODUCT_PRICE_PURPOSE_ID");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("productStoreGroupId", "PRODUCT_STORE_GROUP_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("price", "PRICE");
        fields.put("termUomId", "TERM_UOM_ID");
        fields.put("createdDate", "CREATED_DATE");
        fields.put("createdByUserLogin", "CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPrice", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPrice> {
    productId("productId"),
    productPriceTypeId("productPriceTypeId"),
    productPricePurposeId("productPricePurposeId"),
    currencyUomId("currencyUomId"),
    productStoreGroupId("productStoreGroupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    price("price"),
    termUomId("termUomId"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ProductPricePkBridge.class)
     private ProductPricePk id = new ProductPricePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductPricePk</code>
     */
      public ProductPricePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductPricePk</code> value to set
    */   
      public void setId(ProductPricePk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="PRICE")
   private BigDecimal price;
   @Column(name="TERM_UOM_ID")
   private String termUomId;
   @Column(name="CREATED_DATE")
   private Timestamp createdDate;
   @Column(name="CREATED_BY_USER_LOGIN")
   private String createdByUserLogin;
   @Column(name="LAST_MODIFIED_DATE")
   private Timestamp lastModifiedDate;
   @Column(name="LAST_MODIFIED_BY_USER_LOGIN")
   private String lastModifiedByUserLogin;
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
   @JoinColumn(name="PRODUCT_PRICE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPriceType productPriceType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PRICE_PURPOSE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPricePurpose productPricePurpose = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom currencyUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERM_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom termUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreGroup productStoreGroup = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CREATED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedCreatedByUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LAST_MODIFIED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedLastModifiedByUserLogin = null;
   private transient List<ProductPriceChange> productPriceChanges = null;

  /**
   * Default constructor.
   */
  public ProductPrice() {
      super();
      this.baseEntityName = "ProductPrice";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productPriceTypeId");this.primaryKeyNames.add("productPricePurposeId");this.primaryKeyNames.add("currencyUomId");this.primaryKeyNames.add("productStoreGroupId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("productPriceTypeId");this.allFieldsNames.add("productPricePurposeId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("productStoreGroupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("price");this.allFieldsNames.add("termUomId");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPrice(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param productPriceTypeId the productPriceTypeId to set
     */
    public void setProductPriceTypeId(String productPriceTypeId) {
        id.setProductPriceTypeId(productPriceTypeId);
    }
    /**
     * Auto generated value setter.
     * @param productPricePurposeId the productPricePurposeId to set
     */
    public void setProductPricePurposeId(String productPricePurposeId) {
        id.setProductPricePurposeId(productPricePurposeId);
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        id.setCurrencyUomId(currencyUomId);
    }
    /**
     * Auto generated value setter.
     * @param productStoreGroupId the productStoreGroupId to set
     */
    public void setProductStoreGroupId(String productStoreGroupId) {
        id.setProductStoreGroupId(productStoreGroupId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
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
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /**
     * Auto generated value setter.
     * @param termUomId the termUomId to set
     */
    public void setTermUomId(String termUomId) {
        this.termUomId = termUomId;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPriceTypeId() {
        return this.id.getProductPriceTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPricePurposeId() {
        return this.id.getProductPricePurposeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.id.getCurrencyUomId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreGroupId() {
        return this.id.getProductStoreGroupId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPrice() {
        return this.price;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTermUomId() {
        return this.termUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
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
     * Auto generated method that gets the related <code>ProductPriceType</code> by the relation named <code>ProductPriceType</code>.
     * @return the <code>ProductPriceType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPriceType getProductPriceType() throws RepositoryException {
        if (this.productPriceType == null) {
            this.productPriceType = getRelatedOne(ProductPriceType.class, "ProductPriceType");
        }
        return this.productPriceType;
    }
    /**
     * Auto generated method that gets the related <code>ProductPricePurpose</code> by the relation named <code>ProductPricePurpose</code>.
     * @return the <code>ProductPricePurpose</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPricePurpose getProductPricePurpose() throws RepositoryException {
        if (this.productPricePurpose == null) {
            this.productPricePurpose = getRelatedOne(ProductPricePurpose.class, "ProductPricePurpose");
        }
        return this.productPricePurpose;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>CurrencyUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getCurrencyUom() throws RepositoryException {
        if (this.currencyUom == null) {
            this.currencyUom = getRelatedOne(Uom.class, "CurrencyUom");
        }
        return this.currencyUom;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>TermUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getTermUom() throws RepositoryException {
        if (this.termUom == null) {
            this.termUom = getRelatedOne(Uom.class, "TermUom");
        }
        return this.termUom;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroup</code> by the relation named <code>ProductStoreGroup</code>.
     * @return the <code>ProductStoreGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreGroup getProductStoreGroup() throws RepositoryException {
        if (this.productStoreGroup == null) {
            this.productStoreGroup = getRelatedOne(ProductStoreGroup.class, "ProductStoreGroup");
        }
        return this.productStoreGroup;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>CreatedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedCreatedByUserLogin() throws RepositoryException {
        if (this.relatedCreatedByUserLogin == null) {
            this.relatedCreatedByUserLogin = getRelatedOne(UserLogin.class, "CreatedByUserLogin");
        }
        return this.relatedCreatedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>LastModifiedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedLastModifiedByUserLogin() throws RepositoryException {
        if (this.relatedLastModifiedByUserLogin == null) {
            this.relatedLastModifiedByUserLogin = getRelatedOne(UserLogin.class, "LastModifiedByUserLogin");
        }
        return this.relatedLastModifiedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>ProductPriceChange</code> by the relation named <code>ProductPriceChange</code>.
     * @return the list of <code>ProductPriceChange</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPriceChange> getProductPriceChanges() throws RepositoryException {
        if (this.productPriceChanges == null) {
            this.productPriceChanges = getRelated(ProductPriceChange.class, "ProductPriceChange");
        }
        return this.productPriceChanges;
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
     * @param productPriceType the productPriceType to set
    */
    public void setProductPriceType(ProductPriceType productPriceType) {
        this.productPriceType = productPriceType;
    }
    /**
     * Auto generated value setter.
     * @param productPricePurpose the productPricePurpose to set
    */
    public void setProductPricePurpose(ProductPricePurpose productPricePurpose) {
        this.productPricePurpose = productPricePurpose;
    }
    /**
     * Auto generated value setter.
     * @param currencyUom the currencyUom to set
    */
    public void setCurrencyUom(Uom currencyUom) {
        this.currencyUom = currencyUom;
    }
    /**
     * Auto generated value setter.
     * @param termUom the termUom to set
    */
    public void setTermUom(Uom termUom) {
        this.termUom = termUom;
    }
    /**
     * Auto generated value setter.
     * @param productStoreGroup the productStoreGroup to set
    */
    public void setProductStoreGroup(ProductStoreGroup productStoreGroup) {
        this.productStoreGroup = productStoreGroup;
    }
    /**
     * Auto generated value setter.
     * @param relatedCreatedByUserLogin the relatedCreatedByUserLogin to set
    */
    public void setRelatedCreatedByUserLogin(UserLogin relatedCreatedByUserLogin) {
        this.relatedCreatedByUserLogin = relatedCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param relatedLastModifiedByUserLogin the relatedLastModifiedByUserLogin to set
    */
    public void setRelatedLastModifiedByUserLogin(UserLogin relatedLastModifiedByUserLogin) {
        this.relatedLastModifiedByUserLogin = relatedLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param productPriceChanges the productPriceChanges to set
    */
    public void setProductPriceChanges(List<ProductPriceChange> productPriceChanges) {
        this.productPriceChanges = productPriceChanges;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setProductPriceTypeId((String) mapValue.get("productPriceTypeId"));
        setProductPricePurposeId((String) mapValue.get("productPricePurposeId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setProductStoreGroupId((String) mapValue.get("productStoreGroupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPrice(convertToBigDecimal(mapValue.get("price")));
        setTermUomId((String) mapValue.get("termUomId"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
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
        mapValue.put("productId", getProductId());
        mapValue.put("productPriceTypeId", getProductPriceTypeId());
        mapValue.put("productPricePurposeId", getProductPricePurposeId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("productStoreGroupId", getProductStoreGroupId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("price", getPrice());
        mapValue.put("termUomId", getTermUomId());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
