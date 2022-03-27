package Day11.hspedu.object_;

import java.security.PrivateKey;

public class EqualsExercise01 {

    public static void main(String[] args) {

        Person person1 = new Person("jack", 19, '男');
        Person person2 = new Person("jack", 19, '男');

        System.out.println(person1.equals(person2));//false
        //因为这里比较的是两个对象，并不是纯int或者string，所以子类并没有重写Object源码里的equals方法
        //因此比较两个对象的地址是否相同，不相同，所以打印false
        //---------------
        //然后再写重写一个equals（）方法，里面的功能可以让上面这个打印结果变成true
        //重写的equals方法的功能:判断两个对象的内容是否相等
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //这个equals是后面才写的，没写之前，打印false，写了以后才打印true
    public boolean equals(Object obj) {
        //判断两个对象如果是同一个对象就返回true
        if (this == obj) {//this是指调用equals的对象，obj是形参，指向调用equals后面的实参里的对象
            return true;
        }

        if (obj instanceof Person) {//是Person类，才开始比较
            Person p = (Person) obj;//因为需要调用到子类的私有属性
            //而现在这个obj不可能调用的了子类Person的方法，因为没有重写
            //所以需要让obj向下转型，变成Person类的p，然后再通过p调用Person类的私有属性

            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}