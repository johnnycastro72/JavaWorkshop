package exerciseOne;

/**
 * This class provides a solution to the requirements of exercise one.
 *
 * Exercise Statement
 * Declare 2 numeric variables (with the value you want), and indicate which is the greater of the two. If they are
 * equal, indicate that too. Change the values to check that it works.
 *
 * @version 1.0.0 26/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @since 1.0.0
 */
public class ExerciseOne implements ICompareValues {
    private Float firstVal = Float.valueOf(10);
    private Float secondVal = Float.valueOf(15);

    /**
     * ExerciseOne Constructor with default values
     */
    public ExerciseOne() {
    }

    /**
     * ExerciseOne Constructor
     *
     * @param firstVal  <Float> First value to compare
     * @param secondVal <Float> Second value to compare
     */
    public ExerciseOne(Float firstVal, Float secondVal) {
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    /**
     * This method compares the two values and return true if the first value it's greater than the second value
     *
     * @param firstValue  <Float> First value to compare
     * @param secondValue <Float> Second value to compare
     * @return <Boolean> True if first value it's greater than second value otherwise False
     */
    @Override
    public Boolean greaterThan(Float firstValue, Float secondValue) {
        return (firstValue > secondValue);
    }

    /**
     * This method compares the two values and return true if the first value it's equal to the second value
     *
     * @param firstValue  <Float> First value to compare
     * @param secondValue <Float> Second value to compare
     * @return <Boolean> True if first value it's equal to the second value otherwise False
     */
    @Override
    public Boolean equalTo(Float firstValue, Float secondValue) {
        return (firstValue == secondValue);
    }

    public static void main(String[] args) {


    }

}
