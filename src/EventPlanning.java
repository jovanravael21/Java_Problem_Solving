import java.util.Scanner;
public class EventPlanning {
    public static void main(String[] args){
        double tempDay1, tempDay2;
        int rainLevelDay1, rainLevelDay2;
        int humidityDay1, humidityDay2;
        double day1Score, day2Score;
        int tempScore, rainLevelScore, humidityScore;

        // Temperature (℃)
        //         15-25   <15 	>25
        // Score	3	    2	 1

        // Rain (mm)
        //        0 - 3	  4 - 8	  9 +
        // Score	3	    2	   1

        // Humidity (%)
        //          0 - 45	46 - 60	   61 +
        // Score	   3	   2	     1

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
        tempDay1 = scnr.nextDouble();
        rainLevelDay1 = scnr.nextInt();
        humidityDay1 = scnr.nextInt();

        System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
        tempDay2 = scnr.nextDouble();
        rainLevelDay2 = scnr.nextInt();
        humidityDay2 = scnr.nextInt();

        // Day 1 Temperature Checker
        if(Math.abs(tempDay1) >= 15 && Math.abs(tempDay1) <= 25){
            tempScore = 3;
        }else if (Math.abs(tempDay1) < 15){
            tempScore = 2;
        }else{
            tempScore = 1;
        }

        // Day 1 Rain Level Checker
        if(rainLevelDay1 >= 0 && rainLevelDay1 <= 3){
            rainLevelScore = 3;
        }else if(rainLevelDay1 >= 4 && rainLevelDay1 <= 8){
            rainLevelScore = 2;
        }else{
            rainLevelScore = 1;
        }

        // Day 1 Humidity Checker
        if(humidityDay1 >= 0 && humidityDay1 <= 45){
            humidityScore = 3;
        }else if(humidityDay1 >= 46 && humidityDay1 <= 60){
            humidityScore = 2;
        }else{
            humidityScore = 1;
        }

        day1Score = (tempScore * 3) + (rainLevelScore * 2) + (humidityScore);

        // Day 2 Temperature Checker
        if(Math.abs(tempDay2) >= 15 && Math.abs(tempDay2) <= 25){
            tempScore = 3;
        }else if (Math.abs(tempDay2) < 15){
            tempScore = 2;
        }else{
            tempScore = 1;
        }

        // Day 1 Rain Level Checker
        if(rainLevelDay2 >= 0 && rainLevelDay2 <= 3){
            rainLevelScore = 3;
        }else if(rainLevelDay2 >= 4 && rainLevelDay2 <= 8){
            rainLevelScore = 2;
        }else{
            rainLevelScore = 1;
        }

        // Day 1 Humidity Checker
        if(humidityDay2 >= 0 && humidityDay2 <= 45){
            humidityScore = 3;
        }else if(humidityDay2 >= 46 && humidityDay2 <= 60){
            humidityScore = 2;
        }else{
            humidityScore = 1;
        }

        day2Score = (tempScore * 3) + (rainLevelScore * 2) + (humidityScore);

        System.out.printf("\nOutcome score day 1: %.1f\n",day1Score);
        System.out.printf("Outcome score day 2: %.1f\n",day2Score);
        if (day1Score > day2Score){
            System.out.println("The best day to hold your event is: Day 1");
        }else if (day1Score == day2Score){
            System.out.println("The best day to hold your event is: Day 1 or Day 2");
        }else{
            System.out.println("The best day to hold your event is: Day 2");
        }
    }
}
