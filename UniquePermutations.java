import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();

        Set<String> permutations = new HashSet<>();
        generatePermutations("", number, permutations);

        System.out.println("Unique permutations of the given number are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }

        scanner.close();
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), permutations);
            }
        }
    }
}
