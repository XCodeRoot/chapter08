package Day14.com.hspedu.homework.Homework04;

public class Employee {

    private String name;
    private double daySalary;
    private int workDays;
    private double garde;

    public Employee(String name, double daySalary, int workDays, double garde) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.garde = garde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGarde() {
        return garde;
    }

    public void setGarde(double garde) {
        this.garde = garde;
    }

    public void printSalary() {
        System.out.println(name + '\t' + "总工资= " + daySalary * workDays * garde);
    }

}
