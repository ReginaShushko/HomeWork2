import java.util.Scanner;

public class HomeWork2Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st digit:");
        int q = scanner.nextInt();

        System.out.println("Enter 2nd digit:");
        int w = scanner.nextInt();

        System.out.println(q / w);
        System.out.println(q % w);

        scanner.close();
    }
}


