import java.util.Scanner;
public class Guessing {
    public static void main(String[] args){
        String guess;
        String answer;
        Scanner scnr = new Scanner(System.in);

        System.out.println("\"I like playing basketball\"");
        System.out.println("Who said it?");
        guess = scnr.nextLine().toLowerCase();
        answer = "jovan";
        System.out.println(guess.equals(answer));

        System.out.println();
        System.out.println("\"I  have a big sweet tooth\"");
        System.out.println("Who said it?");
        guess = scnr.nextLine().toLowerCase();
        answer = "mahd";
        System.out.println(guess.equals(answer));

        System.out.println();
        System.out.println("\"I like playing minecraft\"");
        System.out.println("Who said it?");
        guess = scnr.nextLine().toLowerCase();
        answer = "nea";
        System.out.println(guess.equals(answer));

        System.out.println();
        System.out.println("\"I like speeding with car\"");
        System.out.println("Who said it?");
        guess = scnr.nextLine().toLowerCase();
        answer = "duren";
        System.out.println(guess.equals(answer));

        System.out.println();
        System.out.println("\"I like going to gym\"");
        System.out.println("Who said it?");
        guess = scnr.nextLine().toLowerCase();
        answer = "pal";
        System.out.println(guess.equals(answer));
    }
}
