package sprint1;

import java.util.Scanner;

public class CodingChallenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cityname:");
        String name = scanner.nextLine();

        System.out.print("Capital? (Yes/No):");
        boolean isCapital = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Number of inhabitants:");
        int numberOfInhabitants = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Tax revenue per inhabitant:");
        double taxRevenuePerInhibitant = Double.parseDouble(scanner.nextLine().trim());

        double annualTaxIncome = numberOfInhabitants * taxRevenuePerInhibitant;

        boolean isMetropolis = (isCapital && numberOfInhabitants > 100_000)
                || (numberOfInhabitants > 200_000 && annualTaxIncome >= 1_000_000_000);

        if (isMetropolis) {
            System.out.println(name + " is a metropolis.");
        } else {
            System.out.println(name + " is not a metropolis.");
        }
    }
}
