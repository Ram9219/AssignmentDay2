import java.util.Scanner;

public class PermissionToggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input as a 4-bit binary string
        System.out.print("Enter current permissions (4-bit binary): ");
        String binaryInput = scanner.next();

        // Convert binary string to an integer
        int permissions = Integer.parseInt(binaryInput, 2);

        // Take user input for the bit position to toggle (0-3)
        System.out.print("Enter the bit position to toggle (0-3): ");
        int position = scanner.nextInt();

        // Ensure valid input
        if (binaryInput.length() == 4 && position >= 0 && position <= 3) {
            // Toggle the bit using XOR
            int newPermissions = permissions ^ (1 << position);

            // Convert the new permission value back to a 4-bit binary string
            String newBinary = String.format("%4s", Integer.toBinaryString(newPermissions)).replace(' ', '0');

            // Display the result
            System.out.println("New permissions value: " + newBinary);
        } else {
            System.out.println("Invalid input. Please enter a valid 4-bit binary number and position.");
        }

        scanner.close();
    }
}
