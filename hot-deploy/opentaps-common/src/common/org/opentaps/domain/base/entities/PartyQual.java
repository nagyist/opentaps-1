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
 * Auto generated base entity PartyQual.
 */
@javax.persistence.Entity
@Table(name="PARTY_QUAL")
public class PartyQual extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyQualId", "PARTY_QUAL_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("partyQualTypeId", "PARTY_QUAL_TYPE_ID");
        fields.put("institutionPartyId", "INSTITUTION_PARTY_ID");
        fields.put("title", "TITLE");
        fields.put("statusId", "STATUS_ID");
        fields.put("institutionInternalId", "INSTITUTION_INTERNAL_ID");
        fields.put("infoString", "INFO_STRING");
        fields.put("verifStatusId", "VERIF_STATUS_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyQual", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyQual> {
    partyQualId("partyQualId"),
    partyId("partyId"),
    partyQualTypeId("partyQualTypeId"),
    institutionPartyId("institutionPartyId"),
    title("title"),
    statusId("statusId"),
    institutionInternalId("institutionInternalId"),
    infoString("infoString"),
    verifStatusId("verifStatusId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="PartyQual_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyQual_GEN")
   @Id
   @Column(name="PARTY_QUAL_ID")
   private String partyQualId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="PARTY_QUAL_TYPE_ID")
   private String partyQualTypeId;
   @Column(name="INSTITUTION_PARTY_ID")
   private String institutionPartyId;
   @Column(name="TITLE")
   private String title;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="INSTITUTION_INTERNAL_ID")
   private String institutionInternalId;
   @Column(name="INFO_STRING")
   private String infoString;
   @Column(name="VERIF_STATUS_ID")
   private String verifStatusId;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_QUAL_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PartyQualType partyQualType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INSTITUTION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party institutionParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VERIF_STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem verificationStatusItem = null;

  /**
   * Default constructor.
   */
  public PartyQual() {
      super();
      this.baseEntityName = "PartyQual";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyQualId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyQualId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyQualTypeId");this.allFieldsNames.add("institutionPartyId");this.allFieldsNames.add("title");this.allFieldsNames.add("statusId");this.allFieldsNames.add("institutionInternalId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("verifStatusId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyQual(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyQualId the partyQualId to set
     */
    public void setPartyQualId(String partyQualId) {
        this.partyQualId = partyQualId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyQualTypeId the partyQualTypeId to set
     */
    public void setPartyQualTypeId(String partyQualTypeId) {
        this.partyQualTypeId = partyQualTypeId;
    }
    /**
     * Auto generated value setter.
     * @param institutionPartyId the institutionPartyId to set
     */
    public void setInstitutionPartyId(String institutionPartyId) {
        this.institutionPartyId = institutionPartyId;
    }
    /**
     * Auto generated value setter.
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param institutionInternalId the institutionInternalId to set
     */
    public void setInstitutionInternalId(String institutionInternalId) {
        this.institutionInternalId = institutionInternalId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
    /**
     * Auto generated value setter.
     * @param verifStatusId the verifStatusId to set
     */
    public void setVerifStatusId(String verifStatusId) {
        this.verifStatusId = verifStatusId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
    public String getPartyQualId() {
        return this.partyQualId;
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
    public String getPartyQualTypeId() {
        return this.partyQualTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInstitutionPartyId() {
        return this.institutionPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTitle() {
        return this.title;
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
    public String getInstitutionInternalId() {
        return this.institutionInternalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVerifStatusId() {
        return this.verifStatusId;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>PartyQualType</code> by the relation named <code>PartyQualType</code>.
     * @return the <code>PartyQualType</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyQualType getPartyQualType() throws RepositoryException {
        if (this.partyQualType == null) {
            this.partyQualType = getRelatedOne(PartyQualType.class, "PartyQualType");
        }
        return this.partyQualType;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>InstitutionParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getInstitutionParty() throws RepositoryException {
        if (this.institutionParty == null) {
            this.institutionParty = getRelatedOne(Party.class, "InstitutionParty");
        }
        return this.institutionParty;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>VerificationStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getVerificationStatusItem() throws RepositoryException {
        if (this.verificationStatusItem == null) {
            this.verificationStatusItem = getRelatedOne(StatusItem.class, "VerificationStatusItem");
        }
        return this.verificationStatusItem;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param partyQualType the partyQualType to set
    */
    public void setPartyQualType(PartyQualType partyQualType) {
        this.partyQualType = partyQualType;
    }
    /**
     * Auto generated value setter.
     * @param institutionParty the institutionParty to set
    */
    public void setInstitutionParty(Party institutionParty) {
        this.institutionParty = institutionParty;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param verificationStatusItem the verificationStatusItem to set
    */
    public void setVerificationStatusItem(StatusItem verificationStatusItem) {
        this.verificationStatusItem = verificationStatusItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyQualId((String) mapValue.get("partyQualId"));
        setPartyId((String) mapValue.get("partyId"));
        setPartyQualTypeId((String) mapValue.get("partyQualTypeId"));
        setInstitutionPartyId((String) mapValue.get("institutionPartyId"));
        setTitle((String) mapValue.get("title"));
        setStatusId((String) mapValue.get("statusId"));
        setInstitutionInternalId((String) mapValue.get("institutionInternalId"));
        setInfoString((String) mapValue.get("infoString"));
        setVerifStatusId((String) mapValue.get("verifStatusId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("partyQualId", getPartyQualId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyQualTypeId", getPartyQualTypeId());
        mapValue.put("institutionPartyId", getInstitutionPartyId());
        mapValue.put("title", getTitle());
        mapValue.put("statusId", getStatusId());
        mapValue.put("institutionInternalId", getInstitutionInternalId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("verifStatusId", getVerifStatusId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
