
package com.kyle.microservices.service.getWorkEfforts;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="workEffortId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="workEffortTypeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="currentStatusId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastStatusUpdate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="workEffortPurposeTypeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="workEffortParentId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="scopeEnumId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="workEffortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="showAsEnumId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sendNotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locationDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="estimatedStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="estimatedCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actualStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actualCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="estimatedMilliSeconds" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="estimatedSetupMillis" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="estimateCalcMethod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actualMilliSeconds" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="actualSetupMillis" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="totalMilliSecondsAllowed" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="totalMoneyAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="moneyUomId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="specialTerms" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeTransparency" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sourceReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fixedAssetId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="facilityId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="infoUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recurrenceInfoId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tempExprId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="runtimeDataId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noteId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="serviceLoaderName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="quantityToProduce" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="quantityProduced" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="quantityRejected" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="reservPersons" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="reserv2ndPPPerc" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="reservNthPPPerc" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="accommodationMapId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accommodationSpotId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdByUserLogin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastModifiedByUserLogin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastUpdatedStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastUpdatedTxStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdTxStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sequenceNum" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "eeval-WorkEffort")
public class EevalWorkEffort {

    @XmlAttribute(name = "workEffortId")
    protected String workEffortId;
    @XmlAttribute(name = "workEffortTypeId")
    protected String workEffortTypeId;
    @XmlAttribute(name = "currentStatusId")
    protected String currentStatusId;
    @XmlAttribute(name = "lastStatusUpdate")
    protected String lastStatusUpdate;
    @XmlAttribute(name = "workEffortPurposeTypeId")
    protected String workEffortPurposeTypeId;
    @XmlAttribute(name = "workEffortParentId")
    protected String workEffortParentId;
    @XmlAttribute(name = "scopeEnumId")
    protected String scopeEnumId;
    @XmlAttribute(name = "priority")
    protected Long priority;
    @XmlAttribute(name = "percentComplete")
    protected Long percentComplete;
    @XmlAttribute(name = "workEffortName")
    protected String workEffortName;
    @XmlAttribute(name = "showAsEnumId")
    protected String showAsEnumId;
    @XmlAttribute(name = "sendNotificationEmail")
    protected String sendNotificationEmail;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "locationDesc")
    protected String locationDesc;
    @XmlAttribute(name = "estimatedStartDate")
    protected String estimatedStartDate;
    @XmlAttribute(name = "estimatedCompletionDate")
    protected String estimatedCompletionDate;
    @XmlAttribute(name = "actualStartDate")
    protected String actualStartDate;
    @XmlAttribute(name = "actualCompletionDate")
    protected String actualCompletionDate;
    @XmlAttribute(name = "estimatedMilliSeconds")
    protected Double estimatedMilliSeconds;
    @XmlAttribute(name = "estimatedSetupMillis")
    protected Double estimatedSetupMillis;
    @XmlAttribute(name = "estimateCalcMethod")
    protected String estimateCalcMethod;
    @XmlAttribute(name = "actualMilliSeconds")
    protected Double actualMilliSeconds;
    @XmlAttribute(name = "actualSetupMillis")
    protected Double actualSetupMillis;
    @XmlAttribute(name = "totalMilliSecondsAllowed")
    protected Double totalMilliSecondsAllowed;
    @XmlAttribute(name = "totalMoneyAllowed")
    protected BigDecimal totalMoneyAllowed;
    @XmlAttribute(name = "moneyUomId")
    protected String moneyUomId;
    @XmlAttribute(name = "specialTerms")
    protected String specialTerms;
    @XmlAttribute(name = "timeTransparency")
    protected Long timeTransparency;
    @XmlAttribute(name = "universalId")
    protected String universalId;
    @XmlAttribute(name = "sourceReferenceId")
    protected String sourceReferenceId;
    @XmlAttribute(name = "fixedAssetId")
    protected String fixedAssetId;
    @XmlAttribute(name = "facilityId")
    protected String facilityId;
    @XmlAttribute(name = "infoUrl")
    protected String infoUrl;
    @XmlAttribute(name = "recurrenceInfoId")
    protected String recurrenceInfoId;
    @XmlAttribute(name = "tempExprId")
    protected String tempExprId;
    @XmlAttribute(name = "runtimeDataId")
    protected String runtimeDataId;
    @XmlAttribute(name = "noteId")
    protected String noteId;
    @XmlAttribute(name = "serviceLoaderName")
    protected String serviceLoaderName;
    @XmlAttribute(name = "quantityToProduce")
    protected BigDecimal quantityToProduce;
    @XmlAttribute(name = "quantityProduced")
    protected BigDecimal quantityProduced;
    @XmlAttribute(name = "quantityRejected")
    protected BigDecimal quantityRejected;
    @XmlAttribute(name = "reservPersons")
    protected BigDecimal reservPersons;
    @XmlAttribute(name = "reserv2ndPPPerc")
    protected BigDecimal reserv2NdPPPerc;
    @XmlAttribute(name = "reservNthPPPerc")
    protected BigDecimal reservNthPPPerc;
    @XmlAttribute(name = "accommodationMapId")
    protected String accommodationMapId;
    @XmlAttribute(name = "accommodationSpotId")
    protected String accommodationSpotId;
    @XmlAttribute(name = "revisionNumber")
    protected Long revisionNumber;
    @XmlAttribute(name = "createdDate")
    protected String createdDate;
    @XmlAttribute(name = "createdByUserLogin")
    protected String createdByUserLogin;
    @XmlAttribute(name = "lastModifiedDate")
    protected String lastModifiedDate;
    @XmlAttribute(name = "lastModifiedByUserLogin")
    protected String lastModifiedByUserLogin;
    @XmlAttribute(name = "lastUpdatedStamp")
    protected String lastUpdatedStamp;
    @XmlAttribute(name = "lastUpdatedTxStamp")
    protected String lastUpdatedTxStamp;
    @XmlAttribute(name = "createdStamp")
    protected String createdStamp;
    @XmlAttribute(name = "createdTxStamp")
    protected String createdTxStamp;
    @XmlAttribute(name = "sequenceNum")
    protected Long sequenceNum;

    /**
     * Gets the value of the workEffortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEffortId() {
        return workEffortId;
    }

    /**
     * Sets the value of the workEffortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEffortId(String value) {
        this.workEffortId = value;
    }

    /**
     * Gets the value of the workEffortTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEffortTypeId() {
        return workEffortTypeId;
    }

    /**
     * Sets the value of the workEffortTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEffortTypeId(String value) {
        this.workEffortTypeId = value;
    }

    /**
     * Gets the value of the currentStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatusId() {
        return currentStatusId;
    }

    /**
     * Sets the value of the currentStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatusId(String value) {
        this.currentStatusId = value;
    }

    /**
     * Gets the value of the lastStatusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatusUpdate() {
        return lastStatusUpdate;
    }

    /**
     * Sets the value of the lastStatusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStatusUpdate(String value) {
        this.lastStatusUpdate = value;
    }

    /**
     * Gets the value of the workEffortPurposeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEffortPurposeTypeId() {
        return workEffortPurposeTypeId;
    }

    /**
     * Sets the value of the workEffortPurposeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEffortPurposeTypeId(String value) {
        this.workEffortPurposeTypeId = value;
    }

    /**
     * Gets the value of the workEffortParentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEffortParentId() {
        return workEffortParentId;
    }

    /**
     * Sets the value of the workEffortParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEffortParentId(String value) {
        this.workEffortParentId = value;
    }

    /**
     * Gets the value of the scopeEnumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeEnumId() {
        return scopeEnumId;
    }

    /**
     * Sets the value of the scopeEnumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeEnumId(String value) {
        this.scopeEnumId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercentComplete(Long value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the workEffortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEffortName() {
        return workEffortName;
    }

    /**
     * Sets the value of the workEffortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEffortName(String value) {
        this.workEffortName = value;
    }

    /**
     * Gets the value of the showAsEnumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAsEnumId() {
        return showAsEnumId;
    }

    /**
     * Sets the value of the showAsEnumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAsEnumId(String value) {
        this.showAsEnumId = value;
    }

    /**
     * Gets the value of the sendNotificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendNotificationEmail() {
        return sendNotificationEmail;
    }

    /**
     * Sets the value of the sendNotificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendNotificationEmail(String value) {
        this.sendNotificationEmail = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the locationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDesc() {
        return locationDesc;
    }

    /**
     * Sets the value of the locationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDesc(String value) {
        this.locationDesc = value;
    }

    /**
     * Gets the value of the estimatedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedStartDate() {
        return estimatedStartDate;
    }

    /**
     * Sets the value of the estimatedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedStartDate(String value) {
        this.estimatedStartDate = value;
    }

    /**
     * Gets the value of the estimatedCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    /**
     * Sets the value of the estimatedCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedCompletionDate(String value) {
        this.estimatedCompletionDate = value;
    }

    /**
     * Gets the value of the actualStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualStartDate() {
        return actualStartDate;
    }

    /**
     * Sets the value of the actualStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualStartDate(String value) {
        this.actualStartDate = value;
    }

    /**
     * Gets the value of the actualCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualCompletionDate() {
        return actualCompletionDate;
    }

    /**
     * Sets the value of the actualCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualCompletionDate(String value) {
        this.actualCompletionDate = value;
    }

    /**
     * Gets the value of the estimatedMilliSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedMilliSeconds() {
        return estimatedMilliSeconds;
    }

    /**
     * Sets the value of the estimatedMilliSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedMilliSeconds(Double value) {
        this.estimatedMilliSeconds = value;
    }

    /**
     * Gets the value of the estimatedSetupMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedSetupMillis() {
        return estimatedSetupMillis;
    }

    /**
     * Sets the value of the estimatedSetupMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedSetupMillis(Double value) {
        this.estimatedSetupMillis = value;
    }

    /**
     * Gets the value of the estimateCalcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateCalcMethod() {
        return estimateCalcMethod;
    }

    /**
     * Sets the value of the estimateCalcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateCalcMethod(String value) {
        this.estimateCalcMethod = value;
    }

    /**
     * Gets the value of the actualMilliSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualMilliSeconds() {
        return actualMilliSeconds;
    }

    /**
     * Sets the value of the actualMilliSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualMilliSeconds(Double value) {
        this.actualMilliSeconds = value;
    }

    /**
     * Gets the value of the actualSetupMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualSetupMillis() {
        return actualSetupMillis;
    }

    /**
     * Sets the value of the actualSetupMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualSetupMillis(Double value) {
        this.actualSetupMillis = value;
    }

    /**
     * Gets the value of the totalMilliSecondsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMilliSecondsAllowed() {
        return totalMilliSecondsAllowed;
    }

    /**
     * Sets the value of the totalMilliSecondsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMilliSecondsAllowed(Double value) {
        this.totalMilliSecondsAllowed = value;
    }

    /**
     * Gets the value of the totalMoneyAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMoneyAllowed() {
        return totalMoneyAllowed;
    }

    /**
     * Sets the value of the totalMoneyAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMoneyAllowed(BigDecimal value) {
        this.totalMoneyAllowed = value;
    }

    /**
     * Gets the value of the moneyUomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyUomId() {
        return moneyUomId;
    }

    /**
     * Sets the value of the moneyUomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyUomId(String value) {
        this.moneyUomId = value;
    }

    /**
     * Gets the value of the specialTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Sets the value of the specialTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTerms(String value) {
        this.specialTerms = value;
    }

    /**
     * Gets the value of the timeTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeTransparency() {
        return timeTransparency;
    }

    /**
     * Sets the value of the timeTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTransparency(Long value) {
        this.timeTransparency = value;
    }

    /**
     * Gets the value of the universalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalId() {
        return universalId;
    }

    /**
     * Sets the value of the universalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalId(String value) {
        this.universalId = value;
    }

    /**
     * Gets the value of the sourceReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    /**
     * Sets the value of the sourceReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceReferenceId(String value) {
        this.sourceReferenceId = value;
    }

    /**
     * Gets the value of the fixedAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAssetId() {
        return fixedAssetId;
    }

    /**
     * Sets the value of the fixedAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAssetId(String value) {
        this.fixedAssetId = value;
    }

    /**
     * Gets the value of the facilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityId() {
        return facilityId;
    }

    /**
     * Sets the value of the facilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityId(String value) {
        this.facilityId = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Sets the value of the infoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
    }

    /**
     * Gets the value of the recurrenceInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    /**
     * Sets the value of the recurrenceInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInfoId(String value) {
        this.recurrenceInfoId = value;
    }

    /**
     * Gets the value of the tempExprId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempExprId() {
        return tempExprId;
    }

    /**
     * Sets the value of the tempExprId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempExprId(String value) {
        this.tempExprId = value;
    }

    /**
     * Gets the value of the runtimeDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeDataId() {
        return runtimeDataId;
    }

    /**
     * Sets the value of the runtimeDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntimeDataId(String value) {
        this.runtimeDataId = value;
    }

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteId(String value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the serviceLoaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLoaderName() {
        return serviceLoaderName;
    }

    /**
     * Sets the value of the serviceLoaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLoaderName(String value) {
        this.serviceLoaderName = value;
    }

    /**
     * Gets the value of the quantityToProduce property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityToProduce() {
        return quantityToProduce;
    }

    /**
     * Sets the value of the quantityToProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityToProduce(BigDecimal value) {
        this.quantityToProduce = value;
    }

    /**
     * Gets the value of the quantityProduced property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityProduced() {
        return quantityProduced;
    }

    /**
     * Sets the value of the quantityProduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityProduced(BigDecimal value) {
        this.quantityProduced = value;
    }

    /**
     * Gets the value of the quantityRejected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityRejected() {
        return quantityRejected;
    }

    /**
     * Sets the value of the quantityRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityRejected(BigDecimal value) {
        this.quantityRejected = value;
    }

    /**
     * Gets the value of the reservPersons property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    /**
     * Sets the value of the reservPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservPersons(BigDecimal value) {
        this.reservPersons = value;
    }

    /**
     * Gets the value of the reserv2NdPPPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReserv2NdPPPerc() {
        return reserv2NdPPPerc;
    }

    /**
     * Sets the value of the reserv2NdPPPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReserv2NdPPPerc(BigDecimal value) {
        this.reserv2NdPPPerc = value;
    }

    /**
     * Gets the value of the reservNthPPPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    /**
     * Sets the value of the reservNthPPPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservNthPPPerc(BigDecimal value) {
        this.reservNthPPPerc = value;
    }

    /**
     * Gets the value of the accommodationMapId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationMapId() {
        return accommodationMapId;
    }

    /**
     * Sets the value of the accommodationMapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationMapId(String value) {
        this.accommodationMapId = value;
    }

    /**
     * Gets the value of the accommodationSpotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationSpotId() {
        return accommodationSpotId;
    }

    /**
     * Sets the value of the accommodationSpotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationSpotId(String value) {
        this.accommodationSpotId = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisionNumber(Long value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdByUserLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    /**
     * Sets the value of the createdByUserLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUserLogin(String value) {
        this.createdByUserLogin = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(String value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastModifiedByUserLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    /**
     * Sets the value of the lastModifiedByUserLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedByUserLogin(String value) {
        this.lastModifiedByUserLogin = value;
    }

    /**
     * Gets the value of the lastUpdatedStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    /**
     * Sets the value of the lastUpdatedStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedStamp(String value) {
        this.lastUpdatedStamp = value;
    }

    /**
     * Gets the value of the lastUpdatedTxStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    /**
     * Sets the value of the lastUpdatedTxStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTxStamp(String value) {
        this.lastUpdatedTxStamp = value;
    }

    /**
     * Gets the value of the createdStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedStamp() {
        return createdStamp;
    }

    /**
     * Sets the value of the createdStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedStamp(String value) {
        this.createdStamp = value;
    }

    /**
     * Gets the value of the createdTxStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTxStamp() {
        return createdTxStamp;
    }

    /**
     * Sets the value of the createdTxStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTxStamp(String value) {
        this.createdTxStamp = value;
    }

    /**
     * Gets the value of the sequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNum(Long value) {
        this.sequenceNum = value;
    }

}
