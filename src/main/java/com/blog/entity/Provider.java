package com.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="provider")
public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String providerFullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String clientName;
	private String status;
	private String providerType;
	private String providerSpeciality;
	private String birthDate;
	private String birthPlace;
	private String gender;
	private String driverLicense;
	private String supervisingPhysician;
	private String supervisingPhysicianNPI;
	private String npiNumber;
	private String socialSecurity;
	private String citizenship;
	private String email;
	private String secondaryEmail;
	private String caqhExpirables;
	private String teleHealth;
	private String upinNumber;
	private String taxonomyCode;
	private String taxonomyDescription;
	private String usmleNumber;
	private String ecfmgNumber;
	
	@Size(max = 1000) // Set the maximum length of the string
   	private String notes;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_homeaddress_id")
    @JsonManagedReference
    private ProviderHomeAddress providerHomeAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_caqhattestation_id")
    @JsonManagedReference
    private ProviderAttestation providerAttestation;
	
	

	public long getId() {
		return id;
	}

	public ProviderHomeAddress getProviderHomeAddress() {
		return providerHomeAddress;
	}

	public void setProviderHomeAddress(ProviderHomeAddress providerHomeAddress) {
		this.providerHomeAddress = providerHomeAddress;
	}

	public ProviderAttestation getProviderAttestation() {
		return providerAttestation;
	}

	public void setProviderAttestation(ProviderAttestation providerAttestation) {
		this.providerAttestation = providerAttestation;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getProviderFullName() {
		return providerFullName;
	}

	public void setProviderFullName(String providerFullName) {
		this.providerFullName = providerFullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProviderType() {
		return providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getProviderSpeciality() {
		return providerSpeciality;
	}

	public void setProviderSpeciality(String providerSpeciality) {
		this.providerSpeciality = providerSpeciality;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getSupervisingPhysician() {
		return supervisingPhysician;
	}

	public void setSupervisingPhysician(String supervisingPhysician) {
		this.supervisingPhysician = supervisingPhysician;
	}

	
	public String getSupervisingPhysicianNPI() {
		return supervisingPhysicianNPI;
	}

	public void setSupervisingPhysicianNPI(String supervisingPhysicianNPI) {
		this.supervisingPhysicianNPI = supervisingPhysicianNPI;
	}

	public String getNpiNumber() {
		return npiNumber;
	}

	public void setNpiNumber(String npiNumber) {
		this.npiNumber = npiNumber;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTeleHealth() {
		return teleHealth;
	}

	public void setTeleHealth(String teleHealth) {
		this.teleHealth = teleHealth;
	}

	public String getUpinNumber() {
		return upinNumber;
	}

	public void setUpinNumber(String upinNumber) {
		this.upinNumber = upinNumber;
	}

	public String getTaxonomyCode() {
		return taxonomyCode;
	}

	public void setTaxonomyCode(String taxonomyCode) {
		this.taxonomyCode = taxonomyCode;
	}

	public String getTaxonomyDescription() {
		return taxonomyDescription;
	}

	public void setTaxonomyDescription(String taxonomyDescription) {
		this.taxonomyDescription = taxonomyDescription;
	}

	public String getUsmleNumber() {
		return usmleNumber;
	}

	public void setUsmleNumber(String usmleNumber) {
		this.usmleNumber = usmleNumber;
	}

	public String getEcfmgNumber() {
		return ecfmgNumber;
	}

	public void setEcfmgNumber(String ecfmgNumber) {
		this.ecfmgNumber = ecfmgNumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	

}
