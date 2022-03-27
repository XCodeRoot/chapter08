package Day06.com.hspedu.pkg;

import Day06.com.hspedu.modifier.A;//自动出现的导入A类

public class Test
{
    public static void main(String[] args) {
        A a = new A();//当我打出new A()时，上方自动出现 导入A类（而这两个是不同包）

        System.out.println("n1="+a.n1);//不同包下只能访问public修饰的属性或方法，其余修饰符均不能访问
    }
}
