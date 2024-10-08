import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        char[] letters = word.toCharArray();
        Arrays.sort(letters); // Sort the letters in ascending order
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Append letters in reverse order
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed.append(letters[i]);
        }
        
        System.out.println("Letters in reverse alphabetical order: " + reversed.toString());
        
        scanner.close();
    }
}
