package com.cg.mobile.UI;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationExeption;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI {
	static Scanner sc=new Scanner(System.in);
	static int choice=0;
	static PurchaseDetails details=null;
	static IMobileService Service=new MobileServiceImpl();
	public static void main(String[] args) throws MobileApplicationExeption {
		//Scanner sc=null;
		System.out.println("Mobile Application");
		System.out.println("******************");
		while(true)
		{
			System.out.println("1.Enter Purchase Details:");
			System.out.println("2.Enter Mobile Details:");
			System.out.println("3.Exit:");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:addpurchaseDetails();
			break;
			case 2:getMobileDetails();
			break;
			case 3:
				System.exit(0);
				break;
			}
			
		}
	}
	
	private static void addpurchaseDetails() throws MobileApplicationExeption{
	try
	
	{
		Service=new MobileServiceImpl();
		System.out.println("Enter customer name:");
		String name=sc.next();
		if(Service.validateName(name))
		{
		System.out.println("Enter the mailId");
		String mail=sc.next();
		if(Service.validateEmailid(mail))
		{		
		System.out.println("Enter Phone number:");
		long phone=sc.nextLong();
		String num=String.valueOf(phone);
		if(Service.validatePhoneNo(num))
		{		
		System.out.println("Enter mobile id");
		int mobid=sc.nextInt();
		
		details=new PurchaseDetails(name,mail,phone,mobid);
		Service=new MobileServiceImpl();
		int res=Service.addPurchaseDetails(details);
		
		System.out.println(res+ " inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}
	
		}
		}
		}
}
		catch(MobileApplicationExeption e)
		{
			throw new MobileApplicationExeption("Exception occured");
			
			
		}
	}
	
	private static void getMobileDetails() 
	{
		ArrayList<MobileDetails> list=null;
		list=Service.retrieveDetails();
		for(MobileDetails m:list)
		{
			System.out.println(m.getMobileId());
			System.out.println(m.getName());
			System.out.println(m.getPrice());
			System.out.println(m.getQuantity());
		}
		
	}
}

	
	
	


	

