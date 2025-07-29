import java.util.Scanner;
public class SmallBowl {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input the name of the product:");
        String product = scnr.nextLine();
        System.out.println("Please input the number of products purchased:");
        int numberPurchased = scnr.nextInt();
        System.out.println("Please input the cost per product:");
        double totalCost = scnr.nextDouble();

        double costProduct = totalCost/numberPurchased;

        System.out.printf("\n%-10s %-20s %-15s %-10s\n","Product","Number Purchased","Total Cost","Item Cost");
        System.out.printf("%-10s %-20d $%,-15.2f $%,-10.2f\n",product,numberPurchased,totalCost,costProduct);
    }
}
