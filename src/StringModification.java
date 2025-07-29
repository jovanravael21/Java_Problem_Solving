import java.util.Scanner;

public class StringModification {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputString;

        inputString = scnr.nextLine();

        /* Your code goes here */
        boolean thirdWhiteSpace = Character.isWhitespace(inputString.charAt(2));
        if(thirdWhiteSpace){
            System.out.println("The third character is whitespace.");
        }else{
            System.out.println("The third character is not whitespace.");
        }

    }
}
