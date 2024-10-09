import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println(totalDays + " days = " + years + " years, " + weeks + " weeks, and " + days + " days.");
        
        scanner.close();  // Close the scanner
    }
}
