import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Number of Fibonacci Numbers: ");
        int n = scnr.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for(int i = 0; i < n; i++){
            if(i < 2){
                System.out.println(i);
            }else{
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }

        System.out.println();
        int d = 5;
        System.out.println(d--);
        System.out.println(--d);
    }
}
