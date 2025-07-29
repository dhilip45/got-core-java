package patternprogram;

import java.util.Scanner;

public class LetterA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter alphabet (must be 'A'): ");
        char ch = sc.next().toUpperCase().charAt(0);

        if (ch != 'A') {
            System.out.println("This class only prints letter A.");
            
        }

        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((j == 0 || j == n) && i != 0 ||
                    i == 0 && j != 0 && j != n ||
                    i == n / 2) {
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
