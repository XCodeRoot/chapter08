package Day14.com.hspedu.homework.Homework04;

public class Homework04 {
    public static void main(String[] args) {

        Manager manager = new Manager("刘备", 300, 20, 1.2);
        manager.setBonus(3000);//自己动态设置奖金，而不是直接放在new里

        manager.printSalary();

        Worker worker = new Worker("张飞", 250, 21, 1.3);
        worker.printSalary();
    }
}
