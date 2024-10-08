import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter M (for Mth maximum): ");
        int M = scanner.nextInt();
        
        System.out.print("Enter N (for Nth minimum): ");
        int N = scanner.nextInt();
        
        // Sort the array
        Arrays.sort(array);
        
        // Get Mth maximum (Mth from the end of the sorted array)
        int MthMax = array[n - M];
        // Get Nth minimum (Nth from the start of the sorted array)
        int NthMin = array[N - 1];

        // Calculate sum and difference
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;

        // Output results
        System.out.println("Mth Maximum Number: " + MthMax);
        System.out.println("Nth Minimum Number: " + NthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        scanner.close();
    }
}
