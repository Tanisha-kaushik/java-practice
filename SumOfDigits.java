import java.util.Scanner;
public class SumOfDigits {
     public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Sum of Digits of a Number ");
        System.out.print("Enter Number: ");
        int sum=0;
        int n = sc.nextInt();
        while(n>0)
        {
            int rem= n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
    
}
