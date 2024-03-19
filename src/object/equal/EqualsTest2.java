package object.equal;

public class EqualsTest2 {
    public static void main(String[] args) {
        Student2 lee = new Student2(100,"leesang");
        Student2 lee2 = lee;
        Student2 lee3 = new Student2(100,"leesang");

        if(lee == lee2) {
            System.out.println("주소는 같습니다.");
        } else {
            System.out.println("주소는 다릅니다.");
        }

        if(lee.equals(lee2)){
            System.out.println("동일합니다.");
        } else {
            System.out.println("동일하지 않습니다.");
        }

        if(lee == lee3) {
            System.out.println("주소는 같습니다.");
        } else {
            System.out.println("주소는 다릅니다.");
        }

        if(lee.equals(lee3)){
            System.out.println("동일합니다.");
        } else {
            System.out.println("동일하지 않습니다.");
        }
    }
}
