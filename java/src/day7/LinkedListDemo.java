package src.day7;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList mobileList = new LinkedList();

        mobileList.add("oppo");
        mobileList.add("nokia");
        mobileList.add("redmi");
        System.out.println(mobileList.getFirst()); // oppo
        System.out.println(mobileList.getLast()); // redmi
        System.out.println(mobileList);
        mobileList.addFirst("iphon");
        mobileList.addLast("samsung");

        System.out.println(mobileList);
        mobileList.removeFirst();
        System.out.println("after removing first element" + mobileList);
        mobileList.removeLast();
        mobileList.add(2, "abc");
        System.out.println("after removing last element" + mobileList);
    }
}
