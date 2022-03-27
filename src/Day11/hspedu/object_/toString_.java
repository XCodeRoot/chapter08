package Day11.hspedu.object_;

public class toString_ {
    public static void main(String[] args) {
        /*toString()
        //这是Object类里toString()方法的源码，

        public String toString() {
            //getClass().getName()会打印出 全类名的字符串（即包名加类名）
            //@是分隔符，Integer.toHexString(hashcode())是将 哈希码 转为 16进制的字符串
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            //
        }
         */
        Monster monster = new Monster("小妖怪","来巡山",1000);
        System.out.println(monster.toString());
        //在没重写toString()方法之前，用的是Object类的toString方法，打印 Day11.hspedu.object_.Monster@1b6d3586
        //------------------------
        //重写toString方法，打印 Monster{name='小妖怪', salary=1000.0, job='来巡山'}
        System.out.println("------当直接输出一个对象时，自动调用monster.toString方法，" +
                "如果有重写就调用重写的，没有就调Object的toString方法------");
        System.out.println(monster);
    }
}
class Monster{


    private String name;
    private double salary;
    private String job;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }


    //重写toString()方法: 还是alt + insert + enter找到toString()方法
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }

}