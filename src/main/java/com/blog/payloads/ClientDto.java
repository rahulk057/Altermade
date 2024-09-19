package com.blog.payloads;

public class ClientDto {
	
	private Integer id;
    private String client_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public ClientDto(Integer id, String client_name) {
        this.id = id;
        this.client_name = client_name;
    }

}
