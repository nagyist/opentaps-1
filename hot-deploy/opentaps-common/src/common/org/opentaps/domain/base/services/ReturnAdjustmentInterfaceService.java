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

import java.math.BigDecimal;
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
 * Return Adjustment Interface.
 * Auto generated base service entity returnAdjustmentInterface.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services_return.xml
 */
public class ReturnAdjustmentInterfaceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "returnAdjustmentInterface";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        amount("amount"),
        comments("comments"),
        correspondingProductId("correspondingProductId"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        customerReferenceId("customerReferenceId"),
        description("description"),
        exemptAmount("exemptAmount"),
        includeInShipping("includeInShipping"),
        includeInTax("includeInTax"),
        locale("locale"),
        orderAdjustmentId("orderAdjustmentId"),
        overrideGlAccountId("overrideGlAccountId"),
        primaryGeoId("primaryGeoId"),
        productFeatureId("productFeatureId"),
        productPromoActionSeqId("productPromoActionSeqId"),
        productPromoId("productPromoId"),
        productPromoRuleId("productPromoRuleId"),
        returnAdjustmentId("returnAdjustmentId"),
        returnAdjustmentTypeId("returnAdjustmentTypeId"),
        returnId("returnId"),
        returnItemSeqId("returnItemSeqId"),
        returnTypeId("returnTypeId"),
        secondaryGeoId("secondaryGeoId"),
        shipGroupSeqId("shipGroupSeqId"),
        sourcePercentage("sourcePercentage"),
        sourceReferenceId("sourceReferenceId"),
        taxAuthGeoId("taxAuthGeoId"),
        taxAuthPartyId("taxAuthPartyId"),
        taxAuthorityRateSeqId("taxAuthorityRateSeqId"),
        timeZone("timeZone"),
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
     * Creates a new <code>ReturnAdjustmentInterfaceService</code> instance.
     */
    public ReturnAdjustmentInterfaceService() {
        super();
    }


    private BigDecimal inAmount;
    private String inComments;
    private String inCorrespondingProductId;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inCustomerReferenceId;
    private String inDescription;
    private BigDecimal inExemptAmount;
    private String inIncludeInShipping;
    private String inIncludeInTax;
    private Locale inLocale;
    private String inOrderAdjustmentId;
    private String inOverrideGlAccountId;
    private String inPrimaryGeoId;
    private String inProductFeatureId;
    private String inProductPromoActionSeqId;
    private String inProductPromoId;
    private String inProductPromoRuleId;
    private String inReturnAdjustmentId;
    private String inReturnAdjustmentTypeId;
    private String inReturnId;
    private String inReturnItemSeqId;
    private String inReturnTypeId;
    private String inSecondaryGeoId;
    private String inShipGroupSeqId;
    private BigDecimal inSourcePercentage;
    private String inSourceReferenceId;
    private String inTaxAuthGeoId;
    private String inTaxAuthPartyId;
    private String inTaxAuthorityRateSeqId;
    private TimeZone inTimeZone;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmount() {
        return this.inAmount;
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
    public String getInCorrespondingProductId() {
        return this.inCorrespondingProductId;
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
    public String getInCustomerReferenceId() {
        return this.inCustomerReferenceId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInExemptAmount() {
        return this.inExemptAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIncludeInShipping() {
        return this.inIncludeInShipping;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIncludeInTax() {
        return this.inIncludeInTax;
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
    public String getInOrderAdjustmentId() {
        return this.inOrderAdjustmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOverrideGlAccountId() {
        return this.inOverrideGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryGeoId() {
        return this.inPrimaryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductFeatureId() {
        return this.inProductFeatureId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductPromoActionSeqId() {
        return this.inProductPromoActionSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductPromoId() {
        return this.inProductPromoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductPromoRuleId() {
        return this.inProductPromoRuleId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnAdjustmentId() {
        return this.inReturnAdjustmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnAdjustmentTypeId() {
        return this.inReturnAdjustmentTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnId() {
        return this.inReturnId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnItemSeqId() {
        return this.inReturnItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnTypeId() {
        return this.inReturnTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSecondaryGeoId() {
        return this.inSecondaryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSourcePercentage() {
        return this.inSourcePercentage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSourceReferenceId() {
        return this.inSourceReferenceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthGeoId() {
        return this.inTaxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthPartyId() {
        return this.inTaxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthorityRateSeqId() {
        return this.inTaxAuthorityRateSeqId;
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
     * @param inAmount the inAmount to set
    */
    public void setInAmount(BigDecimal inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
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
     * @param inCorrespondingProductId the inCorrespondingProductId to set
    */
    public void setInCorrespondingProductId(String inCorrespondingProductId) {
        this.inParameters.add("correspondingProductId");
        this.inCorrespondingProductId = inCorrespondingProductId;
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
     * @param inCustomerReferenceId the inCustomerReferenceId to set
    */
    public void setInCustomerReferenceId(String inCustomerReferenceId) {
        this.inParameters.add("customerReferenceId");
        this.inCustomerReferenceId = inCustomerReferenceId;
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
     * @param inExemptAmount the inExemptAmount to set
    */
    public void setInExemptAmount(BigDecimal inExemptAmount) {
        this.inParameters.add("exemptAmount");
        this.inExemptAmount = inExemptAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIncludeInShipping the inIncludeInShipping to set
    */
    public void setInIncludeInShipping(String inIncludeInShipping) {
        this.inParameters.add("includeInShipping");
        this.inIncludeInShipping = inIncludeInShipping;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIncludeInTax the inIncludeInTax to set
    */
    public void setInIncludeInTax(String inIncludeInTax) {
        this.inParameters.add("includeInTax");
        this.inIncludeInTax = inIncludeInTax;
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
     * @param inOrderAdjustmentId the inOrderAdjustmentId to set
    */
    public void setInOrderAdjustmentId(String inOrderAdjustmentId) {
        this.inParameters.add("orderAdjustmentId");
        this.inOrderAdjustmentId = inOrderAdjustmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOverrideGlAccountId the inOverrideGlAccountId to set
    */
    public void setInOverrideGlAccountId(String inOverrideGlAccountId) {
        this.inParameters.add("overrideGlAccountId");
        this.inOverrideGlAccountId = inOverrideGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryGeoId the inPrimaryGeoId to set
    */
    public void setInPrimaryGeoId(String inPrimaryGeoId) {
        this.inParameters.add("primaryGeoId");
        this.inPrimaryGeoId = inPrimaryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductFeatureId the inProductFeatureId to set
    */
    public void setInProductFeatureId(String inProductFeatureId) {
        this.inParameters.add("productFeatureId");
        this.inProductFeatureId = inProductFeatureId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductPromoActionSeqId the inProductPromoActionSeqId to set
    */
    public void setInProductPromoActionSeqId(String inProductPromoActionSeqId) {
        this.inParameters.add("productPromoActionSeqId");
        this.inProductPromoActionSeqId = inProductPromoActionSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductPromoId the inProductPromoId to set
    */
    public void setInProductPromoId(String inProductPromoId) {
        this.inParameters.add("productPromoId");
        this.inProductPromoId = inProductPromoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductPromoRuleId the inProductPromoRuleId to set
    */
    public void setInProductPromoRuleId(String inProductPromoRuleId) {
        this.inParameters.add("productPromoRuleId");
        this.inProductPromoRuleId = inProductPromoRuleId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnAdjustmentId the inReturnAdjustmentId to set
    */
    public void setInReturnAdjustmentId(String inReturnAdjustmentId) {
        this.inParameters.add("returnAdjustmentId");
        this.inReturnAdjustmentId = inReturnAdjustmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnAdjustmentTypeId the inReturnAdjustmentTypeId to set
    */
    public void setInReturnAdjustmentTypeId(String inReturnAdjustmentTypeId) {
        this.inParameters.add("returnAdjustmentTypeId");
        this.inReturnAdjustmentTypeId = inReturnAdjustmentTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnId the inReturnId to set
    */
    public void setInReturnId(String inReturnId) {
        this.inParameters.add("returnId");
        this.inReturnId = inReturnId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnItemSeqId the inReturnItemSeqId to set
    */
    public void setInReturnItemSeqId(String inReturnItemSeqId) {
        this.inParameters.add("returnItemSeqId");
        this.inReturnItemSeqId = inReturnItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnTypeId the inReturnTypeId to set
    */
    public void setInReturnTypeId(String inReturnTypeId) {
        this.inParameters.add("returnTypeId");
        this.inReturnTypeId = inReturnTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSecondaryGeoId the inSecondaryGeoId to set
    */
    public void setInSecondaryGeoId(String inSecondaryGeoId) {
        this.inParameters.add("secondaryGeoId");
        this.inSecondaryGeoId = inSecondaryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSourcePercentage the inSourcePercentage to set
    */
    public void setInSourcePercentage(BigDecimal inSourcePercentage) {
        this.inParameters.add("sourcePercentage");
        this.inSourcePercentage = inSourcePercentage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSourceReferenceId the inSourceReferenceId to set
    */
    public void setInSourceReferenceId(String inSourceReferenceId) {
        this.inParameters.add("sourceReferenceId");
        this.inSourceReferenceId = inSourceReferenceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthGeoId the inTaxAuthGeoId to set
    */
    public void setInTaxAuthGeoId(String inTaxAuthGeoId) {
        this.inParameters.add("taxAuthGeoId");
        this.inTaxAuthGeoId = inTaxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthPartyId the inTaxAuthPartyId to set
    */
    public void setInTaxAuthPartyId(String inTaxAuthPartyId) {
        this.inParameters.add("taxAuthPartyId");
        this.inTaxAuthPartyId = inTaxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthorityRateSeqId the inTaxAuthorityRateSeqId to set
    */
    public void setInTaxAuthorityRateSeqId(String inTaxAuthorityRateSeqId) {
        this.inParameters.add("taxAuthorityRateSeqId");
        this.inTaxAuthorityRateSeqId = inTaxAuthorityRateSeqId;
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
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("correspondingProductId")) mapValue.put("correspondingProductId", getInCorrespondingProductId());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("customerReferenceId")) mapValue.put("customerReferenceId", getInCustomerReferenceId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("exemptAmount")) mapValue.put("exemptAmount", getInExemptAmount());
        if (inParameters.contains("includeInShipping")) mapValue.put("includeInShipping", getInIncludeInShipping());
        if (inParameters.contains("includeInTax")) mapValue.put("includeInTax", getInIncludeInTax());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderAdjustmentId")) mapValue.put("orderAdjustmentId", getInOrderAdjustmentId());
        if (inParameters.contains("overrideGlAccountId")) mapValue.put("overrideGlAccountId", getInOverrideGlAccountId());
        if (inParameters.contains("primaryGeoId")) mapValue.put("primaryGeoId", getInPrimaryGeoId());
        if (inParameters.contains("productFeatureId")) mapValue.put("productFeatureId", getInProductFeatureId());
        if (inParameters.contains("productPromoActionSeqId")) mapValue.put("productPromoActionSeqId", getInProductPromoActionSeqId());
        if (inParameters.contains("productPromoId")) mapValue.put("productPromoId", getInProductPromoId());
        if (inParameters.contains("productPromoRuleId")) mapValue.put("productPromoRuleId", getInProductPromoRuleId());
        if (inParameters.contains("returnAdjustmentId")) mapValue.put("returnAdjustmentId", getInReturnAdjustmentId());
        if (inParameters.contains("returnAdjustmentTypeId")) mapValue.put("returnAdjustmentTypeId", getInReturnAdjustmentTypeId());
        if (inParameters.contains("returnId")) mapValue.put("returnId", getInReturnId());
        if (inParameters.contains("returnItemSeqId")) mapValue.put("returnItemSeqId", getInReturnItemSeqId());
        if (inParameters.contains("returnTypeId")) mapValue.put("returnTypeId", getInReturnTypeId());
        if (inParameters.contains("secondaryGeoId")) mapValue.put("secondaryGeoId", getInSecondaryGeoId());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
        if (inParameters.contains("sourcePercentage")) mapValue.put("sourcePercentage", getInSourcePercentage());
        if (inParameters.contains("sourceReferenceId")) mapValue.put("sourceReferenceId", getInSourceReferenceId());
        if (inParameters.contains("taxAuthGeoId")) mapValue.put("taxAuthGeoId", getInTaxAuthGeoId());
        if (inParameters.contains("taxAuthPartyId")) mapValue.put("taxAuthPartyId", getInTaxAuthPartyId());
        if (inParameters.contains("taxAuthorityRateSeqId")) mapValue.put("taxAuthorityRateSeqId", getInTaxAuthorityRateSeqId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
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
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("correspondingProductId")) setInCorrespondingProductId((String) mapValue.get("correspondingProductId"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("customerReferenceId")) setInCustomerReferenceId((String) mapValue.get("customerReferenceId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("exemptAmount")) setInExemptAmount((BigDecimal) mapValue.get("exemptAmount"));
        if (mapValue.containsKey("includeInShipping")) setInIncludeInShipping((String) mapValue.get("includeInShipping"));
        if (mapValue.containsKey("includeInTax")) setInIncludeInTax((String) mapValue.get("includeInTax"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderAdjustmentId")) setInOrderAdjustmentId((String) mapValue.get("orderAdjustmentId"));
        if (mapValue.containsKey("overrideGlAccountId")) setInOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        if (mapValue.containsKey("primaryGeoId")) setInPrimaryGeoId((String) mapValue.get("primaryGeoId"));
        if (mapValue.containsKey("productFeatureId")) setInProductFeatureId((String) mapValue.get("productFeatureId"));
        if (mapValue.containsKey("productPromoActionSeqId")) setInProductPromoActionSeqId((String) mapValue.get("productPromoActionSeqId"));
        if (mapValue.containsKey("productPromoId")) setInProductPromoId((String) mapValue.get("productPromoId"));
        if (mapValue.containsKey("productPromoRuleId")) setInProductPromoRuleId((String) mapValue.get("productPromoRuleId"));
        if (mapValue.containsKey("returnAdjustmentId")) setInReturnAdjustmentId((String) mapValue.get("returnAdjustmentId"));
        if (mapValue.containsKey("returnAdjustmentTypeId")) setInReturnAdjustmentTypeId((String) mapValue.get("returnAdjustmentTypeId"));
        if (mapValue.containsKey("returnId")) setInReturnId((String) mapValue.get("returnId"));
        if (mapValue.containsKey("returnItemSeqId")) setInReturnItemSeqId((String) mapValue.get("returnItemSeqId"));
        if (mapValue.containsKey("returnTypeId")) setInReturnTypeId((String) mapValue.get("returnTypeId"));
        if (mapValue.containsKey("secondaryGeoId")) setInSecondaryGeoId((String) mapValue.get("secondaryGeoId"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("sourcePercentage")) setInSourcePercentage((BigDecimal) mapValue.get("sourcePercentage"));
        if (mapValue.containsKey("sourceReferenceId")) setInSourceReferenceId((String) mapValue.get("sourceReferenceId"));
        if (mapValue.containsKey("taxAuthGeoId")) setInTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        if (mapValue.containsKey("taxAuthPartyId")) setInTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        if (mapValue.containsKey("taxAuthorityRateSeqId")) setInTaxAuthorityRateSeqId((String) mapValue.get("taxAuthorityRateSeqId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
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
     * Construct a <code>ReturnAdjustmentInterfaceService</code> from the input values of the given <code>ReturnAdjustmentInterfaceService</code>.
     * @param input a <code>ReturnAdjustmentInterfaceService</code>
     */
    public static ReturnAdjustmentInterfaceService fromInput(ReturnAdjustmentInterfaceService input) {
        ReturnAdjustmentInterfaceService service = new ReturnAdjustmentInterfaceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ReturnAdjustmentInterfaceService</code> from the output values of the given <code>ReturnAdjustmentInterfaceService</code>.
     * @param output a <code>ReturnAdjustmentInterfaceService</code>
     */
    public static ReturnAdjustmentInterfaceService fromOutput(ReturnAdjustmentInterfaceService output) {
        ReturnAdjustmentInterfaceService service = new ReturnAdjustmentInterfaceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ReturnAdjustmentInterfaceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ReturnAdjustmentInterfaceService fromInput(Map<String, Object> mapValue) {
        ReturnAdjustmentInterfaceService service = new ReturnAdjustmentInterfaceService();
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
     * Construct a <code>ReturnAdjustmentInterfaceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ReturnAdjustmentInterfaceService fromOutput(Map<String, Object> mapValue) {
        ReturnAdjustmentInterfaceService service = new ReturnAdjustmentInterfaceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
