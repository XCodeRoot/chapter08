package Day14.com.hspedu.homework.Homework08;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double account) {
        super.deposit(account-1);//一块钱是手续费
    }

    @Override
    public void withdraw(double account) {
        super.withdraw(account+1);//要取出100，则银行自动提101，再减去1元手续费给银行
    }
}
