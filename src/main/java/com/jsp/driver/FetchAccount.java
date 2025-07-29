package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Account;

public class FetchAccount {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();

		Account account = entityManager.find(Account.class, 1);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Account No  : "+account.getNumber());
		
		System.out.println("Account Bal :"+account.getBalance());
		
		System.out.println("Bank        :"+account.getBank().getName());
		
		System.out.println("Bank Branch :"+account.getBank().getBranch());
		
		System.out.println("--------------------------------------------------------");
		
	}

}
