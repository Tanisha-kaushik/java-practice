import java.util.Scanner;

class UpperCaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("Uppercase String = " + str.toUpperCase());
    }
}