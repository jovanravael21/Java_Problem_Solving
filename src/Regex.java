import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<lines; i++){
            String email = scanner.nextLine();

            if(email.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$")){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
