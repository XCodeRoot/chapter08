package Day14.com.hspedu.homework.Homework05;



public class Teacher extends Employee {


    private int classDays;
    private double classSalary;

    public Teacher(String name, double salary) {//构造器里不初始化，课时数和课时薪资，用set方法动态设置
        super(name, salary);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    @Override
    public void printSalary() {
        System.out.println("老师");
        System.out.println(getName()+"的年工资是"+
                (
                        getSalary()*getSalaryMonth()+classSalary*classDays
                )
        );
    }
}











