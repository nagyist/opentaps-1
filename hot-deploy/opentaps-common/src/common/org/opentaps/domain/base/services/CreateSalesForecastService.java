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
 * Creates a Sales Forecast for the userLogin. Requires ORDERMGR_4C_CREATE permission.
            This will save the forecast into the history as well. Note that this service does not compute
            the forecast. That must be done in a higher level service..
 * Auto generated base service entity createSalesForecast.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/opportunity/OpportunityServices.xml
 * Invoke: createSalesForecast
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services_opportunity.xml
 */
public class CreateSalesForecastService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createSalesForecast";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        bestCaseAmount("bestCaseAmount"),
        closedAmount("closedAmount"),
        createdByUserLoginId("createdByUserLoginId"),
        currencyUomId("currencyUomId"),
        customTimePeriodId("customTimePeriodId"),
        forecastAmount("forecastAmount"),
        internalPartyId("internalPartyId"),
        locale("locale"),
        modifiedByUserLoginId("modifiedByUserLoginId"),
        organizationPartyId("organizationPartyId"),
        parentSalesForecastId("parentSalesForecastId"),
        percentOfQuotaClosed("percentOfQuotaClosed"),
        percentOfQuotaForecast("percentOfQuotaForecast"),
        pipelineAmount("pipelineAmount"),
        quotaAmount("quotaAmount"),
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
        salesForecastId("salesForecastId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CreateSalesForecastService</code> instance.
     */
    public CreateSalesForecastService() {
        super();
    }

    /**
     * Creates a new <code>CreateSalesForecastService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateSalesForecastService(User user) {
        super(user);
    }

    private BigDecimal inBestCaseAmount;
    private BigDecimal inClosedAmount;
    private String inCreatedByUserLoginId;
    private String inCurrencyUomId;
    private String inCustomTimePeriodId;
    private BigDecimal inForecastAmount;
    private String inInternalPartyId;
    private Locale inLocale;
    private String inModifiedByUserLoginId;
    private String inOrganizationPartyId;
    private String inParentSalesForecastId;
    private BigDecimal inPercentOfQuotaClosed;
    private BigDecimal inPercentOfQuotaForecast;
    private BigDecimal inPipelineAmount;
    private BigDecimal inQuotaAmount;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSalesForecastId;
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
    public BigDecimal getInBestCaseAmount() {
        return this.inBestCaseAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInClosedAmount() {
        return this.inClosedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedByUserLoginId() {
        return this.inCreatedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustomTimePeriodId() {
        return this.inCustomTimePeriodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInForecastAmount() {
        return this.inForecastAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInternalPartyId() {
        return this.inInternalPartyId;
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
    public String getInModifiedByUserLoginId() {
        return this.inModifiedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrganizationPartyId() {
        return this.inOrganizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInParentSalesForecastId() {
        return this.inParentSalesForecastId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPercentOfQuotaClosed() {
        return this.inPercentOfQuotaClosed;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPercentOfQuotaForecast() {
        return this.inPercentOfQuotaForecast;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPipelineAmount() {
        return this.inPipelineAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuotaAmount() {
        return this.inQuotaAmount;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutSalesForecastId() {
        return this.outSalesForecastId;
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
     * @param inBestCaseAmount the inBestCaseAmount to set
    */
    public void setInBestCaseAmount(BigDecimal inBestCaseAmount) {
        this.inParameters.add("bestCaseAmount");
        this.inBestCaseAmount = inBestCaseAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inClosedAmount the inClosedAmount to set
    */
    public void setInClosedAmount(BigDecimal inClosedAmount) {
        this.inParameters.add("closedAmount");
        this.inClosedAmount = inClosedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedByUserLoginId the inCreatedByUserLoginId to set
    */
    public void setInCreatedByUserLoginId(String inCreatedByUserLoginId) {
        this.inParameters.add("createdByUserLoginId");
        this.inCreatedByUserLoginId = inCreatedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustomTimePeriodId the inCustomTimePeriodId to set
    */
    public void setInCustomTimePeriodId(String inCustomTimePeriodId) {
        this.inParameters.add("customTimePeriodId");
        this.inCustomTimePeriodId = inCustomTimePeriodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inForecastAmount the inForecastAmount to set
    */
    public void setInForecastAmount(BigDecimal inForecastAmount) {
        this.inParameters.add("forecastAmount");
        this.inForecastAmount = inForecastAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalPartyId the inInternalPartyId to set
    */
    public void setInInternalPartyId(String inInternalPartyId) {
        this.inParameters.add("internalPartyId");
        this.inInternalPartyId = inInternalPartyId;
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
     * @param inModifiedByUserLoginId the inModifiedByUserLoginId to set
    */
    public void setInModifiedByUserLoginId(String inModifiedByUserLoginId) {
        this.inParameters.add("modifiedByUserLoginId");
        this.inModifiedByUserLoginId = inModifiedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrganizationPartyId the inOrganizationPartyId to set
    */
    public void setInOrganizationPartyId(String inOrganizationPartyId) {
        this.inParameters.add("organizationPartyId");
        this.inOrganizationPartyId = inOrganizationPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inParentSalesForecastId the inParentSalesForecastId to set
    */
    public void setInParentSalesForecastId(String inParentSalesForecastId) {
        this.inParameters.add("parentSalesForecastId");
        this.inParentSalesForecastId = inParentSalesForecastId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPercentOfQuotaClosed the inPercentOfQuotaClosed to set
    */
    public void setInPercentOfQuotaClosed(BigDecimal inPercentOfQuotaClosed) {
        this.inParameters.add("percentOfQuotaClosed");
        this.inPercentOfQuotaClosed = inPercentOfQuotaClosed;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPercentOfQuotaForecast the inPercentOfQuotaForecast to set
    */
    public void setInPercentOfQuotaForecast(BigDecimal inPercentOfQuotaForecast) {
        this.inParameters.add("percentOfQuotaForecast");
        this.inPercentOfQuotaForecast = inPercentOfQuotaForecast;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPipelineAmount the inPipelineAmount to set
    */
    public void setInPipelineAmount(BigDecimal inPipelineAmount) {
        this.inParameters.add("pipelineAmount");
        this.inPipelineAmount = inPipelineAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuotaAmount the inQuotaAmount to set
    */
    public void setInQuotaAmount(BigDecimal inQuotaAmount) {
        this.inParameters.add("quotaAmount");
        this.inQuotaAmount = inQuotaAmount;
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
     * This parameter is required.
     * @param outSalesForecastId the outSalesForecastId to set
    */
    public void setOutSalesForecastId(String outSalesForecastId) {
        this.outParameters.add("salesForecastId");
        this.outSalesForecastId = outSalesForecastId;
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
        if (inParameters.contains("bestCaseAmount")) mapValue.put("bestCaseAmount", getInBestCaseAmount());
        if (inParameters.contains("closedAmount")) mapValue.put("closedAmount", getInClosedAmount());
        if (inParameters.contains("createdByUserLoginId")) mapValue.put("createdByUserLoginId", getInCreatedByUserLoginId());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("customTimePeriodId")) mapValue.put("customTimePeriodId", getInCustomTimePeriodId());
        if (inParameters.contains("forecastAmount")) mapValue.put("forecastAmount", getInForecastAmount());
        if (inParameters.contains("internalPartyId")) mapValue.put("internalPartyId", getInInternalPartyId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("modifiedByUserLoginId")) mapValue.put("modifiedByUserLoginId", getInModifiedByUserLoginId());
        if (inParameters.contains("organizationPartyId")) mapValue.put("organizationPartyId", getInOrganizationPartyId());
        if (inParameters.contains("parentSalesForecastId")) mapValue.put("parentSalesForecastId", getInParentSalesForecastId());
        if (inParameters.contains("percentOfQuotaClosed")) mapValue.put("percentOfQuotaClosed", getInPercentOfQuotaClosed());
        if (inParameters.contains("percentOfQuotaForecast")) mapValue.put("percentOfQuotaForecast", getInPercentOfQuotaForecast());
        if (inParameters.contains("pipelineAmount")) mapValue.put("pipelineAmount", getInPipelineAmount());
        if (inParameters.contains("quotaAmount")) mapValue.put("quotaAmount", getInQuotaAmount());
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
        if (outParameters.contains("salesForecastId")) mapValue.put("salesForecastId", getOutSalesForecastId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("bestCaseAmount")) setInBestCaseAmount((BigDecimal) mapValue.get("bestCaseAmount"));
        if (mapValue.containsKey("closedAmount")) setInClosedAmount((BigDecimal) mapValue.get("closedAmount"));
        if (mapValue.containsKey("createdByUserLoginId")) setInCreatedByUserLoginId((String) mapValue.get("createdByUserLoginId"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("customTimePeriodId")) setInCustomTimePeriodId((String) mapValue.get("customTimePeriodId"));
        if (mapValue.containsKey("forecastAmount")) setInForecastAmount((BigDecimal) mapValue.get("forecastAmount"));
        if (mapValue.containsKey("internalPartyId")) setInInternalPartyId((String) mapValue.get("internalPartyId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("modifiedByUserLoginId")) setInModifiedByUserLoginId((String) mapValue.get("modifiedByUserLoginId"));
        if (mapValue.containsKey("organizationPartyId")) setInOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        if (mapValue.containsKey("parentSalesForecastId")) setInParentSalesForecastId((String) mapValue.get("parentSalesForecastId"));
        if (mapValue.containsKey("percentOfQuotaClosed")) setInPercentOfQuotaClosed((BigDecimal) mapValue.get("percentOfQuotaClosed"));
        if (mapValue.containsKey("percentOfQuotaForecast")) setInPercentOfQuotaForecast((BigDecimal) mapValue.get("percentOfQuotaForecast"));
        if (mapValue.containsKey("pipelineAmount")) setInPipelineAmount((BigDecimal) mapValue.get("pipelineAmount"));
        if (mapValue.containsKey("quotaAmount")) setInQuotaAmount((BigDecimal) mapValue.get("quotaAmount"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("salesForecastId")) setOutSalesForecastId((String) mapValue.get("salesForecastId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateSalesForecastService</code> from the input values of the given <code>CreateSalesForecastService</code>.
     * @param input a <code>CreateSalesForecastService</code>
     */
    public static CreateSalesForecastService fromInput(CreateSalesForecastService input) {
        CreateSalesForecastService service = new CreateSalesForecastService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateSalesForecastService</code> from the output values of the given <code>CreateSalesForecastService</code>.
     * @param output a <code>CreateSalesForecastService</code>
     */
    public static CreateSalesForecastService fromOutput(CreateSalesForecastService output) {
        CreateSalesForecastService service = new CreateSalesForecastService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateSalesForecastService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateSalesForecastService fromInput(Map<String, Object> mapValue) {
        CreateSalesForecastService service = new CreateSalesForecastService();
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
     * Construct a <code>CreateSalesForecastService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateSalesForecastService fromOutput(Map<String, Object> mapValue) {
        CreateSalesForecastService service = new CreateSalesForecastService();
        service.putAllOutput(mapValue);
        return service;
    }
}
