package Day14.com.hspedu.homework.Homework10;

public class Homework10 {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("txj", 19, "professor", "男", 18000);
        Doctor doctor2 = new Doctor("txj", 18, "professor", "男", 18000);

        System.out.println(doctor1.equals(doctor2));
    }
}
