package com.pack;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+ ""); //you want to use 5x5 matrix add 11111 22222 format use i+ 
			}
			System.out.println(); // second line include the empty space
		}
		

	}

}
