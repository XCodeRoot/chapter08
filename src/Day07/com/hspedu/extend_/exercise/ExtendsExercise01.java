package Day07.com.hspedu.extend_.exercise;


public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();// 1.因为new B类对象时，先调用了B类的无参构造器
        /*
            2. 恰好B类的无参构造器中含this关键字，所以默认隐藏的super()被this顶替
            3. this("abc"),又将参数传入B类的有参构造器，并调用它
            4. 因为B类有参构造器中无this，所以默认隐藏的super()发挥作用
                调用了父类A的无参构造器，先打印 a
            5.然后B类有参构造器再继续打印  b name
            6.最后 B类无参构造器打印 b
         */
    }
}

class A {
    A() {//构造器
        System.out.println("a");
    }

    A(String name) {//这里是构造器
        System.out.println("a name");
    }
}

class B extends A{
    B() {//这里是构造器
        this("abc");
        System.out.println("b");
    }

    B(String name) {//这里还是构造器
        System.out.println("b name");
    }
}
