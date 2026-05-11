import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;

        System.out.print("Enter starting number: ");
        n = sc.nextInt();

        System.out.print("Enter ending number: ");
        k = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + k + " are:");

        for (int i = n; i <= k; i++) {
            int count = 0;

            if (i < 2) {
                continue;
            }

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
