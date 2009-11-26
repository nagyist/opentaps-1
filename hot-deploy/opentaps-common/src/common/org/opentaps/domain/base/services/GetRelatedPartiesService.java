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
 * 
            Get Parties Related to a Party
            - The relatedPartyIdList coming out will include the original partyIdFrom
            - The includeFromToSwitched and recurse attributes should by "Y" or "N" and default to N.
            - The useCache attribute should be "true" or "false", defaults to "false"
        .
 * Auto generated base service entity getRelatedParties.
 *
 * Engine: simple
 * Location: component://party/script/org/ofbiz/party/party/PartyServices.xml
 * Invoke: getRelatedParties
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/party/servicedef/services_view.xml
 */
public class GetRelatedPartiesService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getRelatedParties";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        includeFromToSwitched("includeFromToSwitched"),
        locale("locale"),
        partyIdFrom("partyIdFrom"),
        partyRelationshipTypeId("partyRelationshipTypeId"),
        recurse("recurse"),
        roleTypeIdFrom("roleTypeIdFrom"),
        roleTypeIdFromInclueAllChildTypes("roleTypeIdFromInclueAllChildTypes"),
        roleTypeIdTo("roleTypeIdTo"),
        roleTypeIdToIncludeAllChildTypes("roleTypeIdToIncludeAllChildTypes"),
        timeZone("timeZone"),
        useCache("useCache"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        relatedPartyIdList("relatedPartyIdList"),
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
     * Creates a new <code>GetRelatedPartiesService</code> instance.
     */
    public GetRelatedPartiesService() {
        super();
    }


    private String inIncludeFromToSwitched;
    private Locale inLocale;
    private String inPartyIdFrom;
    private String inPartyRelationshipTypeId;
    private String inRecurse;
    private String inRoleTypeIdFrom;
    private String inRoleTypeIdFromInclueAllChildTypes;
    private String inRoleTypeIdTo;
    private String inRoleTypeIdToIncludeAllChildTypes;
    private TimeZone inTimeZone;
    private String inUseCache;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private List outRelatedPartyIdList;
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
    public String getInIncludeFromToSwitched() {
        return this.inIncludeFromToSwitched;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPartyIdFrom() {
        return this.inPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyRelationshipTypeId() {
        return this.inPartyRelationshipTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRecurse() {
        return this.inRecurse;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdFrom() {
        return this.inRoleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdFromInclueAllChildTypes() {
        return this.inRoleTypeIdFromInclueAllChildTypes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdTo() {
        return this.inRoleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdToIncludeAllChildTypes() {
        return this.inRoleTypeIdToIncludeAllChildTypes;
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
     * @return <code>String</code>
     */
    public String getInUseCache() {
        return this.inUseCache;
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
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getOutRelatedPartyIdList() {
        return this.outRelatedPartyIdList;
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
     * @param inIncludeFromToSwitched the inIncludeFromToSwitched to set
    */
    public void setInIncludeFromToSwitched(String inIncludeFromToSwitched) {
        this.inParameters.add("includeFromToSwitched");
        this.inIncludeFromToSwitched = inIncludeFromToSwitched;
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
     * This parameter is required.
     * @param inPartyIdFrom the inPartyIdFrom to set
    */
    public void setInPartyIdFrom(String inPartyIdFrom) {
        this.inParameters.add("partyIdFrom");
        this.inPartyIdFrom = inPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyRelationshipTypeId the inPartyRelationshipTypeId to set
    */
    public void setInPartyRelationshipTypeId(String inPartyRelationshipTypeId) {
        this.inParameters.add("partyRelationshipTypeId");
        this.inPartyRelationshipTypeId = inPartyRelationshipTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRecurse the inRecurse to set
    */
    public void setInRecurse(String inRecurse) {
        this.inParameters.add("recurse");
        this.inRecurse = inRecurse;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdFrom the inRoleTypeIdFrom to set
    */
    public void setInRoleTypeIdFrom(String inRoleTypeIdFrom) {
        this.inParameters.add("roleTypeIdFrom");
        this.inRoleTypeIdFrom = inRoleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdFromInclueAllChildTypes the inRoleTypeIdFromInclueAllChildTypes to set
    */
    public void setInRoleTypeIdFromInclueAllChildTypes(String inRoleTypeIdFromInclueAllChildTypes) {
        this.inParameters.add("roleTypeIdFromInclueAllChildTypes");
        this.inRoleTypeIdFromInclueAllChildTypes = inRoleTypeIdFromInclueAllChildTypes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdTo the inRoleTypeIdTo to set
    */
    public void setInRoleTypeIdTo(String inRoleTypeIdTo) {
        this.inParameters.add("roleTypeIdTo");
        this.inRoleTypeIdTo = inRoleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdToIncludeAllChildTypes the inRoleTypeIdToIncludeAllChildTypes to set
    */
    public void setInRoleTypeIdToIncludeAllChildTypes(String inRoleTypeIdToIncludeAllChildTypes) {
        this.inParameters.add("roleTypeIdToIncludeAllChildTypes");
        this.inRoleTypeIdToIncludeAllChildTypes = inRoleTypeIdToIncludeAllChildTypes;
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
     * @param inUseCache the inUseCache to set
    */
    public void setInUseCache(String inUseCache) {
        this.inParameters.add("useCache");
        this.inUseCache = inUseCache;
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
     * This parameter is required.
     * @param outRelatedPartyIdList the outRelatedPartyIdList to set
    */
    public void setOutRelatedPartyIdList(List outRelatedPartyIdList) {
        this.outParameters.add("relatedPartyIdList");
        this.outRelatedPartyIdList = outRelatedPartyIdList;
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
        if (inParameters.contains("includeFromToSwitched")) mapValue.put("includeFromToSwitched", getInIncludeFromToSwitched());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyRelationshipTypeId")) mapValue.put("partyRelationshipTypeId", getInPartyRelationshipTypeId());
        if (inParameters.contains("recurse")) mapValue.put("recurse", getInRecurse());
        if (inParameters.contains("roleTypeIdFrom")) mapValue.put("roleTypeIdFrom", getInRoleTypeIdFrom());
        if (inParameters.contains("roleTypeIdFromInclueAllChildTypes")) mapValue.put("roleTypeIdFromInclueAllChildTypes", getInRoleTypeIdFromInclueAllChildTypes());
        if (inParameters.contains("roleTypeIdTo")) mapValue.put("roleTypeIdTo", getInRoleTypeIdTo());
        if (inParameters.contains("roleTypeIdToIncludeAllChildTypes")) mapValue.put("roleTypeIdToIncludeAllChildTypes", getInRoleTypeIdToIncludeAllChildTypes());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useCache")) mapValue.put("useCache", getInUseCache());
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
        if (outParameters.contains("relatedPartyIdList")) mapValue.put("relatedPartyIdList", getOutRelatedPartyIdList());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("includeFromToSwitched")) setInIncludeFromToSwitched((String) mapValue.get("includeFromToSwitched"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyRelationshipTypeId")) setInPartyRelationshipTypeId((String) mapValue.get("partyRelationshipTypeId"));
        if (mapValue.containsKey("recurse")) setInRecurse((String) mapValue.get("recurse"));
        if (mapValue.containsKey("roleTypeIdFrom")) setInRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        if (mapValue.containsKey("roleTypeIdFromInclueAllChildTypes")) setInRoleTypeIdFromInclueAllChildTypes((String) mapValue.get("roleTypeIdFromInclueAllChildTypes"));
        if (mapValue.containsKey("roleTypeIdTo")) setInRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        if (mapValue.containsKey("roleTypeIdToIncludeAllChildTypes")) setInRoleTypeIdToIncludeAllChildTypes((String) mapValue.get("roleTypeIdToIncludeAllChildTypes"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useCache")) setInUseCache((String) mapValue.get("useCache"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("relatedPartyIdList")) setOutRelatedPartyIdList((List) mapValue.get("relatedPartyIdList"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetRelatedPartiesService</code> from the input values of the given <code>GetRelatedPartiesService</code>.
     * @param input a <code>GetRelatedPartiesService</code>
     */
    public static GetRelatedPartiesService fromInput(GetRelatedPartiesService input) {
        GetRelatedPartiesService service = new GetRelatedPartiesService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetRelatedPartiesService</code> from the output values of the given <code>GetRelatedPartiesService</code>.
     * @param output a <code>GetRelatedPartiesService</code>
     */
    public static GetRelatedPartiesService fromOutput(GetRelatedPartiesService output) {
        GetRelatedPartiesService service = new GetRelatedPartiesService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetRelatedPartiesService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetRelatedPartiesService fromInput(Map<String, Object> mapValue) {
        GetRelatedPartiesService service = new GetRelatedPartiesService();
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
     * Construct a <code>GetRelatedPartiesService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetRelatedPartiesService fromOutput(Map<String, Object> mapValue) {
        GetRelatedPartiesService service = new GetRelatedPartiesService();
        service.putAllOutput(mapValue);
        return service;
    }
}
