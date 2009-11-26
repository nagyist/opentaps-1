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
 * Helper service to create the primary phone number, primary email, primary web url, and general correspondence postal address for a party. 
            The userLogin must have CRMSFA_ACCOUNT_CREATE permission on this party..
 * Auto generated base service entity crmsfa.createBasicContactInfoForParty.
 *
 * Engine: java
 * Location: com.opensourcestrategies.crmsfa.party.PartyContactServices
 * Invoke: createBasicContactInfoForParty
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/crmsfa/servicedef/services_party.xml
 */
public class CrmsfaCreateBasicContactInfoForPartyService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.createBasicContactInfoForParty";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        generalAddress1("generalAddress1"),
        generalAddress2("generalAddress2"),
        generalAttnName("generalAttnName"),
        generalCity("generalCity"),
        generalCountryGeoId("generalCountryGeoId"),
        generalPostalCode("generalPostalCode"),
        generalPostalCodeExt("generalPostalCodeExt"),
        generalStateProvinceGeoId("generalStateProvinceGeoId"),
        generalToName("generalToName"),
        locale("locale"),
        partyId("partyId"),
        primaryEmail("primaryEmail"),
        primaryPhoneAreaCode("primaryPhoneAreaCode"),
        primaryPhoneAskForName("primaryPhoneAskForName"),
        primaryPhoneCountryCode("primaryPhoneCountryCode"),
        primaryPhoneExtension("primaryPhoneExtension"),
        primaryPhoneNumber("primaryPhoneNumber"),
        primaryWebUrl("primaryWebUrl"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        generalAddressContactMechId("generalAddressContactMechId"),
        locale("locale"),
        primaryEmailContactMechId("primaryEmailContactMechId"),
        primaryPhoneContactMechId("primaryPhoneContactMechId"),
        primaryWebUrlContactMechId("primaryWebUrlContactMechId"),
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
     * Creates a new <code>CrmsfaCreateBasicContactInfoForPartyService</code> instance.
     */
    public CrmsfaCreateBasicContactInfoForPartyService() {
        super();
    }

    /**
     * Creates a new <code>CrmsfaCreateBasicContactInfoForPartyService</code> instance.
     * @param user an <code>User</code> value
     */
    public CrmsfaCreateBasicContactInfoForPartyService(User user) {
        super(user);
    }

    private String inGeneralAddress1;
    private String inGeneralAddress2;
    private String inGeneralAttnName;
    private String inGeneralCity;
    private String inGeneralCountryGeoId;
    private String inGeneralPostalCode;
    private String inGeneralPostalCodeExt;
    private String inGeneralStateProvinceGeoId;
    private String inGeneralToName;
    private Locale inLocale;
    private String inPartyId;
    private String inPrimaryEmail;
    private String inPrimaryPhoneAreaCode;
    private String inPrimaryPhoneAskForName;
    private String inPrimaryPhoneCountryCode;
    private String inPrimaryPhoneExtension;
    private String inPrimaryPhoneNumber;
    private String inPrimaryWebUrl;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outGeneralAddressContactMechId;
    private Locale outLocale;
    private String outPrimaryEmailContactMechId;
    private String outPrimaryPhoneContactMechId;
    private String outPrimaryWebUrlContactMechId;
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
     * @return <code>String</code>
     */
    public String getInGeneralAddress1() {
        return this.inGeneralAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralAddress2() {
        return this.inGeneralAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralAttnName() {
        return this.inGeneralAttnName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralCity() {
        return this.inGeneralCity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralCountryGeoId() {
        return this.inGeneralCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralPostalCode() {
        return this.inGeneralPostalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralPostalCodeExt() {
        return this.inGeneralPostalCodeExt;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralStateProvinceGeoId() {
        return this.inGeneralStateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralToName() {
        return this.inGeneralToName;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryEmail() {
        return this.inPrimaryEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneAreaCode() {
        return this.inPrimaryPhoneAreaCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneAskForName() {
        return this.inPrimaryPhoneAskForName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneCountryCode() {
        return this.inPrimaryPhoneCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneExtension() {
        return this.inPrimaryPhoneExtension;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneNumber() {
        return this.inPrimaryPhoneNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryWebUrl() {
        return this.inPrimaryWebUrl;
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
     * @return <code>String</code>
     */
    public String getOutGeneralAddressContactMechId() {
        return this.outGeneralAddressContactMechId;
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
    public String getOutPrimaryEmailContactMechId() {
        return this.outPrimaryEmailContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutPrimaryPhoneContactMechId() {
        return this.outPrimaryPhoneContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutPrimaryWebUrlContactMechId() {
        return this.outPrimaryWebUrlContactMechId;
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
     * @param inGeneralAddress1 the inGeneralAddress1 to set
    */
    public void setInGeneralAddress1(String inGeneralAddress1) {
        this.inParameters.add("generalAddress1");
        this.inGeneralAddress1 = inGeneralAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralAddress2 the inGeneralAddress2 to set
    */
    public void setInGeneralAddress2(String inGeneralAddress2) {
        this.inParameters.add("generalAddress2");
        this.inGeneralAddress2 = inGeneralAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralAttnName the inGeneralAttnName to set
    */
    public void setInGeneralAttnName(String inGeneralAttnName) {
        this.inParameters.add("generalAttnName");
        this.inGeneralAttnName = inGeneralAttnName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralCity the inGeneralCity to set
    */
    public void setInGeneralCity(String inGeneralCity) {
        this.inParameters.add("generalCity");
        this.inGeneralCity = inGeneralCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralCountryGeoId the inGeneralCountryGeoId to set
    */
    public void setInGeneralCountryGeoId(String inGeneralCountryGeoId) {
        this.inParameters.add("generalCountryGeoId");
        this.inGeneralCountryGeoId = inGeneralCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralPostalCode the inGeneralPostalCode to set
    */
    public void setInGeneralPostalCode(String inGeneralPostalCode) {
        this.inParameters.add("generalPostalCode");
        this.inGeneralPostalCode = inGeneralPostalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralPostalCodeExt the inGeneralPostalCodeExt to set
    */
    public void setInGeneralPostalCodeExt(String inGeneralPostalCodeExt) {
        this.inParameters.add("generalPostalCodeExt");
        this.inGeneralPostalCodeExt = inGeneralPostalCodeExt;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralStateProvinceGeoId the inGeneralStateProvinceGeoId to set
    */
    public void setInGeneralStateProvinceGeoId(String inGeneralStateProvinceGeoId) {
        this.inParameters.add("generalStateProvinceGeoId");
        this.inGeneralStateProvinceGeoId = inGeneralStateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralToName the inGeneralToName to set
    */
    public void setInGeneralToName(String inGeneralToName) {
        this.inParameters.add("generalToName");
        this.inGeneralToName = inGeneralToName;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryEmail the inPrimaryEmail to set
    */
    public void setInPrimaryEmail(String inPrimaryEmail) {
        this.inParameters.add("primaryEmail");
        this.inPrimaryEmail = inPrimaryEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneAreaCode the inPrimaryPhoneAreaCode to set
    */
    public void setInPrimaryPhoneAreaCode(String inPrimaryPhoneAreaCode) {
        this.inParameters.add("primaryPhoneAreaCode");
        this.inPrimaryPhoneAreaCode = inPrimaryPhoneAreaCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneAskForName the inPrimaryPhoneAskForName to set
    */
    public void setInPrimaryPhoneAskForName(String inPrimaryPhoneAskForName) {
        this.inParameters.add("primaryPhoneAskForName");
        this.inPrimaryPhoneAskForName = inPrimaryPhoneAskForName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneCountryCode the inPrimaryPhoneCountryCode to set
    */
    public void setInPrimaryPhoneCountryCode(String inPrimaryPhoneCountryCode) {
        this.inParameters.add("primaryPhoneCountryCode");
        this.inPrimaryPhoneCountryCode = inPrimaryPhoneCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneExtension the inPrimaryPhoneExtension to set
    */
    public void setInPrimaryPhoneExtension(String inPrimaryPhoneExtension) {
        this.inParameters.add("primaryPhoneExtension");
        this.inPrimaryPhoneExtension = inPrimaryPhoneExtension;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneNumber the inPrimaryPhoneNumber to set
    */
    public void setInPrimaryPhoneNumber(String inPrimaryPhoneNumber) {
        this.inParameters.add("primaryPhoneNumber");
        this.inPrimaryPhoneNumber = inPrimaryPhoneNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryWebUrl the inPrimaryWebUrl to set
    */
    public void setInPrimaryWebUrl(String inPrimaryWebUrl) {
        this.inParameters.add("primaryWebUrl");
        this.inPrimaryWebUrl = inPrimaryWebUrl;
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
     * @param outGeneralAddressContactMechId the outGeneralAddressContactMechId to set
    */
    public void setOutGeneralAddressContactMechId(String outGeneralAddressContactMechId) {
        this.outParameters.add("generalAddressContactMechId");
        this.outGeneralAddressContactMechId = outGeneralAddressContactMechId;
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
     * @param outPrimaryEmailContactMechId the outPrimaryEmailContactMechId to set
    */
    public void setOutPrimaryEmailContactMechId(String outPrimaryEmailContactMechId) {
        this.outParameters.add("primaryEmailContactMechId");
        this.outPrimaryEmailContactMechId = outPrimaryEmailContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPrimaryPhoneContactMechId the outPrimaryPhoneContactMechId to set
    */
    public void setOutPrimaryPhoneContactMechId(String outPrimaryPhoneContactMechId) {
        this.outParameters.add("primaryPhoneContactMechId");
        this.outPrimaryPhoneContactMechId = outPrimaryPhoneContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPrimaryWebUrlContactMechId the outPrimaryWebUrlContactMechId to set
    */
    public void setOutPrimaryWebUrlContactMechId(String outPrimaryWebUrlContactMechId) {
        this.outParameters.add("primaryWebUrlContactMechId");
        this.outPrimaryWebUrlContactMechId = outPrimaryWebUrlContactMechId;
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
        if (inParameters.contains("generalAddress1")) mapValue.put("generalAddress1", getInGeneralAddress1());
        if (inParameters.contains("generalAddress2")) mapValue.put("generalAddress2", getInGeneralAddress2());
        if (inParameters.contains("generalAttnName")) mapValue.put("generalAttnName", getInGeneralAttnName());
        if (inParameters.contains("generalCity")) mapValue.put("generalCity", getInGeneralCity());
        if (inParameters.contains("generalCountryGeoId")) mapValue.put("generalCountryGeoId", getInGeneralCountryGeoId());
        if (inParameters.contains("generalPostalCode")) mapValue.put("generalPostalCode", getInGeneralPostalCode());
        if (inParameters.contains("generalPostalCodeExt")) mapValue.put("generalPostalCodeExt", getInGeneralPostalCodeExt());
        if (inParameters.contains("generalStateProvinceGeoId")) mapValue.put("generalStateProvinceGeoId", getInGeneralStateProvinceGeoId());
        if (inParameters.contains("generalToName")) mapValue.put("generalToName", getInGeneralToName());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("primaryEmail")) mapValue.put("primaryEmail", getInPrimaryEmail());
        if (inParameters.contains("primaryPhoneAreaCode")) mapValue.put("primaryPhoneAreaCode", getInPrimaryPhoneAreaCode());
        if (inParameters.contains("primaryPhoneAskForName")) mapValue.put("primaryPhoneAskForName", getInPrimaryPhoneAskForName());
        if (inParameters.contains("primaryPhoneCountryCode")) mapValue.put("primaryPhoneCountryCode", getInPrimaryPhoneCountryCode());
        if (inParameters.contains("primaryPhoneExtension")) mapValue.put("primaryPhoneExtension", getInPrimaryPhoneExtension());
        if (inParameters.contains("primaryPhoneNumber")) mapValue.put("primaryPhoneNumber", getInPrimaryPhoneNumber());
        if (inParameters.contains("primaryWebUrl")) mapValue.put("primaryWebUrl", getInPrimaryWebUrl());
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
        if (outParameters.contains("generalAddressContactMechId")) mapValue.put("generalAddressContactMechId", getOutGeneralAddressContactMechId());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("primaryEmailContactMechId")) mapValue.put("primaryEmailContactMechId", getOutPrimaryEmailContactMechId());
        if (outParameters.contains("primaryPhoneContactMechId")) mapValue.put("primaryPhoneContactMechId", getOutPrimaryPhoneContactMechId());
        if (outParameters.contains("primaryWebUrlContactMechId")) mapValue.put("primaryWebUrlContactMechId", getOutPrimaryWebUrlContactMechId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("generalAddress1")) setInGeneralAddress1((String) mapValue.get("generalAddress1"));
        if (mapValue.containsKey("generalAddress2")) setInGeneralAddress2((String) mapValue.get("generalAddress2"));
        if (mapValue.containsKey("generalAttnName")) setInGeneralAttnName((String) mapValue.get("generalAttnName"));
        if (mapValue.containsKey("generalCity")) setInGeneralCity((String) mapValue.get("generalCity"));
        if (mapValue.containsKey("generalCountryGeoId")) setInGeneralCountryGeoId((String) mapValue.get("generalCountryGeoId"));
        if (mapValue.containsKey("generalPostalCode")) setInGeneralPostalCode((String) mapValue.get("generalPostalCode"));
        if (mapValue.containsKey("generalPostalCodeExt")) setInGeneralPostalCodeExt((String) mapValue.get("generalPostalCodeExt"));
        if (mapValue.containsKey("generalStateProvinceGeoId")) setInGeneralStateProvinceGeoId((String) mapValue.get("generalStateProvinceGeoId"));
        if (mapValue.containsKey("generalToName")) setInGeneralToName((String) mapValue.get("generalToName"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("primaryEmail")) setInPrimaryEmail((String) mapValue.get("primaryEmail"));
        if (mapValue.containsKey("primaryPhoneAreaCode")) setInPrimaryPhoneAreaCode((String) mapValue.get("primaryPhoneAreaCode"));
        if (mapValue.containsKey("primaryPhoneAskForName")) setInPrimaryPhoneAskForName((String) mapValue.get("primaryPhoneAskForName"));
        if (mapValue.containsKey("primaryPhoneCountryCode")) setInPrimaryPhoneCountryCode((String) mapValue.get("primaryPhoneCountryCode"));
        if (mapValue.containsKey("primaryPhoneExtension")) setInPrimaryPhoneExtension((String) mapValue.get("primaryPhoneExtension"));
        if (mapValue.containsKey("primaryPhoneNumber")) setInPrimaryPhoneNumber((String) mapValue.get("primaryPhoneNumber"));
        if (mapValue.containsKey("primaryWebUrl")) setInPrimaryWebUrl((String) mapValue.get("primaryWebUrl"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("generalAddressContactMechId")) setOutGeneralAddressContactMechId((String) mapValue.get("generalAddressContactMechId"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("primaryEmailContactMechId")) setOutPrimaryEmailContactMechId((String) mapValue.get("primaryEmailContactMechId"));
        if (mapValue.containsKey("primaryPhoneContactMechId")) setOutPrimaryPhoneContactMechId((String) mapValue.get("primaryPhoneContactMechId"));
        if (mapValue.containsKey("primaryWebUrlContactMechId")) setOutPrimaryWebUrlContactMechId((String) mapValue.get("primaryWebUrlContactMechId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CrmsfaCreateBasicContactInfoForPartyService</code> from the input values of the given <code>CrmsfaCreateBasicContactInfoForPartyService</code>.
     * @param input a <code>CrmsfaCreateBasicContactInfoForPartyService</code>
     */
    public static CrmsfaCreateBasicContactInfoForPartyService fromInput(CrmsfaCreateBasicContactInfoForPartyService input) {
        CrmsfaCreateBasicContactInfoForPartyService service = new CrmsfaCreateBasicContactInfoForPartyService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CrmsfaCreateBasicContactInfoForPartyService</code> from the output values of the given <code>CrmsfaCreateBasicContactInfoForPartyService</code>.
     * @param output a <code>CrmsfaCreateBasicContactInfoForPartyService</code>
     */
    public static CrmsfaCreateBasicContactInfoForPartyService fromOutput(CrmsfaCreateBasicContactInfoForPartyService output) {
        CrmsfaCreateBasicContactInfoForPartyService service = new CrmsfaCreateBasicContactInfoForPartyService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateBasicContactInfoForPartyService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaCreateBasicContactInfoForPartyService fromInput(Map<String, Object> mapValue) {
        CrmsfaCreateBasicContactInfoForPartyService service = new CrmsfaCreateBasicContactInfoForPartyService();
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
     * Construct a <code>CrmsfaCreateBasicContactInfoForPartyService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaCreateBasicContactInfoForPartyService fromOutput(Map<String, Object> mapValue) {
        CrmsfaCreateBasicContactInfoForPartyService service = new CrmsfaCreateBasicContactInfoForPartyService();
        service.putAllOutput(mapValue);
        return service;
    }
}
