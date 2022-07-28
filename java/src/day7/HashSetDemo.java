package src.day7;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet mobileSet = new HashSet();

        mobileSet.add("oppo");
        mobileSet.add("nokia");
        mobileSet.add("redmi");
        mobileSet.add("nokia");
        mobileSet.add("abc");
         mobileSet.add(123);
        mobileSet.add(null);
        mobileSet.add(false);
        System.out.println(mobileSet);
    }
}
