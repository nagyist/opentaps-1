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
 * Auto generated base entity BudgetItemType.
 */
@javax.persistence.Entity
@Table(name="BUDGET_ITEM_TYPE")
public class BudgetItemType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("budgetItemTypeId", "BUDGET_ITEM_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BudgetItemType", fields);
}
  public static enum Fields implements EntityFieldInterface<BudgetItemType> {
    budgetItemTypeId("budgetItemTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="BudgetItemType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="BudgetItemType_GEN")
   @Id
   @Column(name="BUDGET_ITEM_TYPE_ID")
   private String budgetItemTypeId;
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
   
   private BudgetItemType parentBudgetItemType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="BUDGET_ITEM_TYPE_ID")
   
   private List<BudgetItem> budgetItems = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<BudgetItemType> childBudgetItemTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="budgetItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BUDGET_ITEM_TYPE_ID")
   
   private List<BudgetItemTypeAttr> budgetItemTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="budgetItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BUDGET_ITEM_TYPE_ID")
   
   private List<BudgetScenarioRule> budgetScenarioRules = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="budgetItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BUDGET_ITEM_TYPE_ID")
   
   private List<GlBudgetXref> glBudgetXrefs = null;

  /**
   * Default constructor.
   */
  public BudgetItemType() {
      super();
      this.baseEntityName = "BudgetItemType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("budgetItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("budgetItemTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BudgetItemType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param budgetItemTypeId the budgetItemTypeId to set
     */
    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
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
    public String getBudgetItemTypeId() {
        return this.budgetItemTypeId;
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
     * Auto generated method that gets the related <code>BudgetItemType</code> by the relation named <code>ParentBudgetItemType</code>.
     * @return the <code>BudgetItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public BudgetItemType getParentBudgetItemType() throws RepositoryException {
        if (this.parentBudgetItemType == null) {
            this.parentBudgetItemType = getRelatedOne(BudgetItemType.class, "ParentBudgetItemType");
        }
        return this.parentBudgetItemType;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItem</code> by the relation named <code>BudgetItem</code>.
     * @return the list of <code>BudgetItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetItem> getBudgetItems() throws RepositoryException {
        if (this.budgetItems == null) {
            this.budgetItems = getRelated(BudgetItem.class, "BudgetItem");
        }
        return this.budgetItems;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItemType</code> by the relation named <code>ChildBudgetItemType</code>.
     * @return the list of <code>BudgetItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetItemType> getChildBudgetItemTypes() throws RepositoryException {
        if (this.childBudgetItemTypes == null) {
            this.childBudgetItemTypes = getRelated(BudgetItemType.class, "ChildBudgetItemType");
        }
        return this.childBudgetItemTypes;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItemTypeAttr</code> by the relation named <code>BudgetItemTypeAttr</code>.
     * @return the list of <code>BudgetItemTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetItemTypeAttr> getBudgetItemTypeAttrs() throws RepositoryException {
        if (this.budgetItemTypeAttrs == null) {
            this.budgetItemTypeAttrs = getRelated(BudgetItemTypeAttr.class, "BudgetItemTypeAttr");
        }
        return this.budgetItemTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>BudgetScenarioRule</code> by the relation named <code>BudgetScenarioRule</code>.
     * @return the list of <code>BudgetScenarioRule</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetScenarioRule> getBudgetScenarioRules() throws RepositoryException {
        if (this.budgetScenarioRules == null) {
            this.budgetScenarioRules = getRelated(BudgetScenarioRule.class, "BudgetScenarioRule");
        }
        return this.budgetScenarioRules;
    }
    /**
     * Auto generated method that gets the related <code>GlBudgetXref</code> by the relation named <code>GlBudgetXref</code>.
     * @return the list of <code>GlBudgetXref</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GlBudgetXref> getGlBudgetXrefs() throws RepositoryException {
        if (this.glBudgetXrefs == null) {
            this.glBudgetXrefs = getRelated(GlBudgetXref.class, "GlBudgetXref");
        }
        return this.glBudgetXrefs;
    }

    /**
     * Auto generated value setter.
     * @param parentBudgetItemType the parentBudgetItemType to set
    */
    public void setParentBudgetItemType(BudgetItemType parentBudgetItemType) {
        this.parentBudgetItemType = parentBudgetItemType;
    }
    /**
     * Auto generated value setter.
     * @param budgetItems the budgetItems to set
    */
    public void setBudgetItems(List<BudgetItem> budgetItems) {
        this.budgetItems = budgetItems;
    }
    /**
     * Auto generated value setter.
     * @param childBudgetItemTypes the childBudgetItemTypes to set
    */
    public void setChildBudgetItemTypes(List<BudgetItemType> childBudgetItemTypes) {
        this.childBudgetItemTypes = childBudgetItemTypes;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemTypeAttrs the budgetItemTypeAttrs to set
    */
    public void setBudgetItemTypeAttrs(List<BudgetItemTypeAttr> budgetItemTypeAttrs) {
        this.budgetItemTypeAttrs = budgetItemTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param budgetScenarioRules the budgetScenarioRules to set
    */
    public void setBudgetScenarioRules(List<BudgetScenarioRule> budgetScenarioRules) {
        this.budgetScenarioRules = budgetScenarioRules;
    }
    /**
     * Auto generated value setter.
     * @param glBudgetXrefs the glBudgetXrefs to set
    */
    public void setGlBudgetXrefs(List<GlBudgetXref> glBudgetXrefs) {
        this.glBudgetXrefs = glBudgetXrefs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addBudgetItemTypeAttr(BudgetItemTypeAttr budgetItemTypeAttr) {
        if (this.budgetItemTypeAttrs == null) {
            this.budgetItemTypeAttrs = new ArrayList<BudgetItemTypeAttr>();
        }
        this.budgetItemTypeAttrs.add(budgetItemTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeBudgetItemTypeAttr(BudgetItemTypeAttr budgetItemTypeAttr) {
        if (this.budgetItemTypeAttrs == null) {
            return;
        }
        this.budgetItemTypeAttrs.remove(budgetItemTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearBudgetItemTypeAttr() {
        if (this.budgetItemTypeAttrs == null) {
            return;
        }
        this.budgetItemTypeAttrs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addBudgetScenarioRule(BudgetScenarioRule budgetScenarioRule) {
        if (this.budgetScenarioRules == null) {
            this.budgetScenarioRules = new ArrayList<BudgetScenarioRule>();
        }
        this.budgetScenarioRules.add(budgetScenarioRule);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeBudgetScenarioRule(BudgetScenarioRule budgetScenarioRule) {
        if (this.budgetScenarioRules == null) {
            return;
        }
        this.budgetScenarioRules.remove(budgetScenarioRule);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearBudgetScenarioRule() {
        if (this.budgetScenarioRules == null) {
            return;
        }
        this.budgetScenarioRules.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addGlBudgetXref(GlBudgetXref glBudgetXref) {
        if (this.glBudgetXrefs == null) {
            this.glBudgetXrefs = new ArrayList<GlBudgetXref>();
        }
        this.glBudgetXrefs.add(glBudgetXref);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeGlBudgetXref(GlBudgetXref glBudgetXref) {
        if (this.glBudgetXrefs == null) {
            return;
        }
        this.glBudgetXrefs.remove(glBudgetXref);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearGlBudgetXref() {
        if (this.glBudgetXrefs == null) {
            return;
        }
        this.glBudgetXrefs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBudgetItemTypeId((String) mapValue.get("budgetItemTypeId"));
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
        mapValue.put("budgetItemTypeId", getBudgetItemTypeId());
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
