package com.all.passwords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Safe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String url;
	private String username;
	private String password; // should be encrypted later
	
	public Safe() {
		super();
	}
	public Safe(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Safe [id=" + id + ", url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	

	

}
