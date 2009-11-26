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
 * Issues order item quantity specified to the shipment, then receives inventory for that item and quantity, 
            creating a new shipment if necessary. Overrides the OFBiz issueOrderItemToShipmentAndReceiveAgainstPO service.
            If completePurchaseOrder is Y, then this will run the completePurchaseOrder service after receiving any specified
            inventory.  Unreserved inventory will be cancelled.
        .
 * Auto generated base service entity warehouse.issueOrderItemToShipmentAndReceiveAgainstPO.
 *
 * Engine: java
 * Location: org.opentaps.warehouse.inventory.InventoryServices
 * Invoke: issueOrderItemToShipmentAndReceiveAgainstPO
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/warehouse/servicedef/services_inventory.xml
 */
public class WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "warehouse.issueOrderItemToShipmentAndReceiveAgainstPO";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        rowSubmit("_rowSubmit"),
        completePurchaseOrder("completePurchaseOrder"),
        currencyUomId("currencyUomId"),
        facilityId("facilityId"),
        inventoryItemTypeIds("inventoryItemTypeIds"),
        locale("locale"),
        lotIds("lotIds"),
        orderItemSeqIds("orderItemSeqIds"),
        ownerPartyId("ownerPartyId"),
        productIds("productIds"),
        purchaseOrderId("purchaseOrderId"),
        quantitiesAccepted("quantitiesAccepted"),
        quantitiesRejected("quantitiesRejected"),
        shipGroupSeqId("shipGroupSeqId"),
        shipmentId("shipmentId"),
        timeZone("timeZone"),
        unitCosts("unitCosts"),
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
        shipmentId("shipmentId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code> instance.
     */
    public WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService() {
        super();
    }


    private Map inRowSubmit;
    private String inCompletePurchaseOrder;
    private String inCurrencyUomId;
    private String inFacilityId;
    private Map inInventoryItemTypeIds;
    private Locale inLocale;
    private Map inLotIds;
    private Map inOrderItemSeqIds;
    private String inOwnerPartyId;
    private Map inProductIds;
    private String inPurchaseOrderId;
    private Map inQuantitiesAccepted;
    private Map inQuantitiesRejected;
    private String inShipGroupSeqId;
    private String inShipmentId;
    private TimeZone inTimeZone;
    private Map inUnitCosts;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outShipmentId;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInRowSubmit() {
        return this.inRowSubmit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCompletePurchaseOrder() {
        return this.inCompletePurchaseOrder;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInInventoryItemTypeIds() {
        return this.inInventoryItemTypeIds;
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
     * @return <code>Map</code>
     */
    public Map getInLotIds() {
        return this.inLotIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInOrderItemSeqIds() {
        return this.inOrderItemSeqIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOwnerPartyId() {
        return this.inOwnerPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInProductIds() {
        return this.inProductIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPurchaseOrderId() {
        return this.inPurchaseOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInQuantitiesAccepted() {
        return this.inQuantitiesAccepted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInQuantitiesRejected() {
        return this.inQuantitiesRejected;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentId() {
        return this.inShipmentId;
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
     * @return <code>Map</code>
     */
    public Map getInUnitCosts() {
        return this.inUnitCosts;
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
    public String getOutShipmentId() {
        return this.outShipmentId;
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
     * This parameter is required.
     * @param inRowSubmit the inRowSubmit to set
    */
    public void setInRowSubmit(Map inRowSubmit) {
        this.inParameters.add("_rowSubmit");
        this.inRowSubmit = inRowSubmit;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCompletePurchaseOrder the inCompletePurchaseOrder to set
    */
    public void setInCompletePurchaseOrder(String inCompletePurchaseOrder) {
        this.inParameters.add("completePurchaseOrder");
        this.inCompletePurchaseOrder = inCompletePurchaseOrder;
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
     * This parameter is required.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInventoryItemTypeIds the inInventoryItemTypeIds to set
    */
    public void setInInventoryItemTypeIds(Map inInventoryItemTypeIds) {
        this.inParameters.add("inventoryItemTypeIds");
        this.inInventoryItemTypeIds = inInventoryItemTypeIds;
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
     * @param inLotIds the inLotIds to set
    */
    public void setInLotIds(Map inLotIds) {
        this.inParameters.add("lotIds");
        this.inLotIds = inLotIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderItemSeqIds the inOrderItemSeqIds to set
    */
    public void setInOrderItemSeqIds(Map inOrderItemSeqIds) {
        this.inParameters.add("orderItemSeqIds");
        this.inOrderItemSeqIds = inOrderItemSeqIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOwnerPartyId the inOwnerPartyId to set
    */
    public void setInOwnerPartyId(String inOwnerPartyId) {
        this.inParameters.add("ownerPartyId");
        this.inOwnerPartyId = inOwnerPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductIds the inProductIds to set
    */
    public void setInProductIds(Map inProductIds) {
        this.inParameters.add("productIds");
        this.inProductIds = inProductIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPurchaseOrderId the inPurchaseOrderId to set
    */
    public void setInPurchaseOrderId(String inPurchaseOrderId) {
        this.inParameters.add("purchaseOrderId");
        this.inPurchaseOrderId = inPurchaseOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inQuantitiesAccepted the inQuantitiesAccepted to set
    */
    public void setInQuantitiesAccepted(Map inQuantitiesAccepted) {
        this.inParameters.add("quantitiesAccepted");
        this.inQuantitiesAccepted = inQuantitiesAccepted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuantitiesRejected the inQuantitiesRejected to set
    */
    public void setInQuantitiesRejected(Map inQuantitiesRejected) {
        this.inParameters.add("quantitiesRejected");
        this.inQuantitiesRejected = inQuantitiesRejected;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentId the inShipmentId to set
    */
    public void setInShipmentId(String inShipmentId) {
        this.inParameters.add("shipmentId");
        this.inShipmentId = inShipmentId;
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
     * @param inUnitCosts the inUnitCosts to set
    */
    public void setInUnitCosts(Map inUnitCosts) {
        this.inParameters.add("unitCosts");
        this.inUnitCosts = inUnitCosts;
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
     * @param outShipmentId the outShipmentId to set
    */
    public void setOutShipmentId(String outShipmentId) {
        this.outParameters.add("shipmentId");
        this.outShipmentId = outShipmentId;
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
        if (inParameters.contains("_rowSubmit")) mapValue.put("_rowSubmit", getInRowSubmit());
        if (inParameters.contains("completePurchaseOrder")) mapValue.put("completePurchaseOrder", getInCompletePurchaseOrder());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("inventoryItemTypeIds")) mapValue.put("inventoryItemTypeIds", getInInventoryItemTypeIds());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("lotIds")) mapValue.put("lotIds", getInLotIds());
        if (inParameters.contains("orderItemSeqIds")) mapValue.put("orderItemSeqIds", getInOrderItemSeqIds());
        if (inParameters.contains("ownerPartyId")) mapValue.put("ownerPartyId", getInOwnerPartyId());
        if (inParameters.contains("productIds")) mapValue.put("productIds", getInProductIds());
        if (inParameters.contains("purchaseOrderId")) mapValue.put("purchaseOrderId", getInPurchaseOrderId());
        if (inParameters.contains("quantitiesAccepted")) mapValue.put("quantitiesAccepted", getInQuantitiesAccepted());
        if (inParameters.contains("quantitiesRejected")) mapValue.put("quantitiesRejected", getInQuantitiesRejected());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
        if (inParameters.contains("shipmentId")) mapValue.put("shipmentId", getInShipmentId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("unitCosts")) mapValue.put("unitCosts", getInUnitCosts());
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
        if (outParameters.contains("shipmentId")) mapValue.put("shipmentId", getOutShipmentId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("_rowSubmit")) setInRowSubmit((Map) mapValue.get("_rowSubmit"));
        if (mapValue.containsKey("completePurchaseOrder")) setInCompletePurchaseOrder((String) mapValue.get("completePurchaseOrder"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("inventoryItemTypeIds")) setInInventoryItemTypeIds((Map) mapValue.get("inventoryItemTypeIds"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("lotIds")) setInLotIds((Map) mapValue.get("lotIds"));
        if (mapValue.containsKey("orderItemSeqIds")) setInOrderItemSeqIds((Map) mapValue.get("orderItemSeqIds"));
        if (mapValue.containsKey("ownerPartyId")) setInOwnerPartyId((String) mapValue.get("ownerPartyId"));
        if (mapValue.containsKey("productIds")) setInProductIds((Map) mapValue.get("productIds"));
        if (mapValue.containsKey("purchaseOrderId")) setInPurchaseOrderId((String) mapValue.get("purchaseOrderId"));
        if (mapValue.containsKey("quantitiesAccepted")) setInQuantitiesAccepted((Map) mapValue.get("quantitiesAccepted"));
        if (mapValue.containsKey("quantitiesRejected")) setInQuantitiesRejected((Map) mapValue.get("quantitiesRejected"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("shipmentId")) setInShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("unitCosts")) setInUnitCosts((Map) mapValue.get("unitCosts"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shipmentId")) setOutShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code> from the input values of the given <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code>.
     * @param input a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code>
     */
    public static WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService fromInput(WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService input) {
        WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService service = new WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code> from the output values of the given <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code>.
     * @param output a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code>
     */
    public static WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService fromOutput(WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService output) {
        WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService service = new WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService fromInput(Map<String, Object> mapValue) {
        WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService service = new WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService();
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
     * Construct a <code>WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService fromOutput(Map<String, Object> mapValue) {
        WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService service = new WarehouseIssueOrderItemToShipmentAndReceiveAgainstPOService();
        service.putAllOutput(mapValue);
        return service;
    }
}
