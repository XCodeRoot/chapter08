package Day14.com.hspedu.homework.Homework05;

public class Employee {//父类

    private String name;
    private double salary;
    private int salaryMonth = 12;//一般带薪是15或者13薪

    public Employee(String name, double salary) {//带薪月数由setsalaryMonth（）设置
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public void printSalary() {
        System.out.println(name+" 的年工资= " +(salaryMonth*salary));
    }


}
