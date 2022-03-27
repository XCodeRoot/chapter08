package Day14.com.hspedu.homework.Homework08;

public class SavingAccount extends BankAccount{

    private int count=3;//计数
    private double rate=0.01;//利率

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double account) {
        if(count>0)
            super.deposit(account);
        else
            super.deposit(account-1);
        count--;
    }

    @Override
    public void withdraw(double account) {
        if(count>0){
            super.withdraw(account);
        }else{
            super.withdraw(account+1);
        }
        count--;
    }
    public void earnMonthlyInterest(){
        count=3;//每个月初，我们统计上个月的利息，同时将count重置为3
        super.deposit(getBalance()*rate);
    }
}
