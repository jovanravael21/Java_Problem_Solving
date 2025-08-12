import java.util.Scanner;

public class ArrayParameterTwo{
    
    public static void subtractIndexFromElements(int[] array){
        int i;
        for(i = 0; i < array.length; i++){
            array[i] = array[i] - i;
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
        int i;

        numVals = scnr.nextInt();

        arrToModify = new int[numVals];

        for (i = 0; i < arrToModify.length; ++i) {
            arrToModify[i] = scnr.nextInt();
        }

        System.out.print("Old array: ");
        printArr(arrToModify);

        subtractIndexFromElements(arrToModify);

        System.out.print("New array: ");
        printArr(arrToModify);
    }
}
