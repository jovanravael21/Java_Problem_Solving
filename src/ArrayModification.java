import java.util.Scanner;

public class ArrayModification {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] pointsArray;
        int[] modifiedArray;
        int numPoints;
        int i;

        numPoints = scnr.nextInt();

        pointsArray = new int[numPoints];
        modifiedArray = new int[numPoints];

        for (i = 0; i < pointsArray.length; ++i) {
            pointsArray[i] = scnr.nextInt();
        }

        /* Your code goes here */
        for (i = 0; i < pointsArray.length-1; i++){
            modifiedArray[i] = pointsArray[i+1];
        }
        modifiedArray[pointsArray.length-1] = pointsArray[0];

        System.out.print("Original points: ");
        for (i = 0; i < pointsArray.length; ++i) {
            System.out.print(pointsArray[i] + " ");
        }
        System.out.println();

        System.out.print("Updated points: ");
        for (i = 0; i < modifiedArray.length; ++i) {
            System.out.print(modifiedArray[i] + " ");
        }
        System.out.println();
    }
}
