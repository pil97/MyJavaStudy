package generic;

public class PointTest {
    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
        Point<Integer, Double> p2 = new Point<Integer, Double>(10,10.0);

        double rect = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
        System.out.println(rect);

        double a = ((Number)5.0).doubleValue();
        System.out.println(a);
    }
}
