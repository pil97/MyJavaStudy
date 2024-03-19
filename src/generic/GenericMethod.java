package generic;

public class GenericMethod {
    public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getX()).doubleValue();
        double bottom = ((Number)p2.getX()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }
}
