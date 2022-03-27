package Day06.com.hspedu.extend_;

public class Sub extends Base //subclass表示子类
{
    //子类继承父类的所有属性，但私有属性不能访问
    public Sub()//子类无参构造器
    {
        System.out.println("子类sub()...");
    }

    public void sayOk()//子类方法
    {//非私有的属性和方法可以在子类中直接访问
        //私有的属性和方法要通过父类中公共的方法get

        System.out.println(n1+" "+n2+" "+n3);//除了n4不能访问，因为n4是私有属性
        test100();
        test200();
        test300();
        //test400();//会报错，因为test400()属于父类私有方法

        System.out.println("n4="+getN4());//这里通过调用父类里的公共方法，getN4（）获取到了私有属性n4
        CallTest400();//这里通过调用父类里的公共方法CallTest400（），间接调用到了私有方法Test400（）
    }
}
