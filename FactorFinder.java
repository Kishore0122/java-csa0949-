import java.util.ArrayList;
import java.util.Scanner;

public class FactorFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the value of n (to get nth factor): ");
        int n = scanner.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Number of factors: " + factors.size());

        if (n > 0 && n <= factors.size()) {
            System.out.println("The " + n + "th factor is: " + factors.get(n - 1));
        } else {
            System.out.println("Invalid value for n. It should be between 1 and " + factors.size());
        }

        scanner.close();
    }
}
