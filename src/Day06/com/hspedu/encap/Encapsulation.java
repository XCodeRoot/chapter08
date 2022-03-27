package Day06.com.hspedu.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("txj");//给person对象设置名字
        person.setAge(19);//年龄
        person.setSalary(30000);//薪水


        System.out.println(person.info());//打印返回的字符串
        Person smith = new Person("Smith", 200, 50000);
        System.out.println(smith.info());
    }

}

class Person {
    public String name;
    private int age;
    private double salary;

    /*
        不能随便查看人的年龄和薪水等隐私，并对设置的年龄进行合理的验证，要求1-120岁
        name要求2-6个字符之间
     */
    //来个结构体Alt+Insert


    public Person() {
    }

    public Person(String name, int age, double salary) {//构造器里使用封装方法
//        this.name = name;
//        this.age = age;
//        this.salary = salary;//这时如果把参数直接赋给属性，那构造器就会直接绕过set方法，从而使判断条件失效

        //在构造器里调用set属性的方法，仍然可以保护属性
        setName(name);//给person对象设置名字
        setAge(age);//年龄
        setSalary(salary);

    }

    //注意:这里可以用 Alt + Insert，分别选setter和getter，也可以直接setter and getter
    //然后根据需求自己完善代码
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6)
            this.name = name;//this.name表示属性name，把传入的name参数赋给属性name
        else {
            System.out.println("输入名字有误");
            this.name = "Tom";
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120)
            this.age = age;
        else {
            System.out.println("输入年龄有误");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String info() {
        return "信息为：name=" + name + "  age=" + age + "  salary=" + salary;//返回一个字符串
    }
}