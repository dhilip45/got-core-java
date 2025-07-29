package patternprogram;

import java.util.Scanner;

public class LetterP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (odd number like 7): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
            for (int j = 0; j < n - 1; j++) {
                if (i == 0 || i == n / 2)
                    System.out.print("* ");
                else if (j == n - 2 && i < n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
