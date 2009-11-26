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
 * Gets Picklist Data.
 * Auto generated base service entity findOrdersToPickMove.
 *
 * Engine: java
 * Location: org.opentaps.warehouse.picking.PickingServices
 * Invoke: findOrdersToPickMove
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/warehouse/servicedef/services_shipping.xml
 */
public class FindOrdersToPickMoveService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "findOrdersToPickMove";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        facilityId("facilityId"),
        groupByNoOfOrderItems("groupByNoOfOrderItems"),
        groupByShippingMethod("groupByShippingMethod"),
        groupByWarehouseArea("groupByWarehouseArea"),
        isRushOrder("isRushOrder"),
        locale("locale"),
        maxNumberOfOrders("maxNumberOfOrders"),
        orderHeaderList("orderHeaderList"),
        shipmentMethodTypeId("shipmentMethodTypeId"),
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
        nReturnedOrders("nReturnedOrders"),
        pickMoveByShipmentMethodInfoList("pickMoveByShipmentMethodInfoList"),
        pickMoveInfoList("pickMoveInfoList"),
        responseMessage("responseMessage"),
        rushOrderInfo("rushOrderInfo"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>FindOrdersToPickMoveService</code> instance.
     */
    public FindOrdersToPickMoveService() {
        super();
    }


    private String inFacilityId;
    private String inGroupByNoOfOrderItems;
    private String inGroupByShippingMethod;
    private String inGroupByWarehouseArea;
    private String inIsRushOrder;
    private Locale inLocale;
    private Long inMaxNumberOfOrders;
    private List inOrderHeaderList;
    private String inShipmentMethodTypeId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private Long outNReturnedOrders;
    private List outPickMoveByShipmentMethodInfoList;
    private List outPickMoveInfoList;
    private String outResponseMessage;
    private Map outRushOrderInfo;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

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
     * @return <code>String</code>
     */
    public String getInGroupByNoOfOrderItems() {
        return this.inGroupByNoOfOrderItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupByShippingMethod() {
        return this.inGroupByShippingMethod;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupByWarehouseArea() {
        return this.inGroupByWarehouseArea;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsRushOrder() {
        return this.inIsRushOrder;
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
     * @return <code>Long</code>
     */
    public Long getInMaxNumberOfOrders() {
        return this.inMaxNumberOfOrders;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInOrderHeaderList() {
        return this.inOrderHeaderList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentMethodTypeId() {
        return this.inShipmentMethodTypeId;
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
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutNReturnedOrders() {
        return this.outNReturnedOrders;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutPickMoveByShipmentMethodInfoList() {
        return this.outPickMoveByShipmentMethodInfoList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutPickMoveInfoList() {
        return this.outPickMoveInfoList;
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
     * @return <code>Map</code>
     */
    public Map getOutRushOrderInfo() {
        return this.outRushOrderInfo;
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
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupByNoOfOrderItems the inGroupByNoOfOrderItems to set
    */
    public void setInGroupByNoOfOrderItems(String inGroupByNoOfOrderItems) {
        this.inParameters.add("groupByNoOfOrderItems");
        this.inGroupByNoOfOrderItems = inGroupByNoOfOrderItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupByShippingMethod the inGroupByShippingMethod to set
    */
    public void setInGroupByShippingMethod(String inGroupByShippingMethod) {
        this.inParameters.add("groupByShippingMethod");
        this.inGroupByShippingMethod = inGroupByShippingMethod;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupByWarehouseArea the inGroupByWarehouseArea to set
    */
    public void setInGroupByWarehouseArea(String inGroupByWarehouseArea) {
        this.inParameters.add("groupByWarehouseArea");
        this.inGroupByWarehouseArea = inGroupByWarehouseArea;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsRushOrder the inIsRushOrder to set
    */
    public void setInIsRushOrder(String inIsRushOrder) {
        this.inParameters.add("isRushOrder");
        this.inIsRushOrder = inIsRushOrder;
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
     * @param inMaxNumberOfOrders the inMaxNumberOfOrders to set
    */
    public void setInMaxNumberOfOrders(Long inMaxNumberOfOrders) {
        this.inParameters.add("maxNumberOfOrders");
        this.inMaxNumberOfOrders = inMaxNumberOfOrders;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderHeaderList the inOrderHeaderList to set
    */
    public void setInOrderHeaderList(List inOrderHeaderList) {
        this.inParameters.add("orderHeaderList");
        this.inOrderHeaderList = inOrderHeaderList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentMethodTypeId the inShipmentMethodTypeId to set
    */
    public void setInShipmentMethodTypeId(String inShipmentMethodTypeId) {
        this.inParameters.add("shipmentMethodTypeId");
        this.inShipmentMethodTypeId = inShipmentMethodTypeId;
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
     * This parameter is required.
     * @param outNReturnedOrders the outNReturnedOrders to set
    */
    public void setOutNReturnedOrders(Long outNReturnedOrders) {
        this.outParameters.add("nReturnedOrders");
        this.outNReturnedOrders = outNReturnedOrders;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPickMoveByShipmentMethodInfoList the outPickMoveByShipmentMethodInfoList to set
    */
    public void setOutPickMoveByShipmentMethodInfoList(List outPickMoveByShipmentMethodInfoList) {
        this.outParameters.add("pickMoveByShipmentMethodInfoList");
        this.outPickMoveByShipmentMethodInfoList = outPickMoveByShipmentMethodInfoList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPickMoveInfoList the outPickMoveInfoList to set
    */
    public void setOutPickMoveInfoList(List outPickMoveInfoList) {
        this.outParameters.add("pickMoveInfoList");
        this.outPickMoveInfoList = outPickMoveInfoList;
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
     * @param outRushOrderInfo the outRushOrderInfo to set
    */
    public void setOutRushOrderInfo(Map outRushOrderInfo) {
        this.outParameters.add("rushOrderInfo");
        this.outRushOrderInfo = outRushOrderInfo;
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
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("groupByNoOfOrderItems")) mapValue.put("groupByNoOfOrderItems", getInGroupByNoOfOrderItems());
        if (inParameters.contains("groupByShippingMethod")) mapValue.put("groupByShippingMethod", getInGroupByShippingMethod());
        if (inParameters.contains("groupByWarehouseArea")) mapValue.put("groupByWarehouseArea", getInGroupByWarehouseArea());
        if (inParameters.contains("isRushOrder")) mapValue.put("isRushOrder", getInIsRushOrder());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxNumberOfOrders")) mapValue.put("maxNumberOfOrders", getInMaxNumberOfOrders());
        if (inParameters.contains("orderHeaderList")) mapValue.put("orderHeaderList", getInOrderHeaderList());
        if (inParameters.contains("shipmentMethodTypeId")) mapValue.put("shipmentMethodTypeId", getInShipmentMethodTypeId());
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
        if (outParameters.contains("nReturnedOrders")) mapValue.put("nReturnedOrders", getOutNReturnedOrders());
        if (outParameters.contains("pickMoveByShipmentMethodInfoList")) mapValue.put("pickMoveByShipmentMethodInfoList", getOutPickMoveByShipmentMethodInfoList());
        if (outParameters.contains("pickMoveInfoList")) mapValue.put("pickMoveInfoList", getOutPickMoveInfoList());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("rushOrderInfo")) mapValue.put("rushOrderInfo", getOutRushOrderInfo());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("groupByNoOfOrderItems")) setInGroupByNoOfOrderItems((String) mapValue.get("groupByNoOfOrderItems"));
        if (mapValue.containsKey("groupByShippingMethod")) setInGroupByShippingMethod((String) mapValue.get("groupByShippingMethod"));
        if (mapValue.containsKey("groupByWarehouseArea")) setInGroupByWarehouseArea((String) mapValue.get("groupByWarehouseArea"));
        if (mapValue.containsKey("isRushOrder")) setInIsRushOrder((String) mapValue.get("isRushOrder"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxNumberOfOrders")) setInMaxNumberOfOrders((Long) mapValue.get("maxNumberOfOrders"));
        if (mapValue.containsKey("orderHeaderList")) setInOrderHeaderList((List) mapValue.get("orderHeaderList"));
        if (mapValue.containsKey("shipmentMethodTypeId")) setInShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("nReturnedOrders")) setOutNReturnedOrders((Long) mapValue.get("nReturnedOrders"));
        if (mapValue.containsKey("pickMoveByShipmentMethodInfoList")) setOutPickMoveByShipmentMethodInfoList((List) mapValue.get("pickMoveByShipmentMethodInfoList"));
        if (mapValue.containsKey("pickMoveInfoList")) setOutPickMoveInfoList((List) mapValue.get("pickMoveInfoList"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("rushOrderInfo")) setOutRushOrderInfo((Map) mapValue.get("rushOrderInfo"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>FindOrdersToPickMoveService</code> from the input values of the given <code>FindOrdersToPickMoveService</code>.
     * @param input a <code>FindOrdersToPickMoveService</code>
     */
    public static FindOrdersToPickMoveService fromInput(FindOrdersToPickMoveService input) {
        FindOrdersToPickMoveService service = new FindOrdersToPickMoveService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>FindOrdersToPickMoveService</code> from the output values of the given <code>FindOrdersToPickMoveService</code>.
     * @param output a <code>FindOrdersToPickMoveService</code>
     */
    public static FindOrdersToPickMoveService fromOutput(FindOrdersToPickMoveService output) {
        FindOrdersToPickMoveService service = new FindOrdersToPickMoveService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>FindOrdersToPickMoveService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static FindOrdersToPickMoveService fromInput(Map<String, Object> mapValue) {
        FindOrdersToPickMoveService service = new FindOrdersToPickMoveService();
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
     * Construct a <code>FindOrdersToPickMoveService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static FindOrdersToPickMoveService fromOutput(Map<String, Object> mapValue) {
        FindOrdersToPickMoveService service = new FindOrdersToPickMoveService();
        service.putAllOutput(mapValue);
        return service;
    }
}
