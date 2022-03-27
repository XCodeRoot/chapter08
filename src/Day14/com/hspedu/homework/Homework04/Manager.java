package Day14.com.hspedu.homework.Homework04;

public class Manager extends Employee{
    private double bonus;


    //创建Manager对象时，奖金并不是确定的，所以在构造器里不添加bonus，而是用setbonus（）
    public Manager(String name, double daySalary, int workDays, double garde) {
        super(name, daySalary, workDays, garde);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("经理"+ '\t' + "总工资= "
                + (bonus+getDaySalary()*getGarde()*getWorkDays()));
    }
}
