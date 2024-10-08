import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        
        String specialCharacters = "";
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            // Check if the character is a special character
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters += ch;
                count++;
            }
        }
        
        System.out.println("Special Characters: " + specialCharacters);
        System.out.println("Number of Special Characters: " + count);
        
        scanner.close();
    }
}
