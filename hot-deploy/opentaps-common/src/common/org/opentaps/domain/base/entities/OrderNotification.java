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

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderNotification.
 */
@javax.persistence.Entity
@Table(name="ORDER_NOTIFICATION")
public class OrderNotification extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderNotificationId", "ORDER_NOTIFICATION_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("emailType", "EMAIL_TYPE");
        fields.put("comments", "COMMENTS");
        fields.put("notificationDate", "NOTIFICATION_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderNotification", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderNotification> {
    orderNotificationId("orderNotificationId"),
    orderId("orderId"),
    emailType("emailType"),
    comments("comments"),
    notificationDate("notificationDate"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="OrderNotification_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="OrderNotification_GEN")
   @Id
   @Column(name="ORDER_NOTIFICATION_ID")
   private String orderNotificationId;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="EMAIL_TYPE")
   private String emailType;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="NOTIFICATION_DATE")
   private Timestamp notificationDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID")
   
   private List<OrderItem> orderItems = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMAIL_TYPE", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;

  /**
   * Default constructor.
   */
  public OrderNotification() {
      super();
      this.baseEntityName = "OrderNotification";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderNotificationId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderNotificationId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("emailType");this.allFieldsNames.add("comments");this.allFieldsNames.add("notificationDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderNotification(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderNotificationId the orderNotificationId to set
     */
    public void setOrderNotificationId(String orderNotificationId) {
        this.orderNotificationId = orderNotificationId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param emailType the emailType to set
     */
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param notificationDate the notificationDate to set
     */
    public void setNotificationDate(Timestamp notificationDate) {
        this.notificationDate = notificationDate;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderNotificationId() {
        return this.orderNotificationId;
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
    public String getEmailType() {
        return this.emailType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getNotificationDate() {
        return this.notificationDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the list of <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItem> getOrderItems() throws RepositoryException {
        if (this.orderItems == null) {
            this.orderItems = getRelated(OrderItem.class, "OrderItem");
        }
        return this.orderItems;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }

    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItems the orderItems to set
    */
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderNotificationId((String) mapValue.get("orderNotificationId"));
        setOrderId((String) mapValue.get("orderId"));
        setEmailType((String) mapValue.get("emailType"));
        setComments((String) mapValue.get("comments"));
        setNotificationDate((Timestamp) mapValue.get("notificationDate"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderNotificationId", getOrderNotificationId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("emailType", getEmailType());
        mapValue.put("comments", getComments());
        mapValue.put("notificationDate", getNotificationDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
