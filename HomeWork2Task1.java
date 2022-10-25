import java.util.Scanner;

public class HomeWork2Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st digit:");
        int n = scanner.nextInt();

        int m = n / 10;
        int v = n % 10;

        System.out.println("Sum: " + (m + v));

        scanner.close();

    }
}