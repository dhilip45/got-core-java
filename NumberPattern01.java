package patternprogram;

import java.util.Scanner;

public class NumberPattern01 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the pattern (odd number like 11)
        System.out.print("Enter the count (odd number like 11): ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column
            for (int j = 0; j < n; j++) {
            	if( j==n-1) {
                 n     System.out.print("*  ");
                } else {
                    // Else print space to keep pattern aligned
                    System.out.print("   ");
                }
	        	
	        }
	        
	        System.out.println( );
	 }

}
}