package com.cg.mobile.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationExeption;

public class MobileServiceImpl implements IMobileService {
IMobileDAO dao=null;
	
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationExeption {
		dao=new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
		
	}
	public boolean validateName(String name)
	{
		String ptn="[A-Z]{1}[a-z]{2,19}";
		if(Pattern.matches(ptn, name))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct Customer name");
			return false;
		}																		
	}																		//Validation for Name
	
	public boolean validateEmailid(String id)
	{
		String ptn="^[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(ptn, id))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct Email Id");
			return false;
		}																		
	}			
	
	public boolean validatePhoneNo(String phone)
	{
		String ptn="[0-9]{10}";
		if(Pattern.matches(ptn, phone))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct Phone number.");
			return false;
		}																		
	}
	
	public boolean validatemobileId(String id1)
	{
		String ptn="[0-9]{4}";
		if(Pattern.matches(ptn, id1))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct Phone number.");
			return false;
		}																		
	}
	@Override
	public ArrayList<MobileDetails> retrieveDetails() {
		IMobileDAO details=new MobileDaoImpl();
		return details.retrieveDetails();
	}
	
	
	
	
}
	
