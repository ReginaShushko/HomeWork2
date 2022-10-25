import java.util.Scanner;

public class HomeWork2Task5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit:");
        int abcd = scanner.nextInt();

        int w = (abcd / 10) / 10;
        int q = abcd % 100;
        int sum1 = w + q;

       System.out.println("Sum: " + sum1);

       scanner.close();
    }
}