import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Commands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>(size);
        for(int i=0; i<size; i++){
            numbers.add(scanner.nextInt());
        }


        int numbers_commands = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<numbers_commands; i++){
            String command = scanner.nextLine().trim();
            if(command.toLowerCase().equals("insert")){
                int index = scanner.nextInt(), item = scanner.nextInt();
                scanner.nextLine();
                numbers.add(index,item);
            }else{
                int index = scanner.nextInt();
                numbers.remove(index);
            }
        }
        
        for(int i=0; i<numbers.size(); i++){
            System.out.printf("%d ",numbers.get(i));
        }
    }
}
