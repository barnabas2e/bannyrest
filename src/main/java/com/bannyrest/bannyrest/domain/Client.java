package com.bannyrest.bannyrest.domain;

import java.io.Serializable;

public class Client implements Serializable {
    
	private static final long serialVersionUID = -6673532093586278058L;
    private Integer id;
    private String firstName;
    private String lastName;
    
    public Client() {}
    
    public Client(Integer pId, String pFirstName, String pLastName) {
    	this.id = pId;
    	this.firstName = pFirstName;
    	this.lastName = pLastName;
    }
    
    public Integer getId() {
    	return id;
    } 
    
    public void setId(Integer pId) {
    	this.id = pId;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String pFirstName) {
		this.firstName = pFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String pLastName) {
		this.lastName = pLastName;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
	
}