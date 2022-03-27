package Day09.com.hspedu.poly_.detail_;

public class polyDetail {
    public static void main(String[] args) {
        //向上转型
        //语法 : 父类类型 引用名=new 子类类型();
        Animal animal = new Cat();


        //animal.catchMouse();//不能调用子类特有的成员
        /*在编译阶段，能调用哪些成员，是由编译类型决定的

        	多态中强调：编写java程序时，引用类型变量只能调用其编译时类型的变量，不能调用其运行时类型变量。

         */

        //调用方法时，先从 运行类型所对应的那个类里找方法，然后再父类找、、、、
        // 查找规则跟之前学的方法调用的规则 一致:就近原则

        animal.eat();//这里找到的是子类重写的eat，因为子类eat（）打印的是 猫吃鱼，父类eat（）打印的是 吃
        animal.sleep();//这两个找到的是父类的sleep
        animal.run();

//---------------------------------------
        //向下转型：
        /*
            （1）语法:  子类类型 引用名 = (子类类型) 父类引用
         */
        Cat cat=(Cat) animal;//向下转型，即可以调用子类的成员
        //此时，cat的编译类型是Cat，运行类型还是 Cat
        cat.catchMouse();//猫捉老鼠

        //  （2）要求父类的引用必须指向的是当前目标类型的对象
        //原本animal指向的就是 new出来的 Cat 对象，
        //现在只不过是，让animal强转了一下，就另外生成了一个cat，然后让cat指向Cat这个对象
        //而原来的animal仍然指向的是Cat对象 ，就是说现在有两个引用指向了Cat
        //然后animal还是只能调用父类的，cat现在就可以调用子类的了
    }
}
