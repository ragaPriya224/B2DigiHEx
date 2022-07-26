package src.day5.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("hello");

        try {
            System.out.println("good morning");
            System.out.println(10 / 0); // unchecked exception
            System.out.println("good afternoon"); 
        } catch (ArithmeticException  e) {
            System.out.println("not executed, try some other way ");
        } catch (Exception e) {
        System.out.println("not executed, try some other way ");
    }finally{
            System.out.println("closed the db "); 
        }

        System.out.println("bye");

        // PrintWriter pw = new PrintWriter("abc.txt"); //checked exception
        // pw.print("helllowwww");
        // pw.close();
    }

}
