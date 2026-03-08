import java.util.Scanner;
public class Swapping {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("SWAPPING USING THIRD VARIABLE");
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("AFTER SWAPPING");
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        sc.close();
    }
    
}
