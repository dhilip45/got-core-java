package com.pack;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		int start = 1;
		for(int i=1; i<=n; i++) {
			int num = start;
			for(int j=1; j<=n; j++) {
				System.out.print(num+ "		");
				num += 5;
			}
			System.out.println(); 
			start += 25;
		}


	}

}
