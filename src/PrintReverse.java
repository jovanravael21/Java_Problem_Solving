import java.util.Scanner;
public class PrintReverse {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String userInput;
        while(true){
            userInput = scnr.nextLine();
            if(userInput.toLowerCase().equals("done") || userInput.equals("d")){
                break;
            }else {
                for(int i = userInput.length()-1; i >= 0; i--){
                    System.out.print(userInput.charAt(i));
                }
                System.out.println();
            }
        }
    }
}
