package MySmallChangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class My_Imitation_Of_SmallChangeSysOOP {

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
    //1.定义相关变量，完成零钱通菜单
    boolean loop=true;//do-while的循环条件

    String key="";//switch的循环条件

    Scanner scanner=new Scanner(System.in);//new一个Scanner对象，以便调用接收方法

    //2.零钱通明细
    String details="--------------零钱通明细---------------";

    //3.收益
    double money=0;
    double balance=0;

    Date date=null;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//格式化时间

    //4.消费
    String note="";




    //方法

    //1.显示菜单
    public void mainMenu(){

        do{
            //do-while循环，先输出菜单，然后接收输入的数字传入switch里，在switch里写上1,2,3,4，的内容名称
            System.out.println("\n==============零钱通菜单(OOP版)================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");

            System.out.print("请选择1-4:");
            key=scanner.next();//通过scanner对象调用某方法，来接收键盘输入的数据，存进key里


            switch (key){
                case "1":
                    this.detail();
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
                    break;

            }

        }while(loop);

        System.out.println("------------退出了零钱通项目------------");
    }

    //2.查看明细
    public void detail(){

        System.out.println(details);


    }

    //3.收益
    public void income(){

        System.out.print("收益入账金额:");
        money=scanner.nextDouble();//接收金额
        //判断金额范围是否正常
        if(money<=0){
            System.out.println("收益入账的金额需要 大于 0");
            return;//退出方法，不再执行后面的代码
        }
        balance+=money;

        date=new Date();//获取当前时间
        details+="\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额\t" + balance;


    }

    //4.消费
    public void pay(){

        System.out.print("消费理由:");
        note=scanner.next();

        System.out.print("消费金额:");
        money=scanner.nextDouble();
        //判断金额范围是否正常
        if(money<=0||money>balance){
            System.out.println("你的消费金额应该在 0-"+balance);
            return;
        }

        date=new Date();
        details+="\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额\t" + balance;
    }

    //5.退出
    public void exit(){
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
