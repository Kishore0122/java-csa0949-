import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine().toLowerCase();
        
        int vowelCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels in the statement: " + vowelCount);
        
        scanner.close();
    }
}
