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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity UserLoginAndPartyDetails.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUserLoginAndPartyDetailss", query="SELECT PTY.PARTY_ID AS \"partyId\",PTY.PARTY_TYPE_ID AS \"partyTypeId\",PTY.CREATED_DATE AS \"createdDate\",PTYGRP.GROUP_NAME AS \"groupName\",ULN.USER_LOGIN_ID AS \"userLoginId\",ULN.CURRENT_PASSWORD AS \"currentPassword\",ULN.PASSWORD_HINT AS \"passwordHint\",ULN.ENABLED AS \"enabled\",ULN.DISABLED_DATE_TIME AS \"disabledDateTime\",ULN.SUCCESSIVE_FAILED_LOGINS AS \"successiveFailedLogins\",PER.LAST_NAME AS \"lastName\",PER.MIDDLE_NAME AS \"middleName\",PER.FIRST_NAME AS \"firstName\" FROM USER_LOGIN ULN LEFT JOIN PARTY PTY ON ULN.PARTY_ID = PTY.PARTY_ID LEFT JOIN PERSON PER ON ULN.PARTY_ID = PER.PARTY_ID LEFT JOIN PARTY_GROUP PTYGRP ON ULN.PARTY_ID = PTYGRP.PARTY_ID", resultSetMapping="UserLoginAndPartyDetailsMapping")
@SqlResultSetMapping(name="UserLoginAndPartyDetailsMapping", entities={
@EntityResult(entityClass=UserLoginAndPartyDetails.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="userLoginId", column="userLoginId")
,@FieldResult(name="currentPassword", column="currentPassword")
,@FieldResult(name="passwordHint", column="passwordHint")
,@FieldResult(name="enabled", column="enabled")
,@FieldResult(name="disabledDateTime", column="disabledDateTime")
,@FieldResult(name="successiveFailedLogins", column="successiveFailedLogins")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="middleName", column="middleName")
,@FieldResult(name="firstName", column="firstName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UserLoginAndPartyDetails extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PTY.PARTY_ID");
        fields.put("partyTypeId", "PTY.PARTY_TYPE_ID");
        fields.put("createdDate", "PTY.CREATED_DATE");
        fields.put("groupName", "PTYGRP.GROUP_NAME");
        fields.put("userLoginId", "ULN.USER_LOGIN_ID");
        fields.put("currentPassword", "ULN.CURRENT_PASSWORD");
        fields.put("passwordHint", "ULN.PASSWORD_HINT");
        fields.put("enabled", "ULN.ENABLED");
        fields.put("disabledDateTime", "ULN.DISABLED_DATE_TIME");
        fields.put("successiveFailedLogins", "ULN.SUCCESSIVE_FAILED_LOGINS");
        fields.put("lastName", "PER.LAST_NAME");
        fields.put("middleName", "PER.MIDDLE_NAME");
        fields.put("firstName", "PER.FIRST_NAME");
fieldMapColumns.put("UserLoginAndPartyDetails", fields);
}
  public static enum Fields implements EntityFieldInterface<UserLoginAndPartyDetails> {
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    createdDate("createdDate"),
    groupName("groupName"),
    userLoginId("userLoginId"),
    currentPassword("currentPassword"),
    passwordHint("passwordHint"),
    enabled("enabled"),
    disabledDateTime("disabledDateTime"),
    successiveFailedLogins("successiveFailedLogins"),
    lastName("lastName"),
    middleName("middleName"),
    firstName("firstName");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String partyId;
    
   private String partyTypeId;
    
   private Timestamp createdDate;
    
   private String groupName;
    @Id
   private String userLoginId;
    
   private String currentPassword;
    
   private String passwordHint;
    
   private String enabled;
    
   private Timestamp disabledDateTime;
    
   private Long successiveFailedLogins;
    
   private String lastName;
    
   private String middleName;
    
   private String firstName;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;

  /**
   * Default constructor.
   */
  public UserLoginAndPartyDetails() {
      super();
      this.baseEntityName = "UserLoginAndPartyDetails";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("userLoginId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("groupName");this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("currentPassword");this.allFieldsNames.add("passwordHint");this.allFieldsNames.add("enabled");this.allFieldsNames.add("disabledDateTime");this.allFieldsNames.add("successiveFailedLogins");this.allFieldsNames.add("lastName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("firstName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UserLoginAndPartyDetails(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    private void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    private void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    private void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    private void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    private void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param currentPassword the currentPassword to set
     */
    private void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
    /**
     * Auto generated value setter.
     * @param passwordHint the passwordHint to set
     */
    private void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
    /**
     * Auto generated value setter.
     * @param enabled the enabled to set
     */
    private void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    /**
     * Auto generated value setter.
     * @param disabledDateTime the disabledDateTime to set
     */
    private void setDisabledDateTime(Timestamp disabledDateTime) {
        this.disabledDateTime = disabledDateTime;
    }
    /**
     * Auto generated value setter.
     * @param successiveFailedLogins the successiveFailedLogins to set
     */
    private void setSuccessiveFailedLogins(Long successiveFailedLogins) {
        this.successiveFailedLogins = successiveFailedLogins;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Auto generated value setter.
     * @param middleName the middleName to set
     */
    private void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * Auto generated value setter.
     * @param firstName the firstName to set
     */
    private void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrentPassword() {
        return this.currentPassword;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPasswordHint() {
        return this.passwordHint;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnabled() {
        return this.enabled;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDisabledDateTime() {
        return this.disabledDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSuccessiveFailedLogins() {
        return this.successiveFailedLogins;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstName() {
        return this.firstName;
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
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
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
        setPartyId((String) mapValue.get("partyId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setGroupName((String) mapValue.get("groupName"));
        setUserLoginId((String) mapValue.get("userLoginId"));
        setCurrentPassword((String) mapValue.get("currentPassword"));
        setPasswordHint((String) mapValue.get("passwordHint"));
        setEnabled((String) mapValue.get("enabled"));
        setDisabledDateTime((Timestamp) mapValue.get("disabledDateTime"));
        setSuccessiveFailedLogins((Long) mapValue.get("successiveFailedLogins"));
        setLastName((String) mapValue.get("lastName"));
        setMiddleName((String) mapValue.get("middleName"));
        setFirstName((String) mapValue.get("firstName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("groupName", getGroupName());
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("currentPassword", getCurrentPassword());
        mapValue.put("passwordHint", getPasswordHint());
        mapValue.put("enabled", getEnabled());
        mapValue.put("disabledDateTime", getDisabledDateTime());
        mapValue.put("successiveFailedLogins", getSuccessiveFailedLogins());
        mapValue.put("lastName", getLastName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("firstName", getFirstName());
        return mapValue;
    }


}
