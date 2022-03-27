package Day14.com.hspedu.homework.Homework01;

public class HomeWork01 {//创建对象数组，以年龄冒泡排序

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("jack", 19, "teacher");
        people[1] = new Person("milan", 16, "manager");
        people[2] = new Person("sccot", 120, "employee");

        for (Person p : people) {//
            System.out.println(p);
        }

        Person temp = null;

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {

                if (people[i].getAge() > people[i + 1].getAge()) {
                    temp = people[i];//对象数组的元素进行交换，而不是元素的属性进行交换
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                }

            }
        }
        for (Person p : people) {
            System.out.println(p);
        }


    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {//toString方法
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

}
