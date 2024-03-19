package object.equal;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            if (this.day == ((MyDate) obj).day) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
