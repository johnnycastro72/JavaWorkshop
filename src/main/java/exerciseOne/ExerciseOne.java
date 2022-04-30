package exerciseOne;

/**
 * This class provides a solution to the requirements of exercise one.
 * <p>
 * Exercise Statement
 * Declare 2 numeric variables (with the value you want), and indicate which is the greater of the two. If they are
 * equal, indicate that too. Change the values to check that it works.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 26/04/2022
 * @since 1.0.0
 */
public class ExerciseOne implements ICompareValues {
    private Float firstVal = 10f;
    private Float secondVal = 15f;

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
     * firstVal attribute accessor method
     *
     * @return <Float> firstVal
     */
    public Float firstVal() {
        return firstVal;
    }

    /**
     * secondVal attribute accessor method
     *
     * @return <Float> secondVal
     */
    public Float secondVal() {
        return secondVal;
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
        return (firstValue.equals(secondValue));
    }

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        ExerciseOne exerciseOne = new ExerciseOne();

        System.out.println("Exercise One:");
        System.out.println();
        System.out.format("El primer valor: %-14s es %-14s al segundo valor:  %-14s%n", exerciseOne.firstVal.toString(), ((exerciseOne.equalTo(exerciseOne.firstVal(), exerciseOne.secondVal())) ? " igual " : (exerciseOne.greaterThan(exerciseOne.firstVal(), exerciseOne.secondVal())) ? " mayor " : " menor "), exerciseOne.secondVal.toString());
        Float[][] values = {{10.10f, 30.30f}, {40.60f, 15.15f}, {20.20f, 20.20f}};
        for (Float[] valuePair : values) {
            ExerciseOne exerciseOnes = new ExerciseOne(valuePair[0], valuePair[1]);
            System.out.format("El primer valor: %-14s es %-14s al segundo valor:  %-14s%n", exerciseOnes.firstVal.toString(), ((exerciseOnes.equalTo(exerciseOnes.firstVal, exerciseOnes.secondVal)) ? " igual " : (exerciseOnes.greaterThan(exerciseOnes.firstVal, exerciseOnes.secondVal)) ? " mayor " : " menor "), exerciseOnes.secondVal.toString());
        }

    }

}
