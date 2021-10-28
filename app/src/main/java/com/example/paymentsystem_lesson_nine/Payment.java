package com.example.paymentsystem_lesson_nine;

import android.util.Log;

import java.util.Random;

public class Payment implements Runnable {
    final Account account;
    public int deposit;

    public Payment(Account account, int deposit) {
        this.account = account;
        this.deposit = deposit;
        new Thread(this).start();
    }

    @Override
    public void run(){
        synchronized (account){
            Log.d("myLog","New payment: ");
            int oldBalance = account.balance;
            try{
                account.balance += deposit;
                Thread.sleep(new Random().nextInt(5000));
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }Log.d("myLog","Balance: " + oldBalance + " " + "Deposit: " + deposit
                    + " = " + account.balance);
        }
    }

}


