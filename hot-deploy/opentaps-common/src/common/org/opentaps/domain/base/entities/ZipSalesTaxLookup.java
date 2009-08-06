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
 * Auto generated base entity ZipSalesTaxLookup.
 */
@javax.persistence.Entity
@Table(name="ZIP_SALES_TAX_LOOKUP")
public class ZipSalesTaxLookup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("zipCode", "ZIP_CODE");
        fields.put("stateCode", "STATE_CODE");
        fields.put("city", "CITY");
        fields.put("county", "COUNTY");
        fields.put("fromDate", "FROM_DATE");
        fields.put("countyFips", "COUNTY_FIPS");
        fields.put("countyDefault", "COUNTY_DEFAULT");
        fields.put("generalDefault", "GENERAL_DEFAULT");
        fields.put("insideCity", "INSIDE_CITY");
        fields.put("geoCode", "GEO_CODE");
        fields.put("stateSalesTax", "STATE_SALES_TAX");
        fields.put("citySalesTax", "CITY_SALES_TAX");
        fields.put("cityLocalSalesTax", "CITY_LOCAL_SALES_TAX");
        fields.put("countySalesTax", "COUNTY_SALES_TAX");
        fields.put("countyLocalSalesTax", "COUNTY_LOCAL_SALES_TAX");
        fields.put("comboSalesTax", "COMBO_SALES_TAX");
        fields.put("stateUseTax", "STATE_USE_TAX");
        fields.put("cityUseTax", "CITY_USE_TAX");
        fields.put("cityLocalUseTax", "CITY_LOCAL_USE_TAX");
        fields.put("countyUseTax", "COUNTY_USE_TAX");
        fields.put("countyLocalUseTax", "COUNTY_LOCAL_USE_TAX");
        fields.put("comboUseTax", "COMBO_USE_TAX");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ZipSalesTaxLookup", fields);
}
  public static enum Fields implements EntityFieldInterface<ZipSalesTaxLookup> {
    zipCode("zipCode"),
    stateCode("stateCode"),
    city("city"),
    county("county"),
    fromDate("fromDate"),
    countyFips("countyFips"),
    countyDefault("countyDefault"),
    generalDefault("generalDefault"),
    insideCity("insideCity"),
    geoCode("geoCode"),
    stateSalesTax("stateSalesTax"),
    citySalesTax("citySalesTax"),
    cityLocalSalesTax("cityLocalSalesTax"),
    countySalesTax("countySalesTax"),
    countyLocalSalesTax("countyLocalSalesTax"),
    comboSalesTax("comboSalesTax"),
    stateUseTax("stateUseTax"),
    cityUseTax("cityUseTax"),
    cityLocalUseTax("cityLocalUseTax"),
    countyUseTax("countyUseTax"),
    countyLocalUseTax("countyLocalUseTax"),
    comboUseTax("comboUseTax"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ZipSalesTaxLookupPkBridge.class)
     private ZipSalesTaxLookupPk id = new ZipSalesTaxLookupPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ZipSalesTaxLookupPk</code>
     */
      public ZipSalesTaxLookupPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ZipSalesTaxLookupPk</code> value to set
    */   
      public void setId(ZipSalesTaxLookupPk id) {
         this.id = id;
      }
   @Column(name="COUNTY_FIPS")
   private String countyFips;
   @Column(name="COUNTY_DEFAULT")
   private String countyDefault;
   @Column(name="GENERAL_DEFAULT")
   private String generalDefault;
   @Column(name="INSIDE_CITY")
   private String insideCity;
   @Column(name="GEO_CODE")
   private String geoCode;
   @Column(name="STATE_SALES_TAX")
   private BigDecimal stateSalesTax;
   @Column(name="CITY_SALES_TAX")
   private BigDecimal citySalesTax;
   @Column(name="CITY_LOCAL_SALES_TAX")
   private BigDecimal cityLocalSalesTax;
   @Column(name="COUNTY_SALES_TAX")
   private BigDecimal countySalesTax;
   @Column(name="COUNTY_LOCAL_SALES_TAX")
   private BigDecimal countyLocalSalesTax;
   @Column(name="COMBO_SALES_TAX")
   private BigDecimal comboSalesTax;
   @Column(name="STATE_USE_TAX")
   private BigDecimal stateUseTax;
   @Column(name="CITY_USE_TAX")
   private BigDecimal cityUseTax;
   @Column(name="CITY_LOCAL_USE_TAX")
   private BigDecimal cityLocalUseTax;
   @Column(name="COUNTY_USE_TAX")
   private BigDecimal countyUseTax;
   @Column(name="COUNTY_LOCAL_USE_TAX")
   private BigDecimal countyLocalUseTax;
   @Column(name="COMBO_USE_TAX")
   private BigDecimal comboUseTax;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public ZipSalesTaxLookup() {
      super();
      this.baseEntityName = "ZipSalesTaxLookup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("zipCode");this.primaryKeyNames.add("stateCode");this.primaryKeyNames.add("city");this.primaryKeyNames.add("county");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("zipCode");this.allFieldsNames.add("stateCode");this.allFieldsNames.add("city");this.allFieldsNames.add("county");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("countyFips");this.allFieldsNames.add("countyDefault");this.allFieldsNames.add("generalDefault");this.allFieldsNames.add("insideCity");this.allFieldsNames.add("geoCode");this.allFieldsNames.add("stateSalesTax");this.allFieldsNames.add("citySalesTax");this.allFieldsNames.add("cityLocalSalesTax");this.allFieldsNames.add("countySalesTax");this.allFieldsNames.add("countyLocalSalesTax");this.allFieldsNames.add("comboSalesTax");this.allFieldsNames.add("stateUseTax");this.allFieldsNames.add("cityUseTax");this.allFieldsNames.add("cityLocalUseTax");this.allFieldsNames.add("countyUseTax");this.allFieldsNames.add("countyLocalUseTax");this.allFieldsNames.add("comboUseTax");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ZipSalesTaxLookup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        id.setZipCode(zipCode);
    }
    /**
     * Auto generated value setter.
     * @param stateCode the stateCode to set
     */
    public void setStateCode(String stateCode) {
        id.setStateCode(stateCode);
    }
    /**
     * Auto generated value setter.
     * @param city the city to set
     */
    public void setCity(String city) {
        id.setCity(city);
    }
    /**
     * Auto generated value setter.
     * @param county the county to set
     */
    public void setCounty(String county) {
        id.setCounty(county);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param countyFips the countyFips to set
     */
    public void setCountyFips(String countyFips) {
        this.countyFips = countyFips;
    }
    /**
     * Auto generated value setter.
     * @param countyDefault the countyDefault to set
     */
    public void setCountyDefault(String countyDefault) {
        this.countyDefault = countyDefault;
    }
    /**
     * Auto generated value setter.
     * @param generalDefault the generalDefault to set
     */
    public void setGeneralDefault(String generalDefault) {
        this.generalDefault = generalDefault;
    }
    /**
     * Auto generated value setter.
     * @param insideCity the insideCity to set
     */
    public void setInsideCity(String insideCity) {
        this.insideCity = insideCity;
    }
    /**
     * Auto generated value setter.
     * @param geoCode the geoCode to set
     */
    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }
    /**
     * Auto generated value setter.
     * @param stateSalesTax the stateSalesTax to set
     */
    public void setStateSalesTax(BigDecimal stateSalesTax) {
        this.stateSalesTax = stateSalesTax;
    }
    /**
     * Auto generated value setter.
     * @param citySalesTax the citySalesTax to set
     */
    public void setCitySalesTax(BigDecimal citySalesTax) {
        this.citySalesTax = citySalesTax;
    }
    /**
     * Auto generated value setter.
     * @param cityLocalSalesTax the cityLocalSalesTax to set
     */
    public void setCityLocalSalesTax(BigDecimal cityLocalSalesTax) {
        this.cityLocalSalesTax = cityLocalSalesTax;
    }
    /**
     * Auto generated value setter.
     * @param countySalesTax the countySalesTax to set
     */
    public void setCountySalesTax(BigDecimal countySalesTax) {
        this.countySalesTax = countySalesTax;
    }
    /**
     * Auto generated value setter.
     * @param countyLocalSalesTax the countyLocalSalesTax to set
     */
    public void setCountyLocalSalesTax(BigDecimal countyLocalSalesTax) {
        this.countyLocalSalesTax = countyLocalSalesTax;
    }
    /**
     * Auto generated value setter.
     * @param comboSalesTax the comboSalesTax to set
     */
    public void setComboSalesTax(BigDecimal comboSalesTax) {
        this.comboSalesTax = comboSalesTax;
    }
    /**
     * Auto generated value setter.
     * @param stateUseTax the stateUseTax to set
     */
    public void setStateUseTax(BigDecimal stateUseTax) {
        this.stateUseTax = stateUseTax;
    }
    /**
     * Auto generated value setter.
     * @param cityUseTax the cityUseTax to set
     */
    public void setCityUseTax(BigDecimal cityUseTax) {
        this.cityUseTax = cityUseTax;
    }
    /**
     * Auto generated value setter.
     * @param cityLocalUseTax the cityLocalUseTax to set
     */
    public void setCityLocalUseTax(BigDecimal cityLocalUseTax) {
        this.cityLocalUseTax = cityLocalUseTax;
    }
    /**
     * Auto generated value setter.
     * @param countyUseTax the countyUseTax to set
     */
    public void setCountyUseTax(BigDecimal countyUseTax) {
        this.countyUseTax = countyUseTax;
    }
    /**
     * Auto generated value setter.
     * @param countyLocalUseTax the countyLocalUseTax to set
     */
    public void setCountyLocalUseTax(BigDecimal countyLocalUseTax) {
        this.countyLocalUseTax = countyLocalUseTax;
    }
    /**
     * Auto generated value setter.
     * @param comboUseTax the comboUseTax to set
     */
    public void setComboUseTax(BigDecimal comboUseTax) {
        this.comboUseTax = comboUseTax;
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
    public String getZipCode() {
        return this.id.getZipCode();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStateCode() {
        return this.id.getStateCode();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCity() {
        return this.id.getCity();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCounty() {
        return this.id.getCounty();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountyFips() {
        return this.countyFips;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountyDefault() {
        return this.countyDefault;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeneralDefault() {
        return this.generalDefault;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInsideCity() {
        return this.insideCity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoCode() {
        return this.geoCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getStateSalesTax() {
        return this.stateSalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCitySalesTax() {
        return this.citySalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCityLocalSalesTax() {
        return this.cityLocalSalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCountySalesTax() {
        return this.countySalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCountyLocalSalesTax() {
        return this.countyLocalSalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getComboSalesTax() {
        return this.comboSalesTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getStateUseTax() {
        return this.stateUseTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCityUseTax() {
        return this.cityUseTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCityLocalUseTax() {
        return this.cityLocalUseTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCountyUseTax() {
        return this.countyUseTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCountyLocalUseTax() {
        return this.countyLocalUseTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getComboUseTax() {
        return this.comboUseTax;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setZipCode((String) mapValue.get("zipCode"));
        setStateCode((String) mapValue.get("stateCode"));
        setCity((String) mapValue.get("city"));
        setCounty((String) mapValue.get("county"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setCountyFips((String) mapValue.get("countyFips"));
        setCountyDefault((String) mapValue.get("countyDefault"));
        setGeneralDefault((String) mapValue.get("generalDefault"));
        setInsideCity((String) mapValue.get("insideCity"));
        setGeoCode((String) mapValue.get("geoCode"));
        setStateSalesTax(convertToBigDecimal(mapValue.get("stateSalesTax")));
        setCitySalesTax(convertToBigDecimal(mapValue.get("citySalesTax")));
        setCityLocalSalesTax(convertToBigDecimal(mapValue.get("cityLocalSalesTax")));
        setCountySalesTax(convertToBigDecimal(mapValue.get("countySalesTax")));
        setCountyLocalSalesTax(convertToBigDecimal(mapValue.get("countyLocalSalesTax")));
        setComboSalesTax(convertToBigDecimal(mapValue.get("comboSalesTax")));
        setStateUseTax(convertToBigDecimal(mapValue.get("stateUseTax")));
        setCityUseTax(convertToBigDecimal(mapValue.get("cityUseTax")));
        setCityLocalUseTax(convertToBigDecimal(mapValue.get("cityLocalUseTax")));
        setCountyUseTax(convertToBigDecimal(mapValue.get("countyUseTax")));
        setCountyLocalUseTax(convertToBigDecimal(mapValue.get("countyLocalUseTax")));
        setComboUseTax(convertToBigDecimal(mapValue.get("comboUseTax")));
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
        mapValue.put("zipCode", getZipCode());
        mapValue.put("stateCode", getStateCode());
        mapValue.put("city", getCity());
        mapValue.put("county", getCounty());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("countyFips", getCountyFips());
        mapValue.put("countyDefault", getCountyDefault());
        mapValue.put("generalDefault", getGeneralDefault());
        mapValue.put("insideCity", getInsideCity());
        mapValue.put("geoCode", getGeoCode());
        mapValue.put("stateSalesTax", getStateSalesTax());
        mapValue.put("citySalesTax", getCitySalesTax());
        mapValue.put("cityLocalSalesTax", getCityLocalSalesTax());
        mapValue.put("countySalesTax", getCountySalesTax());
        mapValue.put("countyLocalSalesTax", getCountyLocalSalesTax());
        mapValue.put("comboSalesTax", getComboSalesTax());
        mapValue.put("stateUseTax", getStateUseTax());
        mapValue.put("cityUseTax", getCityUseTax());
        mapValue.put("cityLocalUseTax", getCityLocalUseTax());
        mapValue.put("countyUseTax", getCountyUseTax());
        mapValue.put("countyLocalUseTax", getCountyLocalUseTax());
        mapValue.put("comboUseTax", getComboUseTax());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
