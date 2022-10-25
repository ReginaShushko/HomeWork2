import java.util.Scanner;

public class HomeWork2Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five-digit number:");
        int a = scanner.nextInt();

        int b = (a % 1000) / 100;

        System.out.println(b);

        scanner.close();
    }
}