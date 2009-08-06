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
 * Auto generated base entity DataSource.
 */
@javax.persistence.Entity
@Table(name="DATA_SOURCE")
public class DataSource extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("dataSourceId", "DATA_SOURCE_ID");
        fields.put("dataSourceTypeId", "DATA_SOURCE_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataSource", fields);
}
  public static enum Fields implements EntityFieldInterface<DataSource> {
    dataSourceId("dataSourceId"),
    dataSourceTypeId("dataSourceTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="DataSource_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="DataSource_GEN")
   @Id
   @Column(name="DATA_SOURCE_ID")
   private String dataSourceId;
   @Column(name="DATA_SOURCE_TYPE_ID")
   private String dataSourceTypeId;
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
   @JoinColumn(name="DATA_SOURCE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataSourceType dataSourceType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<Content> contents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<ContentAssoc> contentAssocs = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<ContentMetaData> contentMetaDatas = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<DataResource> dataResources = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<DataResourceMetaData> dataResourceMetaDatas = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="dataSource", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DATA_SOURCE_ID")
   
   private List<PartyDataSource> partyDataSources = null;

  /**
   * Default constructor.
   */
  public DataSource() {
      super();
      this.baseEntityName = "DataSource";
      this.isView = false;
      this.resourceName = "CommonEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("dataSourceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("dataSourceTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataSource(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceTypeId the dataSourceTypeId to set
     */
    public void setDataSourceTypeId(String dataSourceTypeId) {
        this.dataSourceTypeId = dataSourceTypeId;
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
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceTypeId() {
        return this.dataSourceTypeId;
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
     * Auto generated method that gets the related <code>DataSourceType</code> by the relation named <code>DataSourceType</code>.
     * @return the <code>DataSourceType</code>
     * @throws RepositoryException if an error occurs
     */
    public DataSourceType getDataSourceType() throws RepositoryException {
        if (this.dataSourceType == null) {
            this.dataSourceType = getRelatedOne(DataSourceType.class, "DataSourceType");
        }
        return this.dataSourceType;
    }
    /**
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the list of <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Content> getContents() throws RepositoryException {
        if (this.contents == null) {
            this.contents = getRelated(Content.class, "Content");
        }
        return this.contents;
    }
    /**
     * Auto generated method that gets the related <code>ContentAssoc</code> by the relation named <code>ContentAssoc</code>.
     * @return the list of <code>ContentAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContentAssoc> getContentAssocs() throws RepositoryException {
        if (this.contentAssocs == null) {
            this.contentAssocs = getRelated(ContentAssoc.class, "ContentAssoc");
        }
        return this.contentAssocs;
    }
    /**
     * Auto generated method that gets the related <code>ContentMetaData</code> by the relation named <code>ContentMetaData</code>.
     * @return the list of <code>ContentMetaData</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContentMetaData> getContentMetaDatas() throws RepositoryException {
        if (this.contentMetaDatas == null) {
            this.contentMetaDatas = getRelated(ContentMetaData.class, "ContentMetaData");
        }
        return this.contentMetaDatas;
    }
    /**
     * Auto generated method that gets the related <code>DataResource</code> by the relation named <code>DataResource</code>.
     * @return the list of <code>DataResource</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DataResource> getDataResources() throws RepositoryException {
        if (this.dataResources == null) {
            this.dataResources = getRelated(DataResource.class, "DataResource");
        }
        return this.dataResources;
    }
    /**
     * Auto generated method that gets the related <code>DataResourceMetaData</code> by the relation named <code>DataResourceMetaData</code>.
     * @return the list of <code>DataResourceMetaData</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DataResourceMetaData> getDataResourceMetaDatas() throws RepositoryException {
        if (this.dataResourceMetaDatas == null) {
            this.dataResourceMetaDatas = getRelated(DataResourceMetaData.class, "DataResourceMetaData");
        }
        return this.dataResourceMetaDatas;
    }
    /**
     * Auto generated method that gets the related <code>PartyDataSource</code> by the relation named <code>PartyDataSource</code>.
     * @return the list of <code>PartyDataSource</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyDataSource> getPartyDataSources() throws RepositoryException {
        if (this.partyDataSources == null) {
            this.partyDataSources = getRelated(PartyDataSource.class, "PartyDataSource");
        }
        return this.partyDataSources;
    }

    /**
     * Auto generated value setter.
     * @param dataSourceType the dataSourceType to set
    */
    public void setDataSourceType(DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;
    }
    /**
     * Auto generated value setter.
     * @param contents the contents to set
    */
    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
    /**
     * Auto generated value setter.
     * @param contentAssocs the contentAssocs to set
    */
    public void setContentAssocs(List<ContentAssoc> contentAssocs) {
        this.contentAssocs = contentAssocs;
    }
    /**
     * Auto generated value setter.
     * @param contentMetaDatas the contentMetaDatas to set
    */
    public void setContentMetaDatas(List<ContentMetaData> contentMetaDatas) {
        this.contentMetaDatas = contentMetaDatas;
    }
    /**
     * Auto generated value setter.
     * @param dataResources the dataResources to set
    */
    public void setDataResources(List<DataResource> dataResources) {
        this.dataResources = dataResources;
    }
    /**
     * Auto generated value setter.
     * @param dataResourceMetaDatas the dataResourceMetaDatas to set
    */
    public void setDataResourceMetaDatas(List<DataResourceMetaData> dataResourceMetaDatas) {
        this.dataResourceMetaDatas = dataResourceMetaDatas;
    }
    /**
     * Auto generated value setter.
     * @param partyDataSources the partyDataSources to set
    */
    public void setPartyDataSources(List<PartyDataSource> partyDataSources) {
        this.partyDataSources = partyDataSources;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyDataSource(PartyDataSource partyDataSource) {
        if (this.partyDataSources == null) {
            this.partyDataSources = new ArrayList<PartyDataSource>();
        }
        this.partyDataSources.add(partyDataSource);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyDataSource(PartyDataSource partyDataSource) {
        if (this.partyDataSources == null) {
            return;
        }
        this.partyDataSources.remove(partyDataSource);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyDataSource() {
        if (this.partyDataSources == null) {
            return;
        }
        this.partyDataSources.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setDataSourceTypeId((String) mapValue.get("dataSourceTypeId"));
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
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("dataSourceTypeId", getDataSourceTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
