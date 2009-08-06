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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkflowProcess.
 */
@javax.persistence.Entity
@Table(name="WORKFLOW_PROCESS")
public class WorkflowProcess extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("packageId", "PACKAGE_ID");
        fields.put("packageVersion", "PACKAGE_VERSION");
        fields.put("processId", "PROCESS_ID");
        fields.put("processVersion", "PROCESS_VERSION");
        fields.put("objectName", "OBJECT_NAME");
        fields.put("objectPriority", "OBJECT_PRIORITY");
        fields.put("description", "DESCRIPTION");
        fields.put("creationDateTime", "CREATION_DATE_TIME");
        fields.put("author", "AUTHOR");
        fields.put("codepage", "CODEPAGE");
        fields.put("countryGeoId", "COUNTRY_GEO_ID");
        fields.put("publicationStatusId", "PUBLICATION_STATUS_ID");
        fields.put("timeLimit", "TIME_LIMIT");
        fields.put("validFromDate", "VALID_FROM_DATE");
        fields.put("validToDate", "VALID_TO_DATE");
        fields.put("responsibleListId", "RESPONSIBLE_LIST_ID");
        fields.put("participantListId", "PARTICIPANT_LIST_ID");
        fields.put("documentationUrl", "DOCUMENTATION_URL");
        fields.put("durationUomId", "DURATION_UOM_ID");
        fields.put("duration", "DURATION");
        fields.put("workingTime", "WORKING_TIME");
        fields.put("waitingTime", "WAITING_TIME");
        fields.put("defaultStartActivityId", "DEFAULT_START_ACTIVITY_ID");
        fields.put("sourceReferenceField", "SOURCE_REFERENCE_FIELD");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkflowProcess", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkflowProcess> {
    packageId("packageId"),
    packageVersion("packageVersion"),
    processId("processId"),
    processVersion("processVersion"),
    objectName("objectName"),
    objectPriority("objectPriority"),
    description("description"),
    creationDateTime("creationDateTime"),
    author("author"),
    codepage("codepage"),
    countryGeoId("countryGeoId"),
    publicationStatusId("publicationStatusId"),
    timeLimit("timeLimit"),
    validFromDate("validFromDate"),
    validToDate("validToDate"),
    responsibleListId("responsibleListId"),
    participantListId("participantListId"),
    documentationUrl("documentationUrl"),
    durationUomId("durationUomId"),
    duration("duration"),
    workingTime("workingTime"),
    waitingTime("waitingTime"),
    defaultStartActivityId("defaultStartActivityId"),
    sourceReferenceField("sourceReferenceField"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.WorkflowProcessPkBridge.class)
     private WorkflowProcessPk id = new WorkflowProcessPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkflowProcessPk</code>
     */
      public WorkflowProcessPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkflowProcessPk</code> value to set
    */   
      public void setId(WorkflowProcessPk id) {
         this.id = id;
      }
   @Column(name="OBJECT_NAME")
   private String objectName;
   @Column(name="OBJECT_PRIORITY")
   private Long objectPriority;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="CREATION_DATE_TIME")
   private Timestamp creationDateTime;
   @Column(name="AUTHOR")
   private String author;
   @Column(name="CODEPAGE")
   private String codepage;
   @Column(name="COUNTRY_GEO_ID")
   private String countryGeoId;
   @Column(name="PUBLICATION_STATUS_ID")
   private String publicationStatusId;
   @Column(name="TIME_LIMIT")
   private BigDecimal timeLimit;
   @Column(name="VALID_FROM_DATE")
   private Timestamp validFromDate;
   @Column(name="VALID_TO_DATE")
   private Timestamp validToDate;
   @Column(name="RESPONSIBLE_LIST_ID")
   private String responsibleListId;
   @Column(name="PARTICIPANT_LIST_ID")
   private String participantListId;
   @Column(name="DOCUMENTATION_URL")
   private String documentationUrl;
   @Column(name="DURATION_UOM_ID")
   private String durationUomId;
   @Column(name="DURATION")
   private BigDecimal duration;
   @Column(name="WORKING_TIME")
   private BigDecimal workingTime;
   @Column(name="WAITING_TIME")
   private BigDecimal waitingTime;
   @Column(name="DEFAULT_START_ACTIVITY_ID")
   private String defaultStartActivityId;
   @Column(name="SOURCE_REFERENCE_FIELD")
   private String sourceReferenceField;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient WorkflowPackage workflowPackage = null;
   private transient WorkflowActivity defaultStartWorkflowActivity = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COUNTRY_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo countryGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PUBLICATION_STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem publicationStatusItem = null;
   private transient List<WorkflowParticipantList> responsibleWorkflowParticipantLists = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DURATION_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom durationUom = null;
   private transient List<WorkflowParticipantList> workflowParticipantLists = null;
   private transient List<WorkEffort> workEfforts = null;
   private transient List<WorkflowActivity> workflowActivitys = null;
   private transient List<WorkflowActivitySubFlow> subFlowWorkflowActivitySubFlows = null;
   private transient List<WorkflowApplication> workflowApplications = null;
   private transient List<WorkflowDataField> workflowDataFields = null;
   private transient List<WorkflowFormalParam> workflowFormalParams = null;
   private transient List<WorkflowTransition> workflowTransitions = null;

  /**
   * Default constructor.
   */
  public WorkflowProcess() {
      super();
      this.baseEntityName = "WorkflowProcess";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("packageId");this.primaryKeyNames.add("packageVersion");this.primaryKeyNames.add("processId");this.primaryKeyNames.add("processVersion");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("packageId");this.allFieldsNames.add("packageVersion");this.allFieldsNames.add("processId");this.allFieldsNames.add("processVersion");this.allFieldsNames.add("objectName");this.allFieldsNames.add("objectPriority");this.allFieldsNames.add("description");this.allFieldsNames.add("creationDateTime");this.allFieldsNames.add("author");this.allFieldsNames.add("codepage");this.allFieldsNames.add("countryGeoId");this.allFieldsNames.add("publicationStatusId");this.allFieldsNames.add("timeLimit");this.allFieldsNames.add("validFromDate");this.allFieldsNames.add("validToDate");this.allFieldsNames.add("responsibleListId");this.allFieldsNames.add("participantListId");this.allFieldsNames.add("documentationUrl");this.allFieldsNames.add("durationUomId");this.allFieldsNames.add("duration");this.allFieldsNames.add("workingTime");this.allFieldsNames.add("waitingTime");this.allFieldsNames.add("defaultStartActivityId");this.allFieldsNames.add("sourceReferenceField");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkflowProcess(RepositoryInterface repository) {
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
     * @param objectName the objectName to set
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    /**
     * Auto generated value setter.
     * @param objectPriority the objectPriority to set
     */
    public void setObjectPriority(Long objectPriority) {
        this.objectPriority = objectPriority;
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
     * @param creationDateTime the creationDateTime to set
     */
    public void setCreationDateTime(Timestamp creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    /**
     * Auto generated value setter.
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Auto generated value setter.
     * @param codepage the codepage to set
     */
    public void setCodepage(String codepage) {
        this.codepage = codepage;
    }
    /**
     * Auto generated value setter.
     * @param countryGeoId the countryGeoId to set
     */
    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }
    /**
     * Auto generated value setter.
     * @param publicationStatusId the publicationStatusId to set
     */
    public void setPublicationStatusId(String publicationStatusId) {
        this.publicationStatusId = publicationStatusId;
    }
    /**
     * Auto generated value setter.
     * @param timeLimit the timeLimit to set
     */
    public void setTimeLimit(BigDecimal timeLimit) {
        this.timeLimit = timeLimit;
    }
    /**
     * Auto generated value setter.
     * @param validFromDate the validFromDate to set
     */
    public void setValidFromDate(Timestamp validFromDate) {
        this.validFromDate = validFromDate;
    }
    /**
     * Auto generated value setter.
     * @param validToDate the validToDate to set
     */
    public void setValidToDate(Timestamp validToDate) {
        this.validToDate = validToDate;
    }
    /**
     * Auto generated value setter.
     * @param responsibleListId the responsibleListId to set
     */
    public void setResponsibleListId(String responsibleListId) {
        this.responsibleListId = responsibleListId;
    }
    /**
     * Auto generated value setter.
     * @param participantListId the participantListId to set
     */
    public void setParticipantListId(String participantListId) {
        this.participantListId = participantListId;
    }
    /**
     * Auto generated value setter.
     * @param documentationUrl the documentationUrl to set
     */
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }
    /**
     * Auto generated value setter.
     * @param durationUomId the durationUomId to set
     */
    public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
    }
    /**
     * Auto generated value setter.
     * @param duration the duration to set
     */
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }
    /**
     * Auto generated value setter.
     * @param workingTime the workingTime to set
     */
    public void setWorkingTime(BigDecimal workingTime) {
        this.workingTime = workingTime;
    }
    /**
     * Auto generated value setter.
     * @param waitingTime the waitingTime to set
     */
    public void setWaitingTime(BigDecimal waitingTime) {
        this.waitingTime = waitingTime;
    }
    /**
     * Auto generated value setter.
     * @param defaultStartActivityId the defaultStartActivityId to set
     */
    public void setDefaultStartActivityId(String defaultStartActivityId) {
        this.defaultStartActivityId = defaultStartActivityId;
    }
    /**
     * Auto generated value setter.
     * @param sourceReferenceField the sourceReferenceField to set
     */
    public void setSourceReferenceField(String sourceReferenceField) {
        this.sourceReferenceField = sourceReferenceField;
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
    public String getObjectName() {
        return this.objectName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getObjectPriority() {
        return this.objectPriority;
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
    public Timestamp getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCodepage() {
        return this.codepage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryGeoId() {
        return this.countryGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPublicationStatusId() {
        return this.publicationStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTimeLimit() {
        return this.timeLimit;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getValidFromDate() {
        return this.validFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getValidToDate() {
        return this.validToDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResponsibleListId() {
        return this.responsibleListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParticipantListId() {
        return this.participantListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDurationUomId() {
        return this.durationUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getDuration() {
        return this.duration;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWorkingTime() {
        return this.workingTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWaitingTime() {
        return this.waitingTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDefaultStartActivityId() {
        return this.defaultStartActivityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSourceReferenceField() {
        return this.sourceReferenceField;
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
     * Auto generated method that gets the related <code>WorkflowActivity</code> by the relation named <code>DefaultStartWorkflowActivity</code>.
     * @return the <code>WorkflowActivity</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkflowActivity getDefaultStartWorkflowActivity() throws RepositoryException {
        if (this.defaultStartWorkflowActivity == null) {
            this.defaultStartWorkflowActivity = getRelatedOne(WorkflowActivity.class, "DefaultStartWorkflowActivity");
        }
        return this.defaultStartWorkflowActivity;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>CountryGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getCountryGeo() throws RepositoryException {
        if (this.countryGeo == null) {
            this.countryGeo = getRelatedOne(Geo.class, "CountryGeo");
        }
        return this.countryGeo;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>PublicationStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getPublicationStatusItem() throws RepositoryException {
        if (this.publicationStatusItem == null) {
            this.publicationStatusItem = getRelatedOne(StatusItem.class, "PublicationStatusItem");
        }
        return this.publicationStatusItem;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowParticipantList</code> by the relation named <code>ResponsibleWorkflowParticipantList</code>.
     * @return the list of <code>WorkflowParticipantList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowParticipantList> getResponsibleWorkflowParticipantLists() throws RepositoryException {
        if (this.responsibleWorkflowParticipantLists == null) {
            this.responsibleWorkflowParticipantLists = getRelated(WorkflowParticipantList.class, "ResponsibleWorkflowParticipantList");
        }
        return this.responsibleWorkflowParticipantLists;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>DurationUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getDurationUom() throws RepositoryException {
        if (this.durationUom == null) {
            this.durationUom = getRelatedOne(Uom.class, "DurationUom");
        }
        return this.durationUom;
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
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowActivity</code> by the relation named <code>WorkflowActivity</code>.
     * @return the list of <code>WorkflowActivity</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowActivity> getWorkflowActivitys() throws RepositoryException {
        if (this.workflowActivitys == null) {
            this.workflowActivitys = getRelated(WorkflowActivity.class, "WorkflowActivity");
        }
        return this.workflowActivitys;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowActivitySubFlow</code> by the relation named <code>SubFlowWorkflowActivitySubFlow</code>.
     * @return the list of <code>WorkflowActivitySubFlow</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowActivitySubFlow> getSubFlowWorkflowActivitySubFlows() throws RepositoryException {
        if (this.subFlowWorkflowActivitySubFlows == null) {
            this.subFlowWorkflowActivitySubFlows = getRelated(WorkflowActivitySubFlow.class, "SubFlowWorkflowActivitySubFlow");
        }
        return this.subFlowWorkflowActivitySubFlows;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowApplication</code> by the relation named <code>WorkflowApplication</code>.
     * @return the list of <code>WorkflowApplication</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowApplication> getWorkflowApplications() throws RepositoryException {
        if (this.workflowApplications == null) {
            this.workflowApplications = getRelated(WorkflowApplication.class, "WorkflowApplication");
        }
        return this.workflowApplications;
    }
    /**
     * Auto generated method that gets the related <code>WorkflowDataField</code> by the relation named <code>WorkflowDataField</code>.
     * @return the list of <code>WorkflowDataField</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowDataField> getWorkflowDataFields() throws RepositoryException {
        if (this.workflowDataFields == null) {
            this.workflowDataFields = getRelated(WorkflowDataField.class, "WorkflowDataField");
        }
        return this.workflowDataFields;
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
     * Auto generated method that gets the related <code>WorkflowTransition</code> by the relation named <code>WorkflowTransition</code>.
     * @return the list of <code>WorkflowTransition</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkflowTransition> getWorkflowTransitions() throws RepositoryException {
        if (this.workflowTransitions == null) {
            this.workflowTransitions = getRelated(WorkflowTransition.class, "WorkflowTransition");
        }
        return this.workflowTransitions;
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
     * @param defaultStartWorkflowActivity the defaultStartWorkflowActivity to set
    */
    public void setDefaultStartWorkflowActivity(WorkflowActivity defaultStartWorkflowActivity) {
        this.defaultStartWorkflowActivity = defaultStartWorkflowActivity;
    }
    /**
     * Auto generated value setter.
     * @param countryGeo the countryGeo to set
    */
    public void setCountryGeo(Geo countryGeo) {
        this.countryGeo = countryGeo;
    }
    /**
     * Auto generated value setter.
     * @param publicationStatusItem the publicationStatusItem to set
    */
    public void setPublicationStatusItem(StatusItem publicationStatusItem) {
        this.publicationStatusItem = publicationStatusItem;
    }
    /**
     * Auto generated value setter.
     * @param responsibleWorkflowParticipantLists the responsibleWorkflowParticipantLists to set
    */
    public void setResponsibleWorkflowParticipantLists(List<WorkflowParticipantList> responsibleWorkflowParticipantLists) {
        this.responsibleWorkflowParticipantLists = responsibleWorkflowParticipantLists;
    }
    /**
     * Auto generated value setter.
     * @param durationUom the durationUom to set
    */
    public void setDurationUom(Uom durationUom) {
        this.durationUom = durationUom;
    }
    /**
     * Auto generated value setter.
     * @param workflowParticipantLists the workflowParticipantLists to set
    */
    public void setWorkflowParticipantLists(List<WorkflowParticipantList> workflowParticipantLists) {
        this.workflowParticipantLists = workflowParticipantLists;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }
    /**
     * Auto generated value setter.
     * @param workflowActivitys the workflowActivitys to set
    */
    public void setWorkflowActivitys(List<WorkflowActivity> workflowActivitys) {
        this.workflowActivitys = workflowActivitys;
    }
    /**
     * Auto generated value setter.
     * @param subFlowWorkflowActivitySubFlows the subFlowWorkflowActivitySubFlows to set
    */
    public void setSubFlowWorkflowActivitySubFlows(List<WorkflowActivitySubFlow> subFlowWorkflowActivitySubFlows) {
        this.subFlowWorkflowActivitySubFlows = subFlowWorkflowActivitySubFlows;
    }
    /**
     * Auto generated value setter.
     * @param workflowApplications the workflowApplications to set
    */
    public void setWorkflowApplications(List<WorkflowApplication> workflowApplications) {
        this.workflowApplications = workflowApplications;
    }
    /**
     * Auto generated value setter.
     * @param workflowDataFields the workflowDataFields to set
    */
    public void setWorkflowDataFields(List<WorkflowDataField> workflowDataFields) {
        this.workflowDataFields = workflowDataFields;
    }
    /**
     * Auto generated value setter.
     * @param workflowFormalParams the workflowFormalParams to set
    */
    public void setWorkflowFormalParams(List<WorkflowFormalParam> workflowFormalParams) {
        this.workflowFormalParams = workflowFormalParams;
    }
    /**
     * Auto generated value setter.
     * @param workflowTransitions the workflowTransitions to set
    */
    public void setWorkflowTransitions(List<WorkflowTransition> workflowTransitions) {
        this.workflowTransitions = workflowTransitions;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPackageId((String) mapValue.get("packageId"));
        setPackageVersion((String) mapValue.get("packageVersion"));
        setProcessId((String) mapValue.get("processId"));
        setProcessVersion((String) mapValue.get("processVersion"));
        setObjectName((String) mapValue.get("objectName"));
        setObjectPriority((Long) mapValue.get("objectPriority"));
        setDescription((String) mapValue.get("description"));
        setCreationDateTime((Timestamp) mapValue.get("creationDateTime"));
        setAuthor((String) mapValue.get("author"));
        setCodepage((String) mapValue.get("codepage"));
        setCountryGeoId((String) mapValue.get("countryGeoId"));
        setPublicationStatusId((String) mapValue.get("publicationStatusId"));
        setTimeLimit(convertToBigDecimal(mapValue.get("timeLimit")));
        setValidFromDate((Timestamp) mapValue.get("validFromDate"));
        setValidToDate((Timestamp) mapValue.get("validToDate"));
        setResponsibleListId((String) mapValue.get("responsibleListId"));
        setParticipantListId((String) mapValue.get("participantListId"));
        setDocumentationUrl((String) mapValue.get("documentationUrl"));
        setDurationUomId((String) mapValue.get("durationUomId"));
        setDuration(convertToBigDecimal(mapValue.get("duration")));
        setWorkingTime(convertToBigDecimal(mapValue.get("workingTime")));
        setWaitingTime(convertToBigDecimal(mapValue.get("waitingTime")));
        setDefaultStartActivityId((String) mapValue.get("defaultStartActivityId"));
        setSourceReferenceField((String) mapValue.get("sourceReferenceField"));
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
        mapValue.put("objectName", getObjectName());
        mapValue.put("objectPriority", getObjectPriority());
        mapValue.put("description", getDescription());
        mapValue.put("creationDateTime", getCreationDateTime());
        mapValue.put("author", getAuthor());
        mapValue.put("codepage", getCodepage());
        mapValue.put("countryGeoId", getCountryGeoId());
        mapValue.put("publicationStatusId", getPublicationStatusId());
        mapValue.put("timeLimit", getTimeLimit());
        mapValue.put("validFromDate", getValidFromDate());
        mapValue.put("validToDate", getValidToDate());
        mapValue.put("responsibleListId", getResponsibleListId());
        mapValue.put("participantListId", getParticipantListId());
        mapValue.put("documentationUrl", getDocumentationUrl());
        mapValue.put("durationUomId", getDurationUomId());
        mapValue.put("duration", getDuration());
        mapValue.put("workingTime", getWorkingTime());
        mapValue.put("waitingTime", getWaitingTime());
        mapValue.put("defaultStartActivityId", getDefaultStartActivityId());
        mapValue.put("sourceReferenceField", getSourceReferenceField());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
