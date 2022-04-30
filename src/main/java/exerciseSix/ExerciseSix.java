package exerciseSix;

/**
 * This class provides a solution to the requirements of exercise six.
 * <p>
 * Exercise Statement
 * Displays odd and even numbers from 1 to 100 (both included). Uses a for loop.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public class ExerciseSix implements IExerciseFiveSix {

    /**
     * ExerciseFive Constructor
     *
     * @param maxNumber <Integer> Maximum number to classify
     */
    public ExerciseSix(Integer maxNumber) {
        oddEvenCategorize(maxNumber);
    }

    /**
     * This method categorize the numbers in odd or even and add to their list
     *
     * @param maxNumber <Integer> The higher number to categorize
     */
    @Override
    public void oddEvenCategorize(Integer maxNumber) {
        for (Integer actualValue = 1; actualValue < maxNumber; actualValue++) {
            if (this.isOdd(actualValue)) {
                oddValues.add(actualValue);
                continue;
            }
            evenValues.add(actualValue);
        }

    }

    /**
     * This method print the odd values
     */
    @Override
    public void printOddValues() {
        for (Integer oddValue : oddValues) {
            System.out.println(oddValue);
        }
    }

    /**
     * This method print the even values
     */
    @Override
    public void printEvenValues() {
        for (Integer evenValue : evenValues) {
            System.out.println(evenValue);
        }
    }

    /**
     * This method determine whether a number is odd
     *
     * @param number <Integer> Number to check
     * @return <Boolean> True the number is odd otherwise is even
     */
    @Override
    public Boolean isOdd(Integer number) {
        Integer result = (number % 2);
        return (result != 0);
    }

    /**
     * This method print the results
     */
    @Override
    public void printResults() {
        System.out.println("Exercise Six:");
        System.out.println();
        System.out.println("Números impares: ");
        this.printOddValues();
        System.out.println();
        System.out.println("Números pares: ");
        this.printEvenValues();
    }

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        ExerciseSix exerciseSix = new ExerciseSix(100);
        exerciseSix.printResults();
    }
}
