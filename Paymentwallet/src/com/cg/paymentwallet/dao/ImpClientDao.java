package com.cg.paymentwallet.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cg.paymentwallet.bean.ClientBean;
import com.cg.paymentwallet.bean.ClientTranctions;

public class ImpClientDao implements IClientDao {
	List<ClientBean> li = new ArrayList<ClientBean>();
	List<ClientTranctions> ct = new ArrayList<ClientTranctions>();
	ClientTranctions cb = new ClientTranctions();
	@Override
	public boolean createaccount(ClientBean cb) {
		boolean isadded = false;
		isadded = li.add(cb);
		return isadded;
	}
	@Override
	public double showbalance(long mobileNumber) {
		double balance = 0;
		for (ClientBean clientBean : li){
			if(clientBean.getMobileNumber()== mobileNumber) {
				balance = clientBean.getBalance();
			}
			}
		return balance;
	}

	



	@Override
	public ArrayList<ClientTranctions> printtranctions(long mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkphonenumber(long mobileNumber) {
		boolean isvalid = false;
		for (ClientBean clientBean : li) {
			if(ClientBean.getMobileNumber() == mobileNumber) {
				isvalid = true;
			}
		}
		return false;
	}
	
	@Override
	public double withdraw(long mobileNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean fundtransfer(long number1, long number2) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double deposite(long mobileNumber, double amount) {
		double balance = 0;
		for (ClientBean clientBean : li){
		if(clientBean.getMobileNumber() == mobileNumber) {
			balance = clientBean.getBalance()+amount;
			ClientBean.setBalance(balance);
			li.set(li.indexOf(clientBean), clientBean);
			Date date = new Date();
			cb.setAmount(amount);
			cb.setPhoneNumber(mobileNumber);
			cb.setReceipentNumber(mobileNumber);
			cb.setDate(date.toString());
			cb.setType("Deposit");
			
			ct.add(cb);
			
		}
		}
		return balance;
	}
	
	
}
