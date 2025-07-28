/**
 * 
 */
package com.pack;

import java.util.Scanner; 
/**
 * @author Dhilip N
 * @category pattern
 * @deprecation this is an example for condition pattern
 */
public class Patterncondition01 {

	/**
	 * @param args
	 * @deprecation this is contains the source code for pattern program
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for( int j = 0; j<n; j++) {
			if(i==0 || i==n-1 || j==0 || j==n-1)
				System.out.print("# ");
			else {
				System.out.print("- ");
				
			}
		
			}
			System.out.println( );
		} 
		

	}

}
