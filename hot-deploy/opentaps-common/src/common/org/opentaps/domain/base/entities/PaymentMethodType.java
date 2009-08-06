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
 * Auto generated base entity PaymentMethodType.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_METHOD_TYPE")
public class PaymentMethodType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentMethodTypeId", "PAYMENT_METHOD_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("defaultGlAccountId", "DEFAULT_GL_ACCOUNT_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentMethodType", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentMethodType> {
    paymentMethodTypeId("paymentMethodTypeId"),
    description("description"),
    defaultGlAccountId("defaultGlAccountId"),
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

   @org.hibernate.annotations.GenericGenerator(name="PaymentMethodType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentMethodType_GEN")
   @Id
   @Column(name="PAYMENT_METHOD_TYPE_ID")
   private String paymentMethodTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="DEFAULT_GL_ACCOUNT_ID")
   private String defaultGlAccountId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DEFAULT_GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount defaultGlAccount = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<OrderPaymentPreference> orderPaymentPreferences = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<Payment> payments = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<PaymentGatewayResponse> paymentGatewayResponses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<PaymentMethod> paymentMethods = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccounts = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<PayrollPreference> payrollPreferences = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<ProductPaymentMethodType> productPaymentMethodTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
   
   private List<ProductStorePaymentSetting> productStorePaymentSettings = null;

  /**
   * Default constructor.
   */
  public PaymentMethodType() {
      super();
      this.baseEntityName = "PaymentMethodType";
      this.isView = false;
      this.resourceName = "AccountingEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentMethodTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("defaultGlAccountId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentMethodType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentMethodTypeId the paymentMethodTypeId to set
     */
    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param defaultGlAccountId the defaultGlAccountId to set
     */
    public void setDefaultGlAccountId(String defaultGlAccountId) {
        this.defaultGlAccountId = defaultGlAccountId;
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
    public String getPaymentMethodTypeId() {
        return this.paymentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDefaultGlAccountId() {
        return this.defaultGlAccountId;
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
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>DefaultGlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getDefaultGlAccount() throws RepositoryException {
        if (this.defaultGlAccount == null) {
            this.defaultGlAccount = getRelatedOne(GlAccount.class, "DefaultGlAccount");
        }
        return this.defaultGlAccount;
    }
    /**
     * Auto generated method that gets the related <code>OrderPaymentPreference</code> by the relation named <code>OrderPaymentPreference</code>.
     * @return the list of <code>OrderPaymentPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderPaymentPreference> getOrderPaymentPreferences() throws RepositoryException {
        if (this.orderPaymentPreferences == null) {
            this.orderPaymentPreferences = getRelated(OrderPaymentPreference.class, "OrderPaymentPreference");
        }
        return this.orderPaymentPreferences;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the list of <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Payment> getPayments() throws RepositoryException {
        if (this.payments == null) {
            this.payments = getRelated(Payment.class, "Payment");
        }
        return this.payments;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayResponse</code> by the relation named <code>PaymentGatewayResponse</code>.
     * @return the list of <code>PaymentGatewayResponse</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGatewayResponse> getPaymentGatewayResponses() throws RepositoryException {
        if (this.paymentGatewayResponses == null) {
            this.paymentGatewayResponses = getRelated(PaymentGatewayResponse.class, "PaymentGatewayResponse");
        }
        return this.paymentGatewayResponses;
    }
    /**
     * Auto generated method that gets the related <code>PaymentMethod</code> by the relation named <code>PaymentMethod</code>.
     * @return the list of <code>PaymentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentMethod> getPaymentMethods() throws RepositoryException {
        if (this.paymentMethods == null) {
            this.paymentMethods = getRelated(PaymentMethod.class, "PaymentMethod");
        }
        return this.paymentMethods;
    }
    /**
     * Auto generated method that gets the related <code>PaymentMethodTypeGlAccount</code> by the relation named <code>PaymentMethodTypeGlAccount</code>.
     * @return the list of <code>PaymentMethodTypeGlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentMethodTypeGlAccount> getPaymentMethodTypeGlAccounts() throws RepositoryException {
        if (this.paymentMethodTypeGlAccounts == null) {
            this.paymentMethodTypeGlAccounts = getRelated(PaymentMethodTypeGlAccount.class, "PaymentMethodTypeGlAccount");
        }
        return this.paymentMethodTypeGlAccounts;
    }
    /**
     * Auto generated method that gets the related <code>PayrollPreference</code> by the relation named <code>PayrollPreference</code>.
     * @return the list of <code>PayrollPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PayrollPreference> getPayrollPreferences() throws RepositoryException {
        if (this.payrollPreferences == null) {
            this.payrollPreferences = getRelated(PayrollPreference.class, "PayrollPreference");
        }
        return this.payrollPreferences;
    }
    /**
     * Auto generated method that gets the related <code>ProductPaymentMethodType</code> by the relation named <code>ProductPaymentMethodType</code>.
     * @return the list of <code>ProductPaymentMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPaymentMethodType> getProductPaymentMethodTypes() throws RepositoryException {
        if (this.productPaymentMethodTypes == null) {
            this.productPaymentMethodTypes = getRelated(ProductPaymentMethodType.class, "ProductPaymentMethodType");
        }
        return this.productPaymentMethodTypes;
    }
    /**
     * Auto generated method that gets the related <code>ProductStorePaymentSetting</code> by the relation named <code>ProductStorePaymentSetting</code>.
     * @return the list of <code>ProductStorePaymentSetting</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStorePaymentSetting> getProductStorePaymentSettings() throws RepositoryException {
        if (this.productStorePaymentSettings == null) {
            this.productStorePaymentSettings = getRelated(ProductStorePaymentSetting.class, "ProductStorePaymentSetting");
        }
        return this.productStorePaymentSettings;
    }

    /**
     * Auto generated value setter.
     * @param defaultGlAccount the defaultGlAccount to set
    */
    public void setDefaultGlAccount(GlAccount defaultGlAccount) {
        this.defaultGlAccount = defaultGlAccount;
    }
    /**
     * Auto generated value setter.
     * @param orderPaymentPreferences the orderPaymentPreferences to set
    */
    public void setOrderPaymentPreferences(List<OrderPaymentPreference> orderPaymentPreferences) {
        this.orderPaymentPreferences = orderPaymentPreferences;
    }
    /**
     * Auto generated value setter.
     * @param payments the payments to set
    */
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayResponses the paymentGatewayResponses to set
    */
    public void setPaymentGatewayResponses(List<PaymentGatewayResponse> paymentGatewayResponses) {
        this.paymentGatewayResponses = paymentGatewayResponses;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethods the paymentMethods to set
    */
    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodTypeGlAccounts the paymentMethodTypeGlAccounts to set
    */
    public void setPaymentMethodTypeGlAccounts(List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccounts) {
        this.paymentMethodTypeGlAccounts = paymentMethodTypeGlAccounts;
    }
    /**
     * Auto generated value setter.
     * @param payrollPreferences the payrollPreferences to set
    */
    public void setPayrollPreferences(List<PayrollPreference> payrollPreferences) {
        this.payrollPreferences = payrollPreferences;
    }
    /**
     * Auto generated value setter.
     * @param productPaymentMethodTypes the productPaymentMethodTypes to set
    */
    public void setProductPaymentMethodTypes(List<ProductPaymentMethodType> productPaymentMethodTypes) {
        this.productPaymentMethodTypes = productPaymentMethodTypes;
    }
    /**
     * Auto generated value setter.
     * @param productStorePaymentSettings the productStorePaymentSettings to set
    */
    public void setProductStorePaymentSettings(List<ProductStorePaymentSetting> productStorePaymentSettings) {
        this.productStorePaymentSettings = productStorePaymentSettings;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPaymentMethodTypeGlAccount(PaymentMethodTypeGlAccount paymentMethodTypeGlAccount) {
        if (this.paymentMethodTypeGlAccounts == null) {
            this.paymentMethodTypeGlAccounts = new ArrayList<PaymentMethodTypeGlAccount>();
        }
        this.paymentMethodTypeGlAccounts.add(paymentMethodTypeGlAccount);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePaymentMethodTypeGlAccount(PaymentMethodTypeGlAccount paymentMethodTypeGlAccount) {
        if (this.paymentMethodTypeGlAccounts == null) {
            return;
        }
        this.paymentMethodTypeGlAccounts.remove(paymentMethodTypeGlAccount);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPaymentMethodTypeGlAccount() {
        if (this.paymentMethodTypeGlAccounts == null) {
            return;
        }
        this.paymentMethodTypeGlAccounts.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductPaymentMethodType(ProductPaymentMethodType productPaymentMethodType) {
        if (this.productPaymentMethodTypes == null) {
            this.productPaymentMethodTypes = new ArrayList<ProductPaymentMethodType>();
        }
        this.productPaymentMethodTypes.add(productPaymentMethodType);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductPaymentMethodType(ProductPaymentMethodType productPaymentMethodType) {
        if (this.productPaymentMethodTypes == null) {
            return;
        }
        this.productPaymentMethodTypes.remove(productPaymentMethodType);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductPaymentMethodType() {
        if (this.productPaymentMethodTypes == null) {
            return;
        }
        this.productPaymentMethodTypes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStorePaymentSetting(ProductStorePaymentSetting productStorePaymentSetting) {
        if (this.productStorePaymentSettings == null) {
            this.productStorePaymentSettings = new ArrayList<ProductStorePaymentSetting>();
        }
        this.productStorePaymentSettings.add(productStorePaymentSetting);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStorePaymentSetting(ProductStorePaymentSetting productStorePaymentSetting) {
        if (this.productStorePaymentSettings == null) {
            return;
        }
        this.productStorePaymentSettings.remove(productStorePaymentSetting);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStorePaymentSetting() {
        if (this.productStorePaymentSettings == null) {
            return;
        }
        this.productStorePaymentSettings.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setDescription((String) mapValue.get("description"));
        setDefaultGlAccountId((String) mapValue.get("defaultGlAccountId"));
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
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("defaultGlAccountId", getDefaultGlAccountId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
