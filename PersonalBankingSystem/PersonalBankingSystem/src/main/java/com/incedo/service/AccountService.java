package com.incedo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.incedo.BankRepo;
import com.incedo.bean.Account;

@Service
public class AccountService {
	 
	private BankRepo repo;
	
	public List<Account> findAll()
	{
		
		return repo.findAll();
	}
	
	public Account getAccountbyId(int id)
	{
		Optional<Account> ac=repo.findById(id);
		if(ac.isPresent())
		{
			Account a=ac.get();
			return a;
		}
		else
			return null;
	}
	
	public String UpdateAccount(Account acc)
	{
		Optional<Account> ac=repo.findById(acc.getAccId());
		if(ac.isPresent())
		{
			repo.saveAndFlush(acc);
			return "Accout details Updated";
		}
		else
			return "Account details not updated";
		
	}

}
