package src.day2;

public class IfDemo {
    public static void main(String[] args) {

        int money = 5;
        int pencil = 8;
        int penCost = 10;
        int specialPencost = 100;

        if (money >= specialPencost) {
            System.out.println("u can buy special pen");
        } else if (money >= penCost) {
            System.out.println("u can buy pen");
        } else if (money >= pencil) {
            System.out.println("u can buy pencil");
        } else {
            System.out.println("return home ");
        }

    }
}
