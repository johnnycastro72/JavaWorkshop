package exerciseFive;

import java.util.ArrayList;

/**
 * This class provides a solution to the requirements of exercise five.
 * <p>
 * Exercise Statement
 * Displays odd and even numbers from 1 to 100 (both included). Uses a while loop.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public class ExerciseFive {
    private final ArrayList<Integer> oddValues = new ArrayList<>();
    private final ArrayList<Integer> evenValues = new ArrayList<>();

    /**
     * ExerciseFive Constructor
     *
     * @param maxNumber <Integer> Maximum number to classify
     */
    public ExerciseFive(Integer maxNumber) {
        oddEvenCategorize(maxNumber);
    }

    /**
     * This method categorize the numbers in odd or even and add to their list
     *
     * @param maxNumber <Integer> The higher number to categorize
     */
    private void oddEvenCategorize(Integer maxNumber) {
        Integer actualValue = 1;
        while (actualValue <= maxNumber) {
            if (this.isOdd(actualValue)) {
                oddValues.add(actualValue);
                actualValue++;
                continue;
            }
            evenValues.add(actualValue);
            actualValue++;
        }
    }

    /**
     * This method print the odd values
     */
    private void printOddValues() {
        Integer actualValue = 0;
        while (actualValue < oddValues.size()) {
            System.out.println(oddValues.get(actualValue));
            actualValue++;
        }
    }

    /**
     * This method print the even values
     */
    private void printEvenValues() {
        Integer actualValue = 0;
        while (actualValue < evenValues.size()) {
            System.out.println(evenValues.get(actualValue));
            actualValue++;
        }
    }

    /**
     * This method determine whether a number is odd
     *
     * @param number <Integer> Number to check
     * @return <Boolean> True the number is odd otherwise is even
     */
    private Boolean isOdd(Integer number) {
        Integer result = (number % 2);
        return (result != 0);
    }

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        ExerciseFive exerciseFive = new ExerciseFive(100);
        System.out.println("Exercise Five:");
        System.out.println();
        System.out.println("Números impares: ");
        exerciseFive.printOddValues();
        System.out.println();
        System.out.println("Números pares: ");
        exerciseFive.printEvenValues();
    }

}
