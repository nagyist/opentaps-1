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
 * Create accounting preferences for a party (organization).
 * Auto generated base service entity createPartyAcctgPreference.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/admin/AcctgAdminServices.xml
 * Invoke: createPartyAcctgPreference
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/accounting/servicedef/services_admin.xml
 */
public class CreatePartyAcctgPreferenceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createPartyAcctgPreference";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        allocPaymentTagsToAppl("allocPaymentTagsToAppl"),
        baseCurrencyUomId("baseCurrencyUomId"),
        cogsMethodId("cogsMethodId"),
        costingMethodId("costingMethodId"),
        errorGlJournalId("errorGlJournalId"),
        fiscalYearStartDay("fiscalYearStartDay"),
        fiscalYearStartMonth("fiscalYearStartMonth"),
        groupSalesTaxOnInvoicePdf("groupSalesTaxOnInvoicePdf"),
        invoiceIdPrefix("invoiceIdPrefix"),
        invoiceSequenceEnumId("invoiceSequenceEnumId"),
        lastInvoiceNumber("lastInvoiceNumber"),
        lastInvoiceRestartDate("lastInvoiceRestartDate"),
        lastOrderNumber("lastOrderNumber"),
        lastQuoteNumber("lastQuoteNumber"),
        locale("locale"),
        orderIdPrefix("orderIdPrefix"),
        orderSequenceEnumId("orderSequenceEnumId"),
        partyId("partyId"),
        quoteIdPrefix("quoteIdPrefix"),
        quoteSequenceEnumId("quoteSequenceEnumId"),
        refundPaymentMethodId("refundPaymentMethodId"),
        salesInvoiceFooterText("salesInvoiceFooterText"),
        taxFormId("taxFormId"),
        timeZone("timeZone"),
        useInvoiceIdForReturns("useInvoiceIdForReturns"),
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
     * Creates a new <code>CreatePartyAcctgPreferenceService</code> instance.
     */
    public CreatePartyAcctgPreferenceService() {
        super();
    }

    /**
     * Creates a new <code>CreatePartyAcctgPreferenceService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreatePartyAcctgPreferenceService(User user) {
        super(user);
    }

    private String inAllocPaymentTagsToAppl;
    private String inBaseCurrencyUomId;
    private String inCogsMethodId;
    private String inCostingMethodId;
    private String inErrorGlJournalId;
    private Long inFiscalYearStartDay;
    private Long inFiscalYearStartMonth;
    private String inGroupSalesTaxOnInvoicePdf;
    private String inInvoiceIdPrefix;
    private String inInvoiceSequenceEnumId;
    private Long inLastInvoiceNumber;
    private Timestamp inLastInvoiceRestartDate;
    private Long inLastOrderNumber;
    private Long inLastQuoteNumber;
    private Locale inLocale;
    private String inOrderIdPrefix;
    private String inOrderSequenceEnumId;
    private String inPartyId;
    private String inQuoteIdPrefix;
    private String inQuoteSequenceEnumId;
    private String inRefundPaymentMethodId;
    private String inSalesInvoiceFooterText;
    private String inTaxFormId;
    private TimeZone inTimeZone;
    private String inUseInvoiceIdForReturns;
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
     * @return <code>String</code>
     */
    public String getInAllocPaymentTagsToAppl() {
        return this.inAllocPaymentTagsToAppl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBaseCurrencyUomId() {
        return this.inBaseCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCogsMethodId() {
        return this.inCogsMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCostingMethodId() {
        return this.inCostingMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInErrorGlJournalId() {
        return this.inErrorGlJournalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInFiscalYearStartDay() {
        return this.inFiscalYearStartDay;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInFiscalYearStartMonth() {
        return this.inFiscalYearStartMonth;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupSalesTaxOnInvoicePdf() {
        return this.inGroupSalesTaxOnInvoicePdf;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceIdPrefix() {
        return this.inInvoiceIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceSequenceEnumId() {
        return this.inInvoiceSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInLastInvoiceNumber() {
        return this.inLastInvoiceNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastInvoiceRestartDate() {
        return this.inLastInvoiceRestartDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInLastOrderNumber() {
        return this.inLastOrderNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInLastQuoteNumber() {
        return this.inLastQuoteNumber;
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
    public String getInOrderIdPrefix() {
        return this.inOrderIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrderSequenceEnumId() {
        return this.inOrderSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
    public String getInQuoteIdPrefix() {
        return this.inQuoteIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInQuoteSequenceEnumId() {
        return this.inQuoteSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRefundPaymentMethodId() {
        return this.inRefundPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalesInvoiceFooterText() {
        return this.inSalesInvoiceFooterText;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxFormId() {
        return this.inTaxFormId;
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
    public String getInUseInvoiceIdForReturns() {
        return this.inUseInvoiceIdForReturns;
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
     * @param inAllocPaymentTagsToAppl the inAllocPaymentTagsToAppl to set
    */
    public void setInAllocPaymentTagsToAppl(String inAllocPaymentTagsToAppl) {
        this.inParameters.add("allocPaymentTagsToAppl");
        this.inAllocPaymentTagsToAppl = inAllocPaymentTagsToAppl;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBaseCurrencyUomId the inBaseCurrencyUomId to set
    */
    public void setInBaseCurrencyUomId(String inBaseCurrencyUomId) {
        this.inParameters.add("baseCurrencyUomId");
        this.inBaseCurrencyUomId = inBaseCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCogsMethodId the inCogsMethodId to set
    */
    public void setInCogsMethodId(String inCogsMethodId) {
        this.inParameters.add("cogsMethodId");
        this.inCogsMethodId = inCogsMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCostingMethodId the inCostingMethodId to set
    */
    public void setInCostingMethodId(String inCostingMethodId) {
        this.inParameters.add("costingMethodId");
        this.inCostingMethodId = inCostingMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inErrorGlJournalId the inErrorGlJournalId to set
    */
    public void setInErrorGlJournalId(String inErrorGlJournalId) {
        this.inParameters.add("errorGlJournalId");
        this.inErrorGlJournalId = inErrorGlJournalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFiscalYearStartDay the inFiscalYearStartDay to set
    */
    public void setInFiscalYearStartDay(Long inFiscalYearStartDay) {
        this.inParameters.add("fiscalYearStartDay");
        this.inFiscalYearStartDay = inFiscalYearStartDay;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFiscalYearStartMonth the inFiscalYearStartMonth to set
    */
    public void setInFiscalYearStartMonth(Long inFiscalYearStartMonth) {
        this.inParameters.add("fiscalYearStartMonth");
        this.inFiscalYearStartMonth = inFiscalYearStartMonth;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupSalesTaxOnInvoicePdf the inGroupSalesTaxOnInvoicePdf to set
    */
    public void setInGroupSalesTaxOnInvoicePdf(String inGroupSalesTaxOnInvoicePdf) {
        this.inParameters.add("groupSalesTaxOnInvoicePdf");
        this.inGroupSalesTaxOnInvoicePdf = inGroupSalesTaxOnInvoicePdf;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceIdPrefix the inInvoiceIdPrefix to set
    */
    public void setInInvoiceIdPrefix(String inInvoiceIdPrefix) {
        this.inParameters.add("invoiceIdPrefix");
        this.inInvoiceIdPrefix = inInvoiceIdPrefix;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceSequenceEnumId the inInvoiceSequenceEnumId to set
    */
    public void setInInvoiceSequenceEnumId(String inInvoiceSequenceEnumId) {
        this.inParameters.add("invoiceSequenceEnumId");
        this.inInvoiceSequenceEnumId = inInvoiceSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastInvoiceNumber the inLastInvoiceNumber to set
    */
    public void setInLastInvoiceNumber(Long inLastInvoiceNumber) {
        this.inParameters.add("lastInvoiceNumber");
        this.inLastInvoiceNumber = inLastInvoiceNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastInvoiceRestartDate the inLastInvoiceRestartDate to set
    */
    public void setInLastInvoiceRestartDate(Timestamp inLastInvoiceRestartDate) {
        this.inParameters.add("lastInvoiceRestartDate");
        this.inLastInvoiceRestartDate = inLastInvoiceRestartDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastOrderNumber the inLastOrderNumber to set
    */
    public void setInLastOrderNumber(Long inLastOrderNumber) {
        this.inParameters.add("lastOrderNumber");
        this.inLastOrderNumber = inLastOrderNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastQuoteNumber the inLastQuoteNumber to set
    */
    public void setInLastQuoteNumber(Long inLastQuoteNumber) {
        this.inParameters.add("lastQuoteNumber");
        this.inLastQuoteNumber = inLastQuoteNumber;
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
     * @param inOrderIdPrefix the inOrderIdPrefix to set
    */
    public void setInOrderIdPrefix(String inOrderIdPrefix) {
        this.inParameters.add("orderIdPrefix");
        this.inOrderIdPrefix = inOrderIdPrefix;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderSequenceEnumId the inOrderSequenceEnumId to set
    */
    public void setInOrderSequenceEnumId(String inOrderSequenceEnumId) {
        this.inParameters.add("orderSequenceEnumId");
        this.inOrderSequenceEnumId = inOrderSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuoteIdPrefix the inQuoteIdPrefix to set
    */
    public void setInQuoteIdPrefix(String inQuoteIdPrefix) {
        this.inParameters.add("quoteIdPrefix");
        this.inQuoteIdPrefix = inQuoteIdPrefix;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuoteSequenceEnumId the inQuoteSequenceEnumId to set
    */
    public void setInQuoteSequenceEnumId(String inQuoteSequenceEnumId) {
        this.inParameters.add("quoteSequenceEnumId");
        this.inQuoteSequenceEnumId = inQuoteSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRefundPaymentMethodId the inRefundPaymentMethodId to set
    */
    public void setInRefundPaymentMethodId(String inRefundPaymentMethodId) {
        this.inParameters.add("refundPaymentMethodId");
        this.inRefundPaymentMethodId = inRefundPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesInvoiceFooterText the inSalesInvoiceFooterText to set
    */
    public void setInSalesInvoiceFooterText(String inSalesInvoiceFooterText) {
        this.inParameters.add("salesInvoiceFooterText");
        this.inSalesInvoiceFooterText = inSalesInvoiceFooterText;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxFormId the inTaxFormId to set
    */
    public void setInTaxFormId(String inTaxFormId) {
        this.inParameters.add("taxFormId");
        this.inTaxFormId = inTaxFormId;
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
     * @param inUseInvoiceIdForReturns the inUseInvoiceIdForReturns to set
    */
    public void setInUseInvoiceIdForReturns(String inUseInvoiceIdForReturns) {
        this.inParameters.add("useInvoiceIdForReturns");
        this.inUseInvoiceIdForReturns = inUseInvoiceIdForReturns;
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
        if (inParameters.contains("allocPaymentTagsToAppl")) mapValue.put("allocPaymentTagsToAppl", getInAllocPaymentTagsToAppl());
        if (inParameters.contains("baseCurrencyUomId")) mapValue.put("baseCurrencyUomId", getInBaseCurrencyUomId());
        if (inParameters.contains("cogsMethodId")) mapValue.put("cogsMethodId", getInCogsMethodId());
        if (inParameters.contains("costingMethodId")) mapValue.put("costingMethodId", getInCostingMethodId());
        if (inParameters.contains("errorGlJournalId")) mapValue.put("errorGlJournalId", getInErrorGlJournalId());
        if (inParameters.contains("fiscalYearStartDay")) mapValue.put("fiscalYearStartDay", getInFiscalYearStartDay());
        if (inParameters.contains("fiscalYearStartMonth")) mapValue.put("fiscalYearStartMonth", getInFiscalYearStartMonth());
        if (inParameters.contains("groupSalesTaxOnInvoicePdf")) mapValue.put("groupSalesTaxOnInvoicePdf", getInGroupSalesTaxOnInvoicePdf());
        if (inParameters.contains("invoiceIdPrefix")) mapValue.put("invoiceIdPrefix", getInInvoiceIdPrefix());
        if (inParameters.contains("invoiceSequenceEnumId")) mapValue.put("invoiceSequenceEnumId", getInInvoiceSequenceEnumId());
        if (inParameters.contains("lastInvoiceNumber")) mapValue.put("lastInvoiceNumber", getInLastInvoiceNumber());
        if (inParameters.contains("lastInvoiceRestartDate")) mapValue.put("lastInvoiceRestartDate", getInLastInvoiceRestartDate());
        if (inParameters.contains("lastOrderNumber")) mapValue.put("lastOrderNumber", getInLastOrderNumber());
        if (inParameters.contains("lastQuoteNumber")) mapValue.put("lastQuoteNumber", getInLastQuoteNumber());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderIdPrefix")) mapValue.put("orderIdPrefix", getInOrderIdPrefix());
        if (inParameters.contains("orderSequenceEnumId")) mapValue.put("orderSequenceEnumId", getInOrderSequenceEnumId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("quoteIdPrefix")) mapValue.put("quoteIdPrefix", getInQuoteIdPrefix());
        if (inParameters.contains("quoteSequenceEnumId")) mapValue.put("quoteSequenceEnumId", getInQuoteSequenceEnumId());
        if (inParameters.contains("refundPaymentMethodId")) mapValue.put("refundPaymentMethodId", getInRefundPaymentMethodId());
        if (inParameters.contains("salesInvoiceFooterText")) mapValue.put("salesInvoiceFooterText", getInSalesInvoiceFooterText());
        if (inParameters.contains("taxFormId")) mapValue.put("taxFormId", getInTaxFormId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useInvoiceIdForReturns")) mapValue.put("useInvoiceIdForReturns", getInUseInvoiceIdForReturns());
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
        if (mapValue.containsKey("allocPaymentTagsToAppl")) setInAllocPaymentTagsToAppl((String) mapValue.get("allocPaymentTagsToAppl"));
        if (mapValue.containsKey("baseCurrencyUomId")) setInBaseCurrencyUomId((String) mapValue.get("baseCurrencyUomId"));
        if (mapValue.containsKey("cogsMethodId")) setInCogsMethodId((String) mapValue.get("cogsMethodId"));
        if (mapValue.containsKey("costingMethodId")) setInCostingMethodId((String) mapValue.get("costingMethodId"));
        if (mapValue.containsKey("errorGlJournalId")) setInErrorGlJournalId((String) mapValue.get("errorGlJournalId"));
        if (mapValue.containsKey("fiscalYearStartDay")) setInFiscalYearStartDay((Long) mapValue.get("fiscalYearStartDay"));
        if (mapValue.containsKey("fiscalYearStartMonth")) setInFiscalYearStartMonth((Long) mapValue.get("fiscalYearStartMonth"));
        if (mapValue.containsKey("groupSalesTaxOnInvoicePdf")) setInGroupSalesTaxOnInvoicePdf((String) mapValue.get("groupSalesTaxOnInvoicePdf"));
        if (mapValue.containsKey("invoiceIdPrefix")) setInInvoiceIdPrefix((String) mapValue.get("invoiceIdPrefix"));
        if (mapValue.containsKey("invoiceSequenceEnumId")) setInInvoiceSequenceEnumId((String) mapValue.get("invoiceSequenceEnumId"));
        if (mapValue.containsKey("lastInvoiceNumber")) setInLastInvoiceNumber((Long) mapValue.get("lastInvoiceNumber"));
        if (mapValue.containsKey("lastInvoiceRestartDate")) setInLastInvoiceRestartDate((Timestamp) mapValue.get("lastInvoiceRestartDate"));
        if (mapValue.containsKey("lastOrderNumber")) setInLastOrderNumber((Long) mapValue.get("lastOrderNumber"));
        if (mapValue.containsKey("lastQuoteNumber")) setInLastQuoteNumber((Long) mapValue.get("lastQuoteNumber"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderIdPrefix")) setInOrderIdPrefix((String) mapValue.get("orderIdPrefix"));
        if (mapValue.containsKey("orderSequenceEnumId")) setInOrderSequenceEnumId((String) mapValue.get("orderSequenceEnumId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("quoteIdPrefix")) setInQuoteIdPrefix((String) mapValue.get("quoteIdPrefix"));
        if (mapValue.containsKey("quoteSequenceEnumId")) setInQuoteSequenceEnumId((String) mapValue.get("quoteSequenceEnumId"));
        if (mapValue.containsKey("refundPaymentMethodId")) setInRefundPaymentMethodId((String) mapValue.get("refundPaymentMethodId"));
        if (mapValue.containsKey("salesInvoiceFooterText")) setInSalesInvoiceFooterText((String) mapValue.get("salesInvoiceFooterText"));
        if (mapValue.containsKey("taxFormId")) setInTaxFormId((String) mapValue.get("taxFormId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useInvoiceIdForReturns")) setInUseInvoiceIdForReturns((String) mapValue.get("useInvoiceIdForReturns"));
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
     * Construct a <code>CreatePartyAcctgPreferenceService</code> from the input values of the given <code>CreatePartyAcctgPreferenceService</code>.
     * @param input a <code>CreatePartyAcctgPreferenceService</code>
     */
    public static CreatePartyAcctgPreferenceService fromInput(CreatePartyAcctgPreferenceService input) {
        CreatePartyAcctgPreferenceService service = new CreatePartyAcctgPreferenceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreatePartyAcctgPreferenceService</code> from the output values of the given <code>CreatePartyAcctgPreferenceService</code>.
     * @param output a <code>CreatePartyAcctgPreferenceService</code>
     */
    public static CreatePartyAcctgPreferenceService fromOutput(CreatePartyAcctgPreferenceService output) {
        CreatePartyAcctgPreferenceService service = new CreatePartyAcctgPreferenceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreatePartyAcctgPreferenceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreatePartyAcctgPreferenceService fromInput(Map<String, Object> mapValue) {
        CreatePartyAcctgPreferenceService service = new CreatePartyAcctgPreferenceService();
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
     * Construct a <code>CreatePartyAcctgPreferenceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreatePartyAcctgPreferenceService fromOutput(Map<String, Object> mapValue) {
        CreatePartyAcctgPreferenceService service = new CreatePartyAcctgPreferenceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
