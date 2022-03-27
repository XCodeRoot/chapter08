package Day09.com.hspedu.poly_.detail_;

public class Cat extends Animal {
    public void eat(){//这个方法重写了父类的方法
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){//特有
        System.out.println("猫捉老鼠");
    }
}
