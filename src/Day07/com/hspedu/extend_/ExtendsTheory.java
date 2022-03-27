package Day07.com.hspedu.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /*
            1.当指向到上方这句话时，我们知道要先在方法区加载类信息，那父类要不要加载呢？答案是要的
                追溯到顶级父类Object，先加载Object 再 GrandPa 然后 Father 最后 Son
                这些父类和子类 在此刻 都产生了一种  “关联关系”
            2.然后在堆里分配一个地址空间给son，
                此时先在方法区常量池里记录GrandPa的属性name和hobby（因为是引用类型：字符串）
                然后在堆里的son空间内 划分一个小空间，存放常量池里GrandPa属性的地址

            3.同理，son空间里继续开辟一个小空间存Father属性，再开辟另一个空间存Son属性
            //虽然属性名都是叫name，但是属于不同类，不干涉
            4.main栈里就有了son，这个son指向堆里son空间的地址,son空间里就含了 所有父类的属性


         */
        System.out.println(son.name);//此时要按查找关系返回信息
        /*
            （1）首先看子类有没有该属性
            （2）如果子类有，且可以访问该属性，则返回子类的属性
            （3）如果子类没有这个属性，那么就看父类有没有，看高级父类，再看顶级父类

         */
        //所以上面返回的是子类的名字

        //System.out.println(son.age);//因为子类没有，而父类私有，不能跨类访问，所以不能返回父类的age 39
            //如果在父类有私有的age，而高级父类有公共的age，则son.age查找到父类私有的age就开始报错，而不会返回高级父类的公共age


        System.out.println(son.getAge());//这里因为子类继承了父类的公共方法getAge()，所以可以通过son对象调用
        System.out.println(son.hobby);//因为子类和父类没有，所以返回高级父类的hobby 旅游


    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}