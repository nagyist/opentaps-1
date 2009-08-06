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
 * Auto generated base entity SalesOpportunityHistory.
 */
@javax.persistence.Entity
@Table(name="SALES_OPPORTUNITY_HISTORY")
public class SalesOpportunityHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesOpportunityHistoryId", "SALES_OPPORTUNITY_HISTORY_ID");
        fields.put("salesOpportunityId", "SALES_OPPORTUNITY_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("nextStep", "NEXT_STEP");
        fields.put("estimatedAmount", "ESTIMATED_AMOUNT");
        fields.put("estimatedProbability", "ESTIMATED_PROBABILITY");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("estimatedCloseDate", "ESTIMATED_CLOSE_DATE");
        fields.put("opportunityStageId", "OPPORTUNITY_STAGE_ID");
        fields.put("changeNote", "CHANGE_NOTE");
        fields.put("modifiedByUserLogin", "MODIFIED_BY_USER_LOGIN");
        fields.put("modifiedTimestamp", "MODIFIED_TIMESTAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SalesOpportunityHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesOpportunityHistory> {
    salesOpportunityHistoryId("salesOpportunityHistoryId"),
    salesOpportunityId("salesOpportunityId"),
    description("description"),
    nextStep("nextStep"),
    estimatedAmount("estimatedAmount"),
    estimatedProbability("estimatedProbability"),
    currencyUomId("currencyUomId"),
    estimatedCloseDate("estimatedCloseDate"),
    opportunityStageId("opportunityStageId"),
    changeNote("changeNote"),
    modifiedByUserLogin("modifiedByUserLogin"),
    modifiedTimestamp("modifiedTimestamp"),
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

   @org.hibernate.annotations.GenericGenerator(name="SalesOpportunityHistory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SalesOpportunityHistory_GEN")
   @Id
   @Column(name="SALES_OPPORTUNITY_HISTORY_ID")
   private String salesOpportunityHistoryId;
   @Column(name="SALES_OPPORTUNITY_ID")
   private String salesOpportunityId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="NEXT_STEP")
   private String nextStep;
   @Column(name="ESTIMATED_AMOUNT")
   private BigDecimal estimatedAmount;
   @Column(name="ESTIMATED_PROBABILITY")
   private BigDecimal estimatedProbability;
   @Column(name="CURRENCY_UOM_ID")
   private String currencyUomId;
   @Column(name="ESTIMATED_CLOSE_DATE")
   private Timestamp estimatedCloseDate;
   @Column(name="OPPORTUNITY_STAGE_ID")
   private String opportunityStageId;
   @Column(name="CHANGE_NOTE")
   private String changeNote;
   @Column(name="MODIFIED_BY_USER_LOGIN")
   private String modifiedByUserLogin;
   @Column(name="MODIFIED_TIMESTAMP")
   private Timestamp modifiedTimestamp;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OPPORTUNITY_STAGE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SalesOpportunityStage salesOpportunityStage = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SALES_OPPORTUNITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SalesOpportunity salesOpportunity = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="MODIFIED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;

  /**
   * Default constructor.
   */
  public SalesOpportunityHistory() {
      super();
      this.baseEntityName = "SalesOpportunityHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesOpportunityHistoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesOpportunityHistoryId");this.allFieldsNames.add("salesOpportunityId");this.allFieldsNames.add("description");this.allFieldsNames.add("nextStep");this.allFieldsNames.add("estimatedAmount");this.allFieldsNames.add("estimatedProbability");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("estimatedCloseDate");this.allFieldsNames.add("opportunityStageId");this.allFieldsNames.add("changeNote");this.allFieldsNames.add("modifiedByUserLogin");this.allFieldsNames.add("modifiedTimestamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesOpportunityHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salesOpportunityHistoryId the salesOpportunityHistoryId to set
     */
    public void setSalesOpportunityHistoryId(String salesOpportunityHistoryId) {
        this.salesOpportunityHistoryId = salesOpportunityHistoryId;
    }
    /**
     * Auto generated value setter.
     * @param salesOpportunityId the salesOpportunityId to set
     */
    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param nextStep the nextStep to set
     */
    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }
    /**
     * Auto generated value setter.
     * @param estimatedAmount the estimatedAmount to set
     */
    public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }
    /**
     * Auto generated value setter.
     * @param estimatedProbability the estimatedProbability to set
     */
    public void setEstimatedProbability(BigDecimal estimatedProbability) {
        this.estimatedProbability = estimatedProbability;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedCloseDate the estimatedCloseDate to set
     */
    public void setEstimatedCloseDate(Timestamp estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }
    /**
     * Auto generated value setter.
     * @param opportunityStageId the opportunityStageId to set
     */
    public void setOpportunityStageId(String opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }
    /**
     * Auto generated value setter.
     * @param changeNote the changeNote to set
     */
    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }
    /**
     * Auto generated value setter.
     * @param modifiedByUserLogin the modifiedByUserLogin to set
     */
    public void setModifiedByUserLogin(String modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param modifiedTimestamp the modifiedTimestamp to set
     */
    public void setModifiedTimestamp(Timestamp modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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
    public String getSalesOpportunityHistoryId() {
        return this.salesOpportunityHistoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesOpportunityId() {
        return this.salesOpportunityId;
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
    public String getNextStep() {
        return this.nextStep;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedAmount() {
        return this.estimatedAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedProbability() {
        return this.estimatedProbability;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedCloseDate() {
        return this.estimatedCloseDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOpportunityStageId() {
        return this.opportunityStageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getChangeNote() {
        return this.changeNote;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getModifiedByUserLogin() {
        return this.modifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getModifiedTimestamp() {
        return this.modifiedTimestamp;
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
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>SalesOpportunityStage</code> by the relation named <code>SalesOpportunityStage</code>.
     * @return the <code>SalesOpportunityStage</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesOpportunityStage getSalesOpportunityStage() throws RepositoryException {
        if (this.salesOpportunityStage == null) {
            this.salesOpportunityStage = getRelatedOne(SalesOpportunityStage.class, "SalesOpportunityStage");
        }
        return this.salesOpportunityStage;
    }
    /**
     * Auto generated method that gets the related <code>SalesOpportunity</code> by the relation named <code>SalesOpportunity</code>.
     * @return the <code>SalesOpportunity</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesOpportunity getSalesOpportunity() throws RepositoryException {
        if (this.salesOpportunity == null) {
            this.salesOpportunity = getRelatedOne(SalesOpportunity.class, "SalesOpportunity");
        }
        return this.salesOpportunity;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }

    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param salesOpportunityStage the salesOpportunityStage to set
    */
    public void setSalesOpportunityStage(SalesOpportunityStage salesOpportunityStage) {
        this.salesOpportunityStage = salesOpportunityStage;
    }
    /**
     * Auto generated value setter.
     * @param salesOpportunity the salesOpportunity to set
    */
    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }
    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesOpportunityHistoryId((String) mapValue.get("salesOpportunityHistoryId"));
        setSalesOpportunityId((String) mapValue.get("salesOpportunityId"));
        setDescription((String) mapValue.get("description"));
        setNextStep((String) mapValue.get("nextStep"));
        setEstimatedAmount(convertToBigDecimal(mapValue.get("estimatedAmount")));
        setEstimatedProbability(convertToBigDecimal(mapValue.get("estimatedProbability")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setEstimatedCloseDate((Timestamp) mapValue.get("estimatedCloseDate"));
        setOpportunityStageId((String) mapValue.get("opportunityStageId"));
        setChangeNote((String) mapValue.get("changeNote"));
        setModifiedByUserLogin((String) mapValue.get("modifiedByUserLogin"));
        setModifiedTimestamp((Timestamp) mapValue.get("modifiedTimestamp"));
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
        mapValue.put("salesOpportunityHistoryId", getSalesOpportunityHistoryId());
        mapValue.put("salesOpportunityId", getSalesOpportunityId());
        mapValue.put("description", getDescription());
        mapValue.put("nextStep", getNextStep());
        mapValue.put("estimatedAmount", getEstimatedAmount());
        mapValue.put("estimatedProbability", getEstimatedProbability());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("estimatedCloseDate", getEstimatedCloseDate());
        mapValue.put("opportunityStageId", getOpportunityStageId());
        mapValue.put("changeNote", getChangeNote());
        mapValue.put("modifiedByUserLogin", getModifiedByUserLogin());
        mapValue.put("modifiedTimestamp", getModifiedTimestamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
