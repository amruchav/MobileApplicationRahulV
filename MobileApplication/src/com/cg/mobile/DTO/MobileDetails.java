package com.cg.mobile.DTO;

public class MobileDetails {
	private int MobileId;
	private String name;
	private float price;
	private String quantity;
	
	
	

	public int getMobileId() {
		return MobileId;
	}




	public void setMobileId(int mobileId) {
		MobileId = mobileId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public String getQuantity() {
		return quantity;
	}




	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}




	public MobileDetails(int mobileId, String name, float price, String quantity) {
		super();
		MobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}




	public MobileDetails()
	{
		
	}
}
