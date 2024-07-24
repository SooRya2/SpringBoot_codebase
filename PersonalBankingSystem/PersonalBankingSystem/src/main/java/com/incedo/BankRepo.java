package com.incedo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.bean.Account;
import com.incedo.bean.User;


@Repository
public interface BankRepo extends JpaRepository<Account,Integer>
{
		
}


