package Day10.com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {

        Person[] people = new Person[5];//只要是Person或其子类，都可以放入Person数组里

        //把运行类型换掉
        people[0] = new Person("jack", 19);
        people[1] = new Student("jim", 19, 100);
        people[2] = new Student("smith", 19, 99);

        people[3] = new Teacher("scoot", 26, 20000);
        people[4] = new Teacher("king", 23, 10000);

        for (Person p : people) {
            System.out.println(p.say());
            //调用的是第一个人，就从Person类里找say（）
            //如果调用的是第五个人，就从Teacher类里找say（）

            //但因为父类没有teach（）和study（），所以向上转型后，不能调用子类特有的方法（即，非重写的方法）
            //所以用向下转型
            if (p instanceof Student)//判断左边的东西的运行类型是否是右边的类型或其子类
                ((Student) p).study();

            /*也可以写成两步:
            Student student=(Student)p;
            student.study();
             */

            if (p instanceof Teacher)
                ((Teacher) p).teach();
        }



    }
}
