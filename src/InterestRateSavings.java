import java.util.Scanner;
public class InterestRateSavings {
    public static void main(String[] args){
        String name;
        double savingsAccount, interestRate;

        System.out.print("Please enter your first name only, the balance of your savings account, and the annual interest paid on your savings account.");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        savingsAccount = scan.nextDouble();
        interestRate = scan.nextDouble();

        System.out.printf("\n\nOpening Balance: $%.1f\n",savingsAccount);
        savingsAccount = savingsAccount + (savingsAccount * (interestRate/100));
        System.out.printf("First Year: $%.1f\n",savingsAccount);
        savingsAccount = savingsAccount + (savingsAccount * (interestRate/100));
        System.out.printf("Second Year: $%.1f\n",savingsAccount);
        savingsAccount = savingsAccount + (savingsAccount * (interestRate/100));
        System.out.printf("Third Year: $%.2f\n",savingsAccount);
    }
}
