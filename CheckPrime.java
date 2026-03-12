import java.util.Scanner;
public class CheckPrime {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether a Number is Prime?: ");
        System.out.print("Enter Number to check: ");
        int n = sc.nextInt();
        int flag=0;
        if(n<=1)
        {
            System.out.println(n+" is NOT PRIME");
            return;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(n+" is PRIME");
        else
            System.out.println(n+" is NOT PRIME");
    }
}
