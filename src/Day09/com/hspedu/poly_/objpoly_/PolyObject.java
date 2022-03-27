package Day09.com.hspedu.poly_.objpoly_;



public class PolyObject {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.Cry();



        animal =new Cat();//此时因为运行类型是 Cat，所以调用的是Cat类里的Cry()
        animal.Cry();//小猫喵喵叫
    }
}
