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
-->
<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl"/>

<#-- TODO: the padding-left style here and other styles should be implemented as a new set of css styles for our replacement form widget -->

<#function getSearchOption name default="">
  <#if parameters.get("${name}")?exists>
    <#if parameters.get("${name}_op")?exists>
      <#return parameters.get("${name}_op")>
    <#else>
      <#return default>
    </#if>
  <#else>
    <#return default>
  </#if >
</#function>

<#macro textSearchOptionsSelect name defaultSearch="like">
<#assign searchOption = getSearchOption(name, defaultSearch) />
<select name="${name}_op" class="selectBox">
  <option <#if searchOption == "equals">selected="selected"</#if> value="equals">${uiLabelMap.OpentapsEquals}</option>
  <option <#if searchOption == "like">selected="selected"</#if> value="like">${uiLabelMap.OpentapsBeginsWith}</option>
  <option <#if searchOption == "contains">selected="selected"</#if> value="contains">${uiLabelMap.OpentapsContains}</option>
</select>
</#macro>

<#function getCheckboxState name default=true>
  <#if parameters.get("${name}")?exists>
    <#if parameters.get("${name}_ic")?exists>
      <#return true>
    <#else>
      <#return false>
    </#if>
  <#else>
    <#return default>
  </#if >
</#function>

<#macro textSearchOptionsIgnore name>
  <input name="${name}_ic" value="Y" <#if getCheckboxState(name)>checked="checked"</#if> type="checkbox">${uiLabelMap.OpentapsIgnoreCase}
</#macro>

<#macro inputRowTextSearch name title size=25 default="" defaultSearch="like">
<tr>
  <td align="right" class="tableheadtext">${title}</td>
  <td style="padding-left: 20px;">
    <@textSearchOptionsSelect name=name defaultSearch=defaultSearch />
    <@inputText name=name size=size default=default />
    <@textSearchOptionsIgnore name=name />
  </td>
</tr>
</#macro>

<form name="LookupProduct" method="post" action="${lookupAction?default("LookupProduct")}">
  <@inputHidden name="noConditionFind" value="Y"/>
  <@inputHidden name="isVariant" value="N" />
  <table>

    <@inputRowTextSearch name="productId" title=uiLabelMap.ProductProductId default=parameters.productId />
    <@inputRowTextSearch name="brandName" title=uiLabelMap.ProductBrandName default=parameters.brandName />
    <@inputRowTextSearch name="internalName" title=uiLabelMap.ProductInternalName default=parameters.internalName defaultSearch="contains" />
    <@inputRowTextSearch name="keyword" title=uiLabelMap.ProductKeyword />

    <tr>
      <td align="right">
        <@inputSelect name="goodIdentificationTypeId" list=goodIdTypes key="goodIdentificationTypeId" displayField="description" required=false defaultOptionText=uiLabelMap.CommonAny />
      </td>
      <td style="padding-left: 20px;">
        <@textSearchOptionsSelect name="idValue" />
        <@inputText name="idValue" size=25 />
        <@textSearchOptionsIgnore name="idValue" />
      </td>
    </tr>

    <tr>
      <td align="right" class="tableheadtext">${uiLabelMap.ProductProductType}</td>
      <td style="padding-left: 20px;">
        <@inputSelect name="productTypeId" list=productTypes key="productTypeId" displayField="description" required=false />        
      </td>
    </tr>

    <tr>
      <td></td>
      <td style="padding-left: 20px;">
        <@inputSubmit title=uiLabelMap.CommonLookup />
      </td>
    </tr>

  </table>
</form>
