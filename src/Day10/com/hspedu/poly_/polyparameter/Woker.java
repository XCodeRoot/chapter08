package Day10.com.hspedu.poly_.polyparameter;

public class Woker extends Employee{
    public Woker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工  "  +getName()+  "  在工作");
    }

    @Override//表明重写/覆盖
    public double getAnnual() {
        return super.getAnnual();
    }
}
