import java.util.Scanner;
import java.util.HashMap;
public class Map {
    public static void main(String []args) {
        HashMap<String,Integer> phone_number = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            phone_number.put(name,phone);
            in.nextLine();
        }

        while(in.hasNext()) {
            String s=in.nextLine();

            for(String key : phone_number.keySet()){
                if(phone_number.containsKey(s)){
                    System.out.printf("%s = %d\n",s,phone_number.get(s));
                    break;
                }else {
                    System.out.println("Not found");
                    break;
                }
            }
        }
    }
}
