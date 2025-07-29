import java.util.Scanner;

public class Simba {
    public static void main(String[] args){
        String char1;
        String char2;
        String char3;
        String char4;
        String char5;
        String word;

        Scanner scnr = new Scanner(System.in);
        System.out.print("\nPrompt the user to input the first character.");
        char1 = scnr.next();
        System.out.print("\nPrompt the user to input the second character.");
        char2 = scnr.next();
        System.out.print("\nPrompt the user to input the third character.");
        char3 = scnr.next();
        System.out.print("\nPrompt the user to input the fourth character.");
        char4 = scnr.next();
        System.out.print("\nPrompt the user to input the fifth character.");
        char5 = scnr.next();

        System.out.printf("\nAnswer:%s%s%s%s%s\n",char1,char2,char3,char4,char5);

        System.out.print("\nPlease enter a single word consisting of exactly five characters:");
        word = scnr.next();

        System.out.println("\nAnswer:");
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
