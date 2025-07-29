import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Exception {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number1/number2);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
