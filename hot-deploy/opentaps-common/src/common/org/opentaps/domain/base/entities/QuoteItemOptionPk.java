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
public class QuoteItemOptionPk implements Serializable {
    @Column(name="QUOTE_ID")
    private String quoteId;
    @Column(name="QUOTE_ITEM_SEQ_ID")
    private String quoteItemSeqId;
    @Column(name="QUOTE_ITEM_OPTION_SEQ_ID")
    private String quoteItemOptionSeqId;
    
    /**
     * Auto generated value setter.
     * @param quoteId the quoteId to set
     */
    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
    /**
     * Auto generated value setter.
     * @param quoteItemSeqId the quoteItemSeqId to set
     */
    public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param quoteItemOptionSeqId the quoteItemOptionSeqId to set
     */
    public void setQuoteItemOptionSeqId(String quoteItemOptionSeqId) {
        this.quoteItemOptionSeqId = quoteItemOptionSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getQuoteId() {
        return this.quoteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getQuoteItemSeqId() {
        return this.quoteItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getQuoteItemOptionSeqId() {
        return this.quoteItemOptionSeqId;
    }
}
