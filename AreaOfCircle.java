import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String []args)
    {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("AREA OF CIRCLE");
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double area = PI*radius*radius;
        System.out.printf("Area: %.2f",area);
        sc.close();
    }
}
