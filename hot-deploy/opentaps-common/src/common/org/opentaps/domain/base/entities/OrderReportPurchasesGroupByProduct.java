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
 * Auto generated base entity OrderReportPurchasesGroupByProduct.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderReportPurchasesGroupByProducts", query="SELECT OI.PRODUCT_ID AS \"productId\",PR.INTERNAL_NAME AS \"internalName\",OH.ORDER_DATE AS \"orderDate\",OH.STATUS_ID AS \"statusId\",OI.STATUS_ID AS \"statusId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",RT.PARTY_ID AS \"partyId\",RT.ROLE_TYPE_ID AS \"roleTypeId\",RF.PARTY_ID AS \"partyId\",RF.ROLE_TYPE_ID AS \"roleTypeId\",OI.QUANTITY AS \"quantity\",OI.UNIT_PRICE AS \"unitPrice\" FROM ORDER_HEADER OH INNER JOIN ORDER_ITEM OI ON OH.ORDER_ID = OI.ORDER_ID INNER JOIN ORDER_ROLE RT ON OH.ORDER_ID = RT.ORDER_ID INNER JOIN ORDER_ROLE RF ON OH.ORDER_ID = RF.ORDER_ID INNER JOIN PRODUCT PR ON OI.PRODUCT_ID = PR.PRODUCT_ID", resultSetMapping="OrderReportPurchasesGroupByProductMapping")
@SqlResultSetMapping(name="OrderReportPurchasesGroupByProductMapping", entities={
@EntityResult(entityClass=OrderReportPurchasesGroupByProduct.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="internalName", column="internalName")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="orderItemStatusId", column="orderItemStatusId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="toPartyId", column="toPartyId")
,@FieldResult(name="toRoleTypeId", column="toRoleTypeId")
,@FieldResult(name="fromPartyId", column="fromPartyId")
,@FieldResult(name="fromRoleTypeId", column="fromRoleTypeId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="unitPrice", column="unitPrice")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderReportPurchasesGroupByProduct extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("internalName", "PR.INTERNAL_NAME");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("orderItemStatusId", "OI.STATUS_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("toPartyId", "RT.PARTY_ID");
        fields.put("toRoleTypeId", "RT.ROLE_TYPE_ID");
        fields.put("fromPartyId", "RF.PARTY_ID");
        fields.put("fromRoleTypeId", "RF.ROLE_TYPE_ID");
        fields.put("quantity", "OI.QUANTITY");
        fields.put("unitPrice", "OI.UNIT_PRICE");
fieldMapColumns.put("OrderReportPurchasesGroupByProduct", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderReportPurchasesGroupByProduct> {
    productId("productId"),
    internalName("internalName"),
    orderDate("orderDate"),
    orderStatusId("orderStatusId"),
    orderItemStatusId("orderItemStatusId"),
    orderTypeId("orderTypeId"),
    toPartyId("toPartyId"),
    toRoleTypeId("toRoleTypeId"),
    fromPartyId("fromPartyId"),
    fromRoleTypeId("fromRoleTypeId"),
    quantity("quantity"),
    unitPrice("unitPrice");
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
   private String productId;
    
   private String internalName;
    
   private Timestamp orderDate;
    
   private String orderStatusId;
    
   private String orderItemStatusId;
    
   private String orderTypeId;
    
   private String toPartyId;
    
   private String toRoleTypeId;
    
   private String fromPartyId;
    
   private String fromRoleTypeId;
    
   private BigDecimal quantity;
    
   private BigDecimal unitPrice;

  /**
   * Default constructor.
   */
  public OrderReportPurchasesGroupByProduct() {
      super();
      this.baseEntityName = "OrderReportPurchasesGroupByProduct";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("toPartyId");this.primaryKeyNames.add("toRoleTypeId");this.primaryKeyNames.add("fromPartyId");this.primaryKeyNames.add("fromRoleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("internalName");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("orderItemStatusId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("toPartyId");this.allFieldsNames.add("toRoleTypeId");this.allFieldsNames.add("fromPartyId");this.allFieldsNames.add("fromRoleTypeId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("unitPrice");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderReportPurchasesGroupByProduct(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    private void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param internalName the internalName to set
     */
    private void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    private void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param orderStatusId the orderStatusId to set
     */
    private void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemStatusId the orderItemStatusId to set
     */
    private void setOrderItemStatusId(String orderItemStatusId) {
        this.orderItemStatusId = orderItemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    private void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param toPartyId the toPartyId to set
     */
    private void setToPartyId(String toPartyId) {
        this.toPartyId = toPartyId;
    }
    /**
     * Auto generated value setter.
     * @param toRoleTypeId the toRoleTypeId to set
     */
    private void setToRoleTypeId(String toRoleTypeId) {
        this.toRoleTypeId = toRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyId the fromPartyId to set
     */
    private void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }
    /**
     * Auto generated value setter.
     * @param fromRoleTypeId the fromRoleTypeId to set
     */
    private void setFromRoleTypeId(String fromRoleTypeId) {
        this.fromRoleTypeId = fromRoleTypeId;
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
     * @param unitPrice the unitPrice to set
     */
    private void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
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
    public String getInternalName() {
        return this.internalName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatusId() {
        return this.orderStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemStatusId() {
        return this.orderItemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToPartyId() {
        return this.toPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToRoleTypeId() {
        return this.toRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFromPartyId() {
        return this.fromPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFromRoleTypeId() {
        return this.fromRoleTypeId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setInternalName((String) mapValue.get("internalName"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setOrderItemStatusId((String) mapValue.get("orderItemStatusId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setToPartyId((String) mapValue.get("toPartyId"));
        setToRoleTypeId((String) mapValue.get("toRoleTypeId"));
        setFromPartyId((String) mapValue.get("fromPartyId"));
        setFromRoleTypeId((String) mapValue.get("fromRoleTypeId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setUnitPrice(convertToBigDecimal(mapValue.get("unitPrice")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("internalName", getInternalName());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("orderItemStatusId", getOrderItemStatusId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("toPartyId", getToPartyId());
        mapValue.put("toRoleTypeId", getToRoleTypeId());
        mapValue.put("fromPartyId", getFromPartyId());
        mapValue.put("fromRoleTypeId", getFromRoleTypeId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("unitPrice", getUnitPrice());
        return mapValue;
    }


}
