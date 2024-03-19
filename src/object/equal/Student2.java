package object.equal;

public class Student2 {
    int studentId;
    String studentName;

    public Student2(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId +", " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student2) {
            Student2 std = (Student2) obj;
            if (this.studentId == std.studentId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
