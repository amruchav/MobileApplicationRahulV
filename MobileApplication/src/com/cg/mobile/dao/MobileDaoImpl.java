package com.cg.mobile.dao;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dbutil.DbUtil;
//import com.cg.mobile.dbutil.DbUtil;
import com.cg.mobile.exception.MobileApplicationExeption;
public class MobileDaoImpl implements IMobileDAO{
	Connection conn=null;
	Logger logger=Logger.getRootLogger();
	
	public MobileDaoImpl(){
		PropertyConfigurator.configure("log4j.properties");	 
		
	}
public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationExeption{
	
		int result = 0;
		try{
			conn=DbUtil.getConnection();
			String insertQuery="Insert into PurchaseDetails values(purchase_seq_id.nextval,?,?,?,SYSDATE,?)";
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setString(1,p.getCustomername());
			ps.setString(2,p.getMailId());
			ps.setLong(3,p.getPhonenumber());
			ps.setInt(4, p.getMobileId());
			
			result=ps.executeUpdate();
			System.out.println(result);
			logger.info("Execute successfully");
			
		}
		catch(IOException e)
		{
			logger.error("Error Occured");
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			logger.error("Error Occured");
			System.out.println(e.getMessage());
			
		}
		return result;
	}

public ArrayList<MobileDetails> retrieveDetails() {
	ArrayList<MobileDetails> list=new ArrayList<MobileDetails>();
	try
	{
	conn=DbUtil.getConnection();
	String sl="Select * from mobiles";
	
	
	Statement stmt=conn.createStatement();
	
	ResultSet rs=stmt.executeQuery(sl);
	while(rs.next())
	{
		int MobileId=rs.getInt(1);
		String name=rs.getString(2);
		float price=rs.getFloat(3);
		String quantity=rs.getString(4);
		list.add(new MobileDetails(MobileId,name,price,quantity));
	}
	
}
catch(SQLException|IOException e)
{
	logger.error("Error Occured");
	System.out.println(e.getMessage());
}
return list;
}
}
