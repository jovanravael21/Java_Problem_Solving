import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplying_List {
    static int number;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter Your Number: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("ERROR: Please enter a valid input!");
        }

        for(int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d\n",number,i,number*i);
        }
        scanner.close();
    }
}
