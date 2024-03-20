package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("lee"));
        hashSet.add(new String("park"));
        hashSet.add(new String("kim"));
        hashSet.add(new String("lee"));

        System.out.println(hashSet);
    }
}
