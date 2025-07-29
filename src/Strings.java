import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int result = A.compareTo(B);
        System.out.println(A.length()+B.length());
        if(result>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        char uppercase_first_letter = Character.toUpperCase(A.charAt(0));
        String first = uppercase_first_letter+A.substring(1,A.length());
        char uppercase_second_letter = Character.toUpperCase(B.charAt(0));
        String second = uppercase_second_letter+B.substring(1,B.length());
        System.out.println(first + " " + second);
        sc.close();
    }
}
