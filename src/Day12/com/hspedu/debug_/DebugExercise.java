package Day12.com.hspedu.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        //debug 对象创建的过程，实实在在看到这个流程，加深对调试的理解

        //对象创建的流程：
        /*
            （1）先加载类Person信息
            （2）初始化
                1. 默认初始化
                2.显示初始化
                3.构造器初始化
            （3）返回对象的地址
         */
        Person person = new Person("txj",19);
        System.out.println(person);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age ;
    }
}