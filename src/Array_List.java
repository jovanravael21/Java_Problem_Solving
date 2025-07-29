import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // number of lines

        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read each line
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); // number of elements in this line
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                innerList.add(scan.nextInt());
            }
            list.add(innerList);
        }
        int q = scan.nextInt(); // number of queries

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); // line number
            int y = scan.nextInt(); // position in line
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
