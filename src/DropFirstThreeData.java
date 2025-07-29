import java.util.Scanner;

public class DropFirstThreeData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String delimitedData;
        int i;
        int semicolonCount = 0;
        int thirdSemicolon = -1;
        char currentCharacter;
        delimitedData = scnr.next();

        /* Your code goes here */
        for(i = 0; i < delimitedData.length()-1; i++){
            currentCharacter = delimitedData.charAt(i);
            if(currentCharacter == ';'){
                semicolonCount += 1;
            }

            if(semicolonCount == 3){
                //delimitedData = delimitedData.replace(delimitedData.substring(0,delimitedData.indexOf(delimitedData.charAt(i))),"");
                delimitedData = delimitedData.substring(i+1,delimitedData.length());
            }
        }

        System.out.println("Remaining data: " + delimitedData.substring(thirdSemicolon + 1));

    }
}