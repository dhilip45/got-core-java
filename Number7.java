package patternprogram;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (must be 7): ");
        int num = sc.nextInt();

        if (num != 7) {
            System.out.println("This class only prints number 7.");
           
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 6 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
