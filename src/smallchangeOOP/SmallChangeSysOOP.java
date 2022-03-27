package smallchangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    /*
    这是完成零钱通各个功能的类，将各个功能分别封装成方法

        1.先完成显示菜单，并可以选择菜单，给出对应提示
        2.完成零钱通明细
        3.完成收益入账
        4.完成消费
        5.退出零钱通
        6.让用户确认是否要退出
        7.收益入账和消费时要判断金额是否合理，并给出相应提示
     */

    //属性
    //1.定义相关变量，用来完成菜单的循环输出，与接收指令
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);//new出一个Scanner类的对象scanner，接收输入的 1,2,3,4
    String key = "";

    //2.完成零钱通明细
    //老韩思路:（1）可以把收益和消费保存到数组里。（2）可以使用对象。 （3）简单点，就用String拼接
    String details = "--------------零钱通明细---------------";

    //3.完成收益入账
    //老韩思路，定义新的变量（完成功能的过程，驱动我去增加新的变量和代码）
    double money = 0;
    double balance = 0;
    Date date = null;//date 是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//new一个对象，然后添加参数年月日 时分 ，可以用于日期格式化显示

    //4.完成消费
    //定义新变量，保存消费的原因
    String note = "";


    //1.显示菜单
    public void mainMenu(){//mainMenu（）方法 调用所有功能，来完成用户界面

        do {
            //do-while循环，先输出菜单，然后接收输入的数字传入switch里，在switch里写上1,2,3,4，的内容名称
            System.out.println("\n==============零钱通菜单(OOP版)===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");


            System.out.print("请选择1-4:");
            key = scanner.next();//接收用户的选择1-4

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();//通过this调用各个方法
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误");
            }


        } while (loop);
        System.out.println("------------退出了零钱通项目------------");
    }

    //2.零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //3.收益入账
    public void income(){
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();//接收输入的 double类型的money

        //money金额的范围需要校验
        //老韩思路，编程思想:（过关斩将的校验风格）先设一个一个障碍，直到全部通过，才执行正确的代码
        //找出不正确的金额条件，然后给出提示，就直接break
        if(money<=0){
            System.out.println("收益入账的金额需要 大于 0");
            return;//退出方法，不再执行后面的代码
        }

        balance += money;//计算余额

        //拼接收益入账的信息到details
        date = new Date();//获取当前日期，但是这个日期 的格式并不是我们想要的格式，所以需要用格式化表示时间的方法
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额\t" + balance;//sdf是格式化时间类的对象，调用
    }

    //4.消费
    public void pay(){
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        //校验输入的金额是否符合范围
        if(money<=0||money>balance){
            System.out.println("你的消费金额应该在 0-"+balance);
            return;
        }

        System.out.print("消费说明:");
        note = scanner.next();//输入消费理由
        balance -= money;
        //拼接消费信息进details
        date = new Date();//获取当前日期，但是这个日期 的格式并不是我们想要的格式，所以需要用格式化表示时间的方法
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额\t" + balance;//sdf是格式化时间类的对象，调用

    }

    //5.退出
    public void exit(){
        //用户输入 4 退出时，给出提示“你确定要退出吗？ y/n",必须输入正确的 y/n
        //否则循环输入指令，直到输出 y/n
        //老韩思路
                    /*
                         (1)定义一个String变量，接收用户的输入
                         (2)使用while + break，处理接收到的输入
                         (3)退出while后，再判断choice是y还是n
                         (4)建议一个段代码执行一个小功能，尽量不要将功能混合在一起，降低代码的耦合性
                     */
        String choice="";
        while(true){
            System.out.println("确定要退出吗？ y/n");
            choice= scanner.next();
            if("y".equals(choice)||"n".equals(choice)){
                break;
            }


        }
        if(choice.equals("y")){
            loop=false;//选择4 退出，并选了 y ，则让循环条件变成false，当break退出switch以后，退出do-while循环
        }else{
            //不用写，因为loop默认为true
        }

    }
}
