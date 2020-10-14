package com.javarush.task.task17.task1720;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;
    private String owner;
    Object lock1 = new Object();
    Object lock2 = new Object();
    public BankAccount(String owner) {
        this(BigDecimal.ZERO, owner);
    }

    public BankAccount(BigDecimal balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public synchronized void deposit(BigDecimal money) {
       // synchronized (lock1) {
        BigDecimal newBalance = balance.add(money);
        System.out.println("Добавляем " + money + ", на счету " + newBalance);
        balance = newBalance;
       // }
    }

    public synchronized void withdraw(BigDecimal money) throws NotEnoughMoneyException {
        //synchronized (lock2) {
            BigDecimal newBalance = balance.subtract(money);

            if (newBalance.compareTo(BigDecimal.ZERO) < 0) throw new NotEnoughMoneyException();

            balance = newBalance;
            System.out.println("Тратим " + money + ", на счету " + balance);
        //}
    }

    public void deposit(String money) {
        deposit(new BigDecimal(money));
    }

    public void withdraw(String money) throws NotEnoughMoneyException {
        withdraw(new BigDecimal(money));
    }
}
