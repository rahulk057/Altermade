package com.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="client_coi")
public class ClientCOI {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String clientName;
    private String effectiveDate;
    private String expirationDate;
    private String retroDate;
    private String carrierName;
    
    private String policyNumber;
    private String expiryMonitor; // Assuming Active/Inactive or similar values
    private String occurrenceLimit;
    private String aggregateLimit;
    private String address;
    
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String country; // Assuming Yes/No is a dropdown for availability
    private int clientId;
    
    public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getRetroDate() {
		return retroDate;
	}

	public void setRetroDate(String retroDate) {
		this.retroDate = retroDate;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getExpiryMonitor() {
		return expiryMonitor;
	}

	public void setExpiryMonitor(String expiryMonitor) {
		this.expiryMonitor = expiryMonitor;
	}

	public String getOccurrenceLimit() {
		return occurrenceLimit;
	}

	public void setOccurrenceLimit(String occurrenceLimit) {
		this.occurrenceLimit = occurrenceLimit;
	}

	public String getAggregateLimit() {
		return aggregateLimit;
	}

	public void setAggregateLimit(String aggregateLimit) {
		this.aggregateLimit = aggregateLimit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	private String notes;

}
