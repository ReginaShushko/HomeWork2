import java.util.Scanner;

public class HomeWork2Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit:");
        int n = scanner.nextInt();

        int a = (n % 1000) / 100;
        int b = (n % 100) / 10;
        int c = (n % 10);

        int sum = a + b + c;

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}