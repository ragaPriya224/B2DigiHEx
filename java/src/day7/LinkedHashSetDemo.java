package src.day7;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet mobileSet = new LinkedHashSet();

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
