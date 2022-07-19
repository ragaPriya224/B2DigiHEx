package src.day1;

public class ArrayDemo {
    public static void main( String[] args ){
    //    int marks = 80, marks2 = 70 , marks3 = 55, marks4 = 90, marks5 = 75;


       int []marks = new int [5];
       marks[0] = 80;
       marks[2] = 70;
       marks[3] = 55;
       marks[4] = 90;
       System.out.println(marks[3]);
       System.out.println(marks[1]);
    //    System.out.println(marks[22]);
       System.out.println("the array size is "+ marks.length);
    }
}
