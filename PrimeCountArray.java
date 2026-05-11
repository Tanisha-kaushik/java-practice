import java.util.Scanner;

class PrimeCountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, countPrime = 0;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            if (arr[i] < 2) {
                continue;
            }

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                countPrime++;
            }
        }

        System.out.println("Number of prime elements = " + countPrime);
    }
}