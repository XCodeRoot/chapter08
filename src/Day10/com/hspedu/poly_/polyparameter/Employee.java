package Day10.com.hspedu.poly_.polyparameter;

public class Employee {
    /*
        Employee是父类，先给它一个构造器，初始化属性，再添加公共的get，set方法，最后再创建一个返回年薪的double方法
     */
    private String name;
    private double salary;

    public Employee(String name, double salary) {
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
        this.salary = salary;
    }

    public double getAnnual() {
        return 12 * salary;
    }
}
