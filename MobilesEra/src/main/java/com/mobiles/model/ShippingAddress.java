package com.mobiles.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.google.gson.annotations.Expose;

@Entity
public class ShippingAddress 
{
	@Id
	@Expose
	private int shipAddId;
	
	@Expose
	int userId;
	
	@Expose
	private String sName;
	
	@Expose
	private String sPrefix;
	
	@Expose
	private String sLandmark;
	
	@Expose
	private String sStreet;
	
	@Expose
	private String sCity;
	
	@Expose	
	private String sState;
	
	@Expose
	private String sCountry;
	
	@Expose
	private int sPIN;
	
	@OneToOne
	@JoinColumn(name="userId", nullable=false , updatable=false , insertable=false )
	private User user;

	public int getShipAddId() {
		return shipAddId;
	}

	public void setShipAddId(int shipAddId) {
		this.shipAddId = shipAddId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPrefix() {
		return sPrefix;
	}

	public void setsPrefix(String sPrefix) {
		this.sPrefix = sPrefix;
	}

	public String getsLandmark() {
		return sLandmark;
	}

	public void setsLandmark(String sLandmark) {
		this.sLandmark = sLandmark;
	}

	public String getsStreet() {
		return sStreet;
	}

	public void setsStreet(String sStreet) {
		this.sStreet = sStreet;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public String getsState() {
		return sState;
	}

	public void setsState(String sState) {
		this.sState = sState;
	}

	public String getsCountry() {
		return sCountry;
	}

	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}

	public int getsPIN() {
		return sPIN;
	}

	public void setsPIN(int sPIN) {
		this.sPIN = sPIN;
	}

	public User getUser() {
		return user;
	}
	

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
