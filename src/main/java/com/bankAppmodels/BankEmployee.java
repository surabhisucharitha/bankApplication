package com.bankAppmodels;

public class BankEmployee {

	int Bank_employee_id;
	String Bank_employee_name;
	String password;
	
	public BankEmployee(int bank_employee_id, String bank_employee_name, String password) {
		super();
		Bank_employee_id = bank_employee_id;
		Bank_employee_name = bank_employee_name;
		this.password = password;
	}

	public BankEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getBank_employee_id() {
		return Bank_employee_id;
	}
	public void setBank_employee_id(int bank_employee_id) {
		Bank_employee_id = bank_employee_id;
	}
	public String getBank_employee_name() {
		return Bank_employee_name;
	}
	public void setBank_employee_name(String bank_employee_name) {
		Bank_employee_name = bank_employee_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    	
	

}


