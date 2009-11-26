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
 * Create a WorkEffort Event Reminder.
 * Auto generated base service entity createWorkEffortEventReminder.
 *
 * Engine: entity-auto
 * Location: 
 * Invoke: create
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/workeffort/servicedef/services.xml
 */
public class CreateWorkEffortEventReminderService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createWorkEffortEventReminder";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        contactMechId("contactMechId"),
        currentCount("currentCount"),
        isPopup("isPopup"),
        locale("locale"),
        localeId("localeId"),
        recurrenceOffset("recurrenceOffset"),
        reminderDateTime("reminderDateTime"),
        repeatCount("repeatCount"),
        repeatInterval("repeatInterval"),
        timeZone("timeZone"),
        timeZoneId("timeZoneId"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        sequenceId("sequenceId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CreateWorkEffortEventReminderService</code> instance.
     */
    public CreateWorkEffortEventReminderService() {
        super();
    }

    /**
     * Creates a new <code>CreateWorkEffortEventReminderService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateWorkEffortEventReminderService(User user) {
        super(user);
    }

    private String inContactMechId;
    private Long inCurrentCount;
    private String inIsPopup;
    private Locale inLocale;
    private String inLocaleId;
    private Long inRecurrenceOffset;
    private Timestamp inReminderDateTime;
    private Long inRepeatCount;
    private Long inRepeatInterval;
    private TimeZone inTimeZone;
    private String inTimeZoneId;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSequenceId;
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
    public String getInContactMechId() {
        return this.inContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInCurrentCount() {
        return this.inCurrentCount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsPopup() {
        return this.inIsPopup;
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
    public String getInLocaleId() {
        return this.inLocaleId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInRecurrenceOffset() {
        return this.inRecurrenceOffset;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInReminderDateTime() {
        return this.inReminderDateTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInRepeatCount() {
        return this.inRepeatCount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInRepeatInterval() {
        return this.inRepeatInterval;
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
    public String getInTimeZoneId() {
        return this.inTimeZoneId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
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
    public String getOutSequenceId() {
        return this.outSequenceId;
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
     * @param inContactMechId the inContactMechId to set
    */
    public void setInContactMechId(String inContactMechId) {
        this.inParameters.add("contactMechId");
        this.inContactMechId = inContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrentCount the inCurrentCount to set
    */
    public void setInCurrentCount(Long inCurrentCount) {
        this.inParameters.add("currentCount");
        this.inCurrentCount = inCurrentCount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsPopup the inIsPopup to set
    */
    public void setInIsPopup(String inIsPopup) {
        this.inParameters.add("isPopup");
        this.inIsPopup = inIsPopup;
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
     * @param inLocaleId the inLocaleId to set
    */
    public void setInLocaleId(String inLocaleId) {
        this.inParameters.add("localeId");
        this.inLocaleId = inLocaleId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRecurrenceOffset the inRecurrenceOffset to set
    */
    public void setInRecurrenceOffset(Long inRecurrenceOffset) {
        this.inParameters.add("recurrenceOffset");
        this.inRecurrenceOffset = inRecurrenceOffset;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReminderDateTime the inReminderDateTime to set
    */
    public void setInReminderDateTime(Timestamp inReminderDateTime) {
        this.inParameters.add("reminderDateTime");
        this.inReminderDateTime = inReminderDateTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRepeatCount the inRepeatCount to set
    */
    public void setInRepeatCount(Long inRepeatCount) {
        this.inParameters.add("repeatCount");
        this.inRepeatCount = inRepeatCount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRepeatInterval the inRepeatInterval to set
    */
    public void setInRepeatInterval(Long inRepeatInterval) {
        this.inParameters.add("repeatInterval");
        this.inRepeatInterval = inRepeatInterval;
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
     * @param inTimeZoneId the inTimeZoneId to set
    */
    public void setInTimeZoneId(String inTimeZoneId) {
        this.inParameters.add("timeZoneId");
        this.inTimeZoneId = inTimeZoneId;
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
     * This parameter is required.
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
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
     * @param outSequenceId the outSequenceId to set
    */
    public void setOutSequenceId(String outSequenceId) {
        this.outParameters.add("sequenceId");
        this.outSequenceId = outSequenceId;
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
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("currentCount")) mapValue.put("currentCount", getInCurrentCount());
        if (inParameters.contains("isPopup")) mapValue.put("isPopup", getInIsPopup());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("localeId")) mapValue.put("localeId", getInLocaleId());
        if (inParameters.contains("recurrenceOffset")) mapValue.put("recurrenceOffset", getInRecurrenceOffset());
        if (inParameters.contains("reminderDateTime")) mapValue.put("reminderDateTime", getInReminderDateTime());
        if (inParameters.contains("repeatCount")) mapValue.put("repeatCount", getInRepeatCount());
        if (inParameters.contains("repeatInterval")) mapValue.put("repeatInterval", getInRepeatInterval());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("timeZoneId")) mapValue.put("timeZoneId", getInTimeZoneId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
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
        if (outParameters.contains("sequenceId")) mapValue.put("sequenceId", getOutSequenceId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("currentCount")) setInCurrentCount((Long) mapValue.get("currentCount"));
        if (mapValue.containsKey("isPopup")) setInIsPopup((String) mapValue.get("isPopup"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("localeId")) setInLocaleId((String) mapValue.get("localeId"));
        if (mapValue.containsKey("recurrenceOffset")) setInRecurrenceOffset((Long) mapValue.get("recurrenceOffset"));
        if (mapValue.containsKey("reminderDateTime")) setInReminderDateTime((Timestamp) mapValue.get("reminderDateTime"));
        if (mapValue.containsKey("repeatCount")) setInRepeatCount((Long) mapValue.get("repeatCount"));
        if (mapValue.containsKey("repeatInterval")) setInRepeatInterval((Long) mapValue.get("repeatInterval"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("timeZoneId")) setInTimeZoneId((String) mapValue.get("timeZoneId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("sequenceId")) setOutSequenceId((String) mapValue.get("sequenceId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateWorkEffortEventReminderService</code> from the input values of the given <code>CreateWorkEffortEventReminderService</code>.
     * @param input a <code>CreateWorkEffortEventReminderService</code>
     */
    public static CreateWorkEffortEventReminderService fromInput(CreateWorkEffortEventReminderService input) {
        CreateWorkEffortEventReminderService service = new CreateWorkEffortEventReminderService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateWorkEffortEventReminderService</code> from the output values of the given <code>CreateWorkEffortEventReminderService</code>.
     * @param output a <code>CreateWorkEffortEventReminderService</code>
     */
    public static CreateWorkEffortEventReminderService fromOutput(CreateWorkEffortEventReminderService output) {
        CreateWorkEffortEventReminderService service = new CreateWorkEffortEventReminderService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateWorkEffortEventReminderService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateWorkEffortEventReminderService fromInput(Map<String, Object> mapValue) {
        CreateWorkEffortEventReminderService service = new CreateWorkEffortEventReminderService();
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
     * Construct a <code>CreateWorkEffortEventReminderService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateWorkEffortEventReminderService fromOutput(Map<String, Object> mapValue) {
        CreateWorkEffortEventReminderService service = new CreateWorkEffortEventReminderService();
        service.putAllOutput(mapValue);
        return service;
    }
}
