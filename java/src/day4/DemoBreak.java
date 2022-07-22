package src.day4;

public class DemoBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                System.out.println("hey , it's sunday ");
                continue;
            }
            System.out.println(i);
        }

    }
}
