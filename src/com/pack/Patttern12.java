package com.pack;

import java.util.Scanner;

public class Patttern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		int count = n*n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count);
				count--; //you want to reverce order use count-- n*n
			}
			System.out.println(		); // second line include the empty space
		}
	}
}
