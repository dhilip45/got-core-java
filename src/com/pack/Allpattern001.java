package com.pack;

import java.util.Scanner;

public class Allpattern001 {
	/**
	 * @param args
	 * this program is pramid pattern
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the pattern (odd number like 11)
        System.out.print("Enter the count (odd number like 11): ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column
            for (int j = 0; j < n; j++) {

                // Check all conditions to print '*'
                if (
                    i == 0 || // top border  //1
                    i == n - 1 || // bottom border 2
                    j == 0 ||     //left border 3
                    j == n - 1 ||  // right border 4
                    
                    i ==(n/2) || //center line border  5
                    j == (n/2) || // Horizondal line vertical 6
                    
                           i==j 			// lift to right cross line  7 
                   || i+j ==(n-1)
                   ||		// right to left cross line 8
                   
                   i+j ==(n/2) || // first square left to right 9
                   j-i ==(n/2)  || // second square right to left patten 10
                   
                   i-j==(n/2) || // 3rd square left to right 11
                    i+j ==(n-1)+(n/2) // 4th square inside pattern right to left
                   
                   
                ) {
                    System.out.print("* ");
                } else {
                    // Else print space to keep pattern aligned
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
