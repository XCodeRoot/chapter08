package Day14.com.hspedu.homework.Homework05;



public class Farmer extends Employee {

    public Farmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("农民");
        super.printSalary();
    }
}
