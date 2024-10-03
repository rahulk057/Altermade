package com.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id ;
	private String clientName; 
	private String dba; 
	private String status; 
	private String startDate; 
	private String primaryEmail; 
	private String secondaryEmail; 
	private String caqhExpirables; 
	private String reCredentialing; 
	private String speciality; 
	private String billingType; 
	
	@Column(length = 1000)
	private String scopeOfWork;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id")
    @JsonManagedReference
    private ClientBillingAddress clientBillingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailing_address_id")
    @JsonManagedReference
    private ClientMailingAddress clientMailingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    @JsonManagedReference
    private ClientContact clientContact;
    
	
	

	public ClientBillingAddress getClientBillingAddress() {
		return clientBillingAddress;
	}

	public void setClientBillingAddress(ClientBillingAddress clientBillingAddress) {
		this.clientBillingAddress = clientBillingAddress;
	}

	public ClientMailingAddress getClientMailingAddress() {
		return clientMailingAddress;
	}

	public void setClientMailingAddress(ClientMailingAddress clientMailingAddress) {
		this.clientMailingAddress = clientMailingAddress;
	}

	public ClientContact getClientContact() {
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getDba() {
		return dba;
	}

	public void setDba(String dba) {
		this.dba = dba;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	
	public String getCaqhExpirables() {
		return caqhExpirables;
	}

	public void setCaqhExpirables(String caqhExpirables) {
		this.caqhExpirables = caqhExpirables;
	}

	public String getReCredentialing() {
		return reCredentialing;
	}

	public void setReCredentialing(String reCredentialing) {
		this.reCredentialing = reCredentialing;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public String getScopeOfWork() {
		return scopeOfWork;
	}

	public void setScopeOfWork(String scopeOfWork) {
		this.scopeOfWork = scopeOfWork;
	}

	

	

}
