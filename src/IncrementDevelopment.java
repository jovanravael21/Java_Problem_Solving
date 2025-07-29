import java.util.Scanner;
public class IncrementDevelopment {
    public static void main(String[] args){
        String goal1, goal2, goal3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first goal and press the enter key.");
        goal1 = scan.nextLine();
        System.out.println("Please enter the second goal and press the enter key.");
        goal2 = scan.nextLine();
        System.out.println("Please enter the third goal and press the enter key.");
        goal3 = scan.nextLine();
        System.out.println();
        System.out.printf("%d. %s\n",1,goal1);
        System.out.printf("%d. %s\n",2,goal2);
        System.out.printf("%d. %s\n",3,goal3);
        System.out.println();
        System.out.printf("%d. %s\n",3,goal3);
        System.out.printf("%d. %s\n",2,goal2);
        System.out.printf("%d. %s\n",1,goal1);
    }
}
