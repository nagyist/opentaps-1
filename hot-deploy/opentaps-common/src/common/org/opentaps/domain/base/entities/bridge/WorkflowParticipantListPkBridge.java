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
import org.opentaps.domain.base.entities.WorkflowParticipantListPk;

/**
 * A FieldBridge for WorkflowParticipantListPk.
 */
public class WorkflowParticipantListPkBridge implements TwoWayFieldBridge {

    /**
     * getter method, return the WorkflowParticipantListPk.
     * @param name a <code>String</code> value
     * @param document a <code>Document</code> value
     * @return a <code>Object</code> value
     */
    public Object get(String name, Document document) {
        WorkflowParticipantListPk id = new WorkflowParticipantListPk();
        Field field = null;
        field = document.getField(name + ".participantListId");
        id.setParticipantListId(field.stringValue());
        field = document.getField(name + ".packageId");
        id.setPackageId(field.stringValue());
        field = document.getField(name + ".packageVersion");
        id.setPackageVersion(field.stringValue());
        field = document.getField(name + ".processId");
        id.setProcessId(field.stringValue());
        field = document.getField(name + ".processVersion");
        id.setProcessVersion(field.stringValue());
        field = document.getField(name + ".participantId");
        id.setParticipantId(field.stringValue());
        return id;
    }

    /**
     * change object to String.
     * @param object a <code>Object</code> PK value
     * @return a <code>String</code> value
     */
    public String objectToString(Object object) {
        WorkflowParticipantListPk id = (WorkflowParticipantListPk) object;
        StringBuilder sb = new StringBuilder("");
        
        sb.append(id.getParticipantListId());
        sb.append(" ");
        sb.append(id.getPackageId());
        sb.append(" ");
        sb.append(id.getPackageVersion());
        sb.append(" ");
        sb.append(id.getProcessId());
        sb.append(" ");
        sb.append(id.getProcessVersion());
        sb.append(" ");
        sb.append(id.getParticipantId());
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
        WorkflowParticipantListPk id = (WorkflowParticipantListPk) value;
        Store store = luceneOptions.getStore();
        Index index = luceneOptions.getIndex();
        TermVector termVector = luceneOptions.getTermVector();
        Float boost = luceneOptions.getBoost();

        Field field = null;
        field = new Field(name + ".participantListId", id.getParticipantListId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".packageId", id.getPackageId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".packageVersion", id.getPackageVersion(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".processId", id.getProcessId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".processVersion", id.getProcessVersion(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".participantId", id.getParticipantId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);

        field = new Field(name, objectToString(id), store, index, termVector);
        field.setBoost(boost);
    }

}
