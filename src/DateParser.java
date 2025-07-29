import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        while (true) {
            input = scnr.nextLine();

            if (input.equals("-1")) {
                break;
            }

            if (input.contains(",")) {
                // Split the input: e.g., "March 1, 1990"
                int spaceIdx = input.indexOf(" ");
                int commaIdx = input.indexOf(",");

                String monthString = input.substring(0, spaceIdx);
                String dayString = input.substring(spaceIdx + 1, commaIdx);
                String yearString = input.substring(commaIdx + 2); // skip comma and space

                int month = getMonthAsInt(monthString);
                if (month > 0) {
                    System.out.println(month + "-" + dayString + "-" + yearString);
                }
            }
        }
    }
}

