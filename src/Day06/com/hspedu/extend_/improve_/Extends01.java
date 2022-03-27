package Day06.com.hspedu.extend_.improve_;

import Day06.com.hspedu.extend_.Graduate;
import Day06.com.hspedu.extend_.Pupil;

public class Extends01
{
    public static void main(String[] args) {
        Day06.com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name="银角大王";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(61);
        pupil.showInfo();

        Day06.com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name="金角大王";
        graduate.age=22;
        graduate.testing();
        graduate.setScore(149);
        graduate.showInfo();
    }
}
