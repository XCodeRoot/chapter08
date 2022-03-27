package Day15.com.hspedu.homework.Homework13;

public class Person {

    private String name;
    private String Sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        Sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //---------------下面是自己定义的方法

    public String play(){

        return name+"爱玩";

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", age=" + age ;
    }


    public void call(Person p){//因为是参数的向上转型，但为了调用子类方法，必须先向下转型
        if(p instanceof Student){//先判断传进来的是哪个子类
            ((Student)p).study();//如果是Student类，就调用study（）
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }
    }
}
