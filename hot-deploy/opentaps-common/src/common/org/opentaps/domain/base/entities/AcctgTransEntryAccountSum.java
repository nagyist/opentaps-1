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
 * Auto generated base entity AcctgTransEntryAccountSum.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAcctgTransEntryAccountSums", query="SELECT ATR.TRANSACTION_DATE AS \"transactionDate\",ATR.GL_FISCAL_TYPE_ID AS \"glFiscalTypeId\",ATE.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\",ATE.ACCTG_TAG_ENUM_ID1 AS \"acctgTagEnumId1\",ATE.ACCTG_TAG_ENUM_ID2 AS \"acctgTagEnumId2\",ATE.ACCTG_TAG_ENUM_ID3 AS \"acctgTagEnumId3\",ATE.ACCTG_TAG_ENUM_ID4 AS \"acctgTagEnumId4\",ATE.ACCTG_TAG_ENUM_ID5 AS \"acctgTagEnumId5\",ATE.ACCTG_TAG_ENUM_ID6 AS \"acctgTagEnumId6\",ATE.ACCTG_TAG_ENUM_ID7 AS \"acctgTagEnumId7\",ATE.ACCTG_TAG_ENUM_ID8 AS \"acctgTagEnumId8\",ATE.ACCTG_TAG_ENUM_ID9 AS \"acctgTagEnumId9\",ATE.ACCTG_TAG_ENUM_ID10 AS \"acctgTagEnumId10\",ATE.AMOUNT AS \"amount\",ATR.IS_POSTED AS \"isPosted\",GLA.GL_ACCOUNT_ID AS \"glAccountId\",GLA.ACCOUNT_CODE AS \"accountCode\",GLA.ACCOUNT_NAME AS \"accountName\",GLA.GL_ACCOUNT_CLASS_ID AS \"glAccountClassId\" FROM ACCTG_TRANS ATR INNER JOIN ACCTG_TRANS_ENTRY ATE ON ATR.ACCTG_TRANS_ID = ATE.ACCTG_TRANS_ID INNER JOIN GL_ACCOUNT GLA ON ATE.GL_ACCOUNT_ID = GLA.GL_ACCOUNT_ID", resultSetMapping="AcctgTransEntryAccountSumMapping")
@SqlResultSetMapping(name="AcctgTransEntryAccountSumMapping", entities={
@EntityResult(entityClass=AcctgTransEntryAccountSum.class, fields = {
@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="glFiscalTypeId", column="glFiscalTypeId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
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
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="isPosted", column="isPosted")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="accountCode", column="accountCode")
,@FieldResult(name="accountName", column="accountName")
,@FieldResult(name="glAccountClassId", column="glAccountClassId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AcctgTransEntryAccountSum extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("transactionDate", "ATR.TRANSACTION_DATE");
        fields.put("glFiscalTypeId", "ATR.GL_FISCAL_TYPE_ID");
        fields.put("organizationPartyId", "ATE.ORGANIZATION_PARTY_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
        fields.put("acctgTagEnumId1", "ATE.ACCTG_TAG_ENUM_ID1");
        fields.put("acctgTagEnumId2", "ATE.ACCTG_TAG_ENUM_ID2");
        fields.put("acctgTagEnumId3", "ATE.ACCTG_TAG_ENUM_ID3");
        fields.put("acctgTagEnumId4", "ATE.ACCTG_TAG_ENUM_ID4");
        fields.put("acctgTagEnumId5", "ATE.ACCTG_TAG_ENUM_ID5");
        fields.put("acctgTagEnumId6", "ATE.ACCTG_TAG_ENUM_ID6");
        fields.put("acctgTagEnumId7", "ATE.ACCTG_TAG_ENUM_ID7");
        fields.put("acctgTagEnumId8", "ATE.ACCTG_TAG_ENUM_ID8");
        fields.put("acctgTagEnumId9", "ATE.ACCTG_TAG_ENUM_ID9");
        fields.put("acctgTagEnumId10", "ATE.ACCTG_TAG_ENUM_ID10");
        fields.put("amount", "ATE.AMOUNT");
        fields.put("isPosted", "ATR.IS_POSTED");
        fields.put("glAccountId", "GLA.GL_ACCOUNT_ID");
        fields.put("accountCode", "GLA.ACCOUNT_CODE");
        fields.put("accountName", "GLA.ACCOUNT_NAME");
        fields.put("glAccountClassId", "GLA.GL_ACCOUNT_CLASS_ID");
fieldMapColumns.put("AcctgTransEntryAccountSum", fields);
}
  public static enum Fields implements EntityFieldInterface<AcctgTransEntryAccountSum> {
    transactionDate("transactionDate"),
    glFiscalTypeId("glFiscalTypeId"),
    organizationPartyId("organizationPartyId"),
    debitCreditFlag("debitCreditFlag"),
    acctgTagEnumId1("acctgTagEnumId1"),
    acctgTagEnumId2("acctgTagEnumId2"),
    acctgTagEnumId3("acctgTagEnumId3"),
    acctgTagEnumId4("acctgTagEnumId4"),
    acctgTagEnumId5("acctgTagEnumId5"),
    acctgTagEnumId6("acctgTagEnumId6"),
    acctgTagEnumId7("acctgTagEnumId7"),
    acctgTagEnumId8("acctgTagEnumId8"),
    acctgTagEnumId9("acctgTagEnumId9"),
    acctgTagEnumId10("acctgTagEnumId10"),
    amount("amount"),
    isPosted("isPosted"),
    glAccountId("glAccountId"),
    accountCode("accountCode"),
    accountName("accountName"),
    glAccountClassId("glAccountClassId");
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
   private Timestamp transactionDate;
    
   private String glFiscalTypeId;
    
   private String organizationPartyId;
    
   private String debitCreditFlag;
    
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
    
   private BigDecimal amount;
    
   private String isPosted;
    
   private String glAccountId;
    
   private String accountCode;
    
   private String accountName;
    
   private String glAccountClassId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_CLASS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccountClass glAccountClass = null;

  /**
   * Default constructor.
   */
  public AcctgTransEntryAccountSum() {
      super();
      this.baseEntityName = "AcctgTransEntryAccountSum";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("glFiscalTypeId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("debitCreditFlag");this.allFieldsNames.add("acctgTagEnumId1");this.allFieldsNames.add("acctgTagEnumId2");this.allFieldsNames.add("acctgTagEnumId3");this.allFieldsNames.add("acctgTagEnumId4");this.allFieldsNames.add("acctgTagEnumId5");this.allFieldsNames.add("acctgTagEnumId6");this.allFieldsNames.add("acctgTagEnumId7");this.allFieldsNames.add("acctgTagEnumId8");this.allFieldsNames.add("acctgTagEnumId9");this.allFieldsNames.add("acctgTagEnumId10");this.allFieldsNames.add("amount");this.allFieldsNames.add("isPosted");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("accountCode");this.allFieldsNames.add("accountName");this.allFieldsNames.add("glAccountClassId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AcctgTransEntryAccountSum(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    private void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param glFiscalTypeId the glFiscalTypeId to set
     */
    private void setGlFiscalTypeId(String glFiscalTypeId) {
        this.glFiscalTypeId = glFiscalTypeId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    private void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param debitCreditFlag the debitCreditFlag to set
     */
    private void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
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
     * Auto generated value setter.
     * @param amount the amount to set
     */
    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param isPosted the isPosted to set
     */
    private void setIsPosted(String isPosted) {
        this.isPosted = isPosted;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    private void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param accountCode the accountCode to set
     */
    private void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * Auto generated value setter.
     * @param accountName the accountName to set
     */
    private void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    private void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
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
    public String getGlFiscalTypeId() {
        return this.glFiscalTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
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
    public String getIsPosted() {
        return this.isPosted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCode() {
        return this.accountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountClassId() {
        return this.glAccountClassId;
    }

    /**
     * Auto generated method that gets the related <code>GlAccountClass</code> by the relation named <code>GlAccountClass</code>.
     * @return the <code>GlAccountClass</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountClass getGlAccountClass() throws RepositoryException {
        if (this.glAccountClass == null) {
            this.glAccountClass = getRelatedOne(GlAccountClass.class, "GlAccountClass");
        }
        return this.glAccountClass;
    }

    /**
     * Auto generated value setter.
     * @param glAccountClass the glAccountClass to set
    */
    public void setGlAccountClass(GlAccountClass glAccountClass) {
        this.glAccountClass = glAccountClass;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setGlFiscalTypeId((String) mapValue.get("glFiscalTypeId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
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
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setIsPosted((String) mapValue.get("isPosted"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setAccountCode((String) mapValue.get("accountCode"));
        setAccountName((String) mapValue.get("accountName"));
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("glFiscalTypeId", getGlFiscalTypeId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
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
        mapValue.put("amount", getAmount());
        mapValue.put("isPosted", getIsPosted());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("accountCode", getAccountCode());
        mapValue.put("accountName", getAccountName());
        mapValue.put("glAccountClassId", getGlAccountClassId());
        return mapValue;
    }


}
