import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECKING NUMBER IS POSITIVE OR NEGATIVE");
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if(num==0)
            System.out.println("NUMBER IS ZERO");
        else if(num>0)
            System.out.println("NUMBER IS POSITIVE");
        else
            System.out.println("NUMBER IS NEGATIVE");
        sc.close();
    }
    
}
