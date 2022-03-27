package Day08.com.hspedu.override;

public class OverrideExercise
{
    public static void main(String[] args) {

        Person person = new Person("txj",19);
        System.out.println(person.say());

        Student student = new Student("txj",19,"121060100118",100);
        System.out.println(student.say());
    }
}
