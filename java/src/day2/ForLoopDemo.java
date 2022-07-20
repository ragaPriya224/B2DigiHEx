package src.day2;

public class ForLoopDemo {
    public static void main(String[] args) {

        // for(int i = 5; i>=0; i--){
        // System.out.println(i);
        // }
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
