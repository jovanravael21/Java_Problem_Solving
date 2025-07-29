import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
interface StringOperation{
    String apply(String s);
}

@FunctionalInterface
interface StringCount{
    int count(String s);
}

public class String_Lambda {
    public static void main(String[] args){
        StringOperation upperCase = (s) -> s.toUpperCase().toString();
        StringOperation lowerCase = (s) -> s.toLowerCase().toString();
        StringCount length = (s) -> s.length();
        StringOperation reverse = (s) -> new StringBuilder(s).reverse().toString();
        StringOperation isPalindrome = (s) -> {
            boolean palindrome;
            String checker = new StringBuilder(s).reverse().toString().toLowerCase();
            if(s.equals(checker)){
                palindrome = true;
            }else{
                palindrome = false;
            }
            return palindrome ? "YES" : "NO";
        };
        StringOperation removeVowels = (s) -> s.replaceAll("[aiueo]*","");
        StringOperation capitalize = (s) -> {
            String[] wordsList = s.trim().split("\\s+");
            String capitalizedWords = "";
            for(String words : wordsList){
                capitalizedWords += words.substring(0,1).toUpperCase() + words.substring(1,words.length()).toLowerCase() + " ";
            }
            return capitalizedWords.toString();
        };

        boolean isRunning = true;
        while(isRunning){
            System.out.println("-------------------------------------------------");
            System.out.println("\t\tString Transformer with Lambdas");
            System.out.println("-------------------------------------------------");
            System.out.println("1. UpperCase");
            System.out.println("2. LowerCase");
            System.out.println("3. Length");
            System.out.println("4. Reverse");
            System.out.println("5. Palindrome");
            System.out.println("6. RemoveVowels");
            System.out.println("7. Capitalize");
            System.out.println("8. Exit");
            System.out.println("-------------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("Enter Command: ");
                int option = scanner.nextInt();
                scanner.nextLine();
                System.out.println("-------------------------------------------------");
                String stringInput;
                if(option == 1){
                    System.out.print("UpperCase: ");
                    stringInput = scanner.nextLine();
                    System.out.println(upperCase.apply(stringInput));
                }else if(option == 2){
                    System.out.print("LowerCase: ");
                    stringInput = scanner.nextLine();
                    System.out.println(lowerCase.apply(stringInput));
                }else if(option == 3){
                    System.out.print("Length: ");
                    stringInput = scanner.nextLine();
                    System.out.println(length.count(stringInput));
                }else if(option == 4){
                    System.out.print("Reverse: ");
                    stringInput = scanner.nextLine();
                    System.out.println(reverse.apply(stringInput));
                }else if(option == 5){
                    System.out.print("Palindrome: ");
                    stringInput = scanner.nextLine();
                    System.out.println(isPalindrome.apply(stringInput));
                }else if(option == 6){
                    System.out.print("RemoveVowels: ");
                    stringInput = scanner.nextLine();
                    System.out.println(removeVowels.apply(stringInput));
                }else if(option == 7){
                    System.out.print("Capitalize: ");
                    stringInput = scanner.nextLine();
                    System.out.println(capitalize.apply(stringInput));
                }else if(option == 8){
                    System.out.println("END.");
                    break;
                }else {
                    System.out.println("Invalid Command. Try Again!");
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR: Invalid Input!");
            }
        }
    }
}