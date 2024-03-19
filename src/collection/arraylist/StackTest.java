package collection.arraylist;

import java.sql.SQLOutput;

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.size();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.size();



    }
}
