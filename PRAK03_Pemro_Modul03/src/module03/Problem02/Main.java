package module03.Problem02;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfCountries = Integer.parseInt(input.nextLine());

        LinkedList<Country> countries = new LinkedList<>();
        for (int i = 0; i < numberOfCountries; i++) {

            String countryName = input.nextLine();
            String leadershipType = input.nextLine();
            String leaderName = input.nextLine();

            if (leadershipType.equals("monarki")) {
                countries.add(new Country(countryName, leadershipType, leaderName));
                continue;
            }

            int date = Integer.parseInt(input.nextLine());
            int month = Integer.parseInt(input.nextLine());
            int year = Integer.parseInt(input.nextLine());

            countries.add(new Country(countryName, leadershipType, leaderName, date, month, year));
        }

        for (Country country : countries) {
            System.out.println();
            country.printInfo();
        }
    }
}