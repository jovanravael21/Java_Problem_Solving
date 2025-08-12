import java.util.Scanner;
public class GuessMe {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        final String secretWord = "enjoy";
        String userInput;
        
        int closestDistance = 0;
        char[] guessArray;
        char[] secretWordArray = secretWord.toCharArray();
        String[] outputArray = new String[5];

        System.out.println("Please enter your first attempt.");
        userInput = scnr.next();

        guessArray = userInput.toCharArray();

        int a = 0;
        while (a < 5 && !secretWord.equals(userInput)) {
            System.out.println(userInput);
            for (int b = 0; b < guessArray.length; b++) {

                if (guessArray[b] ==  secretWordArray[b]) {
                    outputArray[b] = "" + guessArray[b];
                } else {
                    for (char secretWordLetter : secretWordArray) {
                        if (guessArray[b] == secretWordLetter) {
                            closestDistance = Math.abs(guessArray[b] - secretWordArray[b]);
                            outputArray[b] = "(" + guessArray[b] + ")";
                            break;
                        } else {
                            outputArray[b] = "X";
                        }
                    }
                }
            }
            for (String letter : outputArray) {
                System.out.print(letter);
            }
            System.out.println();

            if (closestDistance > 0) {
                System.out.printf("One of your letters is %d characters away%n", closestDistance);
            }
            System.out.println();

            closestDistance = 0;
            System.out.println("Please try again: ");
            userInput = scnr.next();
            guessArray = userInput.toCharArray();
            a+=1;
        }

        if (secretWord.equals(userInput)) {
            System.out.println(userInput);
            System.out.print("Congratulations, you found the word.");
        } else {
            System.out.println();
            System.out.print("Better luck next time");
        }
    }
}
 