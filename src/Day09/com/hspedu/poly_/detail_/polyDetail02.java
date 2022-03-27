package Day09.com.hspedu.poly_.detail_;



public class polyDetail02 {
    public static void main(String[] args) {
        Base base=new Sub();
        //属性没有重写之说！！属性的值看的是编译类型
        System.out.println(base.count);//所以按编译类型  Base来看
    }
}
class Base{
    int count=10;
}
class Sub extends Base{
    int count=20;
}