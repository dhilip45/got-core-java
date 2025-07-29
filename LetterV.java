package patternprogram;

import java.util.Scanner;

public class LetterV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (odd number like 7): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n * 2; j++) {
                if (j == i || j == 2 * n - i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
