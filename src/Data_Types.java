import java.util.Scanner;
public class Data_Types {
    public static void main(String []args){
        /*
        A byte is an 8-bit signed integer.
        A short is a 16-bit signed integer.
        An int is a 32-bit signed integer.
        A long is a 64-bit signed integer.
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
