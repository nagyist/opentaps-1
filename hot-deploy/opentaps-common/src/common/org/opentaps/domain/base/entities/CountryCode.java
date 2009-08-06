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
 * Auto generated base entity CountryCode.
 */
@javax.persistence.Entity
@Table(name="COUNTRY_CODE")
public class CountryCode extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("countryCode", "COUNTRY_CODE");
        fields.put("countryAbbr", "COUNTRY_ABBR");
        fields.put("countryNumber", "COUNTRY_NUMBER");
        fields.put("countryName", "COUNTRY_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CountryCode", fields);
}
  public static enum Fields implements EntityFieldInterface<CountryCode> {
    countryCode("countryCode"),
    countryAbbr("countryAbbr"),
    countryNumber("countryNumber"),
    countryName("countryName"),
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

   @org.hibernate.annotations.GenericGenerator(name="CountryCode_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CountryCode_GEN")
   @Id
   @Column(name="COUNTRY_CODE")
   private String countryCode;
   @Column(name="COUNTRY_ABBR")
   private String countryAbbr;
   @Column(name="COUNTRY_NUMBER")
   private String countryNumber;
   @Column(name="COUNTRY_NAME")
   private String countryName;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COUNTRY_CODE", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CountryCapital countryCapital = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COUNTRY_CODE", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CountryTeleCode countryTeleCode = null;

  /**
   * Default constructor.
   */
  public CountryCode() {
      super();
      this.baseEntityName = "CountryCode";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("countryCode");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("countryCode");this.allFieldsNames.add("countryAbbr");this.allFieldsNames.add("countryNumber");this.allFieldsNames.add("countryName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CountryCode(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Auto generated value setter.
     * @param countryAbbr the countryAbbr to set
     */
    public void setCountryAbbr(String countryAbbr) {
        this.countryAbbr = countryAbbr;
    }
    /**
     * Auto generated value setter.
     * @param countryNumber the countryNumber to set
     */
    public void setCountryNumber(String countryNumber) {
        this.countryNumber = countryNumber;
    }
    /**
     * Auto generated value setter.
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryAbbr() {
        return this.countryAbbr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryNumber() {
        return this.countryNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryName() {
        return this.countryName;
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
     * Auto generated method that gets the related <code>CountryCapital</code> by the relation named <code>CountryCapital</code>.
     * @return the <code>CountryCapital</code>
     * @throws RepositoryException if an error occurs
     */
    public CountryCapital getCountryCapital() throws RepositoryException {
        if (this.countryCapital == null) {
            this.countryCapital = getRelatedOne(CountryCapital.class, "CountryCapital");
        }
        return this.countryCapital;
    }
    /**
     * Auto generated method that gets the related <code>CountryTeleCode</code> by the relation named <code>CountryTeleCode</code>.
     * @return the <code>CountryTeleCode</code>
     * @throws RepositoryException if an error occurs
     */
    public CountryTeleCode getCountryTeleCode() throws RepositoryException {
        if (this.countryTeleCode == null) {
            this.countryTeleCode = getRelatedOne(CountryTeleCode.class, "CountryTeleCode");
        }
        return this.countryTeleCode;
    }

    /**
     * Auto generated value setter.
     * @param countryCapital the countryCapital to set
    */
    public void setCountryCapital(CountryCapital countryCapital) {
        this.countryCapital = countryCapital;
    }
    /**
     * Auto generated value setter.
     * @param countryTeleCode the countryTeleCode to set
    */
    public void setCountryTeleCode(CountryTeleCode countryTeleCode) {
        this.countryTeleCode = countryTeleCode;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCountryCode((String) mapValue.get("countryCode"));
        setCountryAbbr((String) mapValue.get("countryAbbr"));
        setCountryNumber((String) mapValue.get("countryNumber"));
        setCountryName((String) mapValue.get("countryName"));
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
        mapValue.put("countryCode", getCountryCode());
        mapValue.put("countryAbbr", getCountryAbbr());
        mapValue.put("countryNumber", getCountryNumber());
        mapValue.put("countryName", getCountryName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
