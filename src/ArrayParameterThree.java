import java.util.Scanner;

public class ArrayParameterThree {

    public static void filterArray(int[] arr, int numberComparison){
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] >= numberComparison ){
                arr[i] = 1;
            }else{
                arr[i] = -1;
            }
        }
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
        int[] arrToModify;
        int numVals;
        int numCompare;
        int i;

        numVals = scnr.nextInt();

        arrToModify = new int[numVals];

        for (i = 0; i < arrToModify.length; ++i) {
            arrToModify[i] = scnr.nextInt();
        }

        numCompare = scnr.nextInt();

        System.out.print("Original array: ");
        printArr(arrToModify);

        filterArray(arrToModify, numCompare);

        System.out.print("Changed array: ");
        printArr(arrToModify);
    }
}
