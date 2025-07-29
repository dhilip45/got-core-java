package patternprogram;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the pattern (odd number like 11)
        System.out.print("Enter the count (odd number like 11): ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    System.out.print("*");
                } else if (i < 3 && j == 6) {
                    System.out.print("*");
                } else if (i > 3  && j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	        
	        System.out.println( );
	 }

}
