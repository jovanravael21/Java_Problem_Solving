import java.util.Scanner;
public class Subarray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int negativeCount = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j]; // running sum from i to j
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println(negativeCount);
        scan.close();
    }
}
