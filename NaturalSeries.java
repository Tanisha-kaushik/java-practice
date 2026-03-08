import java.util.Scanner;
public class NaturalSeries {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINT SERIES OF NAURAL NUMBERS UPTO N");
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
