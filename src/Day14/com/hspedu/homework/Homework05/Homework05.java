package Day14.com.hspedu.homework.Homework05;



public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalaryMonth(15);//动态设置带薪月数
        jack.printSalary();

        Farmer smith = new Farmer("smith", 20000);
        smith.setSalaryMonth(10);
        smith.printSalary();

        Teacher teacher = new Teacher("老韩", 2000);
        teacher.setClassDays(360);
        teacher.setClassSalary(1000);
        teacher.printSalary();

        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSalary();
    }
}
