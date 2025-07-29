

package com.pack;
import java.util.Scanner;
/**
 * @author Dhilip N
 * @category pattern
 * @deprecation this is an example for condition pattern
 */
public class Patternnumber01 {

	/**
	 * @param args
	 * this program is numbers 01
	 */
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Ask the user to enter the size of the pattern (odd number like 11)
	        System.out.print("Enter the count (odd number like 11): ");
	        int n = sc.nextInt();
	        for(int i=0; i<n; i++) {
	        	for(int j=0; j<n; j++) {
	        		if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*  ");
                } else {
                    // Else print space to keep pattern aligned
                    System.out.print("   ");
                }
	        	
	        }
	        
	        System.out.println( );
	 }

}
}