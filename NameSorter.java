import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("How would you like to sort the names?");
        System.out.println("1: Ascending Order (A to Z)");
        System.out.println("2: Descending Order (Z to A)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Arrays.sort(names);  // Sort in ascending order
            System.out.println("Names sorted in Ascending Order:");
        } else if (choice == 2) {
            Arrays.sort(names, Collections.reverseOrder());  // Sort in descending order
            System.out.println("Names sorted in Descending Order:");
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
