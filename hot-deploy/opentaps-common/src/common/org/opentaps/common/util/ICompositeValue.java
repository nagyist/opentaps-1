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
package org.opentaps.common.util;

import java.util.LinkedHashSet;

/**
 * <p>This interface we use together with class <code>ConvertMapToString</code> (or in similar cases)
 * if user code need to know which fields are used to create resulting string.</p>
 *
 */
public interface ICompositeValue {

    /**
     * <p>Returns collection of names. Their meaning depend on context 
     * where <code>ICompositeValue</code> is used</p>
     */
    public LinkedHashSet<String> getFields();

}
