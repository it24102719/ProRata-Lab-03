import java.util.Scanner;

public class IT24102719Lab3Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double pricePerKg = sc.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = sc.nextDouble();

        double totalAmount = pricePerKg * kilograms;

        System.out.println("Amount to pay: " + totalAmount);

        sc.close();
    }
}