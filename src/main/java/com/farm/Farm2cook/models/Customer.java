package com.farm.Farm2cook.models;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Customer")
public class Customer {
	
    String firstname;
    String lastname;
    String email;
    String telephone;
    String  dateregistered;
    String status;
    String id;


 public Customer() {
    }

    public Customer(String firstname, String lastname,String email, String telephone, String dateregistered,String id, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.dateregistered = dateregistered;
        this.status = status;
        this.id=id;
       
        
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDateregistered() {
		return dateregistered;
	}

	public void setDateregistered(String dateregistered) {
		this.dateregistered = dateregistered;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

    }