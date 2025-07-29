import java.util.Scanner;
public class GameLeagues {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int playerScore;
        displayTable();
        System.out.print("\nPlease enter the user's score:");
        playerScore = scnr.nextInt();
        displayRanking(playerScore);
    }

    public static void displayRanking(int score){
        if (score >= 500 && score <= 999){
            System.out.println("\nCongratulations you have made it into the Bronze!!!");
        } else if (score >= 1000 && score <= 1999) {
            System.out.println("\nCongratulations you have made it into the Silver!!!");
        } else if (score >= 2000 && score <= 2999) {
            System.out.println("\nCongratulations you have made it into the Gold!!!");
        } else if (score >= 3000) {
            System.out.println("\nCongratulations you have made it into the Platinum!!!");
        } else{
            System.out.println("\nYou have not yet made it into a league");
        }
    }

    public static void displayTable(){
        System.out.printf("%-13s %-13s %-13s %-13s %-14s\n"," ","Bronze","Silver","Gold","Platinum");
        System.out.printf("%-13s %-13s %-13s %-13s %-14s\n","Score Range","500 - 999","1000 - 1999","2000 - 2999","3000 +");
    }
}
