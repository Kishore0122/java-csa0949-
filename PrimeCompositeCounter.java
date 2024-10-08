import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of integers you want to check: ");
        int totalNumbers = scanner.nextInt();
        
        int primeCount = 0;
        int compositeCount = 0;

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                primeCount++;
            } else if (number > 1) {
                compositeCount++;
            }
        }

        System.out.println("Total prime numbers: " + primeCount);
        System.out.println("Total composite numbers: " + compositeCount);
        
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
