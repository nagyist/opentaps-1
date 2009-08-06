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

package org.opentaps.common.reporting.jasper;

import org.ofbiz.base.util.collections.ResourceBundleMapWrapper;
import org.opentaps.common.util.UtilMessage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * JRResourceBundle is subclass of ResourceBundle that wraps ResourceBundleMapWrapper and
 * allow JasperReports utilize uiLabelMap as strings source.
 * 
 * @author Oleg Andreyev
 */
public class JRResourceBundle extends ResourceBundle {
    
    ResourceBundleMapWrapper uiLabelMap = null;

    /**
     * Default constructor.
     * ResourceBundle for system default locale;
     */
    public JRResourceBundle () {
        super();
        uiLabelMap = UtilMessage.getUiLabels(Locale.getDefault());
    }
    
    /**
     * Constructor that creates ResourceBundle for given locale.
     * 
     * @param Locale locale
     */
    public JRResourceBundle(Locale locale) {
        super();
        if (locale == null || !(locale instanceof Locale)) {
            throw new IllegalArgumentException("Agrument locale equals null or isn't instance of Locale");
        }
        uiLabelMap = UtilMessage.getUiLabels(locale);
    }

    /* (non-Javadoc)
     * @see java.util.ResourceBundle#getKeys()
     */
    @SuppressWarnings("unchecked")
    public Enumeration<String> getKeys() {
        Hashtable<String, Object> htbl = new Hashtable<String, Object>(uiLabelMap);
        return htbl.keys();
    }

    /* (non-Javadoc)
     * @see java.util.ResourceBundle#handleGetObject(String key)
     */
    public Object handleGetObject(String key) {
        return uiLabelMap.get(key);
    }
    
    /**
     * Return count elements in the bundle
     * 
     * @return int
     */
    public int size() {
        return uiLabelMap.size();
    }
    

}
