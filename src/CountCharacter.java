import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Character character;
        String word;
        int count = 0;
        Character currentChar;

        character = scnr.next().charAt(0);
        word = scnr.nextLine();

        for(int i = 0; i < word.length()-1; i++){
            currentChar = word.charAt(i);
            if(currentChar.equals(character)){
                count += 1;
            }
        }

        if (count != 1){
            System.out.printf("%d %s's\n",count,character);
        }else {
            System.out.printf("%d %s\n",count,character);
        }

    }
}
