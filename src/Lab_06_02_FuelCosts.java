import java.util.Random;
import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {

        double gallonsIn = 0;
        double fuelEfficiency=0;
        double priceOfGas=0;
        int SET_MILES=100;
        double totalMiles;
        double totalCost;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("How many gallons of gas are in your gas tank?");
        if (in.hasNextDouble()) {
            gallonsIn = in.nextDouble();
            in.nextLine();

            System.out.println("What is the fuel efficiency of your vehicle?");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid number. Please try again.");
                System.exit(0);
            }

            System.out.println("What is the price of gas?");
            if (in.hasNextDouble()) {
                priceOfGas = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid number. Please try again.");
                System.exit(0);
            }

            totalMiles= gallonsIn*fuelEfficiency;

            totalCost= (SET_MILES/fuelEfficiency)*priceOfGas;

            System.out.printf("The price per 100 miles is %.2f dollars %n",totalCost);
            System.out.println("The car can go " + totalMiles + " miles with the gas currently in the tank");

        }else {
            trash = in.nextLine();
            System.out.println("You entered an invalid number. Please try again.");
            System.exit(0);
        }
    }
}

