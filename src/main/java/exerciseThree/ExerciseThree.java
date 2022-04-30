package exerciseThree;

import java.util.Scanner;

/**
 * This class provides a solution to the requirements of exercise three.
 * <p>
 * Exercise Statement
 * Make an application that calculates the area of a circle(pi*R^2).
 * The radius will be requested by keyboard (remember to pass from String
 * to double with Double.parseDouble).
 * Use the constant PI and the Math method pow.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public class ExerciseThree {
    /**
     * ExerciseThree Constructor
     */
    public ExerciseThree() {
    }

    /**
     * This method return the circle area
     *
     * @param circleRadius <Double> Circle radius
     * @return <Double> Circle area
     */
    public Double circleArea(Double circleRadius) {
        return (Math.PI * Math.pow(circleRadius, 2));
    }

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        ExerciseThree exerciseThree = new ExerciseThree();
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Exercise Three:");
        System.out.println();
        System.out.format("Digite el Radio del círculo: ");
        Double circleRadius = consoleInput.nextDouble();
        System.out.println("Resultado:");
        System.out.format("El área del círculo es %-14s", exerciseThree.circleArea(circleRadius));
    }
}
