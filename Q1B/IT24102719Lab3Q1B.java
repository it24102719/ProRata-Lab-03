import java.util.Scanner;

public class IT24102719Lab3Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double pricePerKg = sc.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = sc.nextDouble();

        double totalAmount = pricePerKg * kilograms;
        double discount = totalAmount * 0.10;
        double amountAfterDiscount = totalAmount - discount;

        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay after discount: " + amountAfterDiscount);

        sc.close();
    }
}