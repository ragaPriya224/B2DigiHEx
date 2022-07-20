package src.day2;

public class OperatorDemo {
    public static void main(String[] args) {
        int age = 8;
        String citizen = "indian";
        if (age >= 18 && citizen == "indian") {
            System.out.println("u can vote ");
        } else {
            System.out.println("u cannot vote");
        }

        int a = 7;
        // a++; //post increment by 1
        // ++a; // preincrement by 1
        System.out.println(a++);
        System.out.println(a);

    }
}
