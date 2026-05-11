import java.util.Scanner;

class CubeDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rem, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        System.out.println("Sum of cubes of digits = " + sum);
    }
}