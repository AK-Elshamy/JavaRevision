package com.service;

import com.model.*;

import java.util.Map;

public class AccountsService {

    private Map<String, Accounts> accounts;
    private TransactionsService transactionsService;


    public AccountsService(Map<String, Accounts> accounts, TransactionsService transactionsService) {
        this.accounts = accounts;
        this.transactionsService = transactionsService;
    }

    public void transfer(String senderIBAN, String receiverIBAN, double amount) {

        Accounts sender = accounts.get(senderIBAN);
        Accounts receiver = accounts.get(receiverIBAN);

        if (sender == null || receiver == null) {
            throw new IllegalArgumentException("Invalid IBAN");
        }


        sender.withdraw(amount);

        try {
            receiver.deposit(amount);
        } catch (RuntimeException ex) {
            sender.deposit(amount); // rollback
            throw ex;
        }


        Transaction transaction = new Transaction(senderIBAN, receiverIBAN, amount);
        transactionsService.add(transaction);
    }


}