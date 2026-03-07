import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("FAHRENHEIT TO CELSIUS");
        System.out.print("Enter Temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();
        double result = (temp-32)*(9/5);
        System.out.printf("Temperature (in Celsius): %.2f",result);
        sc.close();

    }
}
