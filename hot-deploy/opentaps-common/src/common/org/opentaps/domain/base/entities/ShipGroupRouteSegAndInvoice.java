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
 * Auto generated base entity ShipGroupRouteSegAndInvoice.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectShipGroupRouteSegAndInvoices", query="SELECT OISG.CARRIER_PARTY_ID AS \"carrierPartyId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OPP.PAYMENT_METHOD_TYPE_ID AS \"paymentMethodTypeId\",OPP.STATUS_ID AS \"statusId\",S.SHIPMENT_ID AS \"shipmentId\",S.SHIPMENT_TYPE_ID AS \"shipmentTypeId\",S.STATUS_ID AS \"statusId\",SRS.TRACKING_ID_NUMBER AS \"trackingIdNumber\",I.INVOICE_ID AS \"invoiceId\",I.INVOICE_TYPE_ID AS \"invoiceTypeId\",I.PARTY_ID_FROM AS \"partyIdFrom\",I.PARTY_ID AS \"partyId\",I.ROLE_TYPE_ID AS \"roleTypeId\",I.STATUS_ID AS \"statusId\",I.BILLING_ACCOUNT_ID AS \"billingAccountId\",I.CONTACT_MECH_ID AS \"contactMechId\",I.INVOICE_DATE AS \"invoiceDate\",I.DUE_DATE AS \"dueDate\",I.PAID_DATE AS \"paidDate\",I.INVOICE_MESSAGE AS \"invoiceMessage\",I.REFERENCE_NUMBER AS \"referenceNumber\",I.DESCRIPTION AS \"description\",I.CURRENCY_UOM_ID AS \"currencyUomId\",I.PROCESSING_STATUS_ID AS \"processingStatusId\" FROM ORDER_ITEM_SHIP_GROUP OISG INNER JOIN ORDER_HEADER OH ON OISG.ORDER_ID = OH.ORDER_ID INNER JOIN ORDER_PAYMENT_PREFERENCE OPP ON OISG.ORDER_ID = OPP.ORDER_ID INNER JOIN SHIPMENT S ON OISG.ORDER_ID = S.PRIMARY_ORDER_ID AND OISG.SHIP_GROUP_SEQ_ID = S.PRIMARY_SHIP_GROUP_SEQ_ID INNER JOIN SHIPMENT_ROUTE_SEGMENT SRS ON S.SHIPMENT_ID = SRS.SHIPMENT_ID INNER JOIN SHIPMENT_ITEM_BILLING SIB ON S.SHIPMENT_ID = SIB.SHIPMENT_ID INNER JOIN INVOICE I ON SIB.INVOICE_ID = I.INVOICE_ID", resultSetMapping="ShipGroupRouteSegAndInvoiceMapping")
@SqlResultSetMapping(name="ShipGroupRouteSegAndInvoiceMapping", entities={
@EntityResult(entityClass=ShipGroupRouteSegAndInvoice.class, fields = {
@FieldResult(name="carrierPartyId", column="carrierPartyId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="paymentMethodTypeId", column="paymentMethodTypeId")
,@FieldResult(name="oppStatusId", column="oppStatusId")
,@FieldResult(name="shipmentId", column="shipmentId")
,@FieldResult(name="shipmentTypeId", column="shipmentTypeId")
,@FieldResult(name="shipmentStatusId", column="shipmentStatusId")
,@FieldResult(name="trackingIdNumber", column="trackingIdNumber")
,@FieldResult(name="invoiceId", column="invoiceId")
,@FieldResult(name="invoiceTypeId", column="invoiceTypeId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="billingAccountId", column="billingAccountId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="invoiceDate", column="invoiceDate")
,@FieldResult(name="dueDate", column="dueDate")
,@FieldResult(name="paidDate", column="paidDate")
,@FieldResult(name="invoiceMessage", column="invoiceMessage")
,@FieldResult(name="referenceNumber", column="referenceNumber")
,@FieldResult(name="description", column="description")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="processingStatusId", column="processingStatusId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ShipGroupRouteSegAndInvoice extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("carrierPartyId", "OISG.CARRIER_PARTY_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("paymentMethodTypeId", "OPP.PAYMENT_METHOD_TYPE_ID");
        fields.put("oppStatusId", "OPP.STATUS_ID");
        fields.put("shipmentId", "S.SHIPMENT_ID");
        fields.put("shipmentTypeId", "S.SHIPMENT_TYPE_ID");
        fields.put("shipmentStatusId", "S.STATUS_ID");
        fields.put("trackingIdNumber", "SRS.TRACKING_ID_NUMBER");
        fields.put("invoiceId", "I.INVOICE_ID");
        fields.put("invoiceTypeId", "I.INVOICE_TYPE_ID");
        fields.put("partyIdFrom", "I.PARTY_ID_FROM");
        fields.put("partyId", "I.PARTY_ID");
        fields.put("roleTypeId", "I.ROLE_TYPE_ID");
        fields.put("statusId", "I.STATUS_ID");
        fields.put("billingAccountId", "I.BILLING_ACCOUNT_ID");
        fields.put("contactMechId", "I.CONTACT_MECH_ID");
        fields.put("invoiceDate", "I.INVOICE_DATE");
        fields.put("dueDate", "I.DUE_DATE");
        fields.put("paidDate", "I.PAID_DATE");
        fields.put("invoiceMessage", "I.INVOICE_MESSAGE");
        fields.put("referenceNumber", "I.REFERENCE_NUMBER");
        fields.put("description", "I.DESCRIPTION");
        fields.put("currencyUomId", "I.CURRENCY_UOM_ID");
        fields.put("processingStatusId", "I.PROCESSING_STATUS_ID");
fieldMapColumns.put("ShipGroupRouteSegAndInvoice", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipGroupRouteSegAndInvoice> {
    carrierPartyId("carrierPartyId"),
    orderTypeId("orderTypeId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    oppStatusId("oppStatusId"),
    shipmentId("shipmentId"),
    shipmentTypeId("shipmentTypeId"),
    shipmentStatusId("shipmentStatusId"),
    trackingIdNumber("trackingIdNumber"),
    invoiceId("invoiceId"),
    invoiceTypeId("invoiceTypeId"),
    partyIdFrom("partyIdFrom"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    statusId("statusId"),
    billingAccountId("billingAccountId"),
    contactMechId("contactMechId"),
    invoiceDate("invoiceDate"),
    dueDate("dueDate"),
    paidDate("paidDate"),
    invoiceMessage("invoiceMessage"),
    referenceNumber("referenceNumber"),
    description("description"),
    currencyUomId("currencyUomId"),
    processingStatusId("processingStatusId");
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
   private String carrierPartyId;
    
   private String orderTypeId;
    
   private String paymentMethodTypeId;
    
   private String oppStatusId;
    
   private String shipmentId;
    
   private String shipmentTypeId;
    
   private String shipmentStatusId;
    
   private String trackingIdNumber;
    
   private String invoiceId;
    
   private String invoiceTypeId;
    
   private String partyIdFrom;
    
   private String partyId;
    
   private String roleTypeId;
    
   private String statusId;
    
   private String billingAccountId;
    
   private String contactMechId;
    
   private Timestamp invoiceDate;
    
   private Timestamp dueDate;
    
   private Timestamp paidDate;
    
   private String invoiceMessage;
    
   private String referenceNumber;
    
   private String description;
    
   private String currencyUomId;
    
   private String processingStatusId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Invoice invoice = null;

  /**
   * Default constructor.
   */
  public ShipGroupRouteSegAndInvoice() {
      super();
      this.baseEntityName = "ShipGroupRouteSegAndInvoice";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentId");this.primaryKeyNames.add("invoiceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("carrierPartyId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("oppStatusId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentTypeId");this.allFieldsNames.add("shipmentStatusId");this.allFieldsNames.add("trackingIdNumber");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("invoiceDate");this.allFieldsNames.add("dueDate");this.allFieldsNames.add("paidDate");this.allFieldsNames.add("invoiceMessage");this.allFieldsNames.add("referenceNumber");this.allFieldsNames.add("description");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("processingStatusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipGroupRouteSegAndInvoice(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param carrierPartyId the carrierPartyId to set
     */
    private void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
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
     * @param paymentMethodTypeId the paymentMethodTypeId to set
     */
    private void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param oppStatusId the oppStatusId to set
     */
    private void setOppStatusId(String oppStatusId) {
        this.oppStatusId = oppStatusId;
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
     * @param shipmentTypeId the shipmentTypeId to set
     */
    private void setShipmentTypeId(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentStatusId the shipmentStatusId to set
     */
    private void setShipmentStatusId(String shipmentStatusId) {
        this.shipmentStatusId = shipmentStatusId;
    }
    /**
     * Auto generated value setter.
     * @param trackingIdNumber the trackingIdNumber to set
     */
    private void setTrackingIdNumber(String trackingIdNumber) {
        this.trackingIdNumber = trackingIdNumber;
    }
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    private void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceTypeId the invoiceTypeId to set
     */
    private void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    private void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    private void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    private void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @param billingAccountId the billingAccountId to set
     */
    private void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    private void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceDate the invoiceDate to set
     */
    private void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    /**
     * Auto generated value setter.
     * @param dueDate the dueDate to set
     */
    private void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }
    /**
     * Auto generated value setter.
     * @param paidDate the paidDate to set
     */
    private void setPaidDate(Timestamp paidDate) {
        this.paidDate = paidDate;
    }
    /**
     * Auto generated value setter.
     * @param invoiceMessage the invoiceMessage to set
     */
    private void setInvoiceMessage(String invoiceMessage) {
        this.invoiceMessage = invoiceMessage;
    }
    /**
     * Auto generated value setter.
     * @param referenceNumber the referenceNumber to set
     */
    private void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
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
     * @param currencyUomId the currencyUomId to set
     */
    private void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param processingStatusId the processingStatusId to set
     */
    private void setProcessingStatusId(String processingStatusId) {
        this.processingStatusId = processingStatusId;
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
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethodTypeId() {
        return this.paymentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOppStatusId() {
        return this.oppStatusId;
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
    public String getShipmentTypeId() {
        return this.shipmentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentStatusId() {
        return this.shipmentStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingIdNumber() {
        return this.trackingIdNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceTypeId() {
        return this.invoiceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
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
     * @return <code>String</code>
     */
    public String getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInvoiceDate() {
        return this.invoiceDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDueDate() {
        return this.dueDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPaidDate() {
        return this.paidDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceMessage() {
        return this.invoiceMessage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceNumber() {
        return this.referenceNumber;
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
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessingStatusId() {
        return this.processingStatusId;
    }

    /**
     * Auto generated method that gets the related <code>Invoice</code> by the relation named <code>Invoice</code>.
     * @return the <code>Invoice</code>
     * @throws RepositoryException if an error occurs
     */
    public Invoice getInvoice() throws RepositoryException {
        if (this.invoice == null) {
            this.invoice = getRelatedOne(Invoice.class, "Invoice");
        }
        return this.invoice;
    }

    /**
     * Auto generated value setter.
     * @param invoice the invoice to set
    */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCarrierPartyId((String) mapValue.get("carrierPartyId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setOppStatusId((String) mapValue.get("oppStatusId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentTypeId((String) mapValue.get("shipmentTypeId"));
        setShipmentStatusId((String) mapValue.get("shipmentStatusId"));
        setTrackingIdNumber((String) mapValue.get("trackingIdNumber"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setInvoiceDate((Timestamp) mapValue.get("invoiceDate"));
        setDueDate((Timestamp) mapValue.get("dueDate"));
        setPaidDate((Timestamp) mapValue.get("paidDate"));
        setInvoiceMessage((String) mapValue.get("invoiceMessage"));
        setReferenceNumber((String) mapValue.get("referenceNumber"));
        setDescription((String) mapValue.get("description"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setProcessingStatusId((String) mapValue.get("processingStatusId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("carrierPartyId", getCarrierPartyId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("oppStatusId", getOppStatusId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentTypeId", getShipmentTypeId());
        mapValue.put("shipmentStatusId", getShipmentStatusId());
        mapValue.put("trackingIdNumber", getTrackingIdNumber());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("invoiceTypeId", getInvoiceTypeId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("invoiceDate", getInvoiceDate());
        mapValue.put("dueDate", getDueDate());
        mapValue.put("paidDate", getPaidDate());
        mapValue.put("invoiceMessage", getInvoiceMessage());
        mapValue.put("referenceNumber", getReferenceNumber());
        mapValue.put("description", getDescription());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("processingStatusId", getProcessingStatusId());
        return mapValue;
    }


}
