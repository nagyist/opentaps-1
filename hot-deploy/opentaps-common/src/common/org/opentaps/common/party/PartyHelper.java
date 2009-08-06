/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 *
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
 */
/* Copyright (c) 2005-2006 Open Source Strategies, Inc. */
/*
 *  Copyright (c) 2001-2005 The Open For Business Project - www.ofbiz.org
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a
 *  copy of this software and associated documentation files (the "Software"),
 *  to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense,
 *  and/or sell copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included
 *  in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 *  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 *  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 *  CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 *  OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 *  THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.opentaps.common.party;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javolution.util.FastList;

import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilDateTime;
import org.ofbiz.base.util.UtilFormatOut;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.base.util.UtilValidate;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.entity.condition.EntityConditionList;
import org.ofbiz.entity.condition.EntityExpr;
import org.ofbiz.entity.condition.EntityOperator;
import org.ofbiz.entity.util.EntityUtil;
import org.ofbiz.service.GenericServiceException;
import org.ofbiz.service.LocalDispatcher;
import org.ofbiz.service.ServiceUtil;
import org.opentaps.common.util.UtilConfig;
import org.opentaps.domain.base.entities.Party;
import org.opentaps.foundation.repository.RepositoryException;

/**
 * Party Helper methods which are designed to provide a consistent set of APIs that can be reused by
 * higher level services.
 * TODO this came from CRMSFA PartyHelper.  The strategy for refactoring crmsfa is to create a CrmPartyHelper that extends this.
 *
 * @author     <a href="mailto:leon@opensourcestrategies.com">Leon Torres</a>
 * @version    $Rev: 548 $
 */
public class PartyHelper {

    public static final String module = PartyHelper.class.getName();
    public static List<String> CLIENT_PARTY_ROLES = Arrays.asList("ACCOUNT", "CONTACT", "PROSPECT", "PARTNER");

    /**
     * A helper method which finds the first valid roleTypeId for a partyId, using a List of possible roleTypeIds.
     *
     * @param partyId the party id
     * @param possibleRoleTypeIds a List of roleTypeIds
     * @param delegator a <code>GenericDelegator</code>
     * @return the first roleTypeId from possibleRoleTypeIds which is actually found in PartyRole for the given partyId
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static String getFirstValidRoleTypeId(String partyId, List possibleRoleTypeIds, GenericDelegator delegator) throws GenericEntityException {

        List partyRoles = delegator.findByAndCache("PartyRole", UtilMisc.toMap("partyId", partyId));

        // iterate across all possible roleTypeIds from the parameter
        Iterator iterValid = possibleRoleTypeIds.iterator();
        while (iterValid.hasNext()) {
            String possibleRoleTypeId = (String) iterValid.next();

            // try to look for each one in the list of PartyRoles
            Iterator partyRolesIter = partyRoles.iterator();
            while (partyRolesIter.hasNext()) {
                GenericValue partyRole = (GenericValue) partyRolesIter.next();
                if (possibleRoleTypeId.equals(partyRole.getString("roleTypeId")))  {
                    return possibleRoleTypeId;
                }
            }
        }
        return null;
    }

    /**
     * A helper method for creating a PartyRelationship entity from partyIdTo to partyIdFrom with specified partyRelationshipTypeId, roleTypeIdFrom,
     * a List of valid roles for the to-party, and a flag to expire any existing relationships between the two parties of the same
     * type.   The idea is that several services would do validation and then use this method to do all the work.
     *
     * @param partyIdTo the party id to of the PartyRelationship to create
     * @param partyIdFrom the party id from of the PartyRelationship to create
     * @param roleTypeIdFrom the role type id from of the PartyRelationship to create
     * @param partyRelationshipTypeId the partyRelationshipTypeId of the PartyRelationship to create
     * @param securityGroupId the securityGroupId of the PartyRelationship to create
     * @param validToPartyRoles a List of roleTypeIds which are valid for the partyIdTo in the create relationship.  It will cycle
     * through until the first of these roles is actually associated with partyIdTo and then create a PartyRelationship using that
     * roleTypeId.  If none of these are associated with partyIdTo, then it will return false
     * @param fromDate the from date of the PartyRelationship to create
     * @param expireExistingRelationships  If set to true, will look for all existing PartyRelationships of partyIdFrom, partyRelationshipTypeId
     * and expire all of them as of the passed in fromDate
     * @param userLogin a <code>GenericValue</code> value
     * @param delegator a <code>GenericDelegator</code> value
     * @param dispatcher a <code>LocalDispatcher</code> value
     * @return <code>false</code> if no relationship was created or <code>true</code> if operation succeeds
     * @throws GenericEntityException if an error occurs
     * @throws GenericServiceException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static boolean createNewPartyToRelationship(String partyIdTo, String partyIdFrom, String roleTypeIdFrom, String partyRelationshipTypeId, String securityGroupId, List validToPartyRoles, Timestamp fromDate, boolean expireExistingRelationships, GenericValue userLogin, GenericDelegator delegator, LocalDispatcher dispatcher) throws GenericEntityException, GenericServiceException {

        // get the first valid roleTypeIdTo from a list of possible roles for the partyIdTo
        // this will be the role we use as roleTypeIdTo in PartyRelationship.
        String roleTypeIdTo = getFirstValidRoleTypeId(partyIdTo, validToPartyRoles, delegator);

        // if no matching roles were found, then no relationship created
        if (roleTypeIdTo == null) {
            return false;
        }

        /*
         * if expireExistingRelationships is true, then find all existing PartyRelationships with partyIdFrom and partyRelationshipTypeId which
         * are not expired on the fromDate and then expire them
         */
        if (expireExistingRelationships) {
            List partyRelationships = delegator.findByAnd("PartyRelationship", UtilMisc.toMap("partyIdFrom", partyIdFrom, "partyRelationshipTypeId", partyRelationshipTypeId));
            expirePartyRelationships(partyRelationships, fromDate, dispatcher, userLogin);
        }

        // call createPartyRelationship service to create PartyRelationship using parameters and the role we just found
        Map input = UtilMisc.toMap("partyIdTo", partyIdTo, "roleTypeIdTo", roleTypeIdTo, "partyIdFrom", partyIdFrom, "roleTypeIdFrom", roleTypeIdFrom);
        input.put("partyRelationshipTypeId", partyRelationshipTypeId);
        input.put("securityGroupId", securityGroupId);
        input.put("fromDate", fromDate);
        input.put("userLogin", userLogin);
        Map serviceResult = dispatcher.runSync("createPartyRelationship", input);

        if (ServiceUtil.isError(serviceResult)) {
            return false;
        }

        // on success return true
        return true;
    }

    /**
     * Same as above except uses a default of now for the timestamp.
     */
    @SuppressWarnings("unchecked")
    public static boolean createNewPartyToRelationship(String partyIdTo, String partyIdFrom, String roleTypeIdFrom,
            String partyRelationshipTypeId, String securityGroupId, List validToPartyRoles,
            boolean expireExistingRelationships, GenericValue userLogin, GenericDelegator delegator, LocalDispatcher dispatcher)
    throws GenericEntityException, GenericServiceException {
        return createNewPartyToRelationship(partyIdTo, partyIdFrom, roleTypeIdFrom,
                partyRelationshipTypeId, securityGroupId, validToPartyRoles, UtilDateTime.nowTimestamp(),
                expireExistingRelationships, userLogin, delegator, dispatcher);
    }

    /**
     * Expires a list of PartyRelationships that are still active on expireDate.
     * @param partyRelationships a <code>List</code> of <code>PartyRelationship</code> to expire
     * @param expireDate the expiration date to set
     * @param dispatcher a <code>LocalDispatcher</code> value
     * @param userLogin a <code>GenericValue</code> value
     * @exception GenericServiceException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static void expirePartyRelationships(List partyRelationships, Timestamp expireDate, LocalDispatcher dispatcher, GenericValue userLogin) throws GenericServiceException {
        List relationsActiveOnFromDate = EntityUtil.filterByDate(partyRelationships, expireDate);

        // to expire on expireDate, set the thruDate to the expireDate in the parameter and call updatePartyRelationship service
        Iterator iter = relationsActiveOnFromDate.iterator();
        while (iter.hasNext()) {
            GenericValue partyRelationship = (GenericValue) iter.next();
            Map input = UtilMisc.toMap("partyIdTo", partyRelationship.getString("partyIdTo"), "roleTypeIdTo", partyRelationship.getString("roleTypeIdTo"),
                    "partyIdFrom", partyRelationship.getString("partyIdFrom"), "roleTypeIdFrom", partyRelationship.getString("roleTypeIdFrom"));
            input.put("fromDate", partyRelationship.getTimestamp("fromDate"));
            input.put("userLogin", userLogin);
            input.put("thruDate", expireDate);
            Map serviceResult = dispatcher.runSync("updatePartyRelationship", input);
            if (ServiceUtil.isError(serviceResult)) {
                throw new GenericServiceException("Failed to expire PartyRelationship with values: " + input.toString());
            }
        }
    }

    /**
     * Common method used by getCurrentlyResponsibleParty and related methods. This method will obtain the first PartyRelationship found with the given criteria
     * and return the PartySummaryCRMView with partyId = partyRelationship.partyIdTo.
     *
     * @param   partyRelationshipTypeId         The party relationship (e.g., reps that are RESPONSIBLE_FOR an account)
     * @param   partyIdFrom                     The partyId of the account/contact/lead
     * @param   roleTypeIdFrom                  The role of the account/contact/lead (e.g., ACCOUNT, CONTACT, LEAD)
     * @param   securityGroupId                 Optional securityGroupId of the relationship
     * @param   activeDate                      Check only for active relationships as of this timestamp
     * @param   delegator a <code>GenericDelegator</code> value
     * @return  First non-expired <code>PartySummaryCRMView</code> or <code>null</code> if none found
     * @exception GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static GenericValue getActivePartyByRole(String partyRelationshipTypeId, String partyIdFrom, String roleTypeIdFrom, String securityGroupId, Timestamp activeDate, GenericDelegator delegator) throws GenericEntityException {

        Map input = UtilMisc.toMap("partyRelationshipTypeId", partyRelationshipTypeId, "partyIdFrom", partyIdFrom, "roleTypeIdFrom", roleTypeIdFrom);
        if (securityGroupId != null) {
            input.put("securityGroupId", securityGroupId);
        }
        List relationships = delegator.findByAnd("PartyRelationship", input);
        List activeRelationships = EntityUtil.filterByDate(relationships, activeDate);

        // if none are found, log a message about this and return null
        if (activeRelationships.size() == 0) {
            Debug.logInfo("No active PartyRelationships found with relationship [" + partyRelationshipTypeId + "] for party [" + partyIdFrom + "] in role [" + roleTypeIdFrom + "]", module);
            return null;
        }

        // return the related party with partyId = partyRelationship.partyIdTo
        GenericValue partyRelationship = (GenericValue) activeRelationships.get(0);
        return delegator.findByPrimaryKey("PartySummaryCRMView", UtilMisc.toMap("partyId", partyRelationship.getString("partyIdTo")));
    }

    /**
     * As above but without security group Id specified.
     * @param   partyRelationshipTypeId         The party relationship (e.g., reps that are RESPONSIBLE_FOR an account)
     * @param   partyIdFrom                     The partyId of the account/contact/lead
     * @param   roleTypeIdFrom                  The role of the account/contact/lead (e.g., ACCOUNT, CONTACT, LEAD)
     * @param   activeDate                      Check only for active relationships as of this timestamp
     * @param   delegator a <code>GenericDelegator</code> value
     * @return  First non-expired <code>PartySummaryCRMView</code> or <code>null</code> if none found
     * @exception GenericEntityException if an error occurs
     */
    public static GenericValue getActivePartyByRole(String partyRelationshipTypeId, String partyIdFrom, String roleTypeIdFrom, Timestamp activeDate, GenericDelegator delegator) throws GenericEntityException {
        return getActivePartyByRole(partyRelationshipTypeId, partyIdFrom, roleTypeIdFrom, null, activeDate, delegator);
    }

    /**
     * Method to copy all "To" relationships of a From party to another From party. For instance, use this method to copy all relationships of an
     * account (or optionally a specific relationship), such as the managers and reps, over to a team.
     * NOTE: This service works on unexpired relationships as of now and will need to be refactored for other Dates.
     *
     * @param partyIdFrom partyIdFrom of the <code>PartyRelationship</code> to copy
     * @param roleTypeIdFrom roleTypeIdFrom of the <code>PartyRelationship</code> to copy
     * @param partyRelationshipTypeId optional, partyRelationshipTypeId of the <code>PartyRelationship</code> to copy
     * @param newPartyIdFrom new partyIdFrom
     * @param newRoleTypeIdFrom new roleTypeIdFrom
     * @param userLogin a <code>GenericValue</code> value
     * @param delegator a <code>GenericDelegator</code> value
     * @param dispatcher a <code>LocalDispatcher</code> value
     * @exception GenericEntityException if an error occurs
     * @exception GenericServiceException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static void copyToPartyRelationships(String partyIdFrom, String roleTypeIdFrom, String partyRelationshipTypeId, String newPartyIdFrom, String newRoleTypeIdFrom, GenericValue userLogin, GenericDelegator delegator, LocalDispatcher dispatcher) throws GenericEntityException, GenericServiceException {

        // hardcoded activeDate
        Timestamp activeDate = UtilDateTime.nowTimestamp();

        // first get the unexpired relationships for the From party
        Map input = UtilMisc.toMap("partyIdFrom", partyIdFrom, "roleTypeIdFrom", roleTypeIdFrom);
        if (partyRelationshipTypeId != null) {
            input.put("partyRelationshipTypeId", partyRelationshipTypeId);
        }
        List relationships = delegator.findByAnd("PartyRelationship", input);
        List activeRelationships = EntityUtil.filterByDate(relationships, activeDate);

        for (Iterator iter = activeRelationships.iterator(); iter.hasNext();) {
            GenericValue relationship = (GenericValue) iter.next();

            input = UtilMisc.toMap("partyIdTo", relationship.getString("partyIdTo"), "roleTypeIdTo", relationship.getString("roleTypeIdTo"));
            input.put("partyIdFrom", newPartyIdFrom);
            input.put("roleTypeIdFrom", newRoleTypeIdFrom);
            input.put("fromDate", activeDate);

            // if relationship already exists, continue
            GenericValue check = delegator.findByPrimaryKey("PartyRelationship", input);
            if (check != null) {
                continue;
            }

            // create the relationship
            input.put("partyRelationshipTypeId", relationship.getString("partyRelationshipTypeId"));
            input.put("securityGroupId", relationship.getString("securityGroupId"));
            input.put("statusId", relationship.getString("statusId"));
            input.put("priorityTypeId", relationship.getString("priorityTypeId"));
            input.put("comments", relationship.getString("comments"));
            input.put("userLogin", userLogin);
            Map serviceResult = dispatcher.runSync("createPartyRelationship", input);
            if (ServiceUtil.isError(serviceResult)) {
                throw new GenericServiceException(ServiceUtil.getErrorMessage(serviceResult));
            }
        }
    }

    /**
     * Method to copy all "To" relationships of a From party to another From party. For instance, use this method to copy all relationships of an
     * account (or optionally a specific relationship), such as the managers and reps, over to a team.
     * NOTE: This service works on unexpired relationships as of now and will need to be refactored for other Dates.
     *
     * @param partyIdFrom partyIdFrom of the <code>PartyRelationship</code> to copy
     * @param roleTypeIdFrom roleTypeIdFrom of the <code>PartyRelationship</code> to copy
     * @param newPartyIdFrom new partyIdFrom
     * @param newRoleTypeIdFrom new roleTypeIdFrom
     * @param userLogin a <code>GenericValue</code> value
     * @param delegator a <code>GenericDelegator</code> value
     * @param dispatcher a <code>LocalDispatcher</code> value
     * @exception GenericEntityException if an error occurs
     * @exception GenericServiceException if an error occurs
     */
    public static void copyToPartyRelationships(String partyIdFrom, String roleTypeIdFrom, String newPartyIdFrom, String newRoleTypeIdFrom, GenericValue userLogin, GenericDelegator delegator, LocalDispatcher dispatcher) throws GenericEntityException, GenericServiceException {
        copyToPartyRelationships(partyIdFrom, roleTypeIdFrom, null, newPartyIdFrom, newRoleTypeIdFrom, userLogin, delegator, dispatcher);
    }

    /**
     * Returns the names for all partyIds using ofbiz PartyHelper.getPartyName.
     * @param partyIds the party to get the names for
     * @param delegator a <code>GenericDelegator</code> value
     * @param lastNameFirst set to <code>true</code> to put the last name first
     * @return a <code>List</code> of <code>Map</code> of the names of each party
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List<Map> getPartyNames(List<String> partyIds, GenericDelegator delegator, boolean lastNameFirst) throws GenericEntityException {
        List<Map> partyNames = new ArrayList<Map>();
        for (String partyId : partyIds) {
            partyNames.add(UtilMisc.toMap(partyId, org.ofbiz.party.party.PartyHelper.getPartyName(delegator, partyId, lastNameFirst)));
        }
        return partyNames;
    }

    /**
     * Returns names for all partyIds, first name first.
     * @param partyIds the party to get the names for
     * @param delegator a <code>GenericDelegator</code> value
     * @return a <code>List</code> of <code>Map</code> of the names of each party
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List<Map> getPartyNames(List<String> partyIds, GenericDelegator delegator) throws GenericEntityException {
        return getPartyNames(partyIds, delegator, false);
    }

    /**
     * Retrieves all contact mechs for a party meeting these criteria, oldest one (by purpose date) first.
     * @param partyId the party to find the <code>ContachMech</code> for
     * @param contactMechTypeId the type of <code>ContachMech</code> to find
     * @param contactMechPurposeTypeId the purpose of <code>ContachMech</code> to find
     * @param additionalConditions other conditions on the <code>ContachMech</code> to find
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of <code>ContachMech</code>
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List getCurrentContactMechsForParty(String partyId, String contactMechTypeId, String contactMechPurposeTypeId, List additionalConditions, GenericDelegator delegator) throws GenericEntityException {
        Timestamp now = UtilDateTime.nowTimestamp();
        List conditions = UtilMisc.toList(
                new EntityExpr("partyId", EntityOperator.EQUALS, partyId),
                new EntityExpr("contactMechPurposeTypeId", EntityOperator.EQUALS, contactMechPurposeTypeId),
                new EntityExpr("contactMechTypeId", EntityOperator.EQUALS, contactMechTypeId));
        if ("EMAIL_ADDRESS".equals(contactMechTypeId)) {
            conditions.add(new EntityExpr("infoString", EntityOperator.NOT_EQUAL, null));
        }
        if (UtilValidate.isNotEmpty(additionalConditions)) {
            conditions.addAll(additionalConditions);
        }

        // TODO: Put the filter by dates in the conditions list
        List contactMechs = delegator.findByCondition("PartyContactWithPurpose", new EntityConditionList(conditions, EntityOperator.AND), null, UtilMisc.toList("-purposeFromDate"));
        contactMechs = EntityUtil.filterByDate(contactMechs, now, "contactFromDate", "contactThruDate", true);
        contactMechs = EntityUtil.filterByDate(contactMechs, now, "purposeFromDate", "purposeThruDate", true);

        return contactMechs;
    }

    /**
     * Retrieves all contact mechs for a party meeting these criteria, oldest one (by purpose date) first.
     * @param partyId the party to find the <code>ContachMech</code> for
     * @param contactMechTypeId the type of <code>ContachMech</code> to find
     * @param contactMechPurposeTypeId the purpose of <code>ContachMech</code> to find
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of <code>ContachMech</code>
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List getCurrentContactMechsForParty(String partyId, String contactMechTypeId, String contactMechPurposeTypeId, GenericDelegator delegator) throws GenericEntityException {
        return getCurrentContactMechsForParty(partyId, contactMechTypeId, contactMechPurposeTypeId, null, delegator);
    }

    /**
     * Retrieves the email for the purpose and party which is ContactMech.infoString.
     * @param partyId the party to find the email for
     * @param contactMechPurposeTypeId the purpose of the email to find
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of email <code>ContachMech</code>
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List getEmailsForParty(String partyId, String contactMechPurposeTypeId, GenericDelegator delegator) throws GenericEntityException {
        return EntityUtil.getFieldListFromEntityList(getCurrentContactMechsForParty(partyId, "EMAIL_ADDRESS", contactMechPurposeTypeId, delegator), "infoString", true);
    }

    /**
     * Returns the first email for the party and the purpose as a String.
     * @param partyId the party to find the email for
     * @param contactMechPurposeTypeId the purpose of the email to find
     * @param delegator a <code>GenericDelegator</code> value
     * @return the email address <code>String</code>
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static String getEmailForPartyByPurpose(String partyId, String contactMechPurposeTypeId, GenericDelegator delegator) throws GenericEntityException {
        String emailAddress = null;

        List addresses = getEmailsForParty(partyId, contactMechPurposeTypeId, delegator);
        if (UtilValidate.isNotEmpty(addresses)) {
            emailAddress = (String) addresses.get(0);
        }
        return emailAddress;
    }

    /**
     * Retrieve the oldest current email address with a PRIMARY_EMAIL purposeTypeId for a party.
     * @param partyId the party to find the email for
     * @param delegator a <code>GenericDelegator</code> value
     * @return the email address <code>String</code>
     * @deprecated Use <code>org.opentaps.domain.party.Party.getPrimaryEmail()</code>
     */
    @Deprecated public static String getPrimaryEmailForParty(String partyId, GenericDelegator delegator) {
        try {
            return getEmailForPartyByPurpose(partyId, "PRIMARY_EMAIL", delegator);
        } catch (GenericEntityException e) {
            Debug.logError(e, "Unable to retrieve primary email address for partyId: " + partyId, module);
            return null;
        }
    }

    /**
     * Provides current party classification groups for a party.
     * @param partyId the party to find the classification for
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of <code>PartyClassificationGroup</code> values ordered by description
     */
    @SuppressWarnings("unchecked")
    public static List getClassificationGroupsForParty(String partyId, GenericDelegator delegator) {
        List groups = new ArrayList();
        try {
            List classifications = delegator.findByAnd("PartyClassification", UtilMisc.toMap("partyId", partyId));
            classifications = EntityUtil.filterByDate(classifications);
            List partyClassificationGroupIds = EntityUtil.getFieldListFromEntityList(classifications, "partyClassificationGroupId", true);
            if (UtilValidate.isNotEmpty(partyClassificationGroupIds)) {
                List partyClassificationGroups = delegator.findByCondition("PartyClassificationGroup", new EntityExpr("partyClassificationGroupId", EntityOperator.IN, partyClassificationGroupIds), null, UtilMisc.toList("description"));
                if (UtilValidate.isNotEmpty(partyClassificationGroups)) {
                    groups.addAll(partyClassificationGroups);
                }
            }
        } catch (GenericEntityException e) {
            Debug.logError(e, "Unable to retrieve party classification groups for partyId: " + partyId, module);
        }
        return groups;
    }

    /**
     * Provides a map of distinct combinations of account#/postalCode/countryCode from PartyCarrierAccount, keyed by carrierPartyId.
     *
     * @param partyId the party to find the <code>PartyCarrierAccounts</code> for
     * @param delegator a <code>GenericDelegator</code> value
     * @return a map of distinct combinations of account#/postalCode/countryCode from PartyCarrierAccount, keyed by carrierPartyId
     */
    @SuppressWarnings("unchecked")
    public static Map getPartyCarrierAccounts(String partyId, GenericDelegator delegator) {
        Map carrierAccountData = new HashMap();
        if (UtilValidate.isEmpty(partyId)) {
            return carrierAccountData;
        }
        List cond = UtilMisc.toList(new EntityExpr("partyId", EntityOperator.EQUALS, partyId), EntityUtil.getFilterByDateExpr());
        List<GenericValue> partyCarrierAccounts = null;
        try {
            partyCarrierAccounts = delegator.findByCondition("PartyCarrierAccount", new EntityConditionList(cond, EntityOperator.AND), null, UtilMisc.toList("accountNumber"));
        } catch (GenericEntityException e) {
            Debug.logError(e, module);
            partyCarrierAccounts = new ArrayList<GenericValue>();
        }

        Iterator pcat = partyCarrierAccounts.iterator();
        while (pcat.hasNext()) {
            GenericValue partyCarrierAccount = (GenericValue) pcat.next();

            String carrierPartyId = partyCarrierAccount.getString("carrierPartyId");
            String carrierName = org.ofbiz.party.party.PartyHelper.getPartyName(delegator, carrierPartyId, false);
            List carrierInfo = (List) carrierAccountData.get(carrierPartyId);
            if (carrierInfo == null) {
                carrierInfo = new ArrayList();
            }
            carrierAccountData.put(carrierPartyId, carrierInfo);

            String accountNumber = partyCarrierAccount.getString("accountNumber");
            String postalCode = partyCarrierAccount.getString("postalCode");
            String countryGeoCode = partyCarrierAccount.getString("countryGeoCode");
            String isDefault = partyCarrierAccount.getString("isDefault");
            Map<String, Object> accountMap = UtilMisc.toMap("carrierName", carrierName, "accountNumber", accountNumber, "postalCode", postalCode, "countryGeoCode", countryGeoCode, "isDefault", isDefault);
            if (!carrierInfo.contains(accountMap)) {
                carrierInfo.add(accountMap);
            }
        }
        return carrierAccountData;
    }

    /**
     * Checks if the given party id correspond to an internal organization.
     *
     * @param partyId a <code>String</code> value
     * @param delegator a <code>GenericDelegator</code> value
     * @return <code>true</code> if it is an internal organization
     */
    public static boolean isInternalOrganization(String partyId, GenericDelegator delegator) {
        GenericValue role = null;
        try {
            role = delegator.findByPrimaryKey("PartyRole", UtilMisc.toMap("partyId", partyId, "roleTypeId", "INTERNAL_ORGANIZATIO"));
        } catch (GenericEntityException e) {
            Debug.logError(e, module);
        }
        return (role != null);
    }

    /**
     * Retrieve the current phone numbers for a party.
     * @param partyId the party to find the phone numbers for
     * @param delegator a <code>GenericDelegator</code> value
     * @return a list of <code>PartyContactWithPurpose</code> records
     */
    @SuppressWarnings("unchecked")
    public static List<GenericValue> getPhoneNumbersForParty(String partyId, GenericDelegator delegator) {
        Timestamp now = UtilDateTime.nowTimestamp();

        List conditions = UtilMisc.toList(
                new EntityExpr("partyId", EntityOperator.EQUALS, partyId),
                new EntityExpr("contactMechPurposeTypeId", EntityOperator.LIKE, "%PHONE%"),
                new EntityExpr("contactMechTypeId", EntityOperator.EQUALS, "TELECOM_NUMBER"));

        List phoneNumbers = new ArrayList<GenericValue>();
        try {
            List<GenericValue> partyContacts = delegator.findByCondition("PartyContactWithPurpose", new EntityConditionList(conditions, EntityOperator.AND), null, UtilMisc.toList("-purposeFromDate"));
            partyContacts = EntityUtil.filterByDate(partyContacts, now, "contactFromDate", "contactThruDate", true);
            partyContacts = EntityUtil.filterByDate(partyContacts, now, "purposeFromDate", "purposeThruDate", true);
            for (GenericValue partyContact : partyContacts) {
                phoneNumbers.add(delegator.findByPrimaryKey("TelecomNumber", UtilMisc.toMap("contactMechId", partyContact.get("contactMechId"))));
            }
        } catch (GenericEntityException e) {
            Debug.logError(e, "Unable to retrieve phone numbers for partyId: " + partyId, module);
        }
        return phoneNumbers;
    }

    /**
     * Get the active partners of the given organization.
     * @param organizationPartyId the organization partyId
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of <code>PartyFromSummaryByRelationship</code> of the organization suppliers
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static List<GenericValue> getPartners(String organizationPartyId, GenericDelegator delegator) throws GenericEntityException {
        List conditions = UtilMisc.toList(
                new EntityExpr("partyIdTo", EntityOperator.EQUALS, organizationPartyId),
                new EntityExpr("roleTypeIdTo", EntityOperator.EQUALS, "INTERNAL_ORGANIZATIO"),
                new EntityExpr("roleTypeIdFrom", EntityOperator.EQUALS, "PARTNER"),
                new EntityExpr("partyRelationshipTypeId", EntityOperator.EQUALS, "PARTNER_OF"),
                EntityUtil.getFilterByDateExpr()
        );
        return delegator.findByAnd("PartyFromSummaryByRelationship", conditions);
    }

    /**
     * Generates a hyperlink URL to the correct view profile page for the given party with the given party role
     * For example, leads will get viewLead, contacts viewContact, account viewAccount, supplier viewSupplier and so on.
     * Everybody else gets to go to the party manager (should only be backend users).
     * Note that application name and control servlet mount point are hardcoded for now.
     *
     * @param party the party <code>GenericValue</code>
     * @param roleIds the list of <code>roleTypId</code> to consider for the given party
     * @param externalLoginKey the <code>externalLoginKey</code> string to add in the link
     * @return the URL to the view page for the given party
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static String createViewPageURL(GenericValue party, List<String> roleIds, String externalLoginKey) throws GenericEntityException {

        GenericDelegator delegator = party.getDelegator();
        StringBuffer uri = new StringBuffer();

        String roleTypeId = getFirstValidRoleTypeId(party.getString("partyId"), roleIds, delegator);

        if (roleTypeId != null) {
            // let's also make sure that a Client PartyRelationship exists, otherwise we shouldn't generate a view link to a CRM account, contact or lead
            EntityConditionList conditions = new EntityConditionList(UtilMisc.toList(
                    EntityUtil.getFilterByDateExpr(),
                    new EntityExpr("partyId", EntityOperator.EQUALS, party.getString("partyId")),
                    new EntityExpr("roleTypeIdFrom", EntityOperator.IN, roleIds)
            ), EntityOperator.AND);
            List<GenericValue> crmRelationships = delegator.findByConditionCache("PartyFromSummaryByRelationship", conditions, Arrays.asList("partyId"), null);
            if (crmRelationships.size() > 0) {
                uri.append("/crmsfa/control/");
                if ("PROSPECT".equals(roleTypeId)) uri.append("viewLead?");
                else if ("ACCOUNT".equals(roleTypeId)) uri.append("viewAccount?");
                else if ("CONTACT".equals(roleTypeId)) uri.append("viewContact?");
                else if ("PARTNER".equals(roleTypeId)) uri.append("viewPartner?");
                else roleTypeId = null; // default to partymgr viewprofile
            } else {
                if ("SUPPLIER".equals(roleTypeId)) {
                    // Suppliers have no relationship but should be directed to purchasing
                    uri.append("/purchasing/control/viewSupplier?");
                } else {
                    roleTypeId = null; // default to partymgr viewprofile
                }
            }
        }

        if (roleTypeId == null) {
            uri.append("/partymgr/control/viewprofile?");
            if (UtilValidate.isNotEmpty(externalLoginKey)) {
                uri.append("externalLoginKey=").append(externalLoginKey).append("&");
            }
        }

        uri.append("partyId=").append(party.getString("partyId"));

        return uri.toString();
    }

    /**
     * Retrieves the view url with partyId.
     * @param partyId the party id
     * @param delegator a <code>GenericDelegator</code> value
     * @param externalLoginKey the <code>externalLoginKey</code> string to add in the link
     * @return the URL to the view page for the given party
     * @throws GenericEntityException if an error occurs
     */
    public static String createViewPageURL(String partyId, GenericDelegator delegator, String externalLoginKey) throws GenericEntityException {
        GenericValue party = delegator.findByPrimaryKey("PartySummaryCRMView", UtilMisc.toMap("partyId", partyId));
        return createViewPageURL(party, CLIENT_PARTY_ROLES, externalLoginKey);
    }

    /**
     * Generates a hyperlink to the correct view profile page for the given party with the standard CRM party using createViewPageURL
     * description string ${groupName} ${firstName} ${lastName} (${partyId}).  Some pages show list of
     * all kinds of parties, including Leads, Accounts, and non-CRM parties.  This method generate a hyperlink to
     * the correct view page, such as viewAccount for Accounts, or partymgr viewprofile for non-CRM parties.
     * @param partyId the party id
     * @param delegator a <code>GenericDelegator</code> value
     * @param externalLoginKey the <code>externalLoginKey</code> string to add in the link
     * @return the HTML hyperlink to the view page for the given party
     * @throws GenericEntityException if an error occurs
     */
    public static String createViewPageLink(String partyId, GenericDelegator delegator, String externalLoginKey) throws GenericEntityException {
        GenericValue party = delegator.findByPrimaryKeyCache("PartySummaryCRMView", UtilMisc.toMap("partyId", partyId));

        // generate the contents of href=""
        String uri = createViewPageURL(party, CLIENT_PARTY_ROLES, externalLoginKey);
        // generate the display name
        StringBuffer name = new StringBuffer(getCrmsfaPartyName(party));

        // put everything together
        StringBuffer buff = new StringBuffer("<a class=\"linktext\" href=\"");
        buff.append(uri).append("\">");
        buff.append(name).append("</a>");
        return buff.toString();
    }

    /**
     * Checks whether the party can send or receive internal messages.
     *
     * @param partyId the party id
     * @param property sender or recipient
     * @param delegator a <code>GenericDelegator</code> value
     * @return <code>true</code> if the party can send or receive internal messages
     */
    public static boolean isInternalMessage(String partyId, String property, GenericDelegator delegator) {
        String role = UtilConfig.getPropertyValue("opentaps", "messaging.roles." + property);
        if (UtilValidate.isEmpty(role)) {
            Debug.logError("There are no messaging roles in opentaps.properties. Please correct this error.", module);
            return false;
        }

        List<String> roleList = FastList.newInstance();

        StringTokenizer st = new StringTokenizer(role, ", ");
        while (st.hasMoreTokens()) {
            roleList.add(st.nextToken());
        }

        if (UtilValidate.isEmpty(roleList)) {
            return false;
        }

        String result = null;

        try {
            result = getFirstValidRoleTypeId(partyId, roleList, delegator);
        } catch (GenericEntityException ex) {
            result = null;
            Debug.logError("Problem getting getFirstValidRoleTypeId [" + partyId + "]: " + ex.getMessage(), module);
        }

        if (result != null) {
            return true;
        }

        return false;
    }

    /**
     * Checks whether the party can send internal messages.
     *
     * @param partyId the party id
     * @param delegator a <code>GenericDelegator</code> value
     * @return <code>true</code> if the party can send internal messages
     */
    public static boolean isInternalMessageSender(String partyId, GenericDelegator delegator) {
        return isInternalMessage(partyId, "sender", delegator);
    }

    /**
     * Checks whether the party can receive internal messages.
     *
     * @param partyId the party id
     * @param delegator a <code>GenericDelegator</code> value
     * @return <code>true</code> if the party can receive internal messages
     */
    public static boolean isInternalMessageRecipient(String partyId, GenericDelegator delegator) {
        return isInternalMessage(partyId, "recipient", delegator);
    }

    /**
     * Gets the list of party who can send or receive internal messages.
     *
     * @param property sender or recipient
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of party id
     */
    @SuppressWarnings("unchecked")
    public static List<String> getInternalMessage(String property, GenericDelegator delegator) {
        String role = UtilConfig.getPropertyValue("opentaps", "messaging.roles." + property);
        if (UtilValidate.isEmpty(role)) {
            Debug.logError("There are no messaging roles in opentaps.properties. Please correct this error.", module);
            return null;
        }

        List<String> roleList = FastList.newInstance();

        StringTokenizer st = new StringTokenizer(role, ", ");
        while (st.hasMoreTokens()) {
            roleList.add(st.nextToken());
        }

        if (UtilValidate.isEmpty(roleList)) {
            return null;
        }

        List<String> partyList = null;

        try {

            List<GenericValue> partyByRole = delegator.findByCondition("UserLogin", new EntityExpr("partyId", EntityOperator.IN, EntityUtil.getFieldListFromEntityList(delegator.findByCondition("PartyRole", new EntityExpr("roleTypeId", EntityOperator.IN, roleList), null, null), "partyId", true)), null, null);
            partyList = EntityUtil.getFieldListFromEntityList(partyByRole, "partyId", true);

        } catch (GenericEntityException ex) {
            Debug.logError("Problem getting All UserLogin: " + ex.getMessage(), module);
        }

        return partyList;
    }

    /**
     * Gets the list of party who can send internal messages.
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of party id
     */
    public static List<String> getInternalMessageSender(GenericDelegator delegator) {
        return getInternalMessage("sender", delegator);
    }

    /**
     * Gets the list of party who can receive internal messages.
     * @param delegator a <code>GenericDelegator</code> value
     * @return the <code>List</code> of party id
     */
    public static List<String> getInternalMessageRecipient(GenericDelegator delegator) {
        return getInternalMessage("recipient", delegator);
    }

    /**
     * Finds the active GENERAL_LOCATION, PRIMARY_PHONE, PRIMARY_EMAIL contactMech for a party and update PartySupplementalData.
     *
     * @param delegator a <code>GenericDelegator</code> instance
     * @param partyId a <code>String</code> object that represents the From party ID
     * @return a boolean <code>true</code>, if PartySupplementalData was updated, in other case <code>false</code>
     * @throws GenericEntityException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public static boolean updatePartySupplementalData(final GenericDelegator delegator, final String partyId) throws GenericEntityException {

        String[] contactMechPurposeTypeIds = {"GENERAL_LOCATION", "PRIMARY_PHONE", "PRIMARY_EMAIL"};
        String[] fieldToUpdates = {"primaryPostalAddressId", "primaryTelecomNumberId", "primaryEmailId"};
        boolean result = false;

        Map input = UtilMisc.toMap("partyId", partyId);
        GenericValue partySupplementalData = delegator.findByPrimaryKey("PartySupplementalData", input);

        if (partySupplementalData == null) {
            // create a new partySupplementalData
            input = UtilMisc.toMap("partyId", partyId);
            partySupplementalData = delegator.makeValue("PartySupplementalData", input);
            partySupplementalData.create();
        }

        for (int i = 0; i < contactMechPurposeTypeIds.length; i++) {
            List whereConditions = UtilMisc.toList(new EntityExpr("partyId", EntityOperator.EQUALS, partyId));
            whereConditions.add(new EntityExpr("contactMechPurposeTypeId", EntityOperator.EQUALS, contactMechPurposeTypeIds[i]));
            whereConditions.add(EntityUtil.getFilterByDateExpr("contactFromDate", "contactThruDate"));
            whereConditions.add(EntityUtil.getFilterByDateExpr("purposeFromDate", "purposeThruDate"));

            List<GenericValue> partyContactMechPurposes = delegator.findByCondition("PartyContactWithPurpose", new EntityConditionList(whereConditions, EntityOperator.AND), null, UtilMisc.toList("contactFromDate"));

            if (UtilValidate.isEmpty(partyContactMechPurposes)) {
                continue;
            }

            GenericValue partyContactMechPurpose = EntityUtil.getFirst(partyContactMechPurposes);

            // get the associated partySupplementalData
            Debug.logInfo("Updating partySupplementalData for partyId " + partyId, module);
            // update the field
            partySupplementalData.set(fieldToUpdates[i], partyContactMechPurpose.getString("contactMechId"));
            partySupplementalData.store();

            result = true;
        }

        return result;
    }

    /**
     * Generates a party name in the standard CRMSFA style.  Input is a PartySummaryCRMView or any
     * view entity with fields partyId, groupName, firstName and lastName.
     * @param party a <code>GenericValue</code> value
     * @return the CRMSFA name of the given party
     */
    public static String getCrmsfaPartyName(GenericValue party) {
        if (party == null) {
            return null;
        }
        StringBuffer name = new StringBuffer();
        if (party.get("groupName") != null) {
            name.append(party.get("groupName")).append(" ");
        }
        if (party.get("firstName") != null) {
            name.append(party.get("firstName")).append(" ");
        }
        if (party.get("lastName") != null) {
            name.append(party.get("lastName")).append(" ");
        }
        name.append("(").append(party.get("partyId")).append(")");
        return name.toString();
    }

    /**
     * Get party name, if it is a Person, then return person name, else return party group name.
     *
     * @param partyObject a <code>Party</code> instance
     * @return a <code>String</code> party name
     * @throws RepositoryException if an error occurs
     */
    public static String getPartyName(Party partyObject) throws RepositoryException {
        return getPartyName(partyObject, false);
    }

    /**
     * Get party name, if it is a Person, then return person name, else return party group name.
     *
     * @param partyObject a <code>Party</code> instance
     * @param lastNameFirst a <code>boolean</code> value
     * @return a <code>String</code> party name
     * @throws RepositoryException if an error occurs
     */
    public static String getPartyName(Party partyObject, boolean lastNameFirst)
            throws RepositoryException {
        if (partyObject == null) {
            return "";
        }
        return formatPartyNameObject(partyObject, lastNameFirst);
    }

    /**
     * Get formatted party name, if it is a Person, then return person name, else return party group name.
     *
     * @param partyValue a <code>Party</code> instance
     * @param lastNameFirst a <code>boolean</code> value
     * @return a <code>String</code> party name
     * @throws RepositoryException if an error occurs
     */
    public static String formatPartyNameObject(Party partyValue, boolean lastNameFirst) throws RepositoryException {
        if (partyValue == null) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        if (partyValue.getPerson() != null) {
            if (lastNameFirst) {
                if (UtilFormatOut.checkNull(partyValue.getPerson()
                        .getLastName()) != null) {
                    result.append(UtilFormatOut.checkNull(partyValue
                            .getPerson().getLastName()));
                    if (partyValue.getPerson().getFirstName() != null) {
                        result.append(", ");
                    }
                }
                result.append(UtilFormatOut.checkNull(partyValue.getPerson()
                        .getFirstName()));
            } else {
                result.append(UtilFormatOut.ifNotEmpty(partyValue.getPerson()
                        .getFirstName(), "", " "));
                result.append(UtilFormatOut.ifNotEmpty(partyValue.getPerson()
                        .getMiddleName(), "", " "));
                result.append(UtilFormatOut.checkNull(partyValue.getPerson()
                        .getLastName()));
            }
        }
        if (partyValue.getPartyGroup() != null) {
            result.append(partyValue.getPartyGroup().getGroupName());
        }
        return result.toString();
    }
}
