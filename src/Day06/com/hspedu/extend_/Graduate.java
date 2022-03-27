package Day06.com.hspedu.extend_;

public class Graduate {

    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing()//和小学生不一样
    {
        System.out.println("大学生"+name+"正在考高数");
    }

    public void showInfo()
    {
        System.out.println("学生名"+name+"  年龄"+age+"  分数"+score);
    }
}
