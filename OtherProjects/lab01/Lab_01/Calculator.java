import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    private double num1;
    private double num2;
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getSum() {
        return num1 + num2;
    }
    public double getDifference() {
        return (Math.abs(num1 - num2));
    }
    public double getProduct() {
        return num1 * num2;
    }
    public String getQuotient() {
        return num2 != 0 ? String.valueOf(num1 / num2) : "Undefined due to division by zero";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        Calculator calculator = new Calculator(num1, num2);
        System.out.println("Sum: " + calculator.getSum());
        System.out.println("Difference: " + calculator.getDifference());
        System.out.println("Product: " + calculator.getProduct());
        System.out.println("Quotient: " + calculator.getQuotient());
        scanner.close();
    }
}
