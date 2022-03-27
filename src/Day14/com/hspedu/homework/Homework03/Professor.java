package Day14.com.hspedu.homework.Homework03;

public class Professor extends Teacher{

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    //这里直接输一个introduce，idea就能自动判断是要进行重写
    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
