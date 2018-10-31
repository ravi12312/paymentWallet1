package com.cg.paymentwallet.service;

import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTranctions;
import com.cg.paymentwallet.dao.IClientDao;
import com.cg.paymentwallet.dao.ImpClientDao;
import com.cg.paymentwallet.exception.ClientException;
import com.cg.paymentwallet.exception.ClientExceptionMessages;

public class ClientServiceImp implements IClientService{

	IClientDao dao = new ImpClientDao();
	@Override
	public boolean createaccount(ClientBean cb) {
		// TODO Auto-generated method stub
		return dao.createaccount(cb);
	}

	@Override
	public double showbalance(long mobileNumber) {
		// TODO Auto-generated method stub
		return dao.showbalance(mobileNumber);
		
	}

	@Override
	public double withdraw(long mobileNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(mobileNumber, amount);
	}
	

	
	
	@Override
	public boolean fundtransfer(long number1, long number2) {
		// TODO Auto-generated method stub
		return dao.fundtransfer(number1, number2);
	}

	@Override
	public ArrayList<ClientTranctions> printtranctions(long mobileNumber) {
		// TODO Auto-generated method stub
		return dao.printtranctions(mobileNumber);
	}

	@Override
	public boolean checkphonenumber(long mobileNumber) {
		// TODO Auto-generated method stub
		return dao.checkphonenumber(mobileNumber);
		}


	@Override
	public boolean validate(ClientBean cbean) throws ClientException {
		boolean isvalid;
		if(cbean.getLastName().trim().length() < 4)
		{
			throw new ClientException(ClientExceptionMessages.ERRORNAME);
		}
		if(cbean.getFirstName().length() < 4)
		{
			throw new ClientException(ClientExceptionMessages.ERRORNAME);
		}
		if(cbean.getAddress() == "") {
			throw new ClientException(ClientExceptionMessages.ERRORADDRESS);
		}
		if(!(cbean.getPan().matches("A-Z]{5}[0-9]{4}[A-Z]{1}")))
		{
			throw new ClientException(ClientExceptionMessages.ERRORPAN);
		}
		if(!(cbean.getEmailid().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")))
				{
			throw new ClientException(ClientExceptionMessages.ERROREMAIL);
		}
		return true;
	}

	@Override
	public boolean validatephonenumber(long mobileNumber) {
		boolean isvalidate=false;
		 // 1) Begins with 0 or 91 
       // 2) Then contains 7 or 8 or 9. 
       // 3) Then contains 9 digits 
		if(String.valueOf(mobileNumber).matches("(0/91)?[7-9][0-9]{9}")) {
		isvalidate = true;	
	}
		return isvalidate;
	}

	@Override
	public boolean validateamount(double amount) {
		boolean isvalidate=false;
		if(amount > 0) {
			isvalidate = true;
		}
		return isvalidate;
	}

	
}
