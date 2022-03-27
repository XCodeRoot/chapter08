package Day16.com.hspedu.houserent.service;

import Day16.com.hspedu.houserent.domain.House;

/**
 * 业务层
 * 定义House[] ，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查）（crud）（c[create],r[read],u[update],d[delete]）
 */
public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums=1;//记录有多少个房屋
    private int idCounter=1;//记录当前id自增长到多少

    public HouseService(int size){
        houses=new House[size];//定义对象数组的大小

        houses[0]=new House(1,"jack","112","海淀区",2000,"未出租");

    }

    //添加新对象
    public boolean add(House newHouse){
        //判断是否还可以继续添加
        if(houseNums==houses.length){
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        houses[houseNums++]=newHouse;//后++

        newHouse.setId(++idCounter);//前++
        return true;
    }

    public House[] list(){
        return houses;
    }


    public boolean delete(int deleteId){//执行实际的删除操作
        int index=-1;
        for (int i = 0;i<houseNums;i++){
            if(deleteId==houses[i].getId()){//如果传入的编号，和找出的房屋的编号匹配，就记录一下
                index=i;//用index记录i
            }
        }

        if(index==-1){//表示没找到这个编号的房屋
            return false;
        }
        for(int i=0;i<houseNums-1;i++){
            houses[i]=houses[i+1];
        }
        houses[--houseNums]=null;//把当前存在的房屋信息的最后一个置空，“ -- ”因为要让houseNums退一个
        return true;
    }

    public House findById(int findId){

        for (int i = 0;i<houseNums;i++){
            if(findId==houses[i].getId()){//如果传入的编号，和找出的房屋的编号匹配，就记录一下
                return houses[i];//
            }
        }

        return null;
    }

}
