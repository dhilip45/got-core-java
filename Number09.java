package patternprogram;
import java.util.Scanner;

public class Number09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a digit (0 to 9): ");
        int num = sc.nextInt();

        int n = 7; // height of pattern

        switch (num) {
            // ------------------ 0 ------------------
            case 0:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == n - 1 || j == 0 || j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 1 ------------------
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j == 3) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 2 ------------------
            case 2:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || i == 6) {
                            System.out.print("*");
                        } else if (i < 3 && j == 6) {
                            System.out.print("*");
                        } else if (i > 3 && j == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 3 ------------------
            case 3:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || i == 6 || j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 4 ------------------
            case 4:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if ((j == 0 && i < 4) || j == 6 || i == 3) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 5 ------------------
            case 5:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || i == 6) {
                            System.out.print("*");
                        } else if (i < 3 && j == 0) {
                            System.out.print("*");
                        } else if (i > 3 && j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 6 ------------------
            case 6:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || i == 6 || j == 0 || (i > 3 && j == 6)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 7 ------------------
            case 7:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 8 ------------------
            case 8:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || i == 6 || j == 0 || j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ 9 ------------------
            case 9:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 3 || j == 6 || (i < 3 && j == 0)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            // ------------------ Invalid Input ------------------
            default:
                System.out.println("Invalid input! Please enter a digit between 0 and 9.");
        }

        sc.close();
    }
}
