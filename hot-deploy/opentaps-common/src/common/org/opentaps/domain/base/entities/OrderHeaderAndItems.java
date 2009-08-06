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
 * Auto generated base entity OrderHeaderAndItems.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderHeaderAndItemss", query="SELECT OH.ORDER_ID AS \"orderId\",OH.ORDER_DATE AS \"orderDate\",OH.STATUS_ID AS \"statusId\",OH.GRAND_TOTAL AS \"grandTotal\",OH.PRODUCT_STORE_ID AS \"productStoreId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OI.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",OI.PRODUCT_ID AS \"productId\",OI.QUANTITY AS \"quantity\",OI.CANCEL_QUANTITY AS \"cancelQuantity\",OI.UNIT_PRICE AS \"unitPrice\",OI.UNIT_LIST_PRICE AS \"unitListPrice\",OI.ITEM_DESCRIPTION AS \"itemDescription\",OI.STATUS_ID AS \"statusId\",OI.ESTIMATED_SHIP_DATE AS \"estimatedShipDate\",OI.ESTIMATED_DELIVERY_DATE AS \"estimatedDeliveryDate\",OI.ORDER_ITEM_TYPE_ID AS \"orderItemTypeId\" FROM ORDER_HEADER OH INNER JOIN ORDER_ITEM OI ON OH.ORDER_ID = OI.ORDER_ID", resultSetMapping="OrderHeaderAndItemsMapping")
@SqlResultSetMapping(name="OrderHeaderAndItemsMapping", entities={
@EntityResult(entityClass=OrderHeaderAndItems.class, fields = {
@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="grandTotal", column="grandTotal")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="cancelQuantity", column="cancelQuantity")
,@FieldResult(name="unitPrice", column="unitPrice")
,@FieldResult(name="unitListPrice", column="unitListPrice")
,@FieldResult(name="itemDescription", column="itemDescription")
,@FieldResult(name="itemStatusId", column="itemStatusId")
,@FieldResult(name="estimatedShipDate", column="estimatedShipDate")
,@FieldResult(name="estimatedDeliveryDate", column="estimatedDeliveryDate")
,@FieldResult(name="orderItemTypeId", column="orderItemTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderHeaderAndItems extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("grandTotal", "OH.GRAND_TOTAL");
        fields.put("productStoreId", "OH.PRODUCT_STORE_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderItemSeqId", "OI.ORDER_ITEM_SEQ_ID");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("quantity", "OI.QUANTITY");
        fields.put("cancelQuantity", "OI.CANCEL_QUANTITY");
        fields.put("unitPrice", "OI.UNIT_PRICE");
        fields.put("unitListPrice", "OI.UNIT_LIST_PRICE");
        fields.put("itemDescription", "OI.ITEM_DESCRIPTION");
        fields.put("itemStatusId", "OI.STATUS_ID");
        fields.put("estimatedShipDate", "OI.ESTIMATED_SHIP_DATE");
        fields.put("estimatedDeliveryDate", "OI.ESTIMATED_DELIVERY_DATE");
        fields.put("orderItemTypeId", "OI.ORDER_ITEM_TYPE_ID");
fieldMapColumns.put("OrderHeaderAndItems", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderHeaderAndItems> {
    orderId("orderId"),
    orderDate("orderDate"),
    orderStatusId("orderStatusId"),
    grandTotal("grandTotal"),
    productStoreId("productStoreId"),
    orderTypeId("orderTypeId"),
    orderItemSeqId("orderItemSeqId"),
    productId("productId"),
    quantity("quantity"),
    cancelQuantity("cancelQuantity"),
    unitPrice("unitPrice"),
    unitListPrice("unitListPrice"),
    itemDescription("itemDescription"),
    itemStatusId("itemStatusId"),
    estimatedShipDate("estimatedShipDate"),
    estimatedDeliveryDate("estimatedDeliveryDate"),
    orderItemTypeId("orderItemTypeId");
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
   private String orderId;
    
   private Timestamp orderDate;
    
   private String orderStatusId;
    
   private BigDecimal grandTotal;
    
   private String productStoreId;
    
   private String orderTypeId;
    
   private String orderItemSeqId;
    
   private String productId;
    
   private BigDecimal quantity;
    
   private BigDecimal cancelQuantity;
    
   private BigDecimal unitPrice;
    
   private BigDecimal unitListPrice;
    
   private String itemDescription;
    
   private String itemStatusId;
    
   private Timestamp estimatedShipDate;
    
   private Timestamp estimatedDeliveryDate;
    
   private String orderItemTypeId;

  /**
   * Default constructor.
   */
  public OrderHeaderAndItems() {
      super();
      this.baseEntityName = "OrderHeaderAndItems";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("grandTotal");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("cancelQuantity");this.allFieldsNames.add("unitPrice");this.allFieldsNames.add("unitListPrice");this.allFieldsNames.add("itemDescription");this.allFieldsNames.add("itemStatusId");this.allFieldsNames.add("estimatedShipDate");this.allFieldsNames.add("estimatedDeliveryDate");this.allFieldsNames.add("orderItemTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderHeaderAndItems(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    private void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @param grandTotal the grandTotal to set
     */
    private void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    private void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
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
     * @param orderItemSeqId the orderItemSeqId to set
     */
    private void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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
     * @param quantity the quantity to set
     */
    private void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param cancelQuantity the cancelQuantity to set
     */
    private void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
    /**
     * Auto generated value setter.
     * @param unitPrice the unitPrice to set
     */
    private void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    /**
     * Auto generated value setter.
     * @param unitListPrice the unitListPrice to set
     */
    private void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }
    /**
     * Auto generated value setter.
     * @param itemDescription the itemDescription to set
     */
    private void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    /**
     * Auto generated value setter.
     * @param itemStatusId the itemStatusId to set
     */
    private void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedShipDate the estimatedShipDate to set
     */
    private void setEstimatedShipDate(Timestamp estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }
    /**
     * Auto generated value setter.
     * @param estimatedDeliveryDate the estimatedDeliveryDate to set
     */
    private void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
    /**
     * Auto generated value setter.
     * @param orderItemTypeId the orderItemTypeId to set
     */
    private void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getGrandTotal() {
        return this.grandTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
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
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
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
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCancelQuantity() {
        return this.cancelQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitListPrice() {
        return this.unitListPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemDescription() {
        return this.itemDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemStatusId() {
        return this.itemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedShipDate() {
        return this.estimatedShipDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemTypeId() {
        return this.orderItemTypeId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setGrandTotal(convertToBigDecimal(mapValue.get("grandTotal")));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setProductId((String) mapValue.get("productId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setCancelQuantity(convertToBigDecimal(mapValue.get("cancelQuantity")));
        setUnitPrice(convertToBigDecimal(mapValue.get("unitPrice")));
        setUnitListPrice(convertToBigDecimal(mapValue.get("unitListPrice")));
        setItemDescription((String) mapValue.get("itemDescription"));
        setItemStatusId((String) mapValue.get("itemStatusId"));
        setEstimatedShipDate((Timestamp) mapValue.get("estimatedShipDate"));
        setEstimatedDeliveryDate((Timestamp) mapValue.get("estimatedDeliveryDate"));
        setOrderItemTypeId((String) mapValue.get("orderItemTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("grandTotal", getGrandTotal());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("cancelQuantity", getCancelQuantity());
        mapValue.put("unitPrice", getUnitPrice());
        mapValue.put("unitListPrice", getUnitListPrice());
        mapValue.put("itemDescription", getItemDescription());
        mapValue.put("itemStatusId", getItemStatusId());
        mapValue.put("estimatedShipDate", getEstimatedShipDate());
        mapValue.put("estimatedDeliveryDate", getEstimatedDeliveryDate());
        mapValue.put("orderItemTypeId", getOrderItemTypeId());
        return mapValue;
    }


}
