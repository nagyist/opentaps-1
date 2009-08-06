<#--
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
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
 *  
-->

<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.fo.ftl"/>

<#escape x as x?xml>
<fo:table text-align="left" table-layout="fixed">
  <fo:table-column column-width="7cm"/>
  <fo:table-column column-width="11cm"/>

  <fo:table-body>

    <#list products as product>
      <#if product.productId?has_content>
        <#assign productContentWrapper = Static["org.opentaps.common.product.UtilProduct"].getProductContentWrapper(delegator, dispatcher, product.productId, locale?if_exists)/>
      </#if>
      <fo:table-row>
  
        <fo:table-cell>
          <#assign largeImageUrl = productContentWrapper.get("LARGE_IMAGE_URL")?default("")/>
          <#if largeImageUrl?has_content>
            <fo:block>
  	      <fo:external-graphic  width="252pt" overflow="hidden"  src="<@ofbizContentUrl>${largeImageUrl}</@ofbizContentUrl>" content-height="scale-to-fit"/>
            </fo:block>
          </#if>
        </fo:table-cell>
  
        <fo:table-cell padding-bottom="30pt">
      	  <fo:block keep-together="always">

            <fo:block>
              <fo:inline font-weight="bold">${productContentWrapper.get("PRODUCT_NAME")?default("")}</fo:inline>
              <#if product.productId?has_content>
                <fo:inline space-before="1pt">(${product.productId})</fo:inline>
              </#if>
            </fo:block>
            
            <#assign description = productContentWrapper.get("DESCRIPTION")?default("")/>
            <#if description?has_content>
              <fo:block space-before="5pt">
                ${description}
              </fo:block>
            </#if>
            
            <#assign longDescription = productContentWrapper.get("LONG_DESCRIPTION")?default("")/>
            <#if longDescription?has_content>
              <fo:block space-before="5pt">
                ${longDescription}
              </fo:block>
            </#if>
  
            <#assign productPrice = productPrices?default({}).get(product)?if_exists/>
            <#if productPrice?has_content>
              <fo:block space-before="5pt">
                <fo:inline font-weight="bold" space-after="1pt">${uiLabelMap.EcommercePrice}:</fo:inline>
                <fo:inline><@ofbizCurrency amount=productPrice isoCode=currencyUomId/></fo:inline>
              </fo:block>
            </#if>
            
          <#if ! product_has_next><fo:block id="theEnd"/></#if>

          </fo:block>
        </fo:table-cell>
  
      </fo:table-row>
    </#list>
  </fo:table-body>
</fo:table>
</#escape>
