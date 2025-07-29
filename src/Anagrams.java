import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        String cleaned1 = a.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleaned2 = b.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (cleaned1.length() != cleaned2.length()) {
            return false; // quick check
        }

        char[] array1 = cleaned1.toCharArray();
        char[] array2 = cleaned2.toCharArray();
        //{a,n,a,r,g,a,m}
        //{m,a,r,g,a,n,a}

        // Bubble Sorting
        //For array [4, 3, 2, 1] and n=4, first pass (i=0):
        //j=0: compare 4 and 3 → swap → [3, 4, 2, 1]
        //j=1: compare 4 and 2 → swap → [3, 2, 4, 1]
        //j=2: compare 4 and 1 → swap → [3, 2, 1, 4]
        //Now 4 is in the correct last position.

        // Bubble sort for array1
        //{a,n,a,r,g,a,m}
        // i < 6
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    char word = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = word;
                }
            }
        }

        // Bubble sort for array2
        //{m,a,r,g,a,n,a}
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - 1 - i; j++) {
                if (array2[j] > array2[j + 1]) {
                    char word = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = word;
                }
            }
        }

        // Optional debug output
        System.out.println("Sorted a: " + new String(array1));
        System.out.println("Sorted b: " + new String(array2));

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
