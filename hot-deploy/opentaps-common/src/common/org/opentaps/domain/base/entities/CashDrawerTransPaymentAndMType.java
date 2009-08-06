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
 * Auto generated base entity CashDrawerTransPaymentAndMType.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCashDrawerTransPaymentAndMTypes", query="SELECT CDT.CASH_DRAWER_ID AS \"cashDrawerId\",CDT.CASH_DRAWER_ITEM_SEQ_ID AS \"cashDrawerItemSeqId\",P.PAYMENT_METHOD_TYPE_ID AS \"paymentMethodTypeId\",PMT.DESCRIPTION AS \"description\",P.PAYMENT_ID AS \"paymentId\",P.PAYMENT_TYPE_ID AS \"paymentTypeId\",P.PAYMENT_METHOD_ID AS \"paymentMethodId\",P.PAYMENT_GATEWAY_RESPONSE_ID AS \"paymentGatewayResponseId\",P.PAYMENT_PREFERENCE_ID AS \"paymentPreferenceId\",P.PARTY_ID_FROM AS \"partyIdFrom\",P.PARTY_ID_TO AS \"partyIdTo\",P.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",P.STATUS_ID AS \"statusId\",P.EFFECTIVE_DATE AS \"effectiveDate\",P.PAYMENT_REF_NUM AS \"paymentRefNum\",P.AMOUNT AS \"amount\",P.CURRENCY_UOM_ID AS \"currencyUomId\",P.COMMENTS AS \"comments\",P.FIN_ACCOUNT_TRANS_ID AS \"finAccountTransId\",P.OVERRIDE_GL_ACCOUNT_ID AS \"overrideGlAccountId\",P.ACTUAL_CURRENCY_AMOUNT AS \"actualCurrencyAmount\",P.ACTUAL_CURRENCY_UOM_ID AS \"actualCurrencyUomId\",P.ACCTG_TAG_ENUM_ID1 AS \"acctgTagEnumId1\",P.ACCTG_TAG_ENUM_ID2 AS \"acctgTagEnumId2\",P.ACCTG_TAG_ENUM_ID3 AS \"acctgTagEnumId3\",P.ACCTG_TAG_ENUM_ID4 AS \"acctgTagEnumId4\",P.ACCTG_TAG_ENUM_ID5 AS \"acctgTagEnumId5\",P.ACCTG_TAG_ENUM_ID6 AS \"acctgTagEnumId6\",P.ACCTG_TAG_ENUM_ID7 AS \"acctgTagEnumId7\",P.ACCTG_TAG_ENUM_ID8 AS \"acctgTagEnumId8\",P.ACCTG_TAG_ENUM_ID9 AS \"acctgTagEnumId9\",P.ACCTG_TAG_ENUM_ID10 AS \"acctgTagEnumId10\" FROM CASH_DRAWER_TRANSACTION CDT INNER JOIN PAYMENT P ON CDT.PAYMENT_ID = P.PAYMENT_ID INNER JOIN PAYMENT_METHOD_TYPE PMT ON P.PAYMENT_METHOD_TYPE_ID = PMT.PAYMENT_METHOD_TYPE_ID", resultSetMapping="CashDrawerTransPaymentAndMTypeMapping")
@SqlResultSetMapping(name="CashDrawerTransPaymentAndMTypeMapping", entities={
@EntityResult(entityClass=CashDrawerTransPaymentAndMType.class, fields = {
@FieldResult(name="cashDrawerId", column="cashDrawerId")
,@FieldResult(name="cashDrawerItemSeqId", column="cashDrawerItemSeqId")
,@FieldResult(name="paymentMethodTypeId", column="paymentMethodTypeId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="paymentTypeId", column="paymentTypeId")
,@FieldResult(name="paymentMethodId", column="paymentMethodId")
,@FieldResult(name="paymentGatewayResponseId", column="paymentGatewayResponseId")
,@FieldResult(name="paymentPreferenceId", column="paymentPreferenceId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="effectiveDate", column="effectiveDate")
,@FieldResult(name="paymentRefNum", column="paymentRefNum")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="finAccountTransId", column="finAccountTransId")
,@FieldResult(name="overrideGlAccountId", column="overrideGlAccountId")
,@FieldResult(name="actualCurrencyAmount", column="actualCurrencyAmount")
,@FieldResult(name="actualCurrencyUomId", column="actualCurrencyUomId")
,@FieldResult(name="acctgTagEnumId1", column="acctgTagEnumId1")
,@FieldResult(name="acctgTagEnumId2", column="acctgTagEnumId2")
,@FieldResult(name="acctgTagEnumId3", column="acctgTagEnumId3")
,@FieldResult(name="acctgTagEnumId4", column="acctgTagEnumId4")
,@FieldResult(name="acctgTagEnumId5", column="acctgTagEnumId5")
,@FieldResult(name="acctgTagEnumId6", column="acctgTagEnumId6")
,@FieldResult(name="acctgTagEnumId7", column="acctgTagEnumId7")
,@FieldResult(name="acctgTagEnumId8", column="acctgTagEnumId8")
,@FieldResult(name="acctgTagEnumId9", column="acctgTagEnumId9")
,@FieldResult(name="acctgTagEnumId10", column="acctgTagEnumId10")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CashDrawerTransPaymentAndMType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("cashDrawerId", "CDT.CASH_DRAWER_ID");
        fields.put("cashDrawerItemSeqId", "CDT.CASH_DRAWER_ITEM_SEQ_ID");
        fields.put("paymentMethodTypeId", "P.PAYMENT_METHOD_TYPE_ID");
        fields.put("description", "PMT.DESCRIPTION");
        fields.put("paymentId", "P.PAYMENT_ID");
        fields.put("paymentTypeId", "P.PAYMENT_TYPE_ID");
        fields.put("paymentMethodId", "P.PAYMENT_METHOD_ID");
        fields.put("paymentGatewayResponseId", "P.PAYMENT_GATEWAY_RESPONSE_ID");
        fields.put("paymentPreferenceId", "P.PAYMENT_PREFERENCE_ID");
        fields.put("partyIdFrom", "P.PARTY_ID_FROM");
        fields.put("partyIdTo", "P.PARTY_ID_TO");
        fields.put("roleTypeIdTo", "P.ROLE_TYPE_ID_TO");
        fields.put("statusId", "P.STATUS_ID");
        fields.put("effectiveDate", "P.EFFECTIVE_DATE");
        fields.put("paymentRefNum", "P.PAYMENT_REF_NUM");
        fields.put("amount", "P.AMOUNT");
        fields.put("currencyUomId", "P.CURRENCY_UOM_ID");
        fields.put("comments", "P.COMMENTS");
        fields.put("finAccountTransId", "P.FIN_ACCOUNT_TRANS_ID");
        fields.put("overrideGlAccountId", "P.OVERRIDE_GL_ACCOUNT_ID");
        fields.put("actualCurrencyAmount", "P.ACTUAL_CURRENCY_AMOUNT");
        fields.put("actualCurrencyUomId", "P.ACTUAL_CURRENCY_UOM_ID");
        fields.put("acctgTagEnumId1", "P.ACCTG_TAG_ENUM_ID1");
        fields.put("acctgTagEnumId2", "P.ACCTG_TAG_ENUM_ID2");
        fields.put("acctgTagEnumId3", "P.ACCTG_TAG_ENUM_ID3");
        fields.put("acctgTagEnumId4", "P.ACCTG_TAG_ENUM_ID4");
        fields.put("acctgTagEnumId5", "P.ACCTG_TAG_ENUM_ID5");
        fields.put("acctgTagEnumId6", "P.ACCTG_TAG_ENUM_ID6");
        fields.put("acctgTagEnumId7", "P.ACCTG_TAG_ENUM_ID7");
        fields.put("acctgTagEnumId8", "P.ACCTG_TAG_ENUM_ID8");
        fields.put("acctgTagEnumId9", "P.ACCTG_TAG_ENUM_ID9");
        fields.put("acctgTagEnumId10", "P.ACCTG_TAG_ENUM_ID10");
fieldMapColumns.put("CashDrawerTransPaymentAndMType", fields);
}
  public static enum Fields implements EntityFieldInterface<CashDrawerTransPaymentAndMType> {
    cashDrawerId("cashDrawerId"),
    cashDrawerItemSeqId("cashDrawerItemSeqId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    description("description"),
    paymentId("paymentId"),
    paymentTypeId("paymentTypeId"),
    paymentMethodId("paymentMethodId"),
    paymentGatewayResponseId("paymentGatewayResponseId"),
    paymentPreferenceId("paymentPreferenceId"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    roleTypeIdTo("roleTypeIdTo"),
    statusId("statusId"),
    effectiveDate("effectiveDate"),
    paymentRefNum("paymentRefNum"),
    amount("amount"),
    currencyUomId("currencyUomId"),
    comments("comments"),
    finAccountTransId("finAccountTransId"),
    overrideGlAccountId("overrideGlAccountId"),
    actualCurrencyAmount("actualCurrencyAmount"),
    actualCurrencyUomId("actualCurrencyUomId"),
    acctgTagEnumId1("acctgTagEnumId1"),
    acctgTagEnumId2("acctgTagEnumId2"),
    acctgTagEnumId3("acctgTagEnumId3"),
    acctgTagEnumId4("acctgTagEnumId4"),
    acctgTagEnumId5("acctgTagEnumId5"),
    acctgTagEnumId6("acctgTagEnumId6"),
    acctgTagEnumId7("acctgTagEnumId7"),
    acctgTagEnumId8("acctgTagEnumId8"),
    acctgTagEnumId9("acctgTagEnumId9"),
    acctgTagEnumId10("acctgTagEnumId10");
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
   private String cashDrawerId;
    
   private String cashDrawerItemSeqId;
    
   private String paymentMethodTypeId;
    
   private String description;
    
   private String paymentId;
    
   private String paymentTypeId;
    
   private String paymentMethodId;
    
   private String paymentGatewayResponseId;
    
   private String paymentPreferenceId;
    
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private String roleTypeIdTo;
    
   private String statusId;
    
   private Timestamp effectiveDate;
    
   private String paymentRefNum;
    
   private BigDecimal amount;
    
   private String currencyUomId;
    
   private String comments;
    
   private String finAccountTransId;
    
   private String overrideGlAccountId;
    
   private BigDecimal actualCurrencyAmount;
    
   private String actualCurrencyUomId;
    
   private String acctgTagEnumId1;
    
   private String acctgTagEnumId2;
    
   private String acctgTagEnumId3;
    
   private String acctgTagEnumId4;
    
   private String acctgTagEnumId5;
    
   private String acctgTagEnumId6;
    
   private String acctgTagEnumId7;
    
   private String acctgTagEnumId8;
    
   private String acctgTagEnumId9;
    
   private String acctgTagEnumId10;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentType paymentType = null;

  /**
   * Default constructor.
   */
  public CashDrawerTransPaymentAndMType() {
      super();
      this.baseEntityName = "CashDrawerTransPaymentAndMType";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("cashDrawerId");this.primaryKeyNames.add("cashDrawerItemSeqId");this.primaryKeyNames.add("paymentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("cashDrawerId");this.allFieldsNames.add("cashDrawerItemSeqId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("paymentId");this.allFieldsNames.add("paymentTypeId");this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("paymentGatewayResponseId");this.allFieldsNames.add("paymentPreferenceId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("statusId");this.allFieldsNames.add("effectiveDate");this.allFieldsNames.add("paymentRefNum");this.allFieldsNames.add("amount");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("comments");this.allFieldsNames.add("finAccountTransId");this.allFieldsNames.add("overrideGlAccountId");this.allFieldsNames.add("actualCurrencyAmount");this.allFieldsNames.add("actualCurrencyUomId");this.allFieldsNames.add("acctgTagEnumId1");this.allFieldsNames.add("acctgTagEnumId2");this.allFieldsNames.add("acctgTagEnumId3");this.allFieldsNames.add("acctgTagEnumId4");this.allFieldsNames.add("acctgTagEnumId5");this.allFieldsNames.add("acctgTagEnumId6");this.allFieldsNames.add("acctgTagEnumId7");this.allFieldsNames.add("acctgTagEnumId8");this.allFieldsNames.add("acctgTagEnumId9");this.allFieldsNames.add("acctgTagEnumId10");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CashDrawerTransPaymentAndMType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param cashDrawerId the cashDrawerId to set
     */
    private void setCashDrawerId(String cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }
    /**
     * Auto generated value setter.
     * @param cashDrawerItemSeqId the cashDrawerItemSeqId to set
     */
    private void setCashDrawerItemSeqId(String cashDrawerItemSeqId) {
        this.cashDrawerItemSeqId = cashDrawerItemSeqId;
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
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    private void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * Auto generated value setter.
     * @param paymentTypeId the paymentTypeId to set
     */
    private void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
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
     * @param paymentGatewayResponseId the paymentGatewayResponseId to set
     */
    private void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
    /**
     * Auto generated value setter.
     * @param paymentPreferenceId the paymentPreferenceId to set
     */
    private void setPaymentPreferenceId(String paymentPreferenceId) {
        this.paymentPreferenceId = paymentPreferenceId;
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
     * @param partyIdTo the partyIdTo to set
     */
    private void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    private void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
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
     * @param effectiveDate the effectiveDate to set
     */
    private void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    /**
     * Auto generated value setter.
     * @param paymentRefNum the paymentRefNum to set
     */
    private void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
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
     * @param currencyUomId the currencyUomId to set
     */
    private void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    private void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTransId the finAccountTransId to set
     */
    private void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
    /**
     * Auto generated value setter.
     * @param overrideGlAccountId the overrideGlAccountId to set
     */
    private void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }
    /**
     * Auto generated value setter.
     * @param actualCurrencyAmount the actualCurrencyAmount to set
     */
    private void setActualCurrencyAmount(BigDecimal actualCurrencyAmount) {
        this.actualCurrencyAmount = actualCurrencyAmount;
    }
    /**
     * Auto generated value setter.
     * @param actualCurrencyUomId the actualCurrencyUomId to set
     */
    private void setActualCurrencyUomId(String actualCurrencyUomId) {
        this.actualCurrencyUomId = actualCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId1 the acctgTagEnumId1 to set
     */
    private void setAcctgTagEnumId1(String acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId2 the acctgTagEnumId2 to set
     */
    private void setAcctgTagEnumId2(String acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId3 the acctgTagEnumId3 to set
     */
    private void setAcctgTagEnumId3(String acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId4 the acctgTagEnumId4 to set
     */
    private void setAcctgTagEnumId4(String acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId5 the acctgTagEnumId5 to set
     */
    private void setAcctgTagEnumId5(String acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId6 the acctgTagEnumId6 to set
     */
    private void setAcctgTagEnumId6(String acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId7 the acctgTagEnumId7 to set
     */
    private void setAcctgTagEnumId7(String acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId8 the acctgTagEnumId8 to set
     */
    private void setAcctgTagEnumId8(String acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId9 the acctgTagEnumId9 to set
     */
    private void setAcctgTagEnumId9(String acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }
    /**
     * Auto generated value setter.
     * @param acctgTagEnumId10 the acctgTagEnumId10 to set
     */
    private void setAcctgTagEnumId10(String acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCashDrawerId() {
        return this.cashDrawerId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCashDrawerItemSeqId() {
        return this.cashDrawerItemSeqId;
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
    public String getDescription() {
        return this.description;
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
    public String getPaymentTypeId() {
        return this.paymentTypeId;
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
    public String getPaymentGatewayResponseId() {
        return this.paymentGatewayResponseId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentPreferenceId() {
        return this.paymentPreferenceId;
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
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getEffectiveDate() {
        return this.effectiveDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentRefNum() {
        return this.paymentRefNum;
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
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountTransId() {
        return this.finAccountTransId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getActualCurrencyAmount() {
        return this.actualCurrencyAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getActualCurrencyUomId() {
        return this.actualCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId1() {
        return this.acctgTagEnumId1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId2() {
        return this.acctgTagEnumId2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId3() {
        return this.acctgTagEnumId3;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId4() {
        return this.acctgTagEnumId4;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId5() {
        return this.acctgTagEnumId5;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId6() {
        return this.acctgTagEnumId6;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId7() {
        return this.acctgTagEnumId7;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId8() {
        return this.acctgTagEnumId8;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId9() {
        return this.acctgTagEnumId9;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTagEnumId10() {
        return this.acctgTagEnumId10;
    }

    /**
     * Auto generated method that gets the related <code>PaymentType</code> by the relation named <code>PaymentType</code>.
     * @return the <code>PaymentType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentType getPaymentType() throws RepositoryException {
        if (this.paymentType == null) {
            this.paymentType = getRelatedOne(PaymentType.class, "PaymentType");
        }
        return this.paymentType;
    }

    /**
     * Auto generated value setter.
     * @param paymentType the paymentType to set
    */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCashDrawerId((String) mapValue.get("cashDrawerId"));
        setCashDrawerItemSeqId((String) mapValue.get("cashDrawerItemSeqId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setDescription((String) mapValue.get("description"));
        setPaymentId((String) mapValue.get("paymentId"));
        setPaymentTypeId((String) mapValue.get("paymentTypeId"));
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setPaymentGatewayResponseId((String) mapValue.get("paymentGatewayResponseId"));
        setPaymentPreferenceId((String) mapValue.get("paymentPreferenceId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setStatusId((String) mapValue.get("statusId"));
        setEffectiveDate((Timestamp) mapValue.get("effectiveDate"));
        setPaymentRefNum((String) mapValue.get("paymentRefNum"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setComments((String) mapValue.get("comments"));
        setFinAccountTransId((String) mapValue.get("finAccountTransId"));
        setOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        setActualCurrencyAmount(convertToBigDecimal(mapValue.get("actualCurrencyAmount")));
        setActualCurrencyUomId((String) mapValue.get("actualCurrencyUomId"));
        setAcctgTagEnumId1((String) mapValue.get("acctgTagEnumId1"));
        setAcctgTagEnumId2((String) mapValue.get("acctgTagEnumId2"));
        setAcctgTagEnumId3((String) mapValue.get("acctgTagEnumId3"));
        setAcctgTagEnumId4((String) mapValue.get("acctgTagEnumId4"));
        setAcctgTagEnumId5((String) mapValue.get("acctgTagEnumId5"));
        setAcctgTagEnumId6((String) mapValue.get("acctgTagEnumId6"));
        setAcctgTagEnumId7((String) mapValue.get("acctgTagEnumId7"));
        setAcctgTagEnumId8((String) mapValue.get("acctgTagEnumId8"));
        setAcctgTagEnumId9((String) mapValue.get("acctgTagEnumId9"));
        setAcctgTagEnumId10((String) mapValue.get("acctgTagEnumId10"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("cashDrawerId", getCashDrawerId());
        mapValue.put("cashDrawerItemSeqId", getCashDrawerItemSeqId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("paymentTypeId", getPaymentTypeId());
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("paymentGatewayResponseId", getPaymentGatewayResponseId());
        mapValue.put("paymentPreferenceId", getPaymentPreferenceId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("statusId", getStatusId());
        mapValue.put("effectiveDate", getEffectiveDate());
        mapValue.put("paymentRefNum", getPaymentRefNum());
        mapValue.put("amount", getAmount());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("comments", getComments());
        mapValue.put("finAccountTransId", getFinAccountTransId());
        mapValue.put("overrideGlAccountId", getOverrideGlAccountId());
        mapValue.put("actualCurrencyAmount", getActualCurrencyAmount());
        mapValue.put("actualCurrencyUomId", getActualCurrencyUomId());
        mapValue.put("acctgTagEnumId1", getAcctgTagEnumId1());
        mapValue.put("acctgTagEnumId2", getAcctgTagEnumId2());
        mapValue.put("acctgTagEnumId3", getAcctgTagEnumId3());
        mapValue.put("acctgTagEnumId4", getAcctgTagEnumId4());
        mapValue.put("acctgTagEnumId5", getAcctgTagEnumId5());
        mapValue.put("acctgTagEnumId6", getAcctgTagEnumId6());
        mapValue.put("acctgTagEnumId7", getAcctgTagEnumId7());
        mapValue.put("acctgTagEnumId8", getAcctgTagEnumId8());
        mapValue.put("acctgTagEnumId9", getAcctgTagEnumId9());
        mapValue.put("acctgTagEnumId10", getAcctgTagEnumId10());
        return mapValue;
    }


}
