/**
 * Copyright 2014 Society for Health Information Systems Programmes, India (HISP India)
 * <p/>
 * This file is part of Hospital-core module.
 * <p/>
 * Hospital-core module is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * Hospital-core module is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with Hospital-core module.  If not, see <http://www.gnu.org/licenses/>.
 **/

package org.openmrs.module.hospitalcore.model;

import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.User;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class IndoorPatientServiceBill implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer indoorPatientServiceBillId;

    private Patient patient;

    private User creator;

    private BigDecimal amount;

    private BigDecimal actualAmount;

    private Date createdDate;

    private Set<IndoorPatientServiceBillItem> billItems;

    private Encounter encounter;

    private Integer selectedCategory;
    private BigDecimal waiverAmount;
    private String comment;
    private String paymentMode;


    public Integer getIndoorPatientServiceBillId() {
        return indoorPatientServiceBillId;
    }

    public void setIndoorPatientServiceBillId(Integer indoorPatientServiceBillId) {
        this.indoorPatientServiceBillId = indoorPatientServiceBillId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void addBillItem(IndoorPatientServiceBillItem item) {
        if (billItems == null)
            billItems = new HashSet<IndoorPatientServiceBillItem>();
        billItems.add(item);
    }

    public Set<IndoorPatientServiceBillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(Set<IndoorPatientServiceBillItem> billItems) {
        this.billItems = billItems;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    /**
     * @return the selectedCategory
     */
    public Integer getSelectedCategory() {
        return selectedCategory;
    }

    /**
     * @param selectedCategory the selectedCategory to set
     */
    public void setSelectedCategory(Integer selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public BigDecimal getWaiverAmount() {
        return waiverAmount;
    }

    public void setWaiverAmount(BigDecimal waiverAmount) {
        this.waiverAmount = waiverAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
