import java.util.Scanner;

public class HomeWork2Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit:");
        int num = scanner.nextInt();

        int lastDigit = num % 10;

        System.out.println("last digit: " + lastDigit);

        scanner.close();

    }
}