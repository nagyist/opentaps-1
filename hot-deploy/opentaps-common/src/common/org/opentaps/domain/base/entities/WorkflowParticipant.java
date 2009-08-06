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
 * Auto generated base entity WorkflowParticipant.
 */
@javax.persistence.Entity
@Table(name="WORKFLOW_PARTICIPANT")
public class WorkflowParticipant extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("packageId", "PACKAGE_ID");
        fields.put("packageVersion", "PACKAGE_VERSION");
        fields.put("processId", "PROCESS_ID");
        fields.put("processVersion", "PROCESS_VERSION");
        fields.put("participantId", "PARTICIPANT_ID");
        fields.put("participantName", "PARTICIPANT_NAME");
        fields.put("partyId", "PARTY_ID");
        fields.put("roleTypeId", "ROLE_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("participantTypeId", "PARTICIPANT_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkflowParticipant", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkflowParticipant> {
    packageId("packageId"),
    packageVersion("packageVersion"),
    processId("processId"),
    processVersion("processVersion"),
    participantId("participantId"),
    participantName("participantName"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    description("description"),
    participantTypeId("participantTypeId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.WorkflowParticipantPkBridge.class)
     private WorkflowParticipantPk id = new WorkflowParticipantPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkflowParticipantPk</code>
     */
      public WorkflowParticipantPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkflowParticipantPk</code> value to set
    */   
      public void setId(WorkflowParticipantPk id) {
         this.id = id;
      }
   @Column(name="PARTICIPANT_NAME")
   private String participantName;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="ROLE_TYPE_ID")
   private String roleTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="PARTICIPANT_TYPE_ID")
   private String participantTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTICIPANT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkflowParticipantType workflowParticipantType = null;
   private transient List<WorkflowActivity> performerWorkflowActivitys = null;
   private transient List<WorkflowParticipantList> workflowParticipantLists = null;

  /**
   * Default constructor.
   */
  public WorkflowParticipant() {
      super();
      this.baseEntityName = "WorkflowParticipant";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("packageId");this.primaryKeyNames.add("packageVersion");this.primaryKeyNames.add("processId");this.primaryKeyNames.add("processVersion");this.primaryKeyNames.add("participantId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("packageId");this.allFieldsNames.add("packageVersion");this.allFieldsNames.add("processId");this.allFieldsNames.add("processVersion");this.allFieldsNames.add("participantId");this.allFieldsNames.add("participantName");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("participantTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkflowParticipant(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param packageId the packageId to set
     */
    public void setPackageId(String packageId) {
        id.setPackageId(packageId);
    }
    /**
     * Auto generated value setter.
     * @param packageVersion the packageVersion to set
     */
    public void setPackageVersion(String packageVersion) {
        id.setPackageVersion(packageVersion);
    }
    /**
     * Auto generated value setter.
     * @param processId the processId to set
     */
    public void setProcessId(String processId) {
        id.setProcessId(processId);
    }
    /**
     * Auto generated value setter.
     * @param processVersion the processVersion to set
     */
    public void setProcessVersion(String processVersion) {
        id.setProcessVersion(processVersion);
    }
    /**
     * Auto generated value setter.
     * @param participantId the participantId to set
     */
    public void setParticipantId(String participantId) {
        id.setParticipantId(participantId);
    }
    /**
     * Auto generated value setter.
     * @param participantName the participantName to set
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @param participantTypeId the participantTypeId to set
     */
    public void setParticipantTypeId(String participantTypeId) {
        this.participantTypeId = participantTypeId;
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
    public String getPackageId() {
        return this.id.getPackageId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPackageVersion() {
        return this.id.getPackageVersion();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessId() {
        return this.id.getProcessId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessVersion() {
        return this.id.getProcessVersion();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParticipantId() {
        return this.id.getParticipantId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParticipantName() {
        return this.participantName;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
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
    public String getParticipantTypeId() {
        return this.participantTypeId;
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
     * Auto generated method that gets the related <code>WorkflowParticipantType</code> by the relation named <code>WorkflowParticipantType</code>.
     * @return the <code>WorkflowParticipantType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkflowParticipantType getWorkflowParticipantType() throws RepositoryException {
        if (this.workflowParticipantType == null) {
            this.workflowParticipantType = getRelatedOne(WorkflowParticipantType.class, "WorkflowParticipantType");
        }
        return this.workflowParticipantType;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowActivity</code> by the relation named <code>PerformerWorkflowActivity</code>.
     * @return the list of <code>WorkflowActivity</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowActivity> getPerformerWorkflowActivitys() throws RepositoryException {
        if (this.performerWorkflowActivitys == null) {
            this.performerWorkflowActivitys = getRelated(WorkflowActivity.class, "PerformerWorkflowActivity");
        }
        return this.performerWorkflowActivitys;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowParticipantList</code> by the relation named <code>WorkflowParticipantList</code>.
     * @return the list of <code>WorkflowParticipantList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowParticipantList> getWorkflowParticipantLists() throws RepositoryException {
        if (this.workflowParticipantLists == null) {
            this.workflowParticipantLists = getRelated(WorkflowParticipantList.class, "WorkflowParticipantList");
        }
        return this.workflowParticipantLists;
    }

    /**
     * Auto generated value setter.
     * @param workflowParticipantType the workflowParticipantType to set
    */
    public void setWorkflowParticipantType(WorkflowParticipantType workflowParticipantType) {
        this.workflowParticipantType = workflowParticipantType;
    }
    /**
     * Auto generated value setter.
     * @param performerWorkflowActivitys the performerWorkflowActivitys to set
    */
    public void setPerformerWorkflowActivitys(List<WorkflowActivity> performerWorkflowActivitys) {
        this.performerWorkflowActivitys = performerWorkflowActivitys;
    }
    /**
     * Auto generated value setter.
     * @param workflowParticipantLists the workflowParticipantLists to set
    */
    public void setWorkflowParticipantLists(List<WorkflowParticipantList> workflowParticipantLists) {
        this.workflowParticipantLists = workflowParticipantLists;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPackageId((String) mapValue.get("packageId"));
        setPackageVersion((String) mapValue.get("packageVersion"));
        setProcessId((String) mapValue.get("processId"));
        setProcessVersion((String) mapValue.get("processVersion"));
        setParticipantId((String) mapValue.get("participantId"));
        setParticipantName((String) mapValue.get("participantName"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setDescription((String) mapValue.get("description"));
        setParticipantTypeId((String) mapValue.get("participantTypeId"));
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
        mapValue.put("packageId", getPackageId());
        mapValue.put("packageVersion", getPackageVersion());
        mapValue.put("processId", getProcessId());
        mapValue.put("processVersion", getProcessVersion());
        mapValue.put("participantId", getParticipantId());
        mapValue.put("participantName", getParticipantName());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("participantTypeId", getParticipantTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
