package exerciseSix;

import java.util.ArrayList;

public interface IExerciseFiveSix {
    ArrayList<Integer> oddValues = new ArrayList<>();
    ArrayList<Integer> evenValues = new ArrayList<>();

    void oddEvenCategorize(Integer maxNumber);

    void printOddValues();

    void printEvenValues();

    Boolean isOdd(Integer number);

    void printResults();
}
