package Day10.com.hspedu.poly_.polyparameter;

public class PolyParameter {//   主方法
    public static void main(String[] args) {
        /*
            主方法
            1.new出Worker和Manager对象
            2.再new一个主方法所在类的PolyParameter对象
            3.写一个showEmpAnnual（）方法，
                （1）其形参是Employee e（为父类的引用），
                （2）调用该方法时的实参是Worker的人名和Manager的人名tom和或者milan
                （3）构成父类的引用指向子类的对象（传参过程中）
                    也称为向上转型
                    调用方法时，看运行类型，因为动态绑定机制，会精确找到对应需要的重写方法
            4.写一个testwork（）方法
                如果要继续使用Employee e作形参
                因为testwork（）方法是两个子类特有的方法，所以不能通过向上转型来调用
                所以需要在testwork（）方法里将形参向下转型成子类的类型
                那有两个子类，怎么转呢？
                    用选择
                    if(e instanceof Woker或者Manager)
                        //e.方法加enter就自动写出强转后调用方法的表达式
                        {((Woker) e).work();}
            然后通过PolyParameter对象调用showEmpAnnual（）方法
         */
        Woker tom=new Woker("tom",10000);
        Manager milan=new Manager("milan",20000,10000);

        PolyParameter polyParameter = new PolyParameter();

        polyParameter.testWork(tom);//传参时有，父类的引用指向子类的对象，定义方法时通过向下转型 调用了子类特有的方法
        polyParameter.showEmpAnnual(tom);//普通的那种 只传参 ，父类的引用指向子类的对象


        polyParameter.testWork(milan);
        polyParameter.showEmpAnnual(milan);


    }
    public void showEmpAnnual(Employee e){//getAnnual（）是子类重写的方法，所以根据运行类型查找子类里方法
        //传入的是实参是子类，形参是父类，构成父类的引用指向子类的对象
        //动态绑定，根据传入的实参的运行类型，来判断从哪个类找getAnnual（）方法
        System.out.println(e.getAnnual());
    }


//添加一个方法，如果是普通员工则用work方法，如果是经理就用manage方法
    //因为work和manage都是子类特有的，非重写的，方法所以要向下转型，才能调用子类特有的方法
    public void testWork(Employee e){//形参是父类的引用
        if(e instanceof Woker){
            ((Woker) e).work();//向下转型，因为work（）属于子类 特有的 非重写方法
        } else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
