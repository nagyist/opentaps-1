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
public class OrderHeaderWorkEffortPk implements Serializable {
    @Column(name="ORDER_ID")
    private String orderId;
    @Column(name="WORK_EFFORT_ID")
    private String workEffortId;
    
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getWorkEffortId() {
        return this.workEffortId;
    }
}
