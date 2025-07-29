import java.util.Scanner;

public class RecipeConversion {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input the name of your ingredient:");
        String ingredient = scnr.nextLine();

        System.out.println("Please input the measurement in grams:");
        int grams = scnr.nextInt();

        System.out.println("Please input the scale factor:");
        double scaleFactor = scnr.nextDouble();

        double cups = (grams / 250.0) * scaleFactor;
        double costPerCup = 2.64;
        double totalCost = cups * costPerCup;

        System.out.printf("\n%-15s%-15s%-15s%s\n","Ingredient","Grams","Scale Factor","Cups");
        System.out.printf("%-15s%-15d%-15.1f%.2f\n", ingredient, grams, scaleFactor, cups);

        System.out.printf("\nThe cost of %d cups at $%.2f per cup is $%,.0f\n", (int)cups, costPerCup, totalCost);
    }
}
