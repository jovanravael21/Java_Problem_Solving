import java.util.InputMismatchException;
import java.util.Scanner;

public class Weird_Numbers {
    static int num;
    public static void main(String[] args){
        int zeroChecker;
        boolean isEven = true;
        /*
        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        */
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a Number: ");
            num = scanner.nextInt();
            scanner.nextLine();
        }catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("ERROR: PLease enter a valid input!");
        }

        zeroChecker = num % 2;
        switch (zeroChecker){
            case 0 -> isEven = true;
            default -> isEven = false;
        }

        if(isEven){
            if(2 <= num && num <= 5){
                System.out.println("Not Weird");
            }else if (6 <= num && num <= 20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
        scanner.close();
    }
}
