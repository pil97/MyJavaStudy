package lec;

public class ForMain {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        for (i = 0; i <= 10; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
        }
    }
}
