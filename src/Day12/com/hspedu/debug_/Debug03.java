package Day12.com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr={1,-1,10,-20,100};

        //让我们看看sort方法底层的实现过程，这就要用上debug调试
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }


        System.out.println("100");
        System.out.println("200");
        System.out.println("300");
        System.out.println("400");
        System.out.println("500");
        System.out.println("600");




    }
}
