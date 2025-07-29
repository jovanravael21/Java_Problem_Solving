import java.util.Scanner;

public class CharityFoodOrders {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Number of people:");
        int numPeople = scnr.nextInt();
        System.out.println("Number of meals per person:");
        int mealsPerPerson = scnr.nextInt();
        System.out.println("Cost per bag of rice:");
        double costPerBag = scnr.nextDouble();

        int totalMeal = numPeople * mealsPerPerson;
        int bagNeeded = (int) Math.ceil(totalMeal/12.0);

        double costTotalBag = bagNeeded * costPerBag;
        System.out.printf("\nThis order will support %,d people to each make %d rice based meals.\n",numPeople,mealsPerPerson);
        System.out.printf("Total meals: %,d\n",totalMeal);
        System.out.printf("You will need %d bags of rice for a cost of $%,.2f.\n",bagNeeded,costTotalBag);

        System.out.println("\nPlease input the expected percentage of late orders:");

        double expectedLate = scnr.nextDouble();
        int totalPeopleExpectedLate = (int) (expectedLate * numPeople);
        int totalFinalMeal = (totalPeopleExpectedLate + numPeople) * mealsPerPerson;
        int totalBagNeeded = (int) Math.ceil(totalFinalMeal/12.0);
        double totalBagPrice = totalBagNeeded * costPerBag;

        System.out.printf("\nAllowing for late orders, you should order: %,d bags of rice for a cost of $%,.2f.",totalBagNeeded,totalBagPrice);
    }
}