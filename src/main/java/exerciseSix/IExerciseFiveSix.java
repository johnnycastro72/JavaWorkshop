package exerciseSix;

import java.util.ArrayList;

/**
 * This interface indicates the methods that must be implemented.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public interface IExerciseFiveSix {
    ArrayList<Integer> oddValues = new ArrayList<>();
    ArrayList<Integer> evenValues = new ArrayList<>();

    void oddEvenCategorize(Integer maxNumber);

    void printOddValues();

    void printEvenValues();

    Boolean isOdd(Integer number);

    void printResults();
}
