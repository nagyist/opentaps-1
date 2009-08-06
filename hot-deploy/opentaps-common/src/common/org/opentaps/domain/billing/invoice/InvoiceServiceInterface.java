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
package org.opentaps.domain.billing.invoice;

import org.opentaps.foundation.service.ServiceInterface;
import org.opentaps.foundation.service.ServiceException;

import java.math.BigDecimal;

/**
 * Interface for invoice services.
 */
public interface InvoiceServiceInterface extends ServiceInterface {

    /**
     * Sets the invoice ID, required parameter for {@link #checkInvoicePaid}.
     * @param invoiceId the invoice ID
     */
    public void setInvoiceId(String invoiceId);

    /**
     * Sets the invoice adjustment type ID, required parameter for {@link #createInvoiceAdjustment}.
     * @param invoiceAdjustmentTypeId the invoice adjustment type ID
     */
    public void setInvoiceAdjustmentTypeId(String invoiceAdjustmentTypeId);

    /**
     * Sets the payment ID, optional parameter for {@link #createInvoiceAdjustment}.
     * Can be associated with an adjustment for information purpose only.
     * @param paymentId the payment ID
     */
    public void setPaymentId(String paymentId);

    /**
     * Sets the invoice adjustment amount, required parameter for {@link #createInvoiceAdjustment}.
     * @param adjustmentAmount the adjustment amount
     */
    public void setAdjustmentAmount(BigDecimal adjustmentAmount);

    /**
     * Sets the comment, optional parameter for {@link #createInvoiceAdjustment}.
     * @param comment the comment text
     */
    public void setComment(String comment);

    /**
     * Get the invoiceAdjustmentId of the invoiceAdjustment created by {@link #createInvoiceAdjustment}.
     * @return the invoiceAdjustmentId
     */
    public String getInvoiceAdjustmentId();

    /**
     * Create the InvoiceAdjustment from invoiceId, paymentId, invoiceAdjustmentTypeId, adjustmentAmount, and comment
     * The adjustment will be posted if the Invoice has already been posted.  Otherwise, the invoice and its items and
     * adjustments should be posted together when the invoice is posted.
     * @throws ServiceException if an error occurs
     * @see #setInvoiceId required input <code>invoiceId</code>
     * @see #setInvoiceAdjustmentTypeId required input <code>invoiceAdjustmentTypeId</code>
     * @see #setAdjustmentAmount required input <code>adjustmentAmount</code>
     * @see #setPaymentId optional input <code>paymentId</code>
     * @see #setComment optional input <code>comment</code>
     */
    public void createInvoiceAdjustment() throws ServiceException;

    /**
     * Service to check if the invoice has been fully paid with payments and adjustments,
     * and set status to PAID if so.
     * @throws ServiceException if an error occurs
     * @see #setInvoiceId required input <code>invoiceId</code>
     */
    public void checkInvoicePaid() throws ServiceException;

    /**
     * Automatically copies all the accounting tags from the order item to the invoice item.
     * @throws ServiceException if an error occurs
     * @see #setInvoiceId required input <code>invoiceId</code>
     */
    public void setAccountingTags() throws ServiceException;

}
