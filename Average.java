import java.util.Scanner;
public class Average {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULATING AVERAGE");
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        double avg = (num1 + num2)/2.0;
        System.out.println("Average: "+avg);
        sc.close();
    }
    
}
