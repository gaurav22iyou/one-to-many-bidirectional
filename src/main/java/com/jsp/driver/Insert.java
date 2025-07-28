package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Insert {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		
		
		Bank bank = new Bank(3, "HDFC","sanpada");

		Account account1 = new Account(5, 56254, 520000);
		Account account2 = new Account(6, 41223, 255243);

		account1.setBank(bank);
		account2.setBank(bank);
		
		List<Account> list = new ArrayList<Account>();
		list.add(account1);
		list.add(account2);

		bank.setAccount(list);

		transaction.begin();

		entityManager.persist(bank);

		entityManager.persist(account1);

		entityManager.persist(account2);

		transaction.commit();

	}

}
