package Day14.com.hspedu.homework.Homework05;



public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("工人");
        super.printSalary();
    }
}
