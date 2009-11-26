package org.opentaps.domain.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update a TrackingCode record.
 * Auto generated base service entity updateTrackingCode.
 *
 * Engine: simple
 * Location: component://marketing/script/org/ofbiz/marketing/tracking/TrackingCodeServices.xml
 * Invoke: updateTrackingCode
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/marketing/servicedef/services.xml
 */
public class UpdateTrackingCodeService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateTrackingCode";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billableLifetime("billableLifetime"),
        campaignListId("campaignListId"),
        comments("comments"),
        contactListId("contactListId"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        description("description"),
        dnis("dnis"),
        fromDate("fromDate"),
        groupId("groupId"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        locale("locale"),
        marketingCampaignId("marketingCampaignId"),
        overrideCss("overrideCss"),
        overrideLogo("overrideLogo"),
        prodCatalogId("prodCatalogId"),
        redirectUrl("redirectUrl"),
        subgroupId("subgroupId"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        trackableLifetime("trackableLifetime"),
        trackingCodeId("trackingCodeId"),
        trackingCodeTypeId("trackingCodeTypeId"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateTrackingCodeService</code> instance.
     */
    public UpdateTrackingCodeService() {
        super();
    }

    /**
     * Creates a new <code>UpdateTrackingCodeService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateTrackingCodeService(User user) {
        super(user);
    }

    private Long inBillableLifetime;
    private String inCampaignListId;
    private String inComments;
    private String inContactListId;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inDescription;
    private String inDnis;
    private Timestamp inFromDate;
    private String inGroupId;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Locale inLocale;
    private String inMarketingCampaignId;
    private String inOverrideCss;
    private String inOverrideLogo;
    private String inProdCatalogId;
    private String inRedirectUrl;
    private String inSubgroupId;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private Long inTrackableLifetime;
    private String inTrackingCodeId;
    private String inTrackingCodeTypeId;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInBillableLifetime() {
        return this.inBillableLifetime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCampaignListId() {
        return this.inCampaignListId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactListId() {
        return this.inContactListId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCreatedDate() {
        return this.inCreatedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDnis() {
        return this.inDnis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupId() {
        return this.inGroupId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastModifiedDate() {
        return this.inLastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInMarketingCampaignId() {
        return this.inMarketingCampaignId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOverrideCss() {
        return this.inOverrideCss;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOverrideLogo() {
        return this.inOverrideLogo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProdCatalogId() {
        return this.inProdCatalogId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRedirectUrl() {
        return this.inRedirectUrl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSubgroupId() {
        return this.inSubgroupId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTrackableLifetime() {
        return this.inTrackableLifetime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTrackingCodeId() {
        return this.inTrackingCodeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTrackingCodeTypeId() {
        return this.inTrackingCodeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillableLifetime the inBillableLifetime to set
    */
    public void setInBillableLifetime(Long inBillableLifetime) {
        this.inParameters.add("billableLifetime");
        this.inBillableLifetime = inBillableLifetime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCampaignListId the inCampaignListId to set
    */
    public void setInCampaignListId(String inCampaignListId) {
        this.inParameters.add("campaignListId");
        this.inCampaignListId = inCampaignListId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactListId the inContactListId to set
    */
    public void setInContactListId(String inContactListId) {
        this.inParameters.add("contactListId");
        this.inContactListId = inContactListId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedDate the inCreatedDate to set
    */
    public void setInCreatedDate(Timestamp inCreatedDate) {
        this.inParameters.add("createdDate");
        this.inCreatedDate = inCreatedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDnis the inDnis to set
    */
    public void setInDnis(String inDnis) {
        this.inParameters.add("dnis");
        this.inDnis = inDnis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupId the inGroupId to set
    */
    public void setInGroupId(String inGroupId) {
        this.inParameters.add("groupId");
        this.inGroupId = inGroupId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedDate the inLastModifiedDate to set
    */
    public void setInLastModifiedDate(Timestamp inLastModifiedDate) {
        this.inParameters.add("lastModifiedDate");
        this.inLastModifiedDate = inLastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMarketingCampaignId the inMarketingCampaignId to set
    */
    public void setInMarketingCampaignId(String inMarketingCampaignId) {
        this.inParameters.add("marketingCampaignId");
        this.inMarketingCampaignId = inMarketingCampaignId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOverrideCss the inOverrideCss to set
    */
    public void setInOverrideCss(String inOverrideCss) {
        this.inParameters.add("overrideCss");
        this.inOverrideCss = inOverrideCss;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOverrideLogo the inOverrideLogo to set
    */
    public void setInOverrideLogo(String inOverrideLogo) {
        this.inParameters.add("overrideLogo");
        this.inOverrideLogo = inOverrideLogo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProdCatalogId the inProdCatalogId to set
    */
    public void setInProdCatalogId(String inProdCatalogId) {
        this.inParameters.add("prodCatalogId");
        this.inProdCatalogId = inProdCatalogId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRedirectUrl the inRedirectUrl to set
    */
    public void setInRedirectUrl(String inRedirectUrl) {
        this.inParameters.add("redirectUrl");
        this.inRedirectUrl = inRedirectUrl;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSubgroupId the inSubgroupId to set
    */
    public void setInSubgroupId(String inSubgroupId) {
        this.inParameters.add("subgroupId");
        this.inSubgroupId = inSubgroupId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTrackableLifetime the inTrackableLifetime to set
    */
    public void setInTrackableLifetime(Long inTrackableLifetime) {
        this.inParameters.add("trackableLifetime");
        this.inTrackableLifetime = inTrackableLifetime;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTrackingCodeId the inTrackingCodeId to set
    */
    public void setInTrackingCodeId(String inTrackingCodeId) {
        this.inParameters.add("trackingCodeId");
        this.inTrackingCodeId = inTrackingCodeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTrackingCodeTypeId the inTrackingCodeTypeId to set
    */
    public void setInTrackingCodeTypeId(String inTrackingCodeTypeId) {
        this.inParameters.add("trackingCodeTypeId");
        this.inTrackingCodeTypeId = inTrackingCodeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("billableLifetime")) mapValue.put("billableLifetime", getInBillableLifetime());
        if (inParameters.contains("campaignListId")) mapValue.put("campaignListId", getInCampaignListId());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("contactListId")) mapValue.put("contactListId", getInContactListId());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("dnis")) mapValue.put("dnis", getInDnis());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("groupId")) mapValue.put("groupId", getInGroupId());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("marketingCampaignId")) mapValue.put("marketingCampaignId", getInMarketingCampaignId());
        if (inParameters.contains("overrideCss")) mapValue.put("overrideCss", getInOverrideCss());
        if (inParameters.contains("overrideLogo")) mapValue.put("overrideLogo", getInOverrideLogo());
        if (inParameters.contains("prodCatalogId")) mapValue.put("prodCatalogId", getInProdCatalogId());
        if (inParameters.contains("redirectUrl")) mapValue.put("redirectUrl", getInRedirectUrl());
        if (inParameters.contains("subgroupId")) mapValue.put("subgroupId", getInSubgroupId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("trackableLifetime")) mapValue.put("trackableLifetime", getInTrackableLifetime());
        if (inParameters.contains("trackingCodeId")) mapValue.put("trackingCodeId", getInTrackingCodeId());
        if (inParameters.contains("trackingCodeTypeId")) mapValue.put("trackingCodeTypeId", getInTrackingCodeTypeId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("billableLifetime")) setInBillableLifetime((Long) mapValue.get("billableLifetime"));
        if (mapValue.containsKey("campaignListId")) setInCampaignListId((String) mapValue.get("campaignListId"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("contactListId")) setInContactListId((String) mapValue.get("contactListId"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("dnis")) setInDnis((String) mapValue.get("dnis"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("groupId")) setInGroupId((String) mapValue.get("groupId"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("marketingCampaignId")) setInMarketingCampaignId((String) mapValue.get("marketingCampaignId"));
        if (mapValue.containsKey("overrideCss")) setInOverrideCss((String) mapValue.get("overrideCss"));
        if (mapValue.containsKey("overrideLogo")) setInOverrideLogo((String) mapValue.get("overrideLogo"));
        if (mapValue.containsKey("prodCatalogId")) setInProdCatalogId((String) mapValue.get("prodCatalogId"));
        if (mapValue.containsKey("redirectUrl")) setInRedirectUrl((String) mapValue.get("redirectUrl"));
        if (mapValue.containsKey("subgroupId")) setInSubgroupId((String) mapValue.get("subgroupId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("trackableLifetime")) setInTrackableLifetime((Long) mapValue.get("trackableLifetime"));
        if (mapValue.containsKey("trackingCodeId")) setInTrackingCodeId((String) mapValue.get("trackingCodeId"));
        if (mapValue.containsKey("trackingCodeTypeId")) setInTrackingCodeTypeId((String) mapValue.get("trackingCodeTypeId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateTrackingCodeService</code> from the input values of the given <code>UpdateTrackingCodeService</code>.
     * @param input a <code>UpdateTrackingCodeService</code>
     */
    public static UpdateTrackingCodeService fromInput(UpdateTrackingCodeService input) {
        UpdateTrackingCodeService service = new UpdateTrackingCodeService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateTrackingCodeService</code> from the output values of the given <code>UpdateTrackingCodeService</code>.
     * @param output a <code>UpdateTrackingCodeService</code>
     */
    public static UpdateTrackingCodeService fromOutput(UpdateTrackingCodeService output) {
        UpdateTrackingCodeService service = new UpdateTrackingCodeService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateTrackingCodeService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateTrackingCodeService fromInput(Map<String, Object> mapValue) {
        UpdateTrackingCodeService service = new UpdateTrackingCodeService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateTrackingCodeService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateTrackingCodeService fromOutput(Map<String, Object> mapValue) {
        UpdateTrackingCodeService service = new UpdateTrackingCodeService();
        service.putAllOutput(mapValue);
        return service;
    }
}
