package com.pack;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(j+1); //you want to use 5x5 matrix add 12345 12345 format use j+1 
			}
			System.out.println(); // second line include the empty space
		}
		

	}

}
