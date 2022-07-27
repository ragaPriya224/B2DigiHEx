package src.day6;

import java.util.Scanner;

public class ScannerDemo {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = obj.nextLine(); // Read user input
        System.out.println("Username is: " + userName);  // Output user input 
    }
}
