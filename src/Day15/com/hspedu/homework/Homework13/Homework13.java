package Day15.com.hspedu.homework.Homework13;

public class Homework13 {

    public static void main(String[] args) {

        Person p1=new Student("txj","男",19,"118");
        Person p2=new Student("txj","男",22,"118");

        Person p3=new Teacher("tly","女",24,2);
        Person p4=new Teacher("tly","女",20,2);

        System.out.println(p1.play());
        System.out.println(p3.play());

        Person[] people=new Person[4];
        people[0]=p1;
        people[1]=p2;
        people[2]=p3;
        people[3]=p4;

        Person temp;
        for(int i=0;i<people.length-1;i++){
            for(int j=0;j<people.length-1-i;j++){
                if(people[j].getAge()<people[j+1].getAge()){
                    temp=people[j];
                    people[j]=people[j+1];
                    people[j+1]=temp;
                }

            }
        }
        for(Person p: people){
            System.out.println(p);//toString可以动态绑定
        }

        for(Person p: people){
            p.call(p);//传入Teacher或Student类型参数
        }

    }
}
