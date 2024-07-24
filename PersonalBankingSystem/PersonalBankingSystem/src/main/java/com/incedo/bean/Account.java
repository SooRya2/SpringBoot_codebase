package com.incedo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int accId;
	private double balance;
	private String IFSCcode;
	
	public Account()
	{
		
	}

	
	public Account(int accId, double balance, String iFSCcode) {
		super();
		this.accId = accId;
		this.balance = balance;
		IFSCcode = iFSCcode;
	}



	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	
	
	
}
