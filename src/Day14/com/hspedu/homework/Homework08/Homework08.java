package Day14.com.hspedu.homework.Homework08;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);//初始有多少余额
        checkingAccount.deposit(10);//存钱
        System.out.println(checkingAccount.getBalance());//显示余额

        checkingAccount.withdraw(9);//取钱
        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);//初始1000，存三次
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);

        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);//三次用完就开始有手续费了
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();//月初自动将利息存进余额
        System.out.println(savingAccount.getBalance());
    }
}
