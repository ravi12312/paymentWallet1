package com.cg.paymentwallet.bean;

public class ClientTranctions {

	private long phoneNumber;
	private String date;
	private String type;
	private long receipentNumber;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getReceipentNumber() {
		return receipentNumber;
	}
	public void setReceipentNumber(long receipentNumber) {
		this.receipentNumber = receipentNumber;
	}
	
	
}
