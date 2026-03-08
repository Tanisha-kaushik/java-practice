import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECKING ODD EVEN");
        System.out.print("Enter Number to check: ");
        int num1 = sc.nextInt();
        if(num1%2==0)
            System.out.println(num1+" is EVEN");
        else
            System.out.println(num1+" is ODD");
        sc.close();
        
    }
}
