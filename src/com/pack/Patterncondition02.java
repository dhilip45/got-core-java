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
public class Patterncondition02 {

	/**
	 * @param args
	 * @deprecation for the program for pattern for code
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		for( int j = 0; j<=i; j++) {
			if(i==0 || i==n-1 || j==0 || j==i)
				System.out.print("# ");
			else {
				System.out.print("- ");
				
			}
		
			}
			System.out.println( );
		} 
		

	}
}
