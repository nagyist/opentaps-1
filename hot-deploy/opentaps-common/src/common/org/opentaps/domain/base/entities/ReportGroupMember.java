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
 * Auto generated base entity ReportGroupMember.
 */
@javax.persistence.Entity
@Table(name="REPORT_GROUP_MEMBER")
public class ReportGroupMember extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("reportGroupId", "REPORT_GROUP_ID");
        fields.put("reportId", "REPORT_ID");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReportGroupMember", fields);
}
  public static enum Fields implements EntityFieldInterface<ReportGroupMember> {
    reportGroupId("reportGroupId"),
    reportId("reportId"),
    sequenceNum("sequenceNum"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ReportGroupMemberPkBridge.class)
     private ReportGroupMemberPk id = new ReportGroupMemberPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ReportGroupMemberPk</code>
     */
      public ReportGroupMemberPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ReportGroupMemberPk</code> value to set
    */   
      public void setId(ReportGroupMemberPk id) {
         this.id = id;
      }
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REPORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReportRegistry reportRegistry = null;

  /**
   * Default constructor.
   */
  public ReportGroupMember() {
      super();
      this.baseEntityName = "ReportGroupMember";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("reportGroupId");this.primaryKeyNames.add("reportId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("reportGroupId");this.allFieldsNames.add("reportId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReportGroupMember(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param reportGroupId the reportGroupId to set
     */
    public void setReportGroupId(String reportGroupId) {
        id.setReportGroupId(reportGroupId);
    }
    /**
     * Auto generated value setter.
     * @param reportId the reportId to set
     */
    public void setReportId(String reportId) {
        id.setReportId(reportId);
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getReportGroupId() {
        return this.id.getReportGroupId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReportId() {
        return this.id.getReportId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>ReportRegistry</code> by the relation named <code>ReportRegistry</code>.
     * @return the <code>ReportRegistry</code>
     * @throws RepositoryException if an error occurs
     */
    public ReportRegistry getReportRegistry() throws RepositoryException {
        if (this.reportRegistry == null) {
            this.reportRegistry = getRelatedOne(ReportRegistry.class, "ReportRegistry");
        }
        return this.reportRegistry;
    }

    /**
     * Auto generated value setter.
     * @param reportRegistry the reportRegistry to set
    */
    public void setReportRegistry(ReportRegistry reportRegistry) {
        this.reportRegistry = reportRegistry;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReportGroupId((String) mapValue.get("reportGroupId"));
        setReportId((String) mapValue.get("reportId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("reportGroupId", getReportGroupId());
        mapValue.put("reportId", getReportId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
