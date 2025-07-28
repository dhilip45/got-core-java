package com.pack;

import java.util.Scanner;

public class Pattern27 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the counts: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // Print increasing numbers (1 to i)
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        // Print decreasing numbers (i-1 to 1)
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }

        // Move to next line
        System.out.println();
    }

    sc.close();
}
}