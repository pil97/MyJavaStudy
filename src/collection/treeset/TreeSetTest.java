package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("kim");
        treeSet.add("park");
        treeSet.add("lee");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
