package patternprogram;

import java.util.Scanner;

public class Number3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the pattern (odd number like 11)
        System.out.print("Enter the count (odd number like 11): ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print * at borders and middle row
            	if (
            		    i == 0 ||                   // Top horizontal line
            		    i == n - 1 ||               // Bottom horizontal line
            		    i == n / 2 ||               // Middle horizontal line
            		    j == n - 1                  // Right vertical line for all
            		)
 {
                    System.out.print("*  ");
                } else {
                    System.out.print("   "); // Print spaces for hollow part
                }
            }
            System.out.println(); // Move to the next row
        }

        sc.close();
    }
}
