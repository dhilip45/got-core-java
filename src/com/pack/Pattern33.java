package com.pack;
import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        char ch = 'A';

        for (int i = 0; i < rows; i++) {
            
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("  ");
            }

           
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(ch + " ");
            }

            ch++; 
            System.out.println();
        }

        sc.close();
    }
}
