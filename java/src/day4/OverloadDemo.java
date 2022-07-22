package src.day4;

public class OverloadDemo {
    public static void main( String[] args ){
        add();
        add(3,6);
        add(2,2.5f);
    }
    public static void main(int a ){
       System.out.println("*******************************");
    }

    public static void add(){
        System.out.println("add method 1 ");
        System.out.println(4+2);
    }
    public static void add(int num1,int num2){
        System.out.println("add method 2 ");
        System.out.println(num1+num2);
    }
    public static void add(int num1,float num2){
        System.out.println("add method 3 ");
        System.out.println(num1+num2);
    }
    public static void add(double num1,double num2){
        System.out.println("add method 4 ");
        System.out.println(num1+num2);
    }
}
