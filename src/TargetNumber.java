import java.util.Scanner;
public class TargetNumber {
    public static void main(String[] args){
        int lowerRange = 1;
        int upperRange = 9;
        int targetNumber;
        int reminder;

        Scanner scnr = new Scanner(System.in);
        System.out.print("Target Number: ");
        targetNumber = scnr.nextInt();

        //System.out.print("Wrapper Number: ");
        //int wrapper = scnr.nextInt();
        //reminder = targetNumber % wrapper;
        //System.out.printf("After wrapping: %d",reminder);

        int biggerThan9 = (targetNumber <= 9) ? targetNumber % 10 : targetNumber % upperRange;
        System.out.println(biggerThan9);
    }
}
