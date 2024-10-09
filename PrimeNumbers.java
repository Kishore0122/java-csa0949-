import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int findNthPrime(int n) {
        int count = 0, num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                return num;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n (nth prime number): ");
        int n = scanner.nextInt();
        System.out.print("Enter how many prime numbers to print after nth prime: ");
        int primesToPrint = scanner.nextInt();

        int nthPrime = findNthPrime(n);

        System.out.println("The " + n + "th prime number is: " + nthPrime);
        System.out.println("Next " + primesToPrint + " prime numbers are:");

        int count = 0;
        int num = nthPrime + 1;
        while (count < primesToPrint) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        
        scanner.close();
    }
}
