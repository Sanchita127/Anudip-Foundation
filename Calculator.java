import java.util.Scanner;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter first integer: ");
        int num1 = SC.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = SC.nextInt();
        int sum1 = calculator.add(num1, num2);
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Enter first integer: ");
        int num3 = SC.nextInt();
        System.out.println("Enter second integer: ");
        int num4 = SC.nextInt();
        System.out.println("Enter third integer: ");
        int num5 = SC.nextInt();
        int sum2 = calculator.add(num3, num4, num5);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Enter first double: ");
        double num6 = SC.nextDouble();
        System.out.println("Enter second double: ");
        double num7 = SC.nextDouble();
        double sum3 = calculator.add(num6, num7);
        System.out.println("Sum of two doubles: " + sum3);
        SC.close();
    }
}
