import java.util.Scanner;
public class OddSeries {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINT SERIES OF ODD NUMBERS UPTO N");
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
