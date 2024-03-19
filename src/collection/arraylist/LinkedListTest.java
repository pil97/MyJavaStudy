package collection.arraylist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList);

        myList.add(0,"D");
        System.out.println(myList);

        myList.addFirst("E");
        System.out.println(myList);

        myList.removeLast();
        System.out.println(myList);
    }
}
