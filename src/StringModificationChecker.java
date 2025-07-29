import java.util.Scanner;

public class StringModificationChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inString;

        inString = scnr.nextLine();

        /* Your code goes here */
        boolean firstLetterLowercase = Character.isLowerCase(inString.charAt(0));
        if (firstLetterLowercase){
            System.out.println("String accepted");
        }else {
            System.out.println("String not accepted");
        }
    }
}
