import java.util.Scanner;
public class Factorial {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Factorial of a Number? ");
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }

}
