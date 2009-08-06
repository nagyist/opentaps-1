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
 * Auto generated base entity WebSiteContentType.
 */
@javax.persistence.Entity
@Table(name="WEB_SITE_CONTENT_TYPE")
public class WebSiteContentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("webSiteContentTypeId", "WEB_SITE_CONTENT_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WebSiteContentType", fields);
}
  public static enum Fields implements EntityFieldInterface<WebSiteContentType> {
    webSiteContentTypeId("webSiteContentTypeId"),
    description("description"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
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

   @org.hibernate.annotations.GenericGenerator(name="WebSiteContentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WebSiteContentType_GEN")
   @Id
   @Column(name="WEB_SITE_CONTENT_TYPE_ID")
   private String webSiteContentTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
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
   
   private WebSiteContentType parentWebSiteContentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="webSiteContentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WEB_SITE_CONTENT_TYPE_ID")
   
   private List<WebSiteContent> webSiteContents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<WebSiteContentType> childWebSiteContentTypes = null;

  /**
   * Default constructor.
   */
  public WebSiteContentType() {
      super();
      this.baseEntityName = "WebSiteContentType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("webSiteContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("webSiteContentTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WebSiteContentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param webSiteContentTypeId the webSiteContentTypeId to set
     */
    public void setWebSiteContentTypeId(String webSiteContentTypeId) {
        this.webSiteContentTypeId = webSiteContentTypeId;
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
    public String getWebSiteContentTypeId() {
        return this.webSiteContentTypeId;
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
     * Auto generated method that gets the related <code>WebSiteContentType</code> by the relation named <code>ParentWebSiteContentType</code>.
     * @return the <code>WebSiteContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public WebSiteContentType getParentWebSiteContentType() throws RepositoryException {
        if (this.parentWebSiteContentType == null) {
            this.parentWebSiteContentType = getRelatedOne(WebSiteContentType.class, "ParentWebSiteContentType");
        }
        return this.parentWebSiteContentType;
    }
    /**
     * Auto generated method that gets the related <code>WebSiteContent</code> by the relation named <code>WebSiteContent</code>.
     * @return the list of <code>WebSiteContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WebSiteContent> getWebSiteContents() throws RepositoryException {
        if (this.webSiteContents == null) {
            this.webSiteContents = getRelated(WebSiteContent.class, "WebSiteContent");
        }
        return this.webSiteContents;
    }
    /**
     * Auto generated method that gets the related <code>WebSiteContentType</code> by the relation named <code>ChildWebSiteContentType</code>.
     * @return the list of <code>WebSiteContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WebSiteContentType> getChildWebSiteContentTypes() throws RepositoryException {
        if (this.childWebSiteContentTypes == null) {
            this.childWebSiteContentTypes = getRelated(WebSiteContentType.class, "ChildWebSiteContentType");
        }
        return this.childWebSiteContentTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentWebSiteContentType the parentWebSiteContentType to set
    */
    public void setParentWebSiteContentType(WebSiteContentType parentWebSiteContentType) {
        this.parentWebSiteContentType = parentWebSiteContentType;
    }
    /**
     * Auto generated value setter.
     * @param webSiteContents the webSiteContents to set
    */
    public void setWebSiteContents(List<WebSiteContent> webSiteContents) {
        this.webSiteContents = webSiteContents;
    }
    /**
     * Auto generated value setter.
     * @param childWebSiteContentTypes the childWebSiteContentTypes to set
    */
    public void setChildWebSiteContentTypes(List<WebSiteContentType> childWebSiteContentTypes) {
        this.childWebSiteContentTypes = childWebSiteContentTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWebSiteContent(WebSiteContent webSiteContent) {
        if (this.webSiteContents == null) {
            this.webSiteContents = new ArrayList<WebSiteContent>();
        }
        this.webSiteContents.add(webSiteContent);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWebSiteContent(WebSiteContent webSiteContent) {
        if (this.webSiteContents == null) {
            return;
        }
        this.webSiteContents.remove(webSiteContent);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWebSiteContent() {
        if (this.webSiteContents == null) {
            return;
        }
        this.webSiteContents.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWebSiteContentTypeId((String) mapValue.get("webSiteContentTypeId"));
        setDescription((String) mapValue.get("description"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
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
        mapValue.put("webSiteContentTypeId", getWebSiteContentTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
