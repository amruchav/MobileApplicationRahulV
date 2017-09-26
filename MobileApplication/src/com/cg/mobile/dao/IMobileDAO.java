package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationExeption;

public interface IMobileDAO {
	public int addPurchaseDetails(PurchaseDetails p)throws MobileApplicationExeption;

	public ArrayList<MobileDetails> retrieveDetails();

	
}
