package Day06.com.hspedu.extend_.improve_;

public class Student//Student是Pupil和Graduate的父类
{
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
//因为这个方法，两个对象不一样，所以去掉
//    public void testing()//和小学生不一样
//    {
//        System.out.printf("大学生"+name+"正在考高数");
//    }

    public void showInfo()
    {
        System.out.println("学生名"+name+"  年龄"+age+"  分数"+score+"\n");
    }
}
