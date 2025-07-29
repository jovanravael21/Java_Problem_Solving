import java.util.Scanner;

public class BiggestValues {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double inputValue;
        double biggestVal;
        int i;

        /* Your code goes here */
        inputValue = scnr.nextDouble();
        biggestVal = inputValue;

        for(i = 0; i < 8; i++){
            inputValue = scnr.nextDouble();
            if(inputValue > biggestVal) {
                biggestVal = inputValue;
            }
        }

        System.out.println(biggestVal);
    }
}
