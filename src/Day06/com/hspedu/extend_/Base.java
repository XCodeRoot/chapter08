package Day06.com.hspedu.extend_;

public class Base//父类
{
    //父类

    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;

    public Base()//无参构造器
    {
        System.out.println("父类Base()....");
    }

    //以下是四种修饰符  修饰的方法
    public void test100()
    {
        System.out.println("test100");
    }
    protected void test200()
    {
        System.out.println("test200");
    }
    void test300()
    {
        System.out.println("test300");
    }
    private void test400()
    {
        System.out.println("test400");
    }
    public int getN4()//调用公开方法，就可以访问私有属性n4
    {
        return n4;
    }
    public void CallTest400()//call表示调用
    {
        test400();
    }


}
