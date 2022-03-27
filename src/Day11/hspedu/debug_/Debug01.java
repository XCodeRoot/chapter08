package Day11.hspedu.debug_;

public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行
        //按F8，调试时就可以 逐行调试代码，显示出各个变量的值的变化过程，真的舒服，很方便
        //规则:   蓝条所在的语句，右边的半透明 白字 会显示当前语句所需变量的值
        //下方调试区，还没有显示当前蓝条语句的结果，然后蓝再切到下一句，才会在debug区显示变量结果，和半透明白字一样
        //Console区会显示控制台的输出
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=i;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
        }
        System.out.println("退出for循环");
    }
}
