package org.opentaps.domain.base.entities.bridge;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.bridge.builtin.*;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.TermVector;
import org.hibernate.search.bridge.LuceneOptions;
import org.hibernate.search.bridge.TwoWayFieldBridge;
import org.opentaps.domain.base.entities.ZipSalesTaxLookupPk;

/**
 * A FieldBridge for ZipSalesTaxLookupPk.
 */
public class ZipSalesTaxLookupPkBridge implements TwoWayFieldBridge {

    /**
     * getter method, return the ZipSalesTaxLookupPk.
     * @param name a <code>String</code> value
     * @param document a <code>Document</code> value
     * @return a <code>Object</code> value
     */
    public Object get(String name, Document document) {
        ZipSalesTaxLookupPk id = new ZipSalesTaxLookupPk();
        Field field = null;
        field = document.getField(name + ".zipCode");
        id.setZipCode(field.stringValue());
        field = document.getField(name + ".stateCode");
        id.setStateCode(field.stringValue());
        field = document.getField(name + ".city");
        id.setCity(field.stringValue());
        field = document.getField(name + ".county");
        id.setCounty(field.stringValue());
        field = document.getField(name + ".fromDate");
        if (field.stringValue() != null && !field.stringValue().equals("")) {
            id.setFromDate(new Timestamp(((Date) (new DateBridge(Resolution.DAY)).stringToObject(field.stringValue())).getTime()));
        }
        return id;
    }

    /**
     * change object to String.
     * @param object a <code>Object</code> PK value
     * @return a <code>String</code> value
     */
    public String objectToString(Object object) {
        ZipSalesTaxLookupPk id = (ZipSalesTaxLookupPk) object;
        StringBuilder sb = new StringBuilder("");
        
        sb.append(id.getZipCode());
        sb.append(" ");
        sb.append(id.getStateCode());
        sb.append(" ");
        sb.append(id.getCity());
        sb.append(" ");
        sb.append(id.getCounty());
        sb.append(" ");
        sb.append(id.getFromDate());
        return sb.toString();
    }

    /**
     * set field value by pk.
     * @param name a <code>String</code> field name
     * @param value a <code>Object</code> value
     * @param document a <code>Document</code> value
     * @param luceneOptions a <code>LuceneOptions</code> value
     */
    public void set(String name, Object value, Document document, LuceneOptions luceneOptions) {
        ZipSalesTaxLookupPk id = (ZipSalesTaxLookupPk) value;
        Store store = luceneOptions.getStore();
        Index index = luceneOptions.getIndex();
        TermVector termVector = luceneOptions.getTermVector();
        Float boost = luceneOptions.getBoost();

        Field field = null;
        field = new Field(name + ".zipCode", id.getZipCode(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".stateCode", id.getStateCode(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".city", id.getCity(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".county", id.getCounty(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".fromDate", (new DateBridge(Resolution.DAY)).objectToString(id.getFromDate()), store, index, termVector);
        field.setBoost(boost);
        document.add(field);

        field = new Field(name, objectToString(id), store, index, termVector);
        field.setBoost(boost);
    }

}
