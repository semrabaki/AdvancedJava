package com.generics.example;

import java.util.Date;

public class RepositoryDemo {

	public static void main(String[] args) {
		
		User user=new User();
		
		user.setId(1L);
		user.setName("John Coffee");
		
		UserRepository userRepo= new UserRepository();
		
		userRepo.save(user);
		
		
		Account account= new Account();
		account.setAccountNumber(3434343434343434L);
		account.setBalance(500.0);
		AccountRepository accountRepo=new AccountRepository();
		accountRepo.save(account);
		
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setDate(new Date());
		
		TransactionRepository transactionRepo= new TransactionRepository();
		transactionRepo.save(transaction);

	}

}
