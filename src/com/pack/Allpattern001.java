package com.pack;

import java.util.Scanner;

public class Allpattern001 {

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
                    i == 0 || i == n - 1 ||        // Top and bottom border
                    j == 0 || j == n - 1 ||      // Left and right border
                    
                    i ==(n/2) || j == (n/2) ||   // center line vertical
                    
                           i==j 							// center line horizontal
                   || i+j ==(n-1)	||		// cross lines
                   
                   i+j ==(n/2) || j-i ==(n/2)  || // first and 2nd inside patten
                   
                   i-j==(n/2) || i+j ==(n-1)+(n/2) // 3rd fourth inside pattern
                   
                   
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
