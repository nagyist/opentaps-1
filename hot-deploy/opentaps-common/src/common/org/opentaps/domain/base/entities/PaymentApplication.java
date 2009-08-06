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
 * Auto generated base entity PaymentApplication.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_APPLICATION")
public class PaymentApplication extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentApplicationId", "PAYMENT_APPLICATION_ID");
        fields.put("paymentId", "PAYMENT_ID");
        fields.put("invoiceId", "INVOICE_ID");
        fields.put("invoiceItemSeqId", "INVOICE_ITEM_SEQ_ID");
        fields.put("billingAccountId", "BILLING_ACCOUNT_ID");
        fields.put("overrideGlAccountId", "OVERRIDE_GL_ACCOUNT_ID");
        fields.put("toPaymentId", "TO_PAYMENT_ID");
        fields.put("taxAuthGeoId", "TAX_AUTH_GEO_ID");
        fields.put("amountApplied", "AMOUNT_APPLIED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentApplication", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentApplication> {
    paymentApplicationId("paymentApplicationId"),
    paymentId("paymentId"),
    invoiceId("invoiceId"),
    invoiceItemSeqId("invoiceItemSeqId"),
    billingAccountId("billingAccountId"),
    overrideGlAccountId("overrideGlAccountId"),
    toPaymentId("toPaymentId"),
    taxAuthGeoId("taxAuthGeoId"),
    amountApplied("amountApplied"),
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

   @org.hibernate.annotations.GenericGenerator(name="PaymentApplication_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentApplication_GEN")
   @Id
   @Column(name="PAYMENT_APPLICATION_ID")
   private String paymentApplicationId;
   @Column(name="PAYMENT_ID")
   private String paymentId;
   @Column(name="INVOICE_ID")
   private String invoiceId;
   @Column(name="INVOICE_ITEM_SEQ_ID")
   private String invoiceItemSeqId;
   @Column(name="BILLING_ACCOUNT_ID")
   private String billingAccountId;
   @Column(name="OVERRIDE_GL_ACCOUNT_ID")
   private String overrideGlAccountId;
   @Column(name="TO_PAYMENT_ID")
   private String toPaymentId;
   @Column(name="TAX_AUTH_GEO_ID")
   private String taxAuthGeoId;
   @Column(name="AMOUNT_APPLIED")
   private BigDecimal amountApplied;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Payment payment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Invoice invoice = null;
   private transient InvoiceItem invoiceItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BILLING_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private BillingAccount billingAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TO_PAYMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Payment toPayment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TAX_AUTH_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo geo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OVERRIDE_GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ORIG_PAYMENT_APPLICATION_ID")
   
   private List<AgreementTermBilling> agreementTermBillings = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_APPLICATION_ID")
   
   private List<LockboxBatchItemDetail> lockboxBatchItemDetails = null;

  /**
   * Default constructor.
   */
  public PaymentApplication() {
      super();
      this.baseEntityName = "PaymentApplication";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentApplicationId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentApplicationId");this.allFieldsNames.add("paymentId");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceItemSeqId");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("overrideGlAccountId");this.allFieldsNames.add("toPaymentId");this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("amountApplied");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentApplication(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentApplicationId the paymentApplicationId to set
     */
    public void setPaymentApplicationId(String paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemSeqId the invoiceItemSeqId to set
     */
    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountId the billingAccountId to set
     */
    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param overrideGlAccountId the overrideGlAccountId to set
     */
    public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
    /**
     * Auto generated value setter.
     * @param toPaymentId the toPaymentId to set
     */
    public void setToPaymentId(String toPaymentId) {
        this.toPaymentId = toPaymentId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * @param amountApplied the amountApplied to set
     */
    public void setAmountApplied(BigDecimal amountApplied) {
        this.amountApplied = amountApplied;
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
    public String getPaymentApplicationId() {
        return this.paymentApplicationId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentId() {
        return this.paymentId;
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
    public String getInvoiceItemSeqId() {
        return this.invoiceItemSeqId;
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
    public String getOverrideGlAccountId() {
        return this.overrideGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToPaymentId() {
        return this.toPaymentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.taxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmountApplied() {
        return this.amountApplied;
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
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public Payment getPayment() throws RepositoryException {
        if (this.payment == null) {
            this.payment = getRelatedOne(Payment.class, "Payment");
        }
        return this.payment;
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
     * @return the <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceItem getInvoiceItem() throws RepositoryException {
        if (this.invoiceItem == null) {
            this.invoiceItem = getRelatedOne(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItem;
    }
    /**
     * Auto generated method that gets the related <code>BillingAccount</code> by the relation named <code>BillingAccount</code>.
     * @return the <code>BillingAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public BillingAccount getBillingAccount() throws RepositoryException {
        if (this.billingAccount == null) {
            this.billingAccount = getRelatedOne(BillingAccount.class, "BillingAccount");
        }
        return this.billingAccount;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>ToPayment</code>.
     * @return the <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public Payment getToPayment() throws RepositoryException {
        if (this.toPayment == null) {
            this.toPayment = getRelatedOne(Payment.class, "ToPayment");
        }
        return this.toPayment;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>Geo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getGeo() throws RepositoryException {
        if (this.geo == null) {
            this.geo = getRelatedOne(Geo.class, "Geo");
        }
        return this.geo;
    }
    /**
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getGlAccount() throws RepositoryException {
        if (this.glAccount == null) {
            this.glAccount = getRelatedOne(GlAccount.class, "GlAccount");
        }
        return this.glAccount;
    }
    /**
     * Auto generated method that gets the related <code>AgreementTermBilling</code> by the relation named <code>AgreementTermBilling</code>.
     * @return the list of <code>AgreementTermBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementTermBilling> getAgreementTermBillings() throws RepositoryException {
        if (this.agreementTermBillings == null) {
            this.agreementTermBillings = getRelated(AgreementTermBilling.class, "AgreementTermBilling");
        }
        return this.agreementTermBillings;
    }
    /**
     * Auto generated method that gets the related <code>LockboxBatchItemDetail</code> by the relation named <code>LockboxBatchItemDetail</code>.
     * @return the list of <code>LockboxBatchItemDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends LockboxBatchItemDetail> getLockboxBatchItemDetails() throws RepositoryException {
        if (this.lockboxBatchItemDetails == null) {
            this.lockboxBatchItemDetails = getRelated(LockboxBatchItemDetail.class, "LockboxBatchItemDetail");
        }
        return this.lockboxBatchItemDetails;
    }

    /**
     * Auto generated value setter.
     * @param payment the payment to set
    */
    public void setPayment(Payment payment) {
        this.payment = payment;
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
     * @param invoiceItem the invoiceItem to set
    */
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
    /**
     * Auto generated value setter.
     * @param billingAccount the billingAccount to set
    */
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }
    /**
     * Auto generated value setter.
     * @param toPayment the toPayment to set
    */
    public void setToPayment(Payment toPayment) {
        this.toPayment = toPayment;
    }
    /**
     * Auto generated value setter.
     * @param geo the geo to set
    */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }
    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }
    /**
     * Auto generated value setter.
     * @param agreementTermBillings the agreementTermBillings to set
    */
    public void setAgreementTermBillings(List<AgreementTermBilling> agreementTermBillings) {
        this.agreementTermBillings = agreementTermBillings;
    }
    /**
     * Auto generated value setter.
     * @param lockboxBatchItemDetails the lockboxBatchItemDetails to set
    */
    public void setLockboxBatchItemDetails(List<LockboxBatchItemDetail> lockboxBatchItemDetails) {
        this.lockboxBatchItemDetails = lockboxBatchItemDetails;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentApplicationId((String) mapValue.get("paymentApplicationId"));
        setPaymentId((String) mapValue.get("paymentId"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        setToPaymentId((String) mapValue.get("toPaymentId"));
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        setAmountApplied(convertToBigDecimal(mapValue.get("amountApplied")));
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
        mapValue.put("paymentApplicationId", getPaymentApplicationId());
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("invoiceItemSeqId", getInvoiceItemSeqId());
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("overrideGlAccountId", getOverrideGlAccountId());
        mapValue.put("toPaymentId", getToPaymentId());
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("amountApplied", getAmountApplied());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
