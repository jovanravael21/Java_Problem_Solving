import java.util.Scanner;

public class PhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the landline phone number:");
        String landline = scnr.nextLine();
        System.out.println("Please enter the mobile phone number:");
        String mobile = scnr.nextLine();

        // +61 425 409 960
        String landlineFormatted = "+61" + landline.charAt(2) + " " + landline.substring(3, 7) + " " + landline.substring(7);

        String mobileFormatted = mobile.substring(0, 4) + " " + mobile.substring(4, 7) + " " + mobile.substring(7);

        System.out.println("\nYour landline number is: " + landlineFormatted);
        System.out.println("Your mobile number is: " + mobileFormatted);
    }
}

