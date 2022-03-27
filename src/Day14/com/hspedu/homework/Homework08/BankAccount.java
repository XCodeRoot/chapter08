package Day14.com.hspedu.homework.Homework08;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {//初始余额
        this.balance = initialBalance;
    }

    public void deposit(double account){//存钱
        balance+=account;
    }

    public void withdraw(double account){//取钱
        balance-=account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}
