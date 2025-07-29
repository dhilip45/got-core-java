package patternprogram;

public class Name {

    public static void main(String[] args) {
        int n = 7; // height of each letter

        for (int i = 0; i < n; i++) {

            // Letter D
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (j == n - 1 && i > 0 && i < n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter I (again)
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter P
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1) || (j == n - 1 && i > 0 && i < n / 2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Space between names
            System.out.print("    ");

            // Letter N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
