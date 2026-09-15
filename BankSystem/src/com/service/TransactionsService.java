package com.service;

import com.model.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionsService {

    private List<Transaction> transactions = new ArrayList<>();

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAll() {
        return transactions;
    }

    public List<Transaction> getByIBAN(String iban) {
        List<Transaction> result = new ArrayList<>();

        for (Transaction t : transactions) {
            if (t.senderIBAN().equals(iban) || t.receiverIBAN().equals(iban)) {
                result.add(t);
            }
        }

        return result;
    }

    public void displayTransactions(){
        for(Transaction t : transactions){
            System.out.println("SenderIBAN: " + t.senderIBAN());
            System.out.println("ReceiverIBAN: " + t.receiverIBAN());
            System.out.println("Amount: " + t.amount());
            System.out.println("============================================");
        }
    }
}