package com.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    private String clientName;
	    private String providerName;
	    private String locationList;   // Example: Active/Inactive
	    private String effectiveDate;  // Use LocalDate for date fields
	    private String phoneNumber;
	    private String fax;
	    private String address;
	    private String address2;
	    private String city;
	    private String state;   // Example: Active/Inactive
	    private String country;  // Example: Yes/No
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
		public String getProviderName() {
			return providerName;
		}
		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}
		public String getLocationList() {
			return locationList;
		}
		public void setLocationList(String locationList) {
			this.locationList = locationList;
		}
		public String getEffectiveDate() {
			return effectiveDate;
		}
		public void setEffectiveDate(String effectiveDate) {
			this.effectiveDate = effectiveDate;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getFax() {
			return fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
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
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}


}
