import java.util.Scanner;

@FunctionalInterface
interface PerformChecker{
    boolean check(int a);
}

public class Lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        PerformChecker isOdd = (a) -> a%2 != 0;
        PerformChecker isPrime = (a) -> {
            if(a<2){
                return false;
            }
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i==0){
                    return  false;
                }
            }
            return true;
        };
        PerformChecker isPalindrome = (a) -> {
            String s = String.valueOf(a);
             return s.equals(new StringBuilder(s).reverse().toString());
        };

        for(int i =0 ; i<testCase; i++){
            int command = scanner.nextInt(), number = scanner.nextInt();
            switch (command){
                case 1 -> {
                    boolean result = isOdd.check(number);
                    System.out.println(result ? "ODD" : "EVEN");
                }
                case 2 -> {
                    boolean result = isPrime.check(number);
                    System.out.println(result ? "PRIME" : "COMPOSITE");
                }
                case 3 -> {
                    boolean result = isPalindrome.check(number);
                    System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                }
            }
        }
    }
}
