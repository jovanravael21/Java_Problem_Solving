import java.util.Scanner;
public class ScoreChecker {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Your Score: ");
        int score = scnr.nextInt();

        if(score > 100){
            System.out.println("Can't enter above 100");
        } else if(score >= 80){
            System.out.println("High Distinction");
        }else if (score >= 70){
            System.out.println("Distinction");
        }else if (score >= 60){
            System.out.println("Credit");
        }else if (score >= 50){
            System.out.println("Pass");
        }else if (score >= 0){
            System.out.println("Fail");
        }else {
            System.out.println("Can enter below 0");
        }

        int number = 100;
        if(number == 100){
            System.out.println("Equal 100");
        }else{
            System.out.println("Not equal 100");
        }

        String name = "Jovan";
        if (name.equals("Jovanh")){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
