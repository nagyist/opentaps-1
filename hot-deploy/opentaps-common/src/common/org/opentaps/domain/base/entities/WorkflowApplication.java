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
 * Auto generated base entity WorkflowApplication.
 */
@javax.persistence.Entity
@Table(name="WORKFLOW_APPLICATION")
public class WorkflowApplication extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("packageId", "PACKAGE_ID");
        fields.put("packageVersion", "PACKAGE_VERSION");
        fields.put("processId", "PROCESS_ID");
        fields.put("processVersion", "PROCESS_VERSION");
        fields.put("applicationId", "APPLICATION_ID");
        fields.put("applicationName", "APPLICATION_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkflowApplication", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkflowApplication> {
    packageId("packageId"),
    packageVersion("packageVersion"),
    processId("processId"),
    processVersion("processVersion"),
    applicationId("applicationId"),
    applicationName("applicationName"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.WorkflowApplicationPkBridge.class)
     private WorkflowApplicationPk id = new WorkflowApplicationPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkflowApplicationPk</code>
     */
      public WorkflowApplicationPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkflowApplicationPk</code> value to set
    */   
      public void setId(WorkflowApplicationPk id) {
         this.id = id;
      }
   @Column(name="APPLICATION_NAME")
   private String applicationName;
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
   private transient WorkflowPackage workflowPackage = null;
   private transient WorkflowProcess workflowProcess = null;
   private transient List<WorkflowFormalParam> workflowFormalParams = null;

  /**
   * Default constructor.
   */
  public WorkflowApplication() {
      super();
      this.baseEntityName = "WorkflowApplication";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("packageId");this.primaryKeyNames.add("packageVersion");this.primaryKeyNames.add("processId");this.primaryKeyNames.add("processVersion");this.primaryKeyNames.add("applicationId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("packageId");this.allFieldsNames.add("packageVersion");this.allFieldsNames.add("processId");this.allFieldsNames.add("processVersion");this.allFieldsNames.add("applicationId");this.allFieldsNames.add("applicationName");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkflowApplication(RepositoryInterface repository) {
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
     * @param applicationId the applicationId to set
     */
    public void setApplicationId(String applicationId) {
        id.setApplicationId(applicationId);
    }
    /**
     * Auto generated value setter.
     * @param applicationName the applicationName to set
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
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
    public String getApplicationId() {
        return this.id.getApplicationId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApplicationName() {
        return this.applicationName;
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
     * Auto generated method that gets the related <code>WorkflowPackage</code> by the relation named <code>WorkflowPackage</code>.
     * @return the <code>WorkflowPackage</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkflowPackage getWorkflowPackage() throws RepositoryException {
        if (this.workflowPackage == null) {
            this.workflowPackage = getRelatedOne(WorkflowPackage.class, "WorkflowPackage");
        }
        return this.workflowPackage;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowProcess</code> by the relation named <code>WorkflowProcess</code>.
     * @return the <code>WorkflowProcess</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkflowProcess getWorkflowProcess() throws RepositoryException {
        if (this.workflowProcess == null) {
            this.workflowProcess = getRelatedOne(WorkflowProcess.class, "WorkflowProcess");
        }
        return this.workflowProcess;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowFormalParam</code> by the relation named <code>WorkflowFormalParam</code>.
     * @return the list of <code>WorkflowFormalParam</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowFormalParam> getWorkflowFormalParams() throws RepositoryException {
        if (this.workflowFormalParams == null) {
            this.workflowFormalParams = getRelated(WorkflowFormalParam.class, "WorkflowFormalParam");
        }
        return this.workflowFormalParams;
    }

    /**
     * Auto generated value setter.
     * @param workflowPackage the workflowPackage to set
    */
    public void setWorkflowPackage(WorkflowPackage workflowPackage) {
        this.workflowPackage = workflowPackage;
    }
    /**
     * Auto generated value setter.
     * @param workflowProcess the workflowProcess to set
    */
    public void setWorkflowProcess(WorkflowProcess workflowProcess) {
        this.workflowProcess = workflowProcess;
    }
    /**
     * Auto generated value setter.
     * @param workflowFormalParams the workflowFormalParams to set
    */
    public void setWorkflowFormalParams(List<WorkflowFormalParam> workflowFormalParams) {
        this.workflowFormalParams = workflowFormalParams;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPackageId((String) mapValue.get("packageId"));
        setPackageVersion((String) mapValue.get("packageVersion"));
        setProcessId((String) mapValue.get("processId"));
        setProcessVersion((String) mapValue.get("processVersion"));
        setApplicationId((String) mapValue.get("applicationId"));
        setApplicationName((String) mapValue.get("applicationName"));
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
        mapValue.put("packageId", getPackageId());
        mapValue.put("packageVersion", getPackageVersion());
        mapValue.put("processId", getProcessId());
        mapValue.put("processVersion", getProcessVersion());
        mapValue.put("applicationId", getApplicationId());
        mapValue.put("applicationName", getApplicationName());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
