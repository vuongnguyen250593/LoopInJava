import java.util.Scanner;

public class HW_countInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount Integer that you want to print: ");
        int num = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println("n = " + n);
            }
            n++;
        }
    }
}
