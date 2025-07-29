import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter kilometres, metres, centimetres, and millimetres on a single line:");
        int kilometersDistance;
        int metersDistance;
        int centimetersDistance;
        int millimetresDistance;
        int totalDistance;

        kilometersDistance = scnr.nextInt() * 1000000;
        metersDistance = scnr.nextInt() * 1000;
        centimetersDistance = scnr.nextInt() * 10;
        millimetresDistance = scnr.nextInt();

        totalDistance = kilometersDistance + metersDistance + centimetersDistance + millimetresDistance;
        System.out.printf("\nTotal millimetres: %d\n",totalDistance);
    }
}
