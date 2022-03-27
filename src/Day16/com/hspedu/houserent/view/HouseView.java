package Day16.com.hspedu.houserent.view;

import Day16.com.hspedu.houserent.domain.House;
import Day16.com.hspedu.houserent.service.HouseService;
import Day16.com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    //定义属性
    private boolean loop = true;//do-while循环的判断条件
    private char key=' ' ;//接收用户输入的数字


    HouseService houseService=new HouseService(2);//设置数组大小为2

    //实现修改房屋信息的功能
    public void updateHouse(){
        System.out.println("=============修改房屋信息==============");
        System.out.println("请选择待修改房屋的编号（-1退出）");

        int updateId=Utility.readInt();
        if(updateId==-1){
            System.out.println("=============你放弃了修改==============");
            return;//表方法结束
        }

        //根据updateId查找对象
        House house=houseService.findById(updateId);//用house接收查找到的对象
        if(house==null) {
            System.out.println("=============查找的编号不存在==============");
            return;
        }
        //输入名字
        System.out.print("姓名("+house.getName()+"): ");
        String name = Utility.readString(8,"");//左边为限制8位，右边表示赋默认值：空串
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话("+house.getPhone()+"): ");
        String phone = Utility.readString(12,"");//左边为限制多少位，右边表示赋默认值：空串
        if(!"".equals(phone)){//如果不是空串
            house.setPhone(phone);//更新信息
        }

        System.out.print("地址("+house.getAddress()+"): ");
        String address = Utility.readString(18,"");//左边为限制8位，右边表示赋默认值：空串
        if(!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("月租("+house.getRent()+"): ");
        int rent = Utility.readInt(-1);
        if(rent==-1){
            house.setRent(rent);
        }

        System.out.print("状态("+house.getState()+"): ");
        String state= Utility.readString(8,"");//左边为限制8位，右边表示赋默认值：空串
        if(!"".equals(state)){
            house.setState(state);
        }
        System.out.println("=============修改房屋信息成功==============");

    }



    //实现查找功能
    public void findHouse(){

        System.out.print("请输入要查找的房屋id: ");

        int findId=Utility.readInt();//findId用来接收用户想查找的编号
        House house = houseService.findById(findId);//用house接收查找到的对象
        if(house==null){
            System.out.println("=============查找的编号不存在==============");
        }else {
            System.out.println(house);
        }

    }


    public void exit(){
        char c=Utility.readConfirmSelection();
        if(c=='Y'){
            loop=false;
        }
    }

    //编写deleteHouse（）界面，接收用户输入的id
    public void deleteHouse(){
        System.out.println("=============删除房屋信息==============");

        System.out.print("请输入待删除房屋信息的编号（-1退出）: ");
        int deleteId=Utility.readInt(3);//delete用来接收用户要删除的房屋的编号

        if(deleteId==-1){//-1就退出
            System.out.println("=============放弃删除房屋信息==============");
            return;//表示结束一个方法，这并没有返回值
        }

        char choice=Utility.readConfirmSelection();
        if(choice=='Y'){
            if(houseService.delete(deleteId)){
                System.out.println("=============删除房屋信息成功==============");
            }else{
                System.out.println("=============编号不存在删除房屋信息失败==============");
            }
        }else {
            System.out.println("=============放弃删除房屋信息==============");
        }


    }


    //接收输入，创建新建一个House对象，调用add方法，也就是添加房屋
    public void addHouse(){
        System.out.println("=============添加房屋==============");

        System.out.print("姓名: ");
        String name = Utility.readString(8);

        System.out.print("电话: ");
        String phone=Utility.readString(12);

        System.out.print("地址: ");
        String address=Utility.readString(16);

        System.out.print("月租: ");
        int  rent =Utility.readInt();

        System.out.print("状态:");
        String state=Utility.readString(3);

        //创建一个新的House对象
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("============添加房屋成功=============");
        }else{
            System.out.println("添加房屋失败");
        }


    }


    //显示房屋列表
    public void listHouse(){
        System.out.println("=============房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses=houseService.list();//得到所有房屋信息

        for(House house: houses){
            if(house==null)
                break;
            System.out.println(house);
        }
        System.out.println("============房屋列表显示完毕==========="+'\n');
    }


    //显示主菜单
    public void mainMenu(){

        do{

            System.out.println("==============房屋出租系统==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");

            System.out.print("请输入你的选择1-6 : ");
            key= Utility.readChar();//这个类是工具包，老韩的
            //工具包里的静态方法 可以直接用类名调用


            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':

                    exit();

                    break;

            }

        }while(loop);

    }
}
