import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        
        if (isValidUsername(username)) {
            System.out.println("The entered username is valid.");
        } else {
            System.out.println("The entered username is invalid.");
        }
        
        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
