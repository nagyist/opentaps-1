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
 * Auto generated base entity AgreementBillingAndInvoiceSum.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAgreementBillingAndInvoiceSums", query="SELECT ATB.AGREEMENT_ID AS \"agreementId\",ATB.ORIG_INVOICE_ID AS \"origInvoiceId\",ATB.AGENT_PARTY_ID AS \"agentPartyId\",ATB.AMOUNT AS \"amount\",ATB.ORIG_AMOUNT AS \"origAmount\",ATB.ORIG_PAYMENT_AMOUNT AS \"origPaymentAmount\",ATB.ORIG_PAYMENT_APPLICATION_ID AS \"origPaymentApplicationId\",ATB.BILLING_DATETIME AS \"billingDatetime\",I.INVOICE_TYPE_ID AS \"invoiceTypeId\",I.STATUS_ID AS \"statusId\",I.PARTY_ID AS \"partyId\",I.PARTY_ID_FROM AS \"partyIdFrom\",I.INVOICE_DATE AS \"invoiceDate\" FROM AGREEMENT_TERM_BILLING ATB INNER JOIN INVOICE I ON ATB.ORIG_INVOICE_ID = I.INVOICE_ID", resultSetMapping="AgreementBillingAndInvoiceSumMapping")
@SqlResultSetMapping(name="AgreementBillingAndInvoiceSumMapping", entities={
@EntityResult(entityClass=AgreementBillingAndInvoiceSum.class, fields = {
@FieldResult(name="agreementId", column="agreementId")
,@FieldResult(name="origInvoiceId", column="origInvoiceId")
,@FieldResult(name="agentPartyId", column="agentPartyId")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="origAmount", column="origAmount")
,@FieldResult(name="origPaymentAmount", column="origPaymentAmount")
,@FieldResult(name="origPaymentApplicationId", column="origPaymentApplicationId")
,@FieldResult(name="billingDatetime", column="billingDatetime")
,@FieldResult(name="invoiceTypeId", column="invoiceTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="invoiceDate", column="invoiceDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AgreementBillingAndInvoiceSum extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("agreementId", "ATB.AGREEMENT_ID");
        fields.put("origInvoiceId", "ATB.ORIG_INVOICE_ID");
        fields.put("agentPartyId", "ATB.AGENT_PARTY_ID");
        fields.put("amount", "ATB.AMOUNT");
        fields.put("origAmount", "ATB.ORIG_AMOUNT");
        fields.put("origPaymentAmount", "ATB.ORIG_PAYMENT_AMOUNT");
        fields.put("origPaymentApplicationId", "ATB.ORIG_PAYMENT_APPLICATION_ID");
        fields.put("billingDatetime", "ATB.BILLING_DATETIME");
        fields.put("invoiceTypeId", "I.INVOICE_TYPE_ID");
        fields.put("statusId", "I.STATUS_ID");
        fields.put("partyId", "I.PARTY_ID");
        fields.put("partyIdFrom", "I.PARTY_ID_FROM");
        fields.put("invoiceDate", "I.INVOICE_DATE");
fieldMapColumns.put("AgreementBillingAndInvoiceSum", fields);
}
  public static enum Fields implements EntityFieldInterface<AgreementBillingAndInvoiceSum> {
    agreementId("agreementId"),
    origInvoiceId("origInvoiceId"),
    agentPartyId("agentPartyId"),
    amount("amount"),
    origAmount("origAmount"),
    origPaymentAmount("origPaymentAmount"),
    origPaymentApplicationId("origPaymentApplicationId"),
    billingDatetime("billingDatetime"),
    invoiceTypeId("invoiceTypeId"),
    statusId("statusId"),
    partyId("partyId"),
    partyIdFrom("partyIdFrom"),
    invoiceDate("invoiceDate");
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
   private String agreementId;
    
   private String origInvoiceId;
    
   private String agentPartyId;
    
   private BigDecimal amount;
    
   private BigDecimal origAmount;
    
   private BigDecimal origPaymentAmount;
    
   private String origPaymentApplicationId;
    
   private Timestamp billingDatetime;
    
   private String invoiceTypeId;
    
   private String statusId;
    
   private String partyId;
    
   private String partyIdFrom;
    
   private Timestamp invoiceDate;

  /**
   * Default constructor.
   */
  public AgreementBillingAndInvoiceSum() {
      super();
      this.baseEntityName = "AgreementBillingAndInvoiceSum";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("agreementId");this.allFieldsNames.add("origInvoiceId");this.allFieldsNames.add("agentPartyId");this.allFieldsNames.add("amount");this.allFieldsNames.add("origAmount");this.allFieldsNames.add("origPaymentAmount");this.allFieldsNames.add("origPaymentApplicationId");this.allFieldsNames.add("billingDatetime");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("invoiceDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AgreementBillingAndInvoiceSum(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param agreementId the agreementId to set
     */
    private void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
    /**
     * Auto generated value setter.
     * @param origInvoiceId the origInvoiceId to set
     */
    private void setOrigInvoiceId(String origInvoiceId) {
        this.origInvoiceId = origInvoiceId;
    }
    /**
     * Auto generated value setter.
     * @param agentPartyId the agentPartyId to set
     */
    private void setAgentPartyId(String agentPartyId) {
        this.agentPartyId = agentPartyId;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param origAmount the origAmount to set
     */
    private void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }
    /**
     * Auto generated value setter.
     * @param origPaymentAmount the origPaymentAmount to set
     */
    private void setOrigPaymentAmount(BigDecimal origPaymentAmount) {
        this.origPaymentAmount = origPaymentAmount;
    }
    /**
     * Auto generated value setter.
     * @param origPaymentApplicationId the origPaymentApplicationId to set
     */
    private void setOrigPaymentApplicationId(String origPaymentApplicationId) {
        this.origPaymentApplicationId = origPaymentApplicationId;
    }
    /**
     * Auto generated value setter.
     * @param billingDatetime the billingDatetime to set
     */
    private void setBillingDatetime(Timestamp billingDatetime) {
        this.billingDatetime = billingDatetime;
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
     * @param statusId the statusId to set
     */
    private void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param partyIdFrom the partyIdFrom to set
     */
    private void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param invoiceDate the invoiceDate to set
     */
    private void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementId() {
        return this.agreementId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrigInvoiceId() {
        return this.origInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgentPartyId() {
        return this.agentPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOrigAmount() {
        return this.origAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOrigPaymentAmount() {
        return this.origPaymentAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrigPaymentApplicationId() {
        return this.origPaymentApplicationId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getBillingDatetime() {
        return this.billingDatetime;
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
    public String getStatusId() {
        return this.statusId;
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
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInvoiceDate() {
        return this.invoiceDate;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAgreementId((String) mapValue.get("agreementId"));
        setOrigInvoiceId((String) mapValue.get("origInvoiceId"));
        setAgentPartyId((String) mapValue.get("agentPartyId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setOrigAmount(convertToBigDecimal(mapValue.get("origAmount")));
        setOrigPaymentAmount(convertToBigDecimal(mapValue.get("origPaymentAmount")));
        setOrigPaymentApplicationId((String) mapValue.get("origPaymentApplicationId"));
        setBillingDatetime((Timestamp) mapValue.get("billingDatetime"));
        setInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setPartyId((String) mapValue.get("partyId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setInvoiceDate((Timestamp) mapValue.get("invoiceDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("agreementId", getAgreementId());
        mapValue.put("origInvoiceId", getOrigInvoiceId());
        mapValue.put("agentPartyId", getAgentPartyId());
        mapValue.put("amount", getAmount());
        mapValue.put("origAmount", getOrigAmount());
        mapValue.put("origPaymentAmount", getOrigPaymentAmount());
        mapValue.put("origPaymentApplicationId", getOrigPaymentApplicationId());
        mapValue.put("billingDatetime", getBillingDatetime());
        mapValue.put("invoiceTypeId", getInvoiceTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("invoiceDate", getInvoiceDate());
        return mapValue;
    }


}
