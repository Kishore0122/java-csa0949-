import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing a number: ");
        String numberString = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(numberString);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        
        scanner.close();
    }
}
