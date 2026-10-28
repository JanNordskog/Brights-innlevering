package seksjon5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Resturant bill:");
        String price = scanner.next();

        System.out.print("Persons:");
        String persons = scanner.next();


        int ppp = Integer.parseInt(price)/Integer.parseInt(persons);

        System.out.println("The price per person is:" + ppp );
    }
}
