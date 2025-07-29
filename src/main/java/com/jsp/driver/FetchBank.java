package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class FetchBank {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();

		Bank bank = entityManager.find(Bank.class, 1);

		System.out.println("-----------------------------------------------");

		System.out.println("Bank        :"+bank.getName());

		System.out.println("Bank Branch :"+bank.getBranch());

		List<Account> list = bank.getAccount();

		for (Account acc : list) {

			System.out.println("Id      : " + acc.getId());

			System.out.println("Name    : " + acc.getNumber());

			System.out.println("Balance : " + acc.getBalance());

		}

		System.out.println("-----------------------------------------------");

	}

}
