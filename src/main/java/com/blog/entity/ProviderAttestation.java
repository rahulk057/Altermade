package com.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="provider_attestation")
public class ProviderAttestation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String caqhNumber;
	private String caqhAttestationDate;
	private String caqhReattestationDate;
	
	@OneToOne(mappedBy = "providerAttestation")  // Corrected field name
    @JsonBackReference
    private Provider provider;
	
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCaqhNumber() {
		return caqhNumber;
	}
	public void setCaqhNumber(String caqhNumber) {
		this.caqhNumber = caqhNumber;
	}
	public String getCaqhAttestationDate() {
		return caqhAttestationDate;
	}
	public void setCaqhAttestationDate(String caqhAttestationDate) {
		this.caqhAttestationDate = caqhAttestationDate;
	}
	public String getCaqhReattestationDate() {
		return caqhReattestationDate;
	}
	public void setCaqhReattestationDate(String caqhReattestationDate) {
		this.caqhReattestationDate = caqhReattestationDate;
	}
	

}
