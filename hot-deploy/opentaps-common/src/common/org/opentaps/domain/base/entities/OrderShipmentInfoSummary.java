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
 * Auto generated base entity OrderShipmentInfoSummary.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderShipmentInfoSummarys", query="SELECT II.ORDER_ID AS \"orderId\",II.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",II.SHIPMENT_ID AS \"shipmentId\",II.SHIP_GROUP_SEQ_ID AS \"shipGroupSeqId\",SRS.SHIPMENT_ROUTE_SEGMENT_ID AS \"shipmentRouteSegmentId\",SRS.CARRIER_PARTY_ID AS \"carrierPartyId\",SRS.ACTUAL_START_DATE AS \"actualStartDate\",SRS.SHIPMENT_METHOD_TYPE_ID AS \"shipmentMethodTypeId\",SPRS.SHIPMENT_PACKAGE_SEQ_ID AS \"shipmentPackageSeqId\",SPRS.TRACKING_CODE AS \"trackingCode\",SPRS.BOX_NUMBER AS \"boxNumber\" FROM ITEM_ISSUANCE II INNER JOIN SHIPMENT_ROUTE_SEGMENT SRS ON II.SHIPMENT_ID = SRS.SHIPMENT_ID INNER JOIN SHIPMENT_PACKAGE_ROUTE_SEG SPRS ON SRS.SHIPMENT_ID = SPRS.SHIPMENT_ID AND SRS.SHIPMENT_ROUTE_SEGMENT_ID = SPRS.SHIPMENT_ROUTE_SEGMENT_ID", resultSetMapping="OrderShipmentInfoSummaryMapping")
@SqlResultSetMapping(name="OrderShipmentInfoSummaryMapping", entities={
@EntityResult(entityClass=OrderShipmentInfoSummary.class, fields = {
@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="shipmentId", column="shipmentId")
,@FieldResult(name="shipGroupSeqId", column="shipGroupSeqId")
,@FieldResult(name="shipmentRouteSegmentId", column="shipmentRouteSegmentId")
,@FieldResult(name="carrierPartyId", column="carrierPartyId")
,@FieldResult(name="actualStartDate", column="actualStartDate")
,@FieldResult(name="shipmentMethodTypeId", column="shipmentMethodTypeId")
,@FieldResult(name="shipmentPackageSeqId", column="shipmentPackageSeqId")
,@FieldResult(name="trackingCode", column="trackingCode")
,@FieldResult(name="boxNumber", column="boxNumber")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderShipmentInfoSummary extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "II.ORDER_ID");
        fields.put("orderItemSeqId", "II.ORDER_ITEM_SEQ_ID");
        fields.put("shipmentId", "II.SHIPMENT_ID");
        fields.put("shipGroupSeqId", "II.SHIP_GROUP_SEQ_ID");
        fields.put("shipmentRouteSegmentId", "SRS.SHIPMENT_ROUTE_SEGMENT_ID");
        fields.put("carrierPartyId", "SRS.CARRIER_PARTY_ID");
        fields.put("actualStartDate", "SRS.ACTUAL_START_DATE");
        fields.put("shipmentMethodTypeId", "SRS.SHIPMENT_METHOD_TYPE_ID");
        fields.put("shipmentPackageSeqId", "SPRS.SHIPMENT_PACKAGE_SEQ_ID");
        fields.put("trackingCode", "SPRS.TRACKING_CODE");
        fields.put("boxNumber", "SPRS.BOX_NUMBER");
fieldMapColumns.put("OrderShipmentInfoSummary", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderShipmentInfoSummary> {
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipmentId("shipmentId"),
    shipGroupSeqId("shipGroupSeqId"),
    shipmentRouteSegmentId("shipmentRouteSegmentId"),
    carrierPartyId("carrierPartyId"),
    actualStartDate("actualStartDate"),
    shipmentMethodTypeId("shipmentMethodTypeId"),
    shipmentPackageSeqId("shipmentPackageSeqId"),
    trackingCode("trackingCode"),
    boxNumber("boxNumber");
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
    
   private String orderItemSeqId;
    
   private String shipmentId;
    
   private String shipGroupSeqId;
    
   private String shipmentRouteSegmentId;
    
   private String carrierPartyId;
    
   private Timestamp actualStartDate;
    
   private String shipmentMethodTypeId;
    
   private String shipmentPackageSeqId;
    
   private String trackingCode;
    
   private String boxNumber;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Shipment shipment = null;

  /**
   * Default constructor.
   */
  public OrderShipmentInfoSummary() {
      super();
      this.baseEntityName = "OrderShipmentInfoSummary";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentRouteSegmentId");this.primaryKeyNames.add("shipmentPackageSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("shipmentRouteSegmentId");this.allFieldsNames.add("carrierPartyId");this.allFieldsNames.add("actualStartDate");this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("shipmentPackageSeqId");this.allFieldsNames.add("trackingCode");this.allFieldsNames.add("boxNumber");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderShipmentInfoSummary(RepositoryInterface repository) {
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
     * @param orderItemSeqId the orderItemSeqId to set
     */
    private void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    private void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    private void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentRouteSegmentId the shipmentRouteSegmentId to set
     */
    private void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }
    /**
     * Auto generated value setter.
     * @param carrierPartyId the carrierPartyId to set
     */
    private void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }
    /**
     * Auto generated value setter.
     * @param actualStartDate the actualStartDate to set
     */
    private void setActualStartDate(Timestamp actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
    /**
     * Auto generated value setter.
     * @param shipmentMethodTypeId the shipmentMethodTypeId to set
     */
    private void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentPackageSeqId the shipmentPackageSeqId to set
     */
    private void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }
    /**
     * Auto generated value setter.
     * @param trackingCode the trackingCode to set
     */
    private void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
    /**
     * Auto generated value setter.
     * @param boxNumber the boxNumber to set
     */
    private void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
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
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupSeqId() {
        return this.shipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentRouteSegmentId() {
        return this.shipmentRouteSegmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCarrierPartyId() {
        return this.carrierPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getActualStartDate() {
        return this.actualStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentMethodTypeId() {
        return this.shipmentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentPackageSeqId() {
        return this.shipmentPackageSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCode() {
        return this.trackingCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBoxNumber() {
        return this.boxNumber;
    }

    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>Shipment</code>.
     * @return the <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public Shipment getShipment() throws RepositoryException {
        if (this.shipment == null) {
            this.shipment = getRelatedOne(Shipment.class, "Shipment");
        }
        return this.shipment;
    }

    /**
     * Auto generated value setter.
     * @param shipment the shipment to set
    */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setShipmentRouteSegmentId((String) mapValue.get("shipmentRouteSegmentId"));
        setCarrierPartyId((String) mapValue.get("carrierPartyId"));
        setActualStartDate((Timestamp) mapValue.get("actualStartDate"));
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setShipmentPackageSeqId((String) mapValue.get("shipmentPackageSeqId"));
        setTrackingCode((String) mapValue.get("trackingCode"));
        setBoxNumber((String) mapValue.get("boxNumber"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("shipmentRouteSegmentId", getShipmentRouteSegmentId());
        mapValue.put("carrierPartyId", getCarrierPartyId());
        mapValue.put("actualStartDate", getActualStartDate());
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("shipmentPackageSeqId", getShipmentPackageSeqId());
        mapValue.put("trackingCode", getTrackingCode());
        mapValue.put("boxNumber", getBoxNumber());
        return mapValue;
    }


}
