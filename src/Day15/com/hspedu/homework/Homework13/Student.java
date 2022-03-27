package Day15.com.hspedu.homework.Homework13;

public class Student extends Person{

    private String stu_id;//学生私有的学号

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习 老韩教的java");
    }

    //重写play方法

    public String play(){
        return super.play()+"足球";//通过复用核心类的方法，在子类的方法中细化内容
    }

    @Override
    public String toString() {
        return  super.toString()+"\t"+
                "stu_id=" + stu_id  ;
    }
}
