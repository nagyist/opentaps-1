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
 * Auto generated base entity ViewPreference.
 */
@javax.persistence.Entity
@Table(name="VIEW_PREFERENCE")
public class ViewPreference extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("viewPrefTypeId", "VIEW_PREF_TYPE_ID");
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("viewPrefValueTypeId", "VIEW_PREF_VALUE_TYPE_ID");
        fields.put("viewPrefEnumId", "VIEW_PREF_ENUM_ID");
        fields.put("viewPrefString", "VIEW_PREF_STRING");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ViewPreference", fields);
}
  public static enum Fields implements EntityFieldInterface<ViewPreference> {
    viewPrefTypeId("viewPrefTypeId"),
    userLoginId("userLoginId"),
    viewPrefValueTypeId("viewPrefValueTypeId"),
    viewPrefEnumId("viewPrefEnumId"),
    viewPrefString("viewPrefString"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ViewPreferencePkBridge.class)
     private ViewPreferencePk id = new ViewPreferencePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ViewPreferencePk</code>
     */
      public ViewPreferencePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ViewPreferencePk</code> value to set
    */   
      public void setId(ViewPreferencePk id) {
         this.id = id;
      }
   @Column(name="VIEW_PREF_VALUE_TYPE_ID")
   private String viewPrefValueTypeId;
   @Column(name="VIEW_PREF_ENUM_ID")
   private String viewPrefEnumId;
   @Column(name="VIEW_PREF_STRING")
   private String viewPrefString;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VIEW_PREF_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ViewPrefType viewPrefType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VIEW_PREF_VALUE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ViewPrefValueType viewPrefValueType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VIEW_PREF_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;

  /**
   * Default constructor.
   */
  public ViewPreference() {
      super();
      this.baseEntityName = "ViewPreference";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("viewPrefTypeId");this.primaryKeyNames.add("userLoginId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("viewPrefTypeId");this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("viewPrefValueTypeId");this.allFieldsNames.add("viewPrefEnumId");this.allFieldsNames.add("viewPrefString");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ViewPreference(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param viewPrefTypeId the viewPrefTypeId to set
     */
    public void setViewPrefTypeId(String viewPrefTypeId) {
        id.setViewPrefTypeId(viewPrefTypeId);
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        id.setUserLoginId(userLoginId);
    }
    /**
     * Auto generated value setter.
     * @param viewPrefValueTypeId the viewPrefValueTypeId to set
     */
    public void setViewPrefValueTypeId(String viewPrefValueTypeId) {
        this.viewPrefValueTypeId = viewPrefValueTypeId;
    }
    /**
     * Auto generated value setter.
     * @param viewPrefEnumId the viewPrefEnumId to set
     */
    public void setViewPrefEnumId(String viewPrefEnumId) {
        this.viewPrefEnumId = viewPrefEnumId;
    }
    /**
     * Auto generated value setter.
     * @param viewPrefString the viewPrefString to set
     */
    public void setViewPrefString(String viewPrefString) {
        this.viewPrefString = viewPrefString;
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
    public String getViewPrefTypeId() {
        return this.id.getViewPrefTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.id.getUserLoginId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getViewPrefValueTypeId() {
        return this.viewPrefValueTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getViewPrefEnumId() {
        return this.viewPrefEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getViewPrefString() {
        return this.viewPrefString;
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
     * Auto generated method that gets the related <code>ViewPrefType</code> by the relation named <code>ViewPrefType</code>.
     * @return the <code>ViewPrefType</code>
     * @throws RepositoryException if an error occurs
     */
    public ViewPrefType getViewPrefType() throws RepositoryException {
        if (this.viewPrefType == null) {
            this.viewPrefType = getRelatedOne(ViewPrefType.class, "ViewPrefType");
        }
        return this.viewPrefType;
    }
    /**
     * Auto generated method that gets the related <code>ViewPrefValueType</code> by the relation named <code>ViewPrefValueType</code>.
     * @return the <code>ViewPrefValueType</code>
     * @throws RepositoryException if an error occurs
     */
    public ViewPrefValueType getViewPrefValueType() throws RepositoryException {
        if (this.viewPrefValueType == null) {
            this.viewPrefValueType = getRelatedOne(ViewPrefValueType.class, "ViewPrefValueType");
        }
        return this.viewPrefValueType;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }

    /**
     * Auto generated value setter.
     * @param viewPrefType the viewPrefType to set
    */
    public void setViewPrefType(ViewPrefType viewPrefType) {
        this.viewPrefType = viewPrefType;
    }
    /**
     * Auto generated value setter.
     * @param viewPrefValueType the viewPrefValueType to set
    */
    public void setViewPrefValueType(ViewPrefValueType viewPrefValueType) {
        this.viewPrefValueType = viewPrefValueType;
    }
    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setViewPrefTypeId((String) mapValue.get("viewPrefTypeId"));
        setUserLoginId((String) mapValue.get("userLoginId"));
        setViewPrefValueTypeId((String) mapValue.get("viewPrefValueTypeId"));
        setViewPrefEnumId((String) mapValue.get("viewPrefEnumId"));
        setViewPrefString((String) mapValue.get("viewPrefString"));
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
        mapValue.put("viewPrefTypeId", getViewPrefTypeId());
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("viewPrefValueTypeId", getViewPrefValueTypeId());
        mapValue.put("viewPrefEnumId", getViewPrefEnumId());
        mapValue.put("viewPrefString", getViewPrefString());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
