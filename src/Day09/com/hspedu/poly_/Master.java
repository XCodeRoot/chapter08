package Day09.com.hspedu.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //完成  主 人 给 动物 喂食


    //使用多态机制，可以统一管理主人给动物喂食的问题
    /*
        animal的编译类型是Animal，可以指向（接收） Animal的子类的对象
        food的编译类型是Food，可以指向（接收） Food的子类的对象

        animal起初指向了 在主方法里new出来的Animal对象，然后animal就可以指向（接收） 任何 它的编译类型 的子类对象
     */
    public void feed(Animal animal,Food food){//这里就是多态，父类的引用接收了子类的传参对象
        /*
            (1)相当于Animal animal = new Dog();
                Food animal = new Bone();

            (2)Animal animal = new Cat();
                Food food = new Fish();


        */
        System.out.println("主人"+name+" 给 "+animal.getName()+" 喂 "+food.getName());
    }
}
