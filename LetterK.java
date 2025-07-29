package patternprogram;

import java.util.Scanner;

public class LetterK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (odd number like 7): ");
        int n = sc.nextInt();

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (j == 0 || i + j == mid || i - j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
