import java.util.Scanner;
public class PhoneNumber{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        long landPhoneNumber;
        long tempNumber;
        long lastThree;
        long firstThree;
        long prefixNumber;

        System.out.println("Please enter the landline phone number:");
        landPhoneNumber = scnr.nextLong();

        System.out.println("Please enter the mobile phone number:");
        phoneNumber = scnr.nextLong();

        tempNumber = landPhoneNumber;

        lastThree = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        firstThree = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        prefixNumber = tempNumber % 10000;
        tempNumber   = tempNumber / 10000;

        System.out.println("Your landline number: +61 " + prefixNumber + " " + firstThree + " " + lastThree);

        tempNumber = phoneNumber;

        lastThree = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        firstThree = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        prefixNumber = tempNumber % 1000;
        tempNumber   = tempNumber / 1000;

        System.out.println("Your phone number: 0" + prefixNumber + " " + firstThree + " " + lastThree);

    }
}