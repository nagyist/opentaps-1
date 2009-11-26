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

import java.io.InputStream;
import java.io.OutputStream;
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
 * .
 * Auto generated base service entity oagisMessageHandler.
 *
 * Engine: java
 * Location: org.ofbiz.oagis.OagisServices
 * Invoke: oagisMessageHandler
 * Defined in: file:/home/jeremy/programmation/opentaps-git/specialpurpose/oagis/servicedef/services.xml
 */
public class OagisMessageHandlerService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "oagisMessageHandler";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        inputStream("inputStream"),
        isErrorRetry("isErrorRetry"),
        locale("locale"),
        outputStream("outputStream"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        component("component"),
        contentType("contentType"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        logicalId("logicalId"),
        referenceId("referenceId"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        task("task"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>OagisMessageHandlerService</code> instance.
     */
    public OagisMessageHandlerService() {
        super();
    }


    private InputStream inInputStream;
    private Boolean inIsErrorRetry;
    private Locale inLocale;
    private OutputStream inOutputStream;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outComponent;
    private String outContentType;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outLogicalId;
    private String outReferenceId;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private String outTask;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>InputStream</code>
     */
    public InputStream getInInputStream() {
        return this.inInputStream;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInIsErrorRetry() {
        return this.inIsErrorRetry;
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
     * @return <code>OutputStream</code>
     */
    public OutputStream getInOutputStream() {
        return this.inOutputStream;
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
    public String getOutComponent() {
        return this.outComponent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutContentType() {
        return this.outContentType;
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
    public String getOutLogicalId() {
        return this.outLogicalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutReferenceId() {
        return this.outReferenceId;
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
     * @return <code>String</code>
     */
    public String getOutTask() {
        return this.outTask;
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
     * This parameter is required.
     * @param inInputStream the inInputStream to set
    */
    public void setInInputStream(InputStream inInputStream) {
        this.inParameters.add("inputStream");
        this.inInputStream = inInputStream;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsErrorRetry the inIsErrorRetry to set
    */
    public void setInIsErrorRetry(Boolean inIsErrorRetry) {
        this.inParameters.add("isErrorRetry");
        this.inIsErrorRetry = inIsErrorRetry;
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
     * @param inOutputStream the inOutputStream to set
    */
    public void setInOutputStream(OutputStream inOutputStream) {
        this.inParameters.add("outputStream");
        this.inOutputStream = inOutputStream;
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
     * @param outComponent the outComponent to set
    */
    public void setOutComponent(String outComponent) {
        this.outParameters.add("component");
        this.outComponent = outComponent;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outContentType the outContentType to set
    */
    public void setOutContentType(String outContentType) {
        this.outParameters.add("contentType");
        this.outContentType = outContentType;
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
     * @param outLogicalId the outLogicalId to set
    */
    public void setOutLogicalId(String outLogicalId) {
        this.outParameters.add("logicalId");
        this.outLogicalId = outLogicalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outReferenceId the outReferenceId to set
    */
    public void setOutReferenceId(String outReferenceId) {
        this.outParameters.add("referenceId");
        this.outReferenceId = outReferenceId;
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
     * @param outTask the outTask to set
    */
    public void setOutTask(String outTask) {
        this.outParameters.add("task");
        this.outTask = outTask;
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
        if (inParameters.contains("inputStream")) mapValue.put("inputStream", getInInputStream());
        if (inParameters.contains("isErrorRetry")) mapValue.put("isErrorRetry", getInIsErrorRetry());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("outputStream")) mapValue.put("outputStream", getInOutputStream());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("component")) mapValue.put("component", getOutComponent());
        if (outParameters.contains("contentType")) mapValue.put("contentType", getOutContentType());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("logicalId")) mapValue.put("logicalId", getOutLogicalId());
        if (outParameters.contains("referenceId")) mapValue.put("referenceId", getOutReferenceId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("task")) mapValue.put("task", getOutTask());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("inputStream")) setInInputStream((InputStream) mapValue.get("inputStream"));
        if (mapValue.containsKey("isErrorRetry")) setInIsErrorRetry((Boolean) mapValue.get("isErrorRetry"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("outputStream")) setInOutputStream((OutputStream) mapValue.get("outputStream"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("component")) setOutComponent((String) mapValue.get("component"));
        if (mapValue.containsKey("contentType")) setOutContentType((String) mapValue.get("contentType"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("logicalId")) setOutLogicalId((String) mapValue.get("logicalId"));
        if (mapValue.containsKey("referenceId")) setOutReferenceId((String) mapValue.get("referenceId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("task")) setOutTask((String) mapValue.get("task"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>OagisMessageHandlerService</code> from the input values of the given <code>OagisMessageHandlerService</code>.
     * @param input a <code>OagisMessageHandlerService</code>
     */
    public static OagisMessageHandlerService fromInput(OagisMessageHandlerService input) {
        OagisMessageHandlerService service = new OagisMessageHandlerService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>OagisMessageHandlerService</code> from the output values of the given <code>OagisMessageHandlerService</code>.
     * @param output a <code>OagisMessageHandlerService</code>
     */
    public static OagisMessageHandlerService fromOutput(OagisMessageHandlerService output) {
        OagisMessageHandlerService service = new OagisMessageHandlerService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>OagisMessageHandlerService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static OagisMessageHandlerService fromInput(Map<String, Object> mapValue) {
        OagisMessageHandlerService service = new OagisMessageHandlerService();
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
     * Construct a <code>OagisMessageHandlerService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static OagisMessageHandlerService fromOutput(Map<String, Object> mapValue) {
        OagisMessageHandlerService service = new OagisMessageHandlerService();
        service.putAllOutput(mapValue);
        return service;
    }
}
