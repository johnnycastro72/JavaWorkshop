package exerciseFour;

import java.util.Scanner;

/**
 * This class provides a solution to the requirements of exercise four.
 *
 * Exercise Statement
 * Read a number from the keyboard asking for the price of a product (it can have decimals) and calculate the final
 * price including VAT. The VAT will be a constant which will be 21%.
 *
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @version 1.0.0 29/04/2022
 * @since 1.0.0
 */
public class ExerciseFour {

    /**
     * ExerciseThree Constructor
     */
    public ExerciseFour() {
    }

    /**
     * actualVAT attribute accessor method
     *
     * @return <Double> actualVAT
     */
    public Double VAT(){
        Double actualVAT = 21d;
        return (actualVAT/100);
    }

    /**
     * This method return the product price including VAT (21%)
     *
     * @param productPrice <Double> The product price
     * @return <Double> Final product price including VAT
     */
    public Double addVAT(Double productPrice) {
        return (productPrice * (1 + VAT()));
    }

    /**
     * Execute the class
     *
     * @param args <String> arguments array for console execution.
     */
    public static void main(String[] args) {
        ExerciseFour exerciseFour = new ExerciseFour();
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Exercise Four:");
        System.out.println();
        System.out.format("Digite el precio del producto: ");
        Double productPrice = consoleInput.nextDouble();
        System.out.println("Resultado:");
        System.out.format("El precio del producto incluido IVA (21%%) es %-14s", exerciseFour.addVAT(productPrice));

    }
}
