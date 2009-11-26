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
 * Get ATP/QOH Availability for a list of OrderItems by summing over all facilities.  If the item is a MARKETING_PKG_AUTO/PICK, then put its quantity available from components
            in the mktgPkgATPMap and mktgPkgQOHMap..
 * Auto generated base service entity getProductInventoryAndFacilitySummary.
 *
 * Engine: java
 * Location: org.ofbiz.product.inventory.InventoryServices
 * Invoke: getProductInventoryAndFacilitySummary
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services_facility.xml
 */
public class GetProductInventoryAndFacilitySummaryService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getProductInventoryAndFacilitySummary";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.FALSE;

    /** The enumeration of input parameters. */
    public static enum In {
        checkTime("checkTime"),
        facilityId("facilityId"),
        locale("locale"),
        minimumStock("minimumStock"),
        productId("productId"),
        statusId("statusId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        defultPrice("defultPrice"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        listPrice("listPrice"),
        locale("locale"),
        offsetATPQtyAvailable("offsetATPQtyAvailable"),
        offsetQOHQtyAvailable("offsetQOHQtyAvailable"),
        quantityOnOrder("quantityOnOrder"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        totalAvailableToPromise("totalAvailableToPromise"),
        totalQuantityOnHand("totalQuantityOnHand"),
        usageQuantity("usageQuantity"),
        userLogin("userLogin"),
        wholeSalePrice("wholeSalePrice");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetProductInventoryAndFacilitySummaryService</code> instance.
     */
    public GetProductInventoryAndFacilitySummaryService() {
        super();
    }


    private Timestamp inCheckTime;
    private String inFacilityId;
    private Locale inLocale;
    private String inMinimumStock;
    private String inProductId;
    private String inStatusId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private BigDecimal outDefultPrice;
    private String outErrorMessage;
    private List outErrorMessageList;
    private BigDecimal outListPrice;
    private Locale outLocale;
    private BigDecimal outOffsetATPQtyAvailable;
    private BigDecimal outOffsetQOHQtyAvailable;
    private BigDecimal outQuantityOnOrder;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private String outTotalAvailableToPromise;
    private String outTotalQuantityOnHand;
    private BigDecimal outUsageQuantity;
    private GenericValue outUserLogin;
    private BigDecimal outWholeSalePrice;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCheckTime() {
        return this.inCheckTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
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
    public String getInMinimumStock() {
        return this.inMinimumStock;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutDefultPrice() {
        return this.outDefultPrice;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutListPrice() {
        return this.outListPrice;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutOffsetATPQtyAvailable() {
        return this.outOffsetATPQtyAvailable;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutOffsetQOHQtyAvailable() {
        return this.outOffsetQOHQtyAvailable;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutQuantityOnOrder() {
        return this.outQuantityOnOrder;
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
     * @return <code>String</code>
     */
    public String getOutTotalAvailableToPromise() {
        return this.outTotalAvailableToPromise;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutTotalQuantityOnHand() {
        return this.outTotalQuantityOnHand;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutUsageQuantity() {
        return this.outUsageQuantity;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutWholeSalePrice() {
        return this.outWholeSalePrice;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCheckTime the inCheckTime to set
    */
    public void setInCheckTime(Timestamp inCheckTime) {
        this.inParameters.add("checkTime");
        this.inCheckTime = inCheckTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
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
     * @param inMinimumStock the inMinimumStock to set
    */
    public void setInMinimumStock(String inMinimumStock) {
        this.inParameters.add("minimumStock");
        this.inMinimumStock = inMinimumStock;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
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
     * @param outDefultPrice the outDefultPrice to set
    */
    public void setOutDefultPrice(BigDecimal outDefultPrice) {
        this.outParameters.add("defultPrice");
        this.outDefultPrice = outDefultPrice;
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
     * @param outListPrice the outListPrice to set
    */
    public void setOutListPrice(BigDecimal outListPrice) {
        this.outParameters.add("listPrice");
        this.outListPrice = outListPrice;
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
     * @param outOffsetATPQtyAvailable the outOffsetATPQtyAvailable to set
    */
    public void setOutOffsetATPQtyAvailable(BigDecimal outOffsetATPQtyAvailable) {
        this.outParameters.add("offsetATPQtyAvailable");
        this.outOffsetATPQtyAvailable = outOffsetATPQtyAvailable;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outOffsetQOHQtyAvailable the outOffsetQOHQtyAvailable to set
    */
    public void setOutOffsetQOHQtyAvailable(BigDecimal outOffsetQOHQtyAvailable) {
        this.outParameters.add("offsetQOHQtyAvailable");
        this.outOffsetQOHQtyAvailable = outOffsetQOHQtyAvailable;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outQuantityOnOrder the outQuantityOnOrder to set
    */
    public void setOutQuantityOnOrder(BigDecimal outQuantityOnOrder) {
        this.outParameters.add("quantityOnOrder");
        this.outQuantityOnOrder = outQuantityOnOrder;
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
     * @param outTotalAvailableToPromise the outTotalAvailableToPromise to set
    */
    public void setOutTotalAvailableToPromise(String outTotalAvailableToPromise) {
        this.outParameters.add("totalAvailableToPromise");
        this.outTotalAvailableToPromise = outTotalAvailableToPromise;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTotalQuantityOnHand the outTotalQuantityOnHand to set
    */
    public void setOutTotalQuantityOnHand(String outTotalQuantityOnHand) {
        this.outParameters.add("totalQuantityOnHand");
        this.outTotalQuantityOnHand = outTotalQuantityOnHand;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUsageQuantity the outUsageQuantity to set
    */
    public void setOutUsageQuantity(BigDecimal outUsageQuantity) {
        this.outParameters.add("usageQuantity");
        this.outUsageQuantity = outUsageQuantity;
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
     * @param outWholeSalePrice the outWholeSalePrice to set
    */
    public void setOutWholeSalePrice(BigDecimal outWholeSalePrice) {
        this.outParameters.add("wholeSalePrice");
        this.outWholeSalePrice = outWholeSalePrice;
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
        if (inParameters.contains("checkTime")) mapValue.put("checkTime", getInCheckTime());
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("minimumStock")) mapValue.put("minimumStock", getInMinimumStock());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("defultPrice")) mapValue.put("defultPrice", getOutDefultPrice());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("listPrice")) mapValue.put("listPrice", getOutListPrice());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("offsetATPQtyAvailable")) mapValue.put("offsetATPQtyAvailable", getOutOffsetATPQtyAvailable());
        if (outParameters.contains("offsetQOHQtyAvailable")) mapValue.put("offsetQOHQtyAvailable", getOutOffsetQOHQtyAvailable());
        if (outParameters.contains("quantityOnOrder")) mapValue.put("quantityOnOrder", getOutQuantityOnOrder());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("totalAvailableToPromise")) mapValue.put("totalAvailableToPromise", getOutTotalAvailableToPromise());
        if (outParameters.contains("totalQuantityOnHand")) mapValue.put("totalQuantityOnHand", getOutTotalQuantityOnHand());
        if (outParameters.contains("usageQuantity")) mapValue.put("usageQuantity", getOutUsageQuantity());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("wholeSalePrice")) mapValue.put("wholeSalePrice", getOutWholeSalePrice());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("checkTime")) setInCheckTime((Timestamp) mapValue.get("checkTime"));
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("minimumStock")) setInMinimumStock((String) mapValue.get("minimumStock"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("defultPrice")) setOutDefultPrice((BigDecimal) mapValue.get("defultPrice"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("listPrice")) setOutListPrice((BigDecimal) mapValue.get("listPrice"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("offsetATPQtyAvailable")) setOutOffsetATPQtyAvailable((BigDecimal) mapValue.get("offsetATPQtyAvailable"));
        if (mapValue.containsKey("offsetQOHQtyAvailable")) setOutOffsetQOHQtyAvailable((BigDecimal) mapValue.get("offsetQOHQtyAvailable"));
        if (mapValue.containsKey("quantityOnOrder")) setOutQuantityOnOrder((BigDecimal) mapValue.get("quantityOnOrder"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("totalAvailableToPromise")) setOutTotalAvailableToPromise((String) mapValue.get("totalAvailableToPromise"));
        if (mapValue.containsKey("totalQuantityOnHand")) setOutTotalQuantityOnHand((String) mapValue.get("totalQuantityOnHand"));
        if (mapValue.containsKey("usageQuantity")) setOutUsageQuantity((BigDecimal) mapValue.get("usageQuantity"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("wholeSalePrice")) setOutWholeSalePrice((BigDecimal) mapValue.get("wholeSalePrice"));
    }

    /**
     * Construct a <code>GetProductInventoryAndFacilitySummaryService</code> from the input values of the given <code>GetProductInventoryAndFacilitySummaryService</code>.
     * @param input a <code>GetProductInventoryAndFacilitySummaryService</code>
     */
    public static GetProductInventoryAndFacilitySummaryService fromInput(GetProductInventoryAndFacilitySummaryService input) {
        GetProductInventoryAndFacilitySummaryService service = new GetProductInventoryAndFacilitySummaryService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetProductInventoryAndFacilitySummaryService</code> from the output values of the given <code>GetProductInventoryAndFacilitySummaryService</code>.
     * @param output a <code>GetProductInventoryAndFacilitySummaryService</code>
     */
    public static GetProductInventoryAndFacilitySummaryService fromOutput(GetProductInventoryAndFacilitySummaryService output) {
        GetProductInventoryAndFacilitySummaryService service = new GetProductInventoryAndFacilitySummaryService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetProductInventoryAndFacilitySummaryService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetProductInventoryAndFacilitySummaryService fromInput(Map<String, Object> mapValue) {
        GetProductInventoryAndFacilitySummaryService service = new GetProductInventoryAndFacilitySummaryService();
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
     * Construct a <code>GetProductInventoryAndFacilitySummaryService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetProductInventoryAndFacilitySummaryService fromOutput(Map<String, Object> mapValue) {
        GetProductInventoryAndFacilitySummaryService service = new GetProductInventoryAndFacilitySummaryService();
        service.putAllOutput(mapValue);
        return service;
    }
}
