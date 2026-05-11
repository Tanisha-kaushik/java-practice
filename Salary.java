import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, bonus, deduction, salary;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();

        System.out.print("Enter Deductions: ");
        deduction = sc.nextDouble();

        salary = basic + hra + da + bonus - deduction;

        System.out.println("Net Salary = " + salary);
    }
}