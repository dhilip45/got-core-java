package patternprogram;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (must be 5): ");
        int num = sc.nextInt();

        if (num != 5) {
            System.out.println("This class only prints number 5.");
            
        }

        // Print number 5 pattern
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (
                    (i == 0) ||               // Top horizontal
                    (i == 3) ||               // Middle horizontal
                    (i == 6) ||               // Bottom horizontal
                    (j == 0 && i < 3) ||      // Left vertical (top part)
                    (j == 6 && i > 3)         // Right vertical (bottom part)
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
