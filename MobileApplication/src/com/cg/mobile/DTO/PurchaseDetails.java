package com.cg.mobile.DTO;

import java.time.LocalDate;

public class PurchaseDetails {
private int purchaseId;
private LocalDate purchaseDate;
private String Customername;
private String MailId;
private long Phonenumber;
private int MobileId;


public int getPurchaseId() {
	return purchaseId;
}
public void setPurchaseId(int purchaseId) {
	this.purchaseId = purchaseId;
}
public LocalDate getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(LocalDate purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public String getCustomername() {
	return Customername;
}
public void setCustomername(String customername) {
	Customername = customername;
}
public String getMailId() {
	return MailId;
}
public void setMailId(String mailId) {
	MailId = mailId;
}
public long getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(long phonenumber) {
	Phonenumber = phonenumber;
}
public int getMobileId() {
	return MobileId;
}
public void setMobileId(int mobileId) {
	MobileId = mobileId;
}

public PurchaseDetails(String customername, String mailId, long phonenumber,
		int mobileId) {
	super();
	Customername = customername;
	MailId = mailId;
	Phonenumber = phonenumber;
	MobileId = mobileId;
}
@Override
public String toString() {
	return "PurchaseDetails [purchaseId=" + purchaseId + ", purchaseDate="
			+ purchaseDate + ", Customername=" + Customername + ", MailId="
			+ MailId + ", Phonenumber=" + Phonenumber + ", MobileId="
			+ MobileId + "]";
}
public PurchaseDetails()
{
	
}																					//Default constructor


}
