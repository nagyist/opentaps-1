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
 * Gets a single user preference..
 * Auto generated base service entity getUserPreference.
 *
 * Engine: java
 * Location: org.ofbiz.common.preferences.PreferenceServices
 * Invoke: getUserPreference
 * Defined in: file:/home/jeremy/programmation/opentaps-git/framework/common/servicedef/services.xml
 */
public class GetUserPreferenceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getUserPreference";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        locale("locale"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        userPrefGroupTypeId("userPrefGroupTypeId"),
        userPrefLoginId("userPrefLoginId"),
        userPrefTypeId("userPrefTypeId");
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
        userLogin("userLogin"),
        userPrefMap("userPrefMap"),
        userPrefValue("userPrefValue");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetUserPreferenceService</code> instance.
     */
    public GetUserPreferenceService() {
        super();
    }


    private Locale inLocale;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inUserPrefGroupTypeId;
    private String inUserPrefLoginId;
    private String inUserPrefTypeId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;
    private Map outUserPrefMap;
    private Object outUserPrefValue;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

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
    public String getInUserPrefGroupTypeId() {
        return this.inUserPrefGroupTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUserPrefLoginId() {
        return this.inUserPrefLoginId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInUserPrefTypeId() {
        return this.inUserPrefTypeId;
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
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getOutUserPrefMap() {
        return this.outUserPrefMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Object</code>
     */
    public Object getOutUserPrefValue() {
        return this.outUserPrefValue;
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
     * @param inUserPrefGroupTypeId the inUserPrefGroupTypeId to set
    */
    public void setInUserPrefGroupTypeId(String inUserPrefGroupTypeId) {
        this.inParameters.add("userPrefGroupTypeId");
        this.inUserPrefGroupTypeId = inUserPrefGroupTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserPrefLoginId the inUserPrefLoginId to set
    */
    public void setInUserPrefLoginId(String inUserPrefLoginId) {
        this.inParameters.add("userPrefLoginId");
        this.inUserPrefLoginId = inUserPrefLoginId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inUserPrefTypeId the inUserPrefTypeId to set
    */
    public void setInUserPrefTypeId(String inUserPrefTypeId) {
        this.inParameters.add("userPrefTypeId");
        this.inUserPrefTypeId = inUserPrefTypeId;
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
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserPrefMap the outUserPrefMap to set
    */
    public void setOutUserPrefMap(Map outUserPrefMap) {
        this.outParameters.add("userPrefMap");
        this.outUserPrefMap = outUserPrefMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserPrefValue the outUserPrefValue to set
    */
    public void setOutUserPrefValue(Object outUserPrefValue) {
        this.outParameters.add("userPrefValue");
        this.outUserPrefValue = outUserPrefValue;
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
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("userPrefGroupTypeId")) mapValue.put("userPrefGroupTypeId", getInUserPrefGroupTypeId());
        if (inParameters.contains("userPrefLoginId")) mapValue.put("userPrefLoginId", getInUserPrefLoginId());
        if (inParameters.contains("userPrefTypeId")) mapValue.put("userPrefTypeId", getInUserPrefTypeId());
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
        if (outParameters.contains("userPrefMap")) mapValue.put("userPrefMap", getOutUserPrefMap());
        if (outParameters.contains("userPrefValue")) mapValue.put("userPrefValue", getOutUserPrefValue());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("userPrefGroupTypeId")) setInUserPrefGroupTypeId((String) mapValue.get("userPrefGroupTypeId"));
        if (mapValue.containsKey("userPrefLoginId")) setInUserPrefLoginId((String) mapValue.get("userPrefLoginId"));
        if (mapValue.containsKey("userPrefTypeId")) setInUserPrefTypeId((String) mapValue.get("userPrefTypeId"));
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
        if (mapValue.containsKey("userPrefMap")) setOutUserPrefMap((Map) mapValue.get("userPrefMap"));
        if (mapValue.containsKey("userPrefValue")) setOutUserPrefValue((Object) mapValue.get("userPrefValue"));
    }

    /**
     * Construct a <code>GetUserPreferenceService</code> from the input values of the given <code>GetUserPreferenceService</code>.
     * @param input a <code>GetUserPreferenceService</code>
     */
    public static GetUserPreferenceService fromInput(GetUserPreferenceService input) {
        GetUserPreferenceService service = new GetUserPreferenceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetUserPreferenceService</code> from the output values of the given <code>GetUserPreferenceService</code>.
     * @param output a <code>GetUserPreferenceService</code>
     */
    public static GetUserPreferenceService fromOutput(GetUserPreferenceService output) {
        GetUserPreferenceService service = new GetUserPreferenceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetUserPreferenceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetUserPreferenceService fromInput(Map<String, Object> mapValue) {
        GetUserPreferenceService service = new GetUserPreferenceService();
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
     * Construct a <code>GetUserPreferenceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetUserPreferenceService fromOutput(Map<String, Object> mapValue) {
        GetUserPreferenceService service = new GetUserPreferenceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
