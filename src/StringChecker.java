import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inString;

        inString = scnr.nextLine();
        int numWhiteSpace = 0;
        /* Your code goes here */
        for(int i = 0; i < inString.length(); i++){
            if(Character.isWhitespace(inString.charAt(i))){
                numWhiteSpace += 1;
            }
        }

        if (numWhiteSpace >= 1){
            System.out.println("String is valid");
        }else {
            System.out.println("String is not valid");
        }
    }
}
