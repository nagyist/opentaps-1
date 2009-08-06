package org.opentaps.domain.base.entities;

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

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class DataResourceMetaDataPk implements Serializable {
    @Column(name="DATA_RESOURCE_ID")
    private String dataResourceId;
    @Column(name="META_DATA_PREDICATE_ID")
    private String metaDataPredicateId;
    @Column(name="META_DATA_VALUE")
    private String metaDataValue;
    
    /**
     * Auto generated value setter.
     * @param dataResourceId the dataResourceId to set
     */
    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param metaDataPredicateId the metaDataPredicateId to set
     */
    public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }
    /**
     * Auto generated value setter.
     * @param metaDataValue the metaDataValue to set
     */
    public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getDataResourceId() {
        return this.dataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getMetaDataPredicateId() {
        return this.metaDataPredicateId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getMetaDataValue() {
        return this.metaDataValue;
    }
}
