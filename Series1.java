import java.util.Scanner;
public class Series1 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINTING SERIES 1-2+3-4+5-6 ... N");
        System.out.print("Enter Value of N: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
                sum+=i;
            else
                sum-=i;
        }
        System.out.println("Sum: "+sum);
    }
}
