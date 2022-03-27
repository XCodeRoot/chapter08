package Day14.com.hspedu.homework.Homework09;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint("black", 1.1, 2.1);

    }
}


class Point{//父类
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


}
class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label,double x,double y) {
        super(x,y);
        this.label = label;
    }

}
