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
 * Auto generated base entity PartyGroup.
 */
@javax.persistence.Entity
@Indexed
@Table(name="PARTY_GROUP")
public class PartyGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PARTY_ID");
        fields.put("groupName", "GROUP_NAME");
        fields.put("groupNameLocal", "GROUP_NAME_LOCAL");
        fields.put("officeSiteName", "OFFICE_SITE_NAME");
        fields.put("comments", "COMMENTS");
        fields.put("logoImageUrl", "LOGO_IMAGE_URL");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("isIncorporated", "IS_INCORPORATED");
        fields.put("federalTaxId", "FEDERAL_TAX_ID");
        fields.put("requires1099", "REQUIRES1099");
fieldMapColumns.put("PartyGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyGroup> {
    partyId("partyId"),
    groupName("groupName"),
    groupNameLocal("groupNameLocal"),
    officeSiteName("officeSiteName"),
    comments("comments"),
    logoImageUrl("logoImageUrl"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    isIncorporated("isIncorporated"),
    federalTaxId("federalTaxId"),
    requires1099("requires1099");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="PartyGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyGroup_GEN")
   @Id
   @DocumentId
   @Field(index=Index.UN_TOKENIZED, store=Store.YES)
   @Boost(10f)
   @Column(name="PARTY_ID")
   private String partyId;
   @Field(index=Index.TOKENIZED, store=Store.YES)
   @Boost(5f)
   @Column(name="GROUP_NAME")
   private String groupName;
   @Column(name="GROUP_NAME_LOCAL")
   private String groupNameLocal;
   @Column(name="OFFICE_SITE_NAME")
   private String officeSiteName;
   @Field(index=Index.TOKENIZED, store=Store.YES)
   @Boost(1f)
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LOGO_IMAGE_URL")
   private String logoImageUrl;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="IS_INCORPORATED")
   private String isIncorporated;
   @Column(name="FEDERAL_TAX_ID")
   private String federalTaxId;
   @Column(name="REQUIRES1099")
   private String requires1099;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   @IndexedEmbedded(depth = 2)
   private Party party = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Affiliate affiliate = null;
   private transient List<PartyContactMech> partyContactMeches = null;
   private transient List<PartyContactMechPurpose> partyContactMechPurposes = null;
   private transient List<PartyInvitationGroupAssoc> toPartyInvitationGroupAssocs = null;
   private transient List<ProdCatalogRole> prodCatalogRoles = null;
   private transient List<ProductStoreRole> productStoreRoles = null;
   private transient List<Shipment> toShipments = null;
   private transient List<Shipment> fromShipments = null;
   private transient List<ShipmentRouteSegment> carrierShipmentRouteSegments = null;
   private transient List<UserLogin> userLogins = null;
   private transient List<WebSiteRole> webSiteRoles = null;

  /**
   * Default constructor.
   */
  public PartyGroup() {
      super();
      this.baseEntityName = "PartyGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("groupName");this.allFieldsNames.add("groupNameLocal");this.allFieldsNames.add("officeSiteName");this.allFieldsNames.add("comments");this.allFieldsNames.add("logoImageUrl");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("isIncorporated");this.allFieldsNames.add("federalTaxId");this.allFieldsNames.add("requires1099");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param groupNameLocal the groupNameLocal to set
     */
    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param officeSiteName the officeSiteName to set
     */
    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param logoImageUrl the logoImageUrl to set
     */
    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
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
     * Auto generated value setter.
     * @param isIncorporated the isIncorporated to set
     */
    public void setIsIncorporated(String isIncorporated) {
        this.isIncorporated = isIncorporated;
    }
    /**
     * Auto generated value setter.
     * @param federalTaxId the federalTaxId to set
     */
    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }
    /**
     * Auto generated value setter.
     * @param requires1099 the requires1099 to set
     */
    public void setRequires1099(String requires1099) {
        this.requires1099 = requires1099;
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
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupNameLocal() {
        return this.groupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLogoImageUrl() {
        return this.logoImageUrl;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsIncorporated() {
        return this.isIncorporated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFederalTaxId() {
        return this.federalTaxId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequires1099() {
        return this.requires1099;
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
     * Auto generated method that gets the related <code>Affiliate</code> by the relation named <code>Affiliate</code>.
     * @return the <code>Affiliate</code>
     * @throws RepositoryException if an error occurs
     */
    public Affiliate getAffiliate() throws RepositoryException {
        if (this.affiliate == null) {
            this.affiliate = getRelatedOne(Affiliate.class, "Affiliate");
        }
        return this.affiliate;
    }
    /**
     * Auto generated method that gets the related <code>PartyContactMech</code> by the relation named <code>PartyContactMech</code>.
     * @return the list of <code>PartyContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyContactMech> getPartyContactMeches() throws RepositoryException {
        if (this.partyContactMeches == null) {
            this.partyContactMeches = getRelated(PartyContactMech.class, "PartyContactMech");
        }
        return this.partyContactMeches;
    }
    /**
     * Auto generated method that gets the related <code>PartyContactMechPurpose</code> by the relation named <code>PartyContactMechPurpose</code>.
     * @return the list of <code>PartyContactMechPurpose</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyContactMechPurpose> getPartyContactMechPurposes() throws RepositoryException {
        if (this.partyContactMechPurposes == null) {
            this.partyContactMechPurposes = getRelated(PartyContactMechPurpose.class, "PartyContactMechPurpose");
        }
        return this.partyContactMechPurposes;
    }
    /**
     * Auto generated method that gets the related <code>PartyInvitationGroupAssoc</code> by the relation named <code>ToPartyInvitationGroupAssoc</code>.
     * @return the list of <code>PartyInvitationGroupAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyInvitationGroupAssoc> getToPartyInvitationGroupAssocs() throws RepositoryException {
        if (this.toPartyInvitationGroupAssocs == null) {
            this.toPartyInvitationGroupAssocs = getRelated(PartyInvitationGroupAssoc.class, "ToPartyInvitationGroupAssoc");
        }
        return this.toPartyInvitationGroupAssocs;
    }
    /**
     * Auto generated method that gets the related <code>ProdCatalogRole</code> by the relation named <code>ProdCatalogRole</code>.
     * @return the list of <code>ProdCatalogRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProdCatalogRole> getProdCatalogRoles() throws RepositoryException {
        if (this.prodCatalogRoles == null) {
            this.prodCatalogRoles = getRelated(ProdCatalogRole.class, "ProdCatalogRole");
        }
        return this.prodCatalogRoles;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreRole</code> by the relation named <code>ProductStoreRole</code>.
     * @return the list of <code>ProductStoreRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreRole> getProductStoreRoles() throws RepositoryException {
        if (this.productStoreRoles == null) {
            this.productStoreRoles = getRelated(ProductStoreRole.class, "ProductStoreRole");
        }
        return this.productStoreRoles;
    }
    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>ToShipment</code>.
     * @return the list of <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Shipment> getToShipments() throws RepositoryException {
        if (this.toShipments == null) {
            this.toShipments = getRelated(Shipment.class, "ToShipment");
        }
        return this.toShipments;
    }
    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>FromShipment</code>.
     * @return the list of <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Shipment> getFromShipments() throws RepositoryException {
        if (this.fromShipments == null) {
            this.fromShipments = getRelated(Shipment.class, "FromShipment");
        }
        return this.fromShipments;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentRouteSegment</code> by the relation named <code>CarrierShipmentRouteSegment</code>.
     * @return the list of <code>ShipmentRouteSegment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentRouteSegment> getCarrierShipmentRouteSegments() throws RepositoryException {
        if (this.carrierShipmentRouteSegments == null) {
            this.carrierShipmentRouteSegments = getRelated(ShipmentRouteSegment.class, "CarrierShipmentRouteSegment");
        }
        return this.carrierShipmentRouteSegments;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the list of <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UserLogin> getUserLogins() throws RepositoryException {
        if (this.userLogins == null) {
            this.userLogins = getRelated(UserLogin.class, "UserLogin");
        }
        return this.userLogins;
    }
    /**
     * Auto generated method that gets the related <code>WebSiteRole</code> by the relation named <code>WebSiteRole</code>.
     * @return the list of <code>WebSiteRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WebSiteRole> getWebSiteRoles() throws RepositoryException {
        if (this.webSiteRoles == null) {
            this.webSiteRoles = getRelated(WebSiteRole.class, "WebSiteRole");
        }
        return this.webSiteRoles;
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
     * @param affiliate the affiliate to set
    */
    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }
    /**
     * Auto generated value setter.
     * @param partyContactMeches the partyContactMeches to set
    */
    public void setPartyContactMeches(List<PartyContactMech> partyContactMeches) {
        this.partyContactMeches = partyContactMeches;
    }
    /**
     * Auto generated value setter.
     * @param partyContactMechPurposes the partyContactMechPurposes to set
    */
    public void setPartyContactMechPurposes(List<PartyContactMechPurpose> partyContactMechPurposes) {
        this.partyContactMechPurposes = partyContactMechPurposes;
    }
    /**
     * Auto generated value setter.
     * @param toPartyInvitationGroupAssocs the toPartyInvitationGroupAssocs to set
    */
    public void setToPartyInvitationGroupAssocs(List<PartyInvitationGroupAssoc> toPartyInvitationGroupAssocs) {
        this.toPartyInvitationGroupAssocs = toPartyInvitationGroupAssocs;
    }
    /**
     * Auto generated value setter.
     * @param prodCatalogRoles the prodCatalogRoles to set
    */
    public void setProdCatalogRoles(List<ProdCatalogRole> prodCatalogRoles) {
        this.prodCatalogRoles = prodCatalogRoles;
    }
    /**
     * Auto generated value setter.
     * @param productStoreRoles the productStoreRoles to set
    */
    public void setProductStoreRoles(List<ProductStoreRole> productStoreRoles) {
        this.productStoreRoles = productStoreRoles;
    }
    /**
     * Auto generated value setter.
     * @param toShipments the toShipments to set
    */
    public void setToShipments(List<Shipment> toShipments) {
        this.toShipments = toShipments;
    }
    /**
     * Auto generated value setter.
     * @param fromShipments the fromShipments to set
    */
    public void setFromShipments(List<Shipment> fromShipments) {
        this.fromShipments = fromShipments;
    }
    /**
     * Auto generated value setter.
     * @param carrierShipmentRouteSegments the carrierShipmentRouteSegments to set
    */
    public void setCarrierShipmentRouteSegments(List<ShipmentRouteSegment> carrierShipmentRouteSegments) {
        this.carrierShipmentRouteSegments = carrierShipmentRouteSegments;
    }
    /**
     * Auto generated value setter.
     * @param userLogins the userLogins to set
    */
    public void setUserLogins(List<UserLogin> userLogins) {
        this.userLogins = userLogins;
    }
    /**
     * Auto generated value setter.
     * @param webSiteRoles the webSiteRoles to set
    */
    public void setWebSiteRoles(List<WebSiteRole> webSiteRoles) {
        this.webSiteRoles = webSiteRoles;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyContactMeche(PartyContactMech partyContactMeche) {
        if (this.partyContactMeches == null) {
            this.partyContactMeches = new ArrayList<PartyContactMech>();
        }
        this.partyContactMeches.add(partyContactMeche);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyContactMeche(PartyContactMech partyContactMeche) {
        if (this.partyContactMeches == null) {
            return;
        }
        this.partyContactMeches.remove(partyContactMeche);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyContactMeche() {
        if (this.partyContactMeches == null) {
            return;
        }
        this.partyContactMeches.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyContactMechPurpose(PartyContactMechPurpose partyContactMechPurpose) {
        if (this.partyContactMechPurposes == null) {
            this.partyContactMechPurposes = new ArrayList<PartyContactMechPurpose>();
        }
        this.partyContactMechPurposes.add(partyContactMechPurpose);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyContactMechPurpose(PartyContactMechPurpose partyContactMechPurpose) {
        if (this.partyContactMechPurposes == null) {
            return;
        }
        this.partyContactMechPurposes.remove(partyContactMechPurpose);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyContactMechPurpose() {
        if (this.partyContactMechPurposes == null) {
            return;
        }
        this.partyContactMechPurposes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addToPartyInvitationGroupAssoc(PartyInvitationGroupAssoc toPartyInvitationGroupAssoc) {
        if (this.toPartyInvitationGroupAssocs == null) {
            this.toPartyInvitationGroupAssocs = new ArrayList<PartyInvitationGroupAssoc>();
        }
        this.toPartyInvitationGroupAssocs.add(toPartyInvitationGroupAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeToPartyInvitationGroupAssoc(PartyInvitationGroupAssoc toPartyInvitationGroupAssoc) {
        if (this.toPartyInvitationGroupAssocs == null) {
            return;
        }
        this.toPartyInvitationGroupAssocs.remove(toPartyInvitationGroupAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearToPartyInvitationGroupAssoc() {
        if (this.toPartyInvitationGroupAssocs == null) {
            return;
        }
        this.toPartyInvitationGroupAssocs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProdCatalogRole(ProdCatalogRole prodCatalogRole) {
        if (this.prodCatalogRoles == null) {
            this.prodCatalogRoles = new ArrayList<ProdCatalogRole>();
        }
        this.prodCatalogRoles.add(prodCatalogRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProdCatalogRole(ProdCatalogRole prodCatalogRole) {
        if (this.prodCatalogRoles == null) {
            return;
        }
        this.prodCatalogRoles.remove(prodCatalogRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProdCatalogRole() {
        if (this.prodCatalogRoles == null) {
            return;
        }
        this.prodCatalogRoles.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStoreRole(ProductStoreRole productStoreRole) {
        if (this.productStoreRoles == null) {
            this.productStoreRoles = new ArrayList<ProductStoreRole>();
        }
        this.productStoreRoles.add(productStoreRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStoreRole(ProductStoreRole productStoreRole) {
        if (this.productStoreRoles == null) {
            return;
        }
        this.productStoreRoles.remove(productStoreRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStoreRole() {
        if (this.productStoreRoles == null) {
            return;
        }
        this.productStoreRoles.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addWebSiteRole(WebSiteRole webSiteRole) {
        if (this.webSiteRoles == null) {
            this.webSiteRoles = new ArrayList<WebSiteRole>();
        }
        this.webSiteRoles.add(webSiteRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWebSiteRole(WebSiteRole webSiteRole) {
        if (this.webSiteRoles == null) {
            return;
        }
        this.webSiteRoles.remove(webSiteRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWebSiteRole() {
        if (this.webSiteRoles == null) {
            return;
        }
        this.webSiteRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setGroupName((String) mapValue.get("groupName"));
        setGroupNameLocal((String) mapValue.get("groupNameLocal"));
        setOfficeSiteName((String) mapValue.get("officeSiteName"));
        setComments((String) mapValue.get("comments"));
        setLogoImageUrl((String) mapValue.get("logoImageUrl"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setIsIncorporated((String) mapValue.get("isIncorporated"));
        setFederalTaxId((String) mapValue.get("federalTaxId"));
        setRequires1099((String) mapValue.get("requires1099"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("groupName", getGroupName());
        mapValue.put("groupNameLocal", getGroupNameLocal());
        mapValue.put("officeSiteName", getOfficeSiteName());
        mapValue.put("comments", getComments());
        mapValue.put("logoImageUrl", getLogoImageUrl());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("isIncorporated", getIsIncorporated());
        mapValue.put("federalTaxId", getFederalTaxId());
        mapValue.put("requires1099", getRequires1099());
        return mapValue;
    }


}
