package com.pack;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("-----");
            System.out.println("@@@@@");
        }
    }
}
