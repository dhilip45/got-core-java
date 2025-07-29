package patternprogram;

import java.util.Scanner;

public class Number4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the pattern (odd number like 11)
        System.out.print("Enter the count (odd number like 11): ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                if ((j == 0 && i < 4) || j == 6 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

            
            System.out.println(); // Move to the next row
        

        sc.close();
    }
}
