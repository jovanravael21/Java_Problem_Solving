import java.util.Scanner;
public class Formula_Problem {
    static int a;
    static int b;
    static int n;
    static int result = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int h=0;h<t;h++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

            result = a;
            for(int i=0; i < n; i++){
                int new_result = (int) Math.pow(2,i)*b;
                result += new_result;
                System.out.printf("%d ",result);
            }
            System.out.println();
        }

        in.close();
    }
}
