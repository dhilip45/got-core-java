package com.pack;

import java.util.Scanner;

public class Pattern30  {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the count: ");

	        int n = sc.nextInt();
	        	        for (int i = n; i >= 1; i--) {
	         
	            for (int s = 0; s < n - i; s++) {
	                System.out.print("  ");
	            }
	            
	            for (int j = 0; j < i * 2; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }

	        
	        for (int i = 2; i <= n; i++) {
	           for (int s = 0; s < n - i; s++) {
	                System.out.print("  ");
	            }
	            
	            for (int j = 0; j < i * 2; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	
