package com.bankAppmodels;

public class BankUser {

	int bankUserId;
	String bankUserName;
	String address;
	double avaialableBalance; 
	String password;
	
	
	
	public BankUser(int bankUserId, String bankUserName, String address, double avaialableBalance, String password) {
		super();
		this.bankUserId = bankUserId;
		this.bankUserName = bankUserName;
		this.address = address;
		this.avaialableBalance = avaialableBalance;
		this.password = password;
	}
	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** 
	 * @return the bankUserId
	 */
	public int getBankUserId() {
		return bankUserId;
	}
	/**
	 * @param bankUserId the bankUserId to set
	 */
	public void setBankUserId(int bankUserId) {
		this.bankUserId = bankUserId;
	}
	/**
	 * @return the bankUserName
	 */
	public String getBankUserName() {
		return bankUserName;
	}
	/**
	 * @param bankUserName the bankUserName to set
	 */
	public void setBankUserName(String bankUserName) {
		this.bankUserName = bankUserName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the avaialableBalance
	 */
	public double getAvaialableBalance() {
		return avaialableBalance;
	}
	/**
	 * @param avaialableBalance the avaialableBalance to set
	 */
	public void setAvaialableBalance(double avaialableBalance) {
		this.avaialableBalance = avaialableBalance;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
