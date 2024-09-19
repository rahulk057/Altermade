package com.blog.payloads;

public class ProviderDto {

	private Long id;
    private String providerFullName;
    private String clientName;
    private String birthDate;
    private String status;
    private String providerSpeciality;
    private String npiNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProviderFullName() {
		return providerFullName;
	}
	public void setProviderFullName(String providerFullName) {
		this.providerFullName = providerFullName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProviderSpeciality() {
		return providerSpeciality;
	}
	public void setProviderSpeciality(String providerSpeciality) {
		this.providerSpeciality = providerSpeciality;
	}
	public String getNpiNumber() {
		return npiNumber;
	}
	public void setNpiNumber(String npiNumber) {
		this.npiNumber = npiNumber;
	}
}
