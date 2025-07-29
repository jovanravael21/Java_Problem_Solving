import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double[] inputs = new double[3];
        int[] sqrtInts = new int[3];
        boolean[] isPerfectSquare = new boolean[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Please input your %s decimal value:\n",
                    i == 0 ? "first" : i == 1 ? "second" : "third");
            inputs[i] = scnr.nextDouble();

            double sqrt = Math.sqrt(inputs[i]);
            sqrtInts[i] = (int) sqrt;
            isPerfectSquare[i] = (sqrt % 1 == 0);
        }

        System.out.println("\nResult:");
        System.out.printf("%-10s %-25s %-20s\n", "Input", "Square Root as Integer", "Perfect Square");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10.2f %-25d %-20b\n", inputs[i], sqrtInts[i], isPerfectSquare[i]);
        }
    }
}
