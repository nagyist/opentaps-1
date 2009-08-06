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
 * Auto generated base entity InvoiceAndPartyClassificationDisbursement.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectInvoiceAndPartyClassificationDisbursements", query="SELECT PC.PARTY_CLASSIFICATION_GROUP_ID AS \"partyClassificationGroupId\",PC.FROM_DATE AS \"fromDate\",PC.THRU_DATE AS \"thruDate\",I.INVOICE_ID AS \"invoiceId\",I.INVOICE_TYPE_ID AS \"invoiceTypeId\",I.PARTY_ID_FROM AS \"partyIdFrom\",I.PARTY_ID AS \"partyId\",I.ROLE_TYPE_ID AS \"roleTypeId\",I.STATUS_ID AS \"statusId\",I.BILLING_ACCOUNT_ID AS \"billingAccountId\",I.CONTACT_MECH_ID AS \"contactMechId\",I.INVOICE_DATE AS \"invoiceDate\",I.DUE_DATE AS \"dueDate\",I.PAID_DATE AS \"paidDate\",I.INVOICE_MESSAGE AS \"invoiceMessage\",I.REFERENCE_NUMBER AS \"referenceNumber\",I.DESCRIPTION AS \"description\",I.CURRENCY_UOM_ID AS \"currencyUomId\",I.PROCESSING_STATUS_ID AS \"processingStatusId\" FROM INVOICE I INNER JOIN PARTY_CLASSIFICATION PC ON I.PARTY_ID_FROM = PC.PARTY_ID", resultSetMapping="InvoiceAndPartyClassificationDisbursementMapping")
@SqlResultSetMapping(name="InvoiceAndPartyClassificationDisbursementMapping", entities={
@EntityResult(entityClass=InvoiceAndPartyClassificationDisbursement.class, fields = {
@FieldResult(name="partyClassificationGroupId", column="partyClassificationGroupId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
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
public class InvoiceAndPartyClassificationDisbursement extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyClassificationGroupId", "PC.PARTY_CLASSIFICATION_GROUP_ID");
        fields.put("fromDate", "PC.FROM_DATE");
        fields.put("thruDate", "PC.THRU_DATE");
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
fieldMapColumns.put("InvoiceAndPartyClassificationDisbursement", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceAndPartyClassificationDisbursement> {
    partyClassificationGroupId("partyClassificationGroupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

    
   private String partyClassificationGroupId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    @Id
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
   private transient List<InvoiceItem> invoiceItems = null;

  /**
   * Default constructor.
   */
  public InvoiceAndPartyClassificationDisbursement() {
      super();
      this.baseEntityName = "InvoiceAndPartyClassificationDisbursement";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyClassificationGroupId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("invoiceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyClassificationGroupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("invoiceDate");this.allFieldsNames.add("dueDate");this.allFieldsNames.add("paidDate");this.allFieldsNames.add("invoiceMessage");this.allFieldsNames.add("referenceNumber");this.allFieldsNames.add("description");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("processingStatusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceAndPartyClassificationDisbursement(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyClassificationGroupId the partyClassificationGroupId to set
     */
    private void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    private void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    private void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
    public String getPartyClassificationGroupId() {
        return this.partyClassificationGroupId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
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
     * Auto generated method that gets the related <code>InvoiceItem</code> by the relation named <code>InvoiceItem</code>.
     * @return the list of <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceItem> getInvoiceItems() throws RepositoryException {
        if (this.invoiceItems == null) {
            this.invoiceItems = getRelated(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItems;
    }

    /**
     * Auto generated value setter.
     * @param invoice the invoice to set
    */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItems the invoiceItems to set
    */
    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyClassificationGroupId((String) mapValue.get("partyClassificationGroupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("partyClassificationGroupId", getPartyClassificationGroupId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
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
