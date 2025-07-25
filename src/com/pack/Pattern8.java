package com.pack;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* "); //you want to use 5x5 matrix 
			}
			System.out.println(); // second line include the empty space
		}
		

	}

}
