import java.util.Scanner;
public class String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(!s.isEmpty()){
            // + = one or more occurrences
            String regex = "[!\\,\\?\\.\\_\\'\\@\\ ]+";
            String[] cleaned = s.split(regex);
            System.out.println(cleaned.length);
            for(String words:cleaned){
                System.out.println(words);
            }
        }else{
            System.out.println(0);
        }
    }
}
