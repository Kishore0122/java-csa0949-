import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquareFilter {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        List<Integer> perfectSquares = new ArrayList<>();

        for (int i = 0; i * i <= upperBound; i++) {
            int square = i * i;
            if (square >= lowerBound && sumOfDigits(square) < 10) {
                perfectSquares.add(square);
            }
        }

        System.out.println("Perfect squares in the range with digit sum less than 10: " + perfectSquares);

        scanner.close();
    }
}
