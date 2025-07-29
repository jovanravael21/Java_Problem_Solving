import java.util.Scanner;

public class LetterValidInvalid {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String codeStr;
        int i;
        int count;

        codeStr = scnr.next();
        count = 0;

        /* Your code goes here */

        for(i = 0; i < codeStr.length()-1; i++){
            if(Character.isLetter(codeStr.charAt(i))){
                count += 1;
            }
        }

        if(count <= 5 && codeStr.length() > 7){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}