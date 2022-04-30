package exerciseTwo;

import exerciseOne.ICompareValues;

import java.util.Scanner;

/**
 * This class provides a solution to the requirements of exercise two.
 * <p>
 * Exercise Statement
 * To the previous exercise add console input of two values and indicate
 * whether they are greater than, less than or equal to each other.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public class ExerciseTwo implements ICompareValues {
    /**
     * ExerciseTwo Constructor with default values
     */
    public ExerciseTwo() {
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
        ExerciseTwo exerciseTwo = new ExerciseTwo();

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Exercise Two:");
        System.out.println();
        System.out.format("Digite el primer número....: ");
        Float firstValue = consoleInput.nextFloat();
        System.out.format("Digite el segundo un número: ");
        Float secondValue = consoleInput.nextFloat();
        System.out.println("Resultado:");
        System.out.format("El primer valor: %-14s es %-14s al segundo valor:  %-14s%n", firstValue, ((exerciseTwo.equalTo(firstValue, secondValue)) ? " igual " : (exerciseTwo.greaterThan(firstValue, secondValue)) ? " mayor " : " menor "), secondValue);

    }

}
