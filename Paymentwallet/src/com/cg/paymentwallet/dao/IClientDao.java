package com.cg.paymentwallet.dao;

import java.util.ArrayList;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTranctions;

public interface IClientDao {

	public boolean createaccount(ClientBean cb);
	public double showbalance(long mobileNumber);
	public double deposite(long mobileNumber, double amount);
	public double withdraw(long mobileNumber, double amount);
	public boolean fundtransfer(long number1, long number2);
	public boolean checkphonenumber(long mobileNumber);
	public ArrayList<ClientTranctions>  printtranctions(long mobileNumber);
}
