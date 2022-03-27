package Day14.com.hspedu.homework.Homework05;



public class Scientist extends Employee {

    private double bonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("科学家");
        System.out.println(getName()+"的工资是"+
                        (getSalary()*getSalaryMonth()+bonus)
                );
    }






}
