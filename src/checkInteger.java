import java.util.Scanner;

public class checkInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("This is an Integer!");
        } else {
            System.out.println("This is not an Integer!");
        }
    }
}
