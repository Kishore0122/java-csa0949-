import java.util.Scanner;

public class CharacterFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter a character to find: ");
        char characterToFind = scanner.nextLine().charAt(0);
        
        int index = -1;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToFind) {
                index = i;
                break;  // Stop searching once we find the character
            }
        }
        
        if (index != -1) {
            System.out.println("The character '" + characterToFind + "' is present at index: " + index);
        } else {
            System.out.println("The character '" + characterToFind + "' is not present in the string.");
        }
        
        scanner.close();
    }
}
