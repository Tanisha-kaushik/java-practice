import java.util.Scanner;

class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c, sum = 0;

        System.out.print("Enter rows: ");
        r = sc.nextInt();

        System.out.print("Enter columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of matrix elements = " + sum);
    }
}