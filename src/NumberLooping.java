import java.util.Scanner;
public class NumberLooping {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int previousNumber, currentNumber;
        System.out.print("Enter two numbers: ");
        previousNumber = scnr.nextInt();
        currentNumber = scnr.nextInt();

        while(currentNumber >= previousNumber){
            System.out.printf("%d is greater than or equal %d.",currentNumber,previousNumber);
            previousNumber = currentNumber;
            System.out.print("\nAdd one number: ");
            currentNumber = scnr.nextInt();
        }
        System.out.printf("%d is not greater than or equal to %d.",currentNumber,previousNumber);

    }
}
