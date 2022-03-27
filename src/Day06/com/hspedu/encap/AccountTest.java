package Day06.com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Smith", 10, "22");
        System.out.println(account.info());
    }
}

class Account {
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4)
            this.name = name;//this.name表示属性name，把传入的name参数赋给属性name
        else {
            System.out.println("输入名字有误");
            this.name = "Tom";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20)
            this.balance = balance;
        else {
            System.out.println("输入余额太少");
            this.balance = 30000;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6)
            this.password = password;
        else{
            this.password="000000";
        }
    }
    public String info() {
        return "信息为：name=" + name + "  balance=" + balance + "  password=" + password;//返回一个字符串
    }
}
