package com.cg.paymentwallet.bean;


public class ClientBean {
	private static String firstName;
	private static String lastName;
	private static long mobileNumber;
	private static String emailid;
	private static String pan;
	private static double balance;
	private static String address;
	
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		ClientBean.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		ClientBean.lastName = lastName;
	}
	public static long getMobileNumber() {
		return mobileNumber;
	}
	public static void setMobileNumber(long mobileNumber) {
		ClientBean.mobileNumber = mobileNumber;
	}
	public static String getEmailid() {
		return emailid;
	}
	public static void setEmailid(String emailid) {
		ClientBean.emailid = emailid;
	}
	public static String getPan() {
		return pan;
	}
	public static void setPan(String pan) {
		ClientBean.pan = pan;
	}
	public static double getBalance() {
		return balance;
	}
	public static void setBalance(double balance) {
		ClientBean.balance = balance;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		ClientBean.address = address;
	}
	
	
	
	
	
}
