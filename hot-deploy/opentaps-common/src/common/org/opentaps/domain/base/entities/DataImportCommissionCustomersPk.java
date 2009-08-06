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
public class DataImportCommissionCustomersPk implements Serializable {
    @Column(name="CUSTOMER_ID")
    private String customerId;
    @Column(name="TO_CUSTOMER_ID")
    private String toCustomerId;
    
    /**
     * Auto generated value setter.
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    /**
     * Auto generated value setter.
     * @param toCustomerId the toCustomerId to set
     */
    public void setToCustomerId(String toCustomerId) {
        this.toCustomerId = toCustomerId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getToCustomerId() {
        return this.toCustomerId;
    }
}
