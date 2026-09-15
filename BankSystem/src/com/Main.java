package com;

import com.model.*;
import com.service.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        // 1️⃣ Create Accounts
        Accounts account1 = new Accounts("EG11112222333344445555", 8000);
        Accounts account2 = new Accounts("EG22223333444455556666", 12000);
        Accounts account3 = new Accounts("EG33334444555566667777", 2000);
        Accounts account4 = new Accounts("EG44445555666677778888", 15000);
        Accounts account5 = new Accounts("EG55556666777788889999", 7000);

        // 2️⃣ Put Accounts in Map
        Map<String, Accounts> accounts = new HashMap<>();
        accounts.put(account1.getIban(), account1);
        accounts.put(account2.getIban(), account2);
        accounts.put(account3.getIban(), account3);
        accounts.put(account4.getIban(), account4);
        accounts.put(account5.getIban(), account5);

        // 3️⃣ Initialize Services
        TransactionsService transactionsService = new TransactionsService();
        AccountsService accountsService = new AccountsService(accounts, transactionsService);

        // 4️⃣ Show Initial State
        System.out.println("=== BEFORE ANY TRANSACTIONS ===");
        account1.displayData();
        account3.displayData();
        account4.displayData();
        account5.displayData();

        // 5️⃣ Transfer All money from account3 -> account1
        System.out.println("\n=== TRANSFER 1: account3 -> account1 (ALL BALANCE) ===");
        accountsService.transfer(
                account3.getIban(),
                account1.getIban(),
                account3.getBalance()
        );

        // 6️⃣ Show After First Transfer
        System.out.println("\n=== AFTER TRANSFER 1 ===");
        account1.displayData();
        account3.displayData();

        // 7️⃣ Transfer Partial from account4 -> account5
        System.out.println("\n=== TRANSFER 2: account4 -> account5 (3000) ===");
        accountsService.transfer(
                account4.getIban(),
                account5.getIban(),
                3000
        );

        // 8️⃣ Show After Second Transfer
        System.out.println("\n=== AFTER TRANSFER 2 ===");
        account4.displayData();
        account5.displayData();

        // 9️⃣ Show All Transactions
        System.out.println("\n=== ALL TRANSACTIONS ===");
        transactionsService.displayTransactions();
    }
}
