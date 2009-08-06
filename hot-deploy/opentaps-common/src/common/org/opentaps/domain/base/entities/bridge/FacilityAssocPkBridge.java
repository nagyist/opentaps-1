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
import org.opentaps.domain.base.entities.FacilityAssocPk;

/**
 * A FieldBridge for FacilityAssocPk.
 */
public class FacilityAssocPkBridge implements TwoWayFieldBridge {

    /**
     * getter method, return the FacilityAssocPk.
     * @param name a <code>String</code> value
     * @param document a <code>Document</code> value
     * @return a <code>Object</code> value
     */
    public Object get(String name, Document document) {
        FacilityAssocPk id = new FacilityAssocPk();
        Field field = null;
        field = document.getField(name + ".facilityId");
        id.setFacilityId(field.stringValue());
        field = document.getField(name + ".facilityIdTo");
        id.setFacilityIdTo(field.stringValue());
        field = document.getField(name + ".facilityAssocTypeId");
        id.setFacilityAssocTypeId(field.stringValue());
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
        FacilityAssocPk id = (FacilityAssocPk) object;
        StringBuilder sb = new StringBuilder("");
        
        sb.append(id.getFacilityId());
        sb.append(" ");
        sb.append(id.getFacilityIdTo());
        sb.append(" ");
        sb.append(id.getFacilityAssocTypeId());
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
        FacilityAssocPk id = (FacilityAssocPk) value;
        Store store = luceneOptions.getStore();
        Index index = luceneOptions.getIndex();
        TermVector termVector = luceneOptions.getTermVector();
        Float boost = luceneOptions.getBoost();

        Field field = null;
        field = new Field(name + ".facilityId", id.getFacilityId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".facilityIdTo", id.getFacilityIdTo(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".facilityAssocTypeId", id.getFacilityAssocTypeId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".fromDate", (new DateBridge(Resolution.DAY)).objectToString(id.getFromDate()), store, index, termVector);
        field.setBoost(boost);
        document.add(field);

        field = new Field(name, objectToString(id), store, index, termVector);
        field.setBoost(boost);
    }

}
