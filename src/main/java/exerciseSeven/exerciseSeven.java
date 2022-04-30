package exerciseSeven;

import java.util.Scanner;

/**
 * This class provides a solution to the requirements of exercise seven.
 * <p>
 * Exercise Statement
 * It reads a number by keyboard and checks that this number is greater or equal to zero, if it is not, it will ask for
 * it again (do while), then it displays this number by console.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 30/04/2022
 * @since 1.0.0
 */
public class exerciseSeven {

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Exercise Seven:");
        System.out.println();
        Integer number;
        do {
            System.out.format("Digite un número: ");
            number = consoleInput.nextInt();
        } while (number < 0);
        System.out.format("El único número válido fue: %-14s%n", number);
    }
}
