package object.equal;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9,18,2004);
        MyDate date2 = new MyDate(91,20,2004);

        System.out.println(date1.equals(date2));
    }
}
