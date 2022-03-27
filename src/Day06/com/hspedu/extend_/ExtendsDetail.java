package Day06.com.hspedu.extend_;

public class ExtendsDetail
{
    public static void main(String[] args) {
        Sub sub = new Sub();//new出sub对象的时候
        //子类构造器被调用了，这很好理解
        //但是父类构造器也被调用了
        //更匪夷所思的是，父类构造器先被调用，子类构造器后被调用

        //其实在创建  子类构造器时，就默认有一句  super();
        //只是这句话被默认隐藏，无论写不写都有


        sub.sayOk();

    }
}
