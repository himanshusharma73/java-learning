package himanshu.ttt;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        System.out.println("Sum is: " + (first + second));
        scanner.nextLine();
        System.out.println("Enter string");
        String x = scanner.nextLine();
        System.out.println(x);

    }
}
