package Day11.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {



        "abc".equals("hello");

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);

        System.out.println(integer1==integer2);//false,因为==比较运算符，比较两个对象的地址是否相同，
        // 是否是同一个对象

        System.out.println(integer1.equals(integer2));//true，因为Object的equals方法多次被重写
        //当调用equals方法的对象是Integer类型，则动态绑定Integer源码里重写的equals方法
        // 比较的是两个值是否相等

        String s1 = new String("hspedu");
        String s2 = new String("hspedu");

        System.out.println(s1==s2);//false,因为==比较运算符，比较两个对象的地址是否相同，
        // 是否是同一个对象

        System.out.println(s1.equals(s2));//true，因为Object的equals方法多次被重写
        //当调用equals方法的对象是String类型，则动态绑定String源码里重写的equals方法
        // 比较的是两个字符串值是否相等


        /*  //Object源码中的equals（）方法，默认比较的是两个对象的地址是否相同
        也就是比较两个对象是否是同一个对象

        public boolean equals(Object obj) {

            return (this == obj);
        }
        */
    //-----------------
        /*
        String源码里的equals（）方法把Object源码里的方法重写成了，比较两个字符串值是否相同
        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject instanceof String) {
                String anotherString = (String)anObject;
                int n = value.length;
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }
         */

    }
}
