package src.day2;

public class MethodDemo {
    public static void main(String[] args) {
        doAdd(4,3);
        doSubtract();
    
    }

    public static void doAdd(int num1, int num2) {
        System.out.println(num1+num2);
    }
    public static void doSubtract() {
        System.out.println(4 - 2);
        int   output  = doMultiply(2,3);
        System.out.println(" this is the output we received" +output);
    }
    public static int doMultiply(int num1, int num2) {
        int result = num1*num2;
        System.out.println(result);
        return result;
    }
}
