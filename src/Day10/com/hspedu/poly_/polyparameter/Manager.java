package Day10.com.hspedu.poly_.polyparameter;

public class Manager extends Employee{
    /*
        子类Manager继承父类Employee，
        写一个私有属性 bonus奖金，为经理专属
        写个构造器，先得super一下，然后再初始化bonus奖金
        重写父类的返回年薪的方法，因为子类的年薪需要多出一个奖金bonus
        最后写一个manage方法，返回经理某某人在管理的字符串
     */
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理  "+getName()+"  在管理");
    }

    @Override//表明重写
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
