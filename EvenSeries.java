import java.util.Scanner;
public class EvenSeries {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINT SERIES OF EVEN NUMBERS UPTO N");
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        for(int i=2;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
