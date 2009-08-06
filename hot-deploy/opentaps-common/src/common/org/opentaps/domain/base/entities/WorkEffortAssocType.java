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
 * Auto generated base entity WorkEffortAssocType.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_ASSOC_TYPE")
public class WorkEffortAssocType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortAssocTypeId", "WORK_EFFORT_ASSOC_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortAssocType", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortAssocType> {
    workEffortAssocTypeId("workEffortAssocTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="WorkEffortAssocType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WorkEffortAssocType_GEN")
   @Id
   @Column(name="WORK_EFFORT_ASSOC_TYPE_ID")
   private String workEffortAssocTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffortAssocType parentWorkEffortAssocType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="workEffortAssocType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WORK_EFFORT_ASSOC_TYPE_ID")
   
   private List<WorkEffortAssoc> workEffortAssocs = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<WorkEffortAssocType> childWorkEffortAssocTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="workEffortAssocType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WORK_EFFORT_ASSOC_TYPE_ID")
   
   private List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs = null;

  /**
   * Default constructor.
   */
  public WorkEffortAssocType() {
      super();
      this.baseEntityName = "WorkEffortAssocType";
      this.isView = false;
      this.resourceName = "WorkEffortEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortAssocTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortAssocTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortAssocType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeId the workEffortAssocTypeId to set
     */
    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getWorkEffortAssocTypeId() {
        return this.workEffortAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>WorkEffortAssocType</code> by the relation named <code>ParentWorkEffortAssocType</code>.
     * @return the <code>WorkEffortAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortAssocType getParentWorkEffortAssocType() throws RepositoryException {
        if (this.parentWorkEffortAssocType == null) {
            this.parentWorkEffortAssocType = getRelatedOne(WorkEffortAssocType.class, "ParentWorkEffortAssocType");
        }
        return this.parentWorkEffortAssocType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssoc</code> by the relation named <code>WorkEffortAssoc</code>.
     * @return the list of <code>WorkEffortAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssoc> getWorkEffortAssocs() throws RepositoryException {
        if (this.workEffortAssocs == null) {
            this.workEffortAssocs = getRelated(WorkEffortAssoc.class, "WorkEffortAssoc");
        }
        return this.workEffortAssocs;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssocType</code> by the relation named <code>ChildWorkEffortAssocType</code>.
     * @return the list of <code>WorkEffortAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssocType> getChildWorkEffortAssocTypes() throws RepositoryException {
        if (this.childWorkEffortAssocTypes == null) {
            this.childWorkEffortAssocTypes = getRelated(WorkEffortAssocType.class, "ChildWorkEffortAssocType");
        }
        return this.childWorkEffortAssocTypes;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssocTypeAttr</code> by the relation named <code>WorkEffortAssocTypeAttr</code>.
     * @return the list of <code>WorkEffortAssocTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssocTypeAttr> getWorkEffortAssocTypeAttrs() throws RepositoryException {
        if (this.workEffortAssocTypeAttrs == null) {
            this.workEffortAssocTypeAttrs = getRelated(WorkEffortAssocTypeAttr.class, "WorkEffortAssocTypeAttr");
        }
        return this.workEffortAssocTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentWorkEffortAssocType the parentWorkEffortAssocType to set
    */
    public void setParentWorkEffortAssocType(WorkEffortAssocType parentWorkEffortAssocType) {
        this.parentWorkEffortAssocType = parentWorkEffortAssocType;
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocs the workEffortAssocs to set
    */
    public void setWorkEffortAssocs(List<WorkEffortAssoc> workEffortAssocs) {
        this.workEffortAssocs = workEffortAssocs;
    }
    /**
     * Auto generated value setter.
     * @param childWorkEffortAssocTypes the childWorkEffortAssocTypes to set
    */
    public void setChildWorkEffortAssocTypes(List<WorkEffortAssocType> childWorkEffortAssocTypes) {
        this.childWorkEffortAssocTypes = childWorkEffortAssocTypes;
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeAttrs the workEffortAssocTypeAttrs to set
    */
    public void setWorkEffortAssocTypeAttrs(List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs) {
        this.workEffortAssocTypeAttrs = workEffortAssocTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortAssoc(WorkEffortAssoc workEffortAssoc) {
        if (this.workEffortAssocs == null) {
            this.workEffortAssocs = new ArrayList<WorkEffortAssoc>();
        }
        this.workEffortAssocs.add(workEffortAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortAssoc(WorkEffortAssoc workEffortAssoc) {
        if (this.workEffortAssocs == null) {
            return;
        }
        this.workEffortAssocs.remove(workEffortAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortAssoc() {
        if (this.workEffortAssocs == null) {
            return;
        }
        this.workEffortAssocs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortAssocTypeAttr(WorkEffortAssocTypeAttr workEffortAssocTypeAttr) {
        if (this.workEffortAssocTypeAttrs == null) {
            this.workEffortAssocTypeAttrs = new ArrayList<WorkEffortAssocTypeAttr>();
        }
        this.workEffortAssocTypeAttrs.add(workEffortAssocTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortAssocTypeAttr(WorkEffortAssocTypeAttr workEffortAssocTypeAttr) {
        if (this.workEffortAssocTypeAttrs == null) {
            return;
        }
        this.workEffortAssocTypeAttrs.remove(workEffortAssocTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortAssocTypeAttr() {
        if (this.workEffortAssocTypeAttrs == null) {
            return;
        }
        this.workEffortAssocTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortAssocTypeId((String) mapValue.get("workEffortAssocTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("workEffortAssocTypeId", getWorkEffortAssocTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
