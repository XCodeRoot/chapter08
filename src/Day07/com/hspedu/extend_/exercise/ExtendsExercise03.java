package Day07.com.hspedu.extend_.exercise;

public class ExtendsExercise03
{
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();

        NotePad notePad = new NotePad("intel",32,1024,"IBM");
        notePad.printInfo();
    }
}
//--------------------
class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {//父类的有参构造器
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){//通过公共方法获取私有属性
        return "cpu="+cpu+"  memory="+memory+"  disk="+disk;
    }

    public String getCpu() {//第二种方式：通过公共方法获取私有属性
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }
}

//---------------------------------------
class PC extends Computer{
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {//传入参数
        super(cpu, memory, disk);//super()指向父类的有参构造器
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void printInfo()
    {
        System.out.println(getDetails()+"  brand="+brand);//打印共有属性（父类的私有属性）和子类特有的属性（子类的私有属性brand）
    }
}

//----------------------------------
class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){//通过父类公共的方法getDetails()，获得共有属性
        System.out.println(getDetails()+"  color="+color);//打印共有属性（父类的私有属性）和子类特有的属性（子类的私有属性color）
    }

}
