import java.util.Scanner;
public class ProgramSumamry{
    public static void main(String[] args){
        String name1, name2, name3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first student name and press the enter key.");
        name1 = scan.nextLine();
        System.out.println("Please enter the second student name and press the enter key.");
        name2 = scan.nextLine();
        System.out.println("Please enter the third student name and press the enter key.");
        name3 = scan.nextLine();

        System.out.printf("%s, %s, %s\n",name1,name2,name3);
    }
}