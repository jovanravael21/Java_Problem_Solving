import java.util.Scanner;

public class ArrayParameterOne {

    public static void modifyFirstLastValues(int[] array){
        array[0] = 0;
        array[array.length-1] = 0;
    }

    public static void printArr(int[] arr) {
        int i;

        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] numberArray;
        int numVals;
        int i;

        numVals = scnr.nextInt();

        numberArray = new int[numVals];

        for (i = 0; i < numberArray.length; ++i) {
            numberArray[i] = scnr.nextInt();
        }

        System.out.print("Initial array: ");
        printArr(numberArray);

        modifyFirstLastValues(numberArray);

        System.out.print("Final array: ");
        printArr(numberArray);
    }
}
