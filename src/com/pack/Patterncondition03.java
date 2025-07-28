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
public class Patterncondition03 {

	/**
	 * @param args
	 * this program is pramid pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("- ");
			} 
		for(int j=1; j<=2*i-1; j++) {
			System.out.print(i+" ");
		}
		System.out.println( );
		}
		
	}

}
