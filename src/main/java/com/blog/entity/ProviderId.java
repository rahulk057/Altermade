package com.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provider_id")
public class ProviderId {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String providerName;
    private String licenseType;
    private String state;
    private String expiryMonitor;
    private String licenseNumber;
    private String issueDate;
    private String expiryDate;
    private String schedule;
    private String notes;
    private long providerid;
	public long getProviderid() {
		return providerid;
	}
	public void setProviderid(long providerid) {
		this.providerid = providerid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getExpiryMonitor() {
		return expiryMonitor;
	}
	public void setExpiryMonitor(String expiryMonitor) {
		this.expiryMonitor = expiryMonitor;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
