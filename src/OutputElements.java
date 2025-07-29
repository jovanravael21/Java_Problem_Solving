import java.util.Scanner;

public class OutputElements {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputData;
        int i;

        inputData = scnr.next();

        /* Your code goes here */
        for(i = inputData.length()-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(inputData.charAt(i) + ",");
            } else {
                System.out.print(inputData.charAt(i));
            }
        }
    }
}
