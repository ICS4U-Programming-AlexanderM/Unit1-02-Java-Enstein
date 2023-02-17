import java.util.Scanner;
/**
* This program calculates the number of logs that can fit on a truck.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-02-16
*/

public final class Einstein {
    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // constants
        final double LIGHT = 299792458;
        // Variables
        String stringInput = "";
        double energy = 0;
        double mass = 0;

        // Try ... catch statement
        try {
            // Get input
            System.out.println("Enter the mass of your object in kg: ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            // Change from string to double
            mass = Double.parseDouble(stringInput);
            // Check for negative numbers
            if (mass >= 0) {
                // Math
                energy = mass * Math.pow(LIGHT, 2);

                // Print energy total
                System.out.format("The total energy is %.3f", energy);
                System.out.println(" J.");
            } else {
                System.out.println("That is a negative number.");
            }
        } catch (NumberFormatException err) {
            System.out.println("Error, not a viable input.");
        }
    }
}
