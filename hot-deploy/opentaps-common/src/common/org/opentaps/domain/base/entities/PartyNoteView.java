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
 * Auto generated base entity PartyNoteView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyNoteViews", query="SELECT PN.PARTY_ID AS \"partyId\",ND.NOTE_ID AS \"noteId\",ND.NOTE_NAME AS \"noteName\",ND.NOTE_INFO AS \"noteInfo\",ND.NOTE_DATE_TIME AS \"noteDateTime\",ND.NOTE_PARTY AS \"noteParty\" FROM PARTY_NOTE PN INNER JOIN NOTE_DATA ND ON PN.NOTE_ID = ND.NOTE_ID", resultSetMapping="PartyNoteViewMapping")
@SqlResultSetMapping(name="PartyNoteViewMapping", entities={
@EntityResult(entityClass=PartyNoteView.class, fields = {
@FieldResult(name="targetPartyId", column="targetPartyId")
,@FieldResult(name="noteId", column="noteId")
,@FieldResult(name="noteName", column="noteName")
,@FieldResult(name="noteInfo", column="noteInfo")
,@FieldResult(name="noteDateTime", column="noteDateTime")
,@FieldResult(name="noteParty", column="noteParty")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyNoteView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("targetPartyId", "PN.PARTY_ID");
        fields.put("noteId", "ND.NOTE_ID");
        fields.put("noteName", "ND.NOTE_NAME");
        fields.put("noteInfo", "ND.NOTE_INFO");
        fields.put("noteDateTime", "ND.NOTE_DATE_TIME");
        fields.put("noteParty", "ND.NOTE_PARTY");
fieldMapColumns.put("PartyNoteView", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyNoteView> {
    targetPartyId("targetPartyId"),
    noteId("noteId"),
    noteName("noteName"),
    noteInfo("noteInfo"),
    noteDateTime("noteDateTime"),
    noteParty("noteParty");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String targetPartyId;
    @Id
   private String noteId;
    
   private String noteName;
    
   private String noteInfo;
    
   private Timestamp noteDateTime;
    
   private String noteParty;

  /**
   * Default constructor.
   */
  public PartyNoteView() {
      super();
      this.baseEntityName = "PartyNoteView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("targetPartyId");this.primaryKeyNames.add("noteId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("targetPartyId");this.allFieldsNames.add("noteId");this.allFieldsNames.add("noteName");this.allFieldsNames.add("noteInfo");this.allFieldsNames.add("noteDateTime");this.allFieldsNames.add("noteParty");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyNoteView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param targetPartyId the targetPartyId to set
     */
    private void setTargetPartyId(String targetPartyId) {
        this.targetPartyId = targetPartyId;
    }
    /**
     * Auto generated value setter.
     * @param noteId the noteId to set
     */
    private void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    /**
     * Auto generated value setter.
     * @param noteName the noteName to set
     */
    private void setNoteName(String noteName) {
        this.noteName = noteName;
    }
    /**
     * Auto generated value setter.
     * @param noteInfo the noteInfo to set
     */
    private void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }
    /**
     * Auto generated value setter.
     * @param noteDateTime the noteDateTime to set
     */
    private void setNoteDateTime(Timestamp noteDateTime) {
        this.noteDateTime = noteDateTime;
    }
    /**
     * Auto generated value setter.
     * @param noteParty the noteParty to set
     */
    private void setNoteParty(String noteParty) {
        this.noteParty = noteParty;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTargetPartyId() {
        return this.targetPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteId() {
        return this.noteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteName() {
        return this.noteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteInfo() {
        return this.noteInfo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getNoteDateTime() {
        return this.noteDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteParty() {
        return this.noteParty;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTargetPartyId((String) mapValue.get("targetPartyId"));
        setNoteId((String) mapValue.get("noteId"));
        setNoteName((String) mapValue.get("noteName"));
        setNoteInfo((String) mapValue.get("noteInfo"));
        setNoteDateTime((Timestamp) mapValue.get("noteDateTime"));
        setNoteParty((String) mapValue.get("noteParty"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("targetPartyId", getTargetPartyId());
        mapValue.put("noteId", getNoteId());
        mapValue.put("noteName", getNoteName());
        mapValue.put("noteInfo", getNoteInfo());
        mapValue.put("noteDateTime", getNoteDateTime());
        mapValue.put("noteParty", getNoteParty());
        return mapValue;
    }


}
