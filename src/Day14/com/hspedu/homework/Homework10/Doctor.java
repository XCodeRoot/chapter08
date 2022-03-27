package Day14.com.hspedu.homework.Homework10;

public class Doctor {

    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //-------------------------
    public boolean equals(Object obj) {

        //过关斩将的编程思想，先判断错的，然后再写对的
        if (this == obj) {//先判断两个对象是否是同一个对象（是否有相同的地址
            return true;
        }

        if(!(obj instanceof Doctor))
            return false;

        //如果obj的运行类型是Doctor或者是其子类，则先向下转型，
        // 因为，调用equals方法的对象doctor1，先传给了Object类型的obj，这就是向上转型
        //然后这个obj又得调用子类的属性进行比较，所以要向下转型成子类Doctor类型
        // 这样才能通过obj调用属性

            Doctor d = (Doctor) obj;
            return this.name.equals(d.name) &&
                    this.age==d.age &&
                    this.job==d.job&&
                    this.gender==d.gender&&
                    this.salary==d.salary;//字符串用equals比较，基本型用==比较


    }



}
