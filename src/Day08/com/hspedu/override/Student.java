package Day08.com.hspedu.override;

public class Student extends Person
{
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {//传入父类属性和子类属性
        super(name, age);//调用父类有参构造器
        this.id = id;
        this.score = score;
    }

    public String say()
    {//重点体现了super的好处，代码复用
        return super.say()+"id="+id+"  score="+score;
    }
}
