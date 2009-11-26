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
 * Credit Card Processing.
 * Auto generated base service entity cyberSourceCCCapture.
 *
 * Engine: java
 * Location: org.ofbiz.accounting.thirdparty.cybersource.IcsPaymentServices
 * Invoke: ccCapture
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/accounting/servicedef/services_cybersource.xml
 */
public class CyberSourceCCCaptureService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "cyberSourceCCCapture";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        authTrans("authTrans"),
        captureAmount("captureAmount"),
        currency("currency"),
        locale("locale"),
        orderPaymentPreference("orderPaymentPreference"),
        paymentConfig("paymentConfig"),
        paymentGatewayConfigId("paymentGatewayConfigId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        captureAltRefNum("captureAltRefNum"),
        captureAmount("captureAmount"),
        captureCode("captureCode"),
        captureFlag("captureFlag"),
        captureMessage("captureMessage"),
        captureRefNum("captureRefNum"),
        captureResult("captureResult"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        internalRespMsgs("internalRespMsgs"),
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
     * Creates a new <code>CyberSourceCCCaptureService</code> instance.
     */
    public CyberSourceCCCaptureService() {
        super();
    }


    private GenericValue inAuthTrans;
    private BigDecimal inCaptureAmount;
    private String inCurrency;
    private Locale inLocale;
    private GenericValue inOrderPaymentPreference;
    private String inPaymentConfig;
    private String inPaymentGatewayConfigId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outCaptureAltRefNum;
    private BigDecimal outCaptureAmount;
    private String outCaptureCode;
    private String outCaptureFlag;
    private String outCaptureMessage;
    private String outCaptureRefNum;
    private Boolean outCaptureResult;
    private String outErrorMessage;
    private List outErrorMessageList;
    private List outInternalRespMsgs;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getInAuthTrans() {
        return this.inAuthTrans;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInCaptureAmount() {
        return this.inCaptureAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrency() {
        return this.inCurrency;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getInOrderPaymentPreference() {
        return this.inOrderPaymentPreference;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentConfig() {
        return this.inPaymentConfig;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentGatewayConfigId() {
        return this.inPaymentGatewayConfigId;
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
    public String getOutCaptureAltRefNum() {
        return this.outCaptureAltRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutCaptureAmount() {
        return this.outCaptureAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCaptureCode() {
        return this.outCaptureCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCaptureFlag() {
        return this.outCaptureFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCaptureMessage() {
        return this.outCaptureMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCaptureRefNum() {
        return this.outCaptureRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getOutCaptureResult() {
        return this.outCaptureResult;
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
     * @return <code>List</code>
     */
    public List getOutInternalRespMsgs() {
        return this.outInternalRespMsgs;
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
     * @param inAuthTrans the inAuthTrans to set
    */
    public void setInAuthTrans(GenericValue inAuthTrans) {
        this.inParameters.add("authTrans");
        this.inAuthTrans = inAuthTrans;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCaptureAmount the inCaptureAmount to set
    */
    public void setInCaptureAmount(BigDecimal inCaptureAmount) {
        this.inParameters.add("captureAmount");
        this.inCaptureAmount = inCaptureAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrency the inCurrency to set
    */
    public void setInCurrency(String inCurrency) {
        this.inParameters.add("currency");
        this.inCurrency = inCurrency;
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
     * @param inOrderPaymentPreference the inOrderPaymentPreference to set
    */
    public void setInOrderPaymentPreference(GenericValue inOrderPaymentPreference) {
        this.inParameters.add("orderPaymentPreference");
        this.inOrderPaymentPreference = inOrderPaymentPreference;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentConfig the inPaymentConfig to set
    */
    public void setInPaymentConfig(String inPaymentConfig) {
        this.inParameters.add("paymentConfig");
        this.inPaymentConfig = inPaymentConfig;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentGatewayConfigId the inPaymentGatewayConfigId to set
    */
    public void setInPaymentGatewayConfigId(String inPaymentGatewayConfigId) {
        this.inParameters.add("paymentGatewayConfigId");
        this.inPaymentGatewayConfigId = inPaymentGatewayConfigId;
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
     * @param outCaptureAltRefNum the outCaptureAltRefNum to set
    */
    public void setOutCaptureAltRefNum(String outCaptureAltRefNum) {
        this.outParameters.add("captureAltRefNum");
        this.outCaptureAltRefNum = outCaptureAltRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCaptureAmount the outCaptureAmount to set
    */
    public void setOutCaptureAmount(BigDecimal outCaptureAmount) {
        this.outParameters.add("captureAmount");
        this.outCaptureAmount = outCaptureAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCaptureCode the outCaptureCode to set
    */
    public void setOutCaptureCode(String outCaptureCode) {
        this.outParameters.add("captureCode");
        this.outCaptureCode = outCaptureCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCaptureFlag the outCaptureFlag to set
    */
    public void setOutCaptureFlag(String outCaptureFlag) {
        this.outParameters.add("captureFlag");
        this.outCaptureFlag = outCaptureFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCaptureMessage the outCaptureMessage to set
    */
    public void setOutCaptureMessage(String outCaptureMessage) {
        this.outParameters.add("captureMessage");
        this.outCaptureMessage = outCaptureMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCaptureRefNum the outCaptureRefNum to set
    */
    public void setOutCaptureRefNum(String outCaptureRefNum) {
        this.outParameters.add("captureRefNum");
        this.outCaptureRefNum = outCaptureRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCaptureResult the outCaptureResult to set
    */
    public void setOutCaptureResult(Boolean outCaptureResult) {
        this.outParameters.add("captureResult");
        this.outCaptureResult = outCaptureResult;
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
     * @param outInternalRespMsgs the outInternalRespMsgs to set
    */
    public void setOutInternalRespMsgs(List outInternalRespMsgs) {
        this.outParameters.add("internalRespMsgs");
        this.outInternalRespMsgs = outInternalRespMsgs;
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
        if (inParameters.contains("authTrans")) mapValue.put("authTrans", getInAuthTrans());
        if (inParameters.contains("captureAmount")) mapValue.put("captureAmount", getInCaptureAmount());
        if (inParameters.contains("currency")) mapValue.put("currency", getInCurrency());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderPaymentPreference")) mapValue.put("orderPaymentPreference", getInOrderPaymentPreference());
        if (inParameters.contains("paymentConfig")) mapValue.put("paymentConfig", getInPaymentConfig());
        if (inParameters.contains("paymentGatewayConfigId")) mapValue.put("paymentGatewayConfigId", getInPaymentGatewayConfigId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("captureAltRefNum")) mapValue.put("captureAltRefNum", getOutCaptureAltRefNum());
        if (outParameters.contains("captureAmount")) mapValue.put("captureAmount", getOutCaptureAmount());
        if (outParameters.contains("captureCode")) mapValue.put("captureCode", getOutCaptureCode());
        if (outParameters.contains("captureFlag")) mapValue.put("captureFlag", getOutCaptureFlag());
        if (outParameters.contains("captureMessage")) mapValue.put("captureMessage", getOutCaptureMessage());
        if (outParameters.contains("captureRefNum")) mapValue.put("captureRefNum", getOutCaptureRefNum());
        if (outParameters.contains("captureResult")) mapValue.put("captureResult", getOutCaptureResult());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("internalRespMsgs")) mapValue.put("internalRespMsgs", getOutInternalRespMsgs());
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
        if (mapValue.containsKey("authTrans")) setInAuthTrans((GenericValue) mapValue.get("authTrans"));
        if (mapValue.containsKey("captureAmount")) setInCaptureAmount((BigDecimal) mapValue.get("captureAmount"));
        if (mapValue.containsKey("currency")) setInCurrency((String) mapValue.get("currency"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderPaymentPreference")) setInOrderPaymentPreference((GenericValue) mapValue.get("orderPaymentPreference"));
        if (mapValue.containsKey("paymentConfig")) setInPaymentConfig((String) mapValue.get("paymentConfig"));
        if (mapValue.containsKey("paymentGatewayConfigId")) setInPaymentGatewayConfigId((String) mapValue.get("paymentGatewayConfigId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("captureAltRefNum")) setOutCaptureAltRefNum((String) mapValue.get("captureAltRefNum"));
        if (mapValue.containsKey("captureAmount")) setOutCaptureAmount((BigDecimal) mapValue.get("captureAmount"));
        if (mapValue.containsKey("captureCode")) setOutCaptureCode((String) mapValue.get("captureCode"));
        if (mapValue.containsKey("captureFlag")) setOutCaptureFlag((String) mapValue.get("captureFlag"));
        if (mapValue.containsKey("captureMessage")) setOutCaptureMessage((String) mapValue.get("captureMessage"));
        if (mapValue.containsKey("captureRefNum")) setOutCaptureRefNum((String) mapValue.get("captureRefNum"));
        if (mapValue.containsKey("captureResult")) setOutCaptureResult((Boolean) mapValue.get("captureResult"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("internalRespMsgs")) setOutInternalRespMsgs((List) mapValue.get("internalRespMsgs"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CyberSourceCCCaptureService</code> from the input values of the given <code>CyberSourceCCCaptureService</code>.
     * @param input a <code>CyberSourceCCCaptureService</code>
     */
    public static CyberSourceCCCaptureService fromInput(CyberSourceCCCaptureService input) {
        CyberSourceCCCaptureService service = new CyberSourceCCCaptureService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CyberSourceCCCaptureService</code> from the output values of the given <code>CyberSourceCCCaptureService</code>.
     * @param output a <code>CyberSourceCCCaptureService</code>
     */
    public static CyberSourceCCCaptureService fromOutput(CyberSourceCCCaptureService output) {
        CyberSourceCCCaptureService service = new CyberSourceCCCaptureService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CyberSourceCCCaptureService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CyberSourceCCCaptureService fromInput(Map<String, Object> mapValue) {
        CyberSourceCCCaptureService service = new CyberSourceCCCaptureService();
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
     * Construct a <code>CyberSourceCCCaptureService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CyberSourceCCCaptureService fromOutput(Map<String, Object> mapValue) {
        CyberSourceCCCaptureService service = new CyberSourceCCCaptureService();
        service.putAllOutput(mapValue);
        return service;
    }
}
