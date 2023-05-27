package thilai_BT1;

public class BankTest {
    public static void main(String[] args) {
        // Create a Bank object with a balance of $1000 and an annual interest rate of 10%
        Bank bank = new Bank(1000, 10);

        // Calculate the monthly interest
        double interest = bank.calculateInterest();

        // Print the result
        System.out.println("Monthly interest: $" + interest);
    }
}
