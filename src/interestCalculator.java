import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment mount: ");
        double money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total = total + money * (interestRate/100)/12 * month;
        }
        System.out.println("Total is: " + total);
    }
}
