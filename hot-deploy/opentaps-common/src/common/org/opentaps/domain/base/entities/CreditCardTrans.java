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
 * Auto generated base entity CreditCardTrans.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCreditCardTranss", query="SELECT P.PAYMENT_ID AS \"paymentId\",P.CURRENCY_UOM_ID AS \"currencyUomId\",P.PARTY_ID_TO AS \"partyIdTo\",P.AMOUNT AS \"amount\",PA.AMOUNT_APPLIED AS \"amountApplied\",PA.INVOICE_ID AS \"invoiceId\",PGR.PAYMENT_GATEWAY_RESPONSE_ID AS \"paymentGatewayResponseId\",PGR.TRANSACTION_DATE AS \"transactionDate\",PGR.TRANS_CODE_ENUM_ID AS \"transCodeEnumId\",PGR.REFERENCE_NUM AS \"referenceNum\",PGR.GATEWAY_CODE AS \"gatewayCode\",CC.PAYMENT_METHOD_ID AS \"paymentMethodId\",OPP.ORDER_ID AS \"orderId\" FROM PAYMENT P LEFT JOIN PAYMENT_APPLICATION PA ON P.PAYMENT_ID = PA.PAYMENT_ID INNER JOIN PAYMENT_GATEWAY_RESPONSE PGR ON P.PAYMENT_GATEWAY_RESPONSE_ID = PGR.PAYMENT_GATEWAY_RESPONSE_ID LEFT JOIN CREDIT_CARD CC ON P.PAYMENT_METHOD_ID = CC.PAYMENT_METHOD_ID LEFT JOIN ORDER_PAYMENT_PREFERENCE OPP ON PGR.ORDER_PAYMENT_PREFERENCE_ID = OPP.ORDER_PAYMENT_PREFERENCE_ID", resultSetMapping="CreditCardTransMapping")
@SqlResultSetMapping(name="CreditCardTransMapping", entities={
@EntityResult(entityClass=CreditCardTrans.class, fields = {
@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="paymentAmount", column="paymentAmount")
,@FieldResult(name="amountApplied", column="amountApplied")
,@FieldResult(name="invoiceId", column="invoiceId")
,@FieldResult(name="paymentGatewayResponseId", column="paymentGatewayResponseId")
,@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="transCodeEnumId", column="transCodeEnumId")
,@FieldResult(name="referenceNum", column="referenceNum")
,@FieldResult(name="gatewayCode", column="gatewayCode")
,@FieldResult(name="paymentMethodId", column="paymentMethodId")
,@FieldResult(name="orderId", column="orderId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CreditCardTrans extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentId", "P.PAYMENT_ID");
        fields.put("currencyUomId", "P.CURRENCY_UOM_ID");
        fields.put("partyIdTo", "P.PARTY_ID_TO");
        fields.put("paymentAmount", "P.AMOUNT");
        fields.put("amountApplied", "PA.AMOUNT_APPLIED");
        fields.put("invoiceId", "PA.INVOICE_ID");
        fields.put("paymentGatewayResponseId", "PGR.PAYMENT_GATEWAY_RESPONSE_ID");
        fields.put("transactionDate", "PGR.TRANSACTION_DATE");
        fields.put("transCodeEnumId", "PGR.TRANS_CODE_ENUM_ID");
        fields.put("referenceNum", "PGR.REFERENCE_NUM");
        fields.put("gatewayCode", "PGR.GATEWAY_CODE");
        fields.put("paymentMethodId", "CC.PAYMENT_METHOD_ID");
        fields.put("orderId", "OPP.ORDER_ID");
fieldMapColumns.put("CreditCardTrans", fields);
}
  public static enum Fields implements EntityFieldInterface<CreditCardTrans> {
    paymentId("paymentId"),
    currencyUomId("currencyUomId"),
    partyIdTo("partyIdTo"),
    paymentAmount("paymentAmount"),
    amountApplied("amountApplied"),
    invoiceId("invoiceId"),
    paymentGatewayResponseId("paymentGatewayResponseId"),
    transactionDate("transactionDate"),
    transCodeEnumId("transCodeEnumId"),
    referenceNum("referenceNum"),
    gatewayCode("gatewayCode"),
    paymentMethodId("paymentMethodId"),
    orderId("orderId");
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
   private String paymentId;
    
   private String currencyUomId;
    
   private String partyIdTo;
    
   private BigDecimal paymentAmount;
    
   private BigDecimal amountApplied;
    
   private String invoiceId;
    
   private String paymentGatewayResponseId;
    
   private Timestamp transactionDate;
    
   private String transCodeEnumId;
    
   private String referenceNum;
    
   private String gatewayCode;
    
   private String paymentMethodId;
    
   private String orderId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CreditCard creditCard = null;

  /**
   * Default constructor.
   */
  public CreditCardTrans() {
      super();
      this.baseEntityName = "CreditCardTrans";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentId");this.primaryKeyNames.add("paymentGatewayResponseId");this.primaryKeyNames.add("paymentMethodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("paymentAmount");this.allFieldsNames.add("amountApplied");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("paymentGatewayResponseId");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("transCodeEnumId");this.allFieldsNames.add("referenceNum");this.allFieldsNames.add("gatewayCode");this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("orderId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CreditCardTrans(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    private void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
     * @param partyIdTo the partyIdTo to set
     */
    private void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param paymentAmount the paymentAmount to set
     */
    private void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    /**
     * Auto generated value setter.
     * @param amountApplied the amountApplied to set
     */
    private void setAmountApplied(BigDecimal amountApplied) {
        this.amountApplied = amountApplied;
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
     * @param paymentGatewayResponseId the paymentGatewayResponseId to set
     */
    private void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    private void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param transCodeEnumId the transCodeEnumId to set
     */
    private void setTransCodeEnumId(String transCodeEnumId) {
        this.transCodeEnumId = transCodeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param referenceNum the referenceNum to set
     */
    private void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }
    /**
     * Auto generated value setter.
     * @param gatewayCode the gatewayCode to set
     */
    private void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodId the paymentMethodId to set
     */
    private void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    private void setOrderId(String orderId) {
        this.orderId = orderId;
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
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPaymentAmount() {
        return this.paymentAmount;
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
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentGatewayResponseId() {
        return this.paymentGatewayResponseId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransCodeEnumId() {
        return this.transCodeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceNum() {
        return this.referenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayCode() {
        return this.gatewayCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Auto generated method that gets the related <code>CreditCard</code> by the relation named <code>CreditCard</code>.
     * @return the <code>CreditCard</code>
     * @throws RepositoryException if an error occurs
     */
    public CreditCard getCreditCard() throws RepositoryException {
        if (this.creditCard == null) {
            this.creditCard = getRelatedOne(CreditCard.class, "CreditCard");
        }
        return this.creditCard;
    }

    /**
     * Auto generated value setter.
     * @param creditCard the creditCard to set
    */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentId((String) mapValue.get("paymentId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setPaymentAmount(convertToBigDecimal(mapValue.get("paymentAmount")));
        setAmountApplied(convertToBigDecimal(mapValue.get("amountApplied")));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setPaymentGatewayResponseId((String) mapValue.get("paymentGatewayResponseId"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setTransCodeEnumId((String) mapValue.get("transCodeEnumId"));
        setReferenceNum((String) mapValue.get("referenceNum"));
        setGatewayCode((String) mapValue.get("gatewayCode"));
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setOrderId((String) mapValue.get("orderId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("paymentAmount", getPaymentAmount());
        mapValue.put("amountApplied", getAmountApplied());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("paymentGatewayResponseId", getPaymentGatewayResponseId());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("transCodeEnumId", getTransCodeEnumId());
        mapValue.put("referenceNum", getReferenceNum());
        mapValue.put("gatewayCode", getGatewayCode());
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("orderId", getOrderId());
        return mapValue;
    }


}
