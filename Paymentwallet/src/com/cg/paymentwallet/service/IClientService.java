package com.cg.paymentwallet.service;

import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTranctions;
import com.cg.paymentwallet.exception.ClientException;

public interface IClientService {

	public boolean createaccount(ClientBean cb);
	public double showbalance(long mobileNumber);
	public double withdraw(long mobileNumber, double amount);
	public boolean fundtransfer(long number1, long number2);
	public ArrayList<ClientTranctions>  printtranctions(long mobileNumber);
	
	
	public boolean checkphonenumber(long mobileNumber);
	public boolean validate(ClientBean cbean) throws ClientException;
	public boolean validatephonenumber(long mobileNumber);
	public boolean validateamount(double amount);
}
