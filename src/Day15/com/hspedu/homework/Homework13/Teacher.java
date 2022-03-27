package Day15.com.hspedu.homework.Homework13;

public class Teacher extends Person{

    private int work_age;//工龄

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学 java");
    }

    //重写play方法

    public String play(){
        return super.play()+"象棋";//通过复用核心类的方法，在子类的方法中细化内容
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+
                "work_age=" + work_age ;
    }
}
