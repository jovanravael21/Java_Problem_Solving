import java.util.Scanner;
public class EOF_Input {
    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.printf("%d %s\n",i+1,scanner.nextLine());
            i++;
        }
    }
}
