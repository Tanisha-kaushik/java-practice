import java.util.Scanner;
public class Series2 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINTING SERIES 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 ... N/N+1");
        System.out.print("Enter Value of N: ");
        int n = sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
            sum+=(double)i/(i+1);
        }
        System.out.printf("Sum: %.2f",sum);
    }
    
}
