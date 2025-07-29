package patternprogram;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (must be 6): ");
        int num = sc.nextInt();

        if (num != 6) {
            System.out.println("This class only prints number 6.");

        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 0 || (i > 3 && j == 6))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
