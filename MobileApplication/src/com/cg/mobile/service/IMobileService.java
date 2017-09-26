package com.cg.mobile.service;

import java.util.ArrayList;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationExeption;

public interface IMobileService {
public int addPurchaseDetails(PurchaseDetails p)throws MobileApplicationExeption;
public boolean validateName(String name);
public boolean validateEmailid(String id);
public boolean validatePhoneNo(String phone);
public ArrayList<MobileDetails> retrieveDetails();




}
