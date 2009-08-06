/*
 * Copyright (c) 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY BY THE GWT BUILD

package org.opentaps.gwt.common.client.messages;

import com.google.gwt.i18n.client.Messages;

public interface CommonMessages extends Messages {
<#list functions as function>
    @DefaultMessage("${function.defaultText}")
    String ${function.key}(<#list function.parameters as parameter>String ${parameter}<#if parameter_has_next>, </#if></#list>);
</#list>
}
