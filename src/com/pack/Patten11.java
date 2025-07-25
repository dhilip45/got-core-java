package com.pack;
import java.util.Scanner;

public class Patten11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		int count = 1;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(count);
				count++;//1  you want to form sat 1 use this concept count
			}
			System.out.println(	); // second line include the empty space
		}
		

	}

}