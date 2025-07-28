package com.pack;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args)  {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the count: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	    
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print("\t");
	            }

	 
	            System.out.print(i);

	            if (i > 1) {
	                for (int s = 1; s <= (2 * i - 3); s++) {
	                    System.out.print("\t");
	                }
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	      
	        for (int s = 1; s <= n; s++) {
	            System.out.print("\t");
	        }
	        System.out.println(n);

	 
	        for (int i = n - 1; i >= 1; i--) {
	           
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print("\t");
	            }

	        
	            System.out.print(i);
	            if (i > 1) {
	                for (int s = 1; s <= (2 * i - 3); s++) {
	                    System.out.print("\t");
	                }
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
