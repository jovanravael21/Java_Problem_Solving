import java.util.Scanner;

public class MultidimensionArray {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ROWS = 2;
        final int NUM_COLS = 2;
        int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
        int i;
        int j;
        int maxMiles;
        int minMiles;

        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                milesTracker[i][j] = scnr.nextInt();
            }
        }

        maxMiles = milesTracker[0][0];
        minMiles = milesTracker[0][0];

        /* Your solution goes here  */
        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                if (maxMiles < milesTracker[i][j]){
                    maxMiles = milesTracker[i][j];
                }

                if (minMiles > milesTracker[i][j]){
                    minMiles = milesTracker[i][j];
                }
            }
        }

        System.out.println("Min miles: " + minMiles);
        System.out.println("Max miles: " + maxMiles);
    }
}