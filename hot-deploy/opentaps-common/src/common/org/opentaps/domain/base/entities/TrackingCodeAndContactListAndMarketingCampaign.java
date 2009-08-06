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
 * Auto generated base entity TrackingCodeAndContactListAndMarketingCampaign.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTrackingCodeAndContactListAndMarketingCampaigns", query="SELECT MKCL.CAMPAIGN_LIST_ID AS \"campaignListId\",MKCL.CONTACT_LIST_ID AS \"contactListId\",MKCL.MARKETING_CAMPAIGN_ID AS \"marketingCampaignId\",MKCL.FROM_DATE AS \"fromDate\",MKCL.THRU_DATE AS \"thruDate\",CC.CONTACT_LIST_NAME AS \"contactListName\",TC.TRACKING_CODE_ID AS \"trackingCodeId\",TC.TRACKING_CODE_TYPE_ID AS \"trackingCodeTypeId\",TC.FROM_DATE AS \"fromDate\",TC.THRU_DATE AS \"thruDate\",CC.PARENT_CONTACT_LIST_ID AS \"parentContactListId\",PCC.CONTACT_LIST_NAME AS \"contactListName\",CC.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\" FROM MARKETING_CAMPAIGN_CONTACT_LIST MKCL INNER JOIN CONTACT_LIST CC ON MKCL.CONTACT_LIST_ID = CC.CONTACT_LIST_ID LEFT JOIN CONTACT_LIST PCC ON CC.PARENT_CONTACT_LIST_ID = PCC.CONTACT_LIST_ID LEFT JOIN TRACKING_CODE TC ON MKCL.CAMPAIGN_LIST_ID = TC.CAMPAIGN_LIST_ID", resultSetMapping="TrackingCodeAndContactListAndMarketingCampaignMapping")
@SqlResultSetMapping(name="TrackingCodeAndContactListAndMarketingCampaignMapping", entities={
@EntityResult(entityClass=TrackingCodeAndContactListAndMarketingCampaign.class, fields = {
@FieldResult(name="campaignListId", column="campaignListId")
,@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="marketingCampaignId", column="marketingCampaignId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="contactListName", column="contactListName")
,@FieldResult(name="trackingCodeId", column="trackingCodeId")
,@FieldResult(name="trackingCodeTypeId", column="trackingCodeTypeId")
,@FieldResult(name="tcFromDate", column="tcFromDate")
,@FieldResult(name="tcThruDate", column="tcThruDate")
,@FieldResult(name="parentContactListId", column="parentContactListId")
,@FieldResult(name="parentContactListName", column="parentContactListName")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TrackingCodeAndContactListAndMarketingCampaign extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("campaignListId", "MKCL.CAMPAIGN_LIST_ID");
        fields.put("contactListId", "MKCL.CONTACT_LIST_ID");
        fields.put("marketingCampaignId", "MKCL.MARKETING_CAMPAIGN_ID");
        fields.put("fromDate", "MKCL.FROM_DATE");
        fields.put("thruDate", "MKCL.THRU_DATE");
        fields.put("contactListName", "CC.CONTACT_LIST_NAME");
        fields.put("trackingCodeId", "TC.TRACKING_CODE_ID");
        fields.put("trackingCodeTypeId", "TC.TRACKING_CODE_TYPE_ID");
        fields.put("tcFromDate", "TC.FROM_DATE");
        fields.put("tcThruDate", "TC.THRU_DATE");
        fields.put("parentContactListId", "CC.PARENT_CONTACT_LIST_ID");
        fields.put("parentContactListName", "PCC.CONTACT_LIST_NAME");
        fields.put("contactMechTypeId", "CC.CONTACT_MECH_TYPE_ID");
fieldMapColumns.put("TrackingCodeAndContactListAndMarketingCampaign", fields);
}
  public static enum Fields implements EntityFieldInterface<TrackingCodeAndContactListAndMarketingCampaign> {
    campaignListId("campaignListId"),
    contactListId("contactListId"),
    marketingCampaignId("marketingCampaignId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    contactListName("contactListName"),
    trackingCodeId("trackingCodeId"),
    trackingCodeTypeId("trackingCodeTypeId"),
    tcFromDate("tcFromDate"),
    tcThruDate("tcThruDate"),
    parentContactListId("parentContactListId"),
    parentContactListName("parentContactListName"),
    contactMechTypeId("contactMechTypeId");
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
   private String campaignListId;
    
   private String contactListId;
    
   private String marketingCampaignId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String contactListName;
    
   private String trackingCodeId;
    
   private String trackingCodeTypeId;
    
   private Timestamp tcFromDate;
    
   private Timestamp tcThruDate;
    
   private String parentContactListId;
    
   private String parentContactListName;
    
   private String contactMechTypeId;

  /**
   * Default constructor.
   */
  public TrackingCodeAndContactListAndMarketingCampaign() {
      super();
      this.baseEntityName = "TrackingCodeAndContactListAndMarketingCampaign";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("campaignListId");this.primaryKeyNames.add("trackingCodeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("campaignListId");this.allFieldsNames.add("contactListId");this.allFieldsNames.add("marketingCampaignId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("contactListName");this.allFieldsNames.add("trackingCodeId");this.allFieldsNames.add("trackingCodeTypeId");this.allFieldsNames.add("tcFromDate");this.allFieldsNames.add("tcThruDate");this.allFieldsNames.add("parentContactListId");this.allFieldsNames.add("parentContactListName");this.allFieldsNames.add("contactMechTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TrackingCodeAndContactListAndMarketingCampaign(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param campaignListId the campaignListId to set
     */
    private void setCampaignListId(String campaignListId) {
        this.campaignListId = campaignListId;
    }
    /**
     * Auto generated value setter.
     * @param contactListId the contactListId to set
     */
    private void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignId the marketingCampaignId to set
     */
    private void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
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
     * @param contactListName the contactListName to set
     */
    private void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    private void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeTypeId the trackingCodeTypeId to set
     */
    private void setTrackingCodeTypeId(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param tcFromDate the tcFromDate to set
     */
    private void setTcFromDate(Timestamp tcFromDate) {
        this.tcFromDate = tcFromDate;
    }
    /**
     * Auto generated value setter.
     * @param tcThruDate the tcThruDate to set
     */
    private void setTcThruDate(Timestamp tcThruDate) {
        this.tcThruDate = tcThruDate;
    }
    /**
     * Auto generated value setter.
     * @param parentContactListId the parentContactListId to set
     */
    private void setParentContactListId(String parentContactListId) {
        this.parentContactListId = parentContactListId;
    }
    /**
     * Auto generated value setter.
     * @param parentContactListName the parentContactListName to set
     */
    private void setParentContactListName(String parentContactListName) {
        this.parentContactListName = parentContactListName;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    private void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCampaignListId() {
        return this.campaignListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactListId() {
        return this.contactListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMarketingCampaignId() {
        return this.marketingCampaignId;
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
    public String getContactListName() {
        return this.contactListName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.trackingCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeTypeId() {
        return this.trackingCodeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTcFromDate() {
        return this.tcFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTcThruDate() {
        return this.tcThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentContactListId() {
        return this.parentContactListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentContactListName() {
        return this.parentContactListName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCampaignListId((String) mapValue.get("campaignListId"));
        setContactListId((String) mapValue.get("contactListId"));
        setMarketingCampaignId((String) mapValue.get("marketingCampaignId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setContactListName((String) mapValue.get("contactListName"));
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        setTrackingCodeTypeId((String) mapValue.get("trackingCodeTypeId"));
        setTcFromDate((Timestamp) mapValue.get("tcFromDate"));
        setTcThruDate((Timestamp) mapValue.get("tcThruDate"));
        setParentContactListId((String) mapValue.get("parentContactListId"));
        setParentContactListName((String) mapValue.get("parentContactListName"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("campaignListId", getCampaignListId());
        mapValue.put("contactListId", getContactListId());
        mapValue.put("marketingCampaignId", getMarketingCampaignId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("contactListName", getContactListName());
        mapValue.put("trackingCodeId", getTrackingCodeId());
        mapValue.put("trackingCodeTypeId", getTrackingCodeTypeId());
        mapValue.put("tcFromDate", getTcFromDate());
        mapValue.put("tcThruDate", getTcThruDate());
        mapValue.put("parentContactListId", getParentContactListId());
        mapValue.put("parentContactListName", getParentContactListName());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        return mapValue;
    }


}
