package Day10.com.hspedu.poly_.dynamic_;



public class DynamicBind {
    public static void main(String[] args) {

        A a=new B();

        System.out.println(a.sum());
        /*
            (1)先按运行类型B查找，从子类B里找sum()没找到，所以去父类A里找sum()
            (2)但是父类里的sum()要调用getI()，那getI（）是从哪个类里找？？？
            (3)其实因为动态绑定机制:
            	1. 当调用对象方法时，该方法会和该对象的内存地址（运行类型）进行绑定  //  实际上运行类型也就代表了堆里储存的该对象
	            2. 当调用对象属性时，没有动态绑定机制，哪里声明哪里使用


            (4)所以父类里sum（）中的getI（）方法已经和运行类型绑定，所以从子类B里找
            (5)而属性没有动态绑定，哪里声明，就从哪里找，所以用的i是子类的i，所以20+10
         */


        System.out.println(a.sum1());//属性没有动态绑定，哪里声明，就从哪里找，所以用的是父类的i，所以10+10
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A{
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int sum1() {
//        return i+10;
//    }

    public int getI(){
        return i;
    }
}