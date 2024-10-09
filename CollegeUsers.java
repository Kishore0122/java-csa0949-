import java.util.Scanner;

public class CollegeUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of users in the college: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();

        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaff);

        System.out.println("Number of staff users: " + staffUsers);
        System.out.println("Number of non-teaching staff users (1 for every 3 staff users): " + nonTeachingStaff);
        System.out.println("Number of student users: " + studentUsers);

        scanner.close();
    }
}
