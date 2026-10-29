package sprint1;

import java.util.Scanner;

public class CodingChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your initials:");
        String initials = scanner.next();

        System.out.print("Population in your country:");
        long country = scanner.nextLong();

        System.out.print("Population on earth:");
        long earth = scanner.nextLong();

        System.out.print("Enter weekday:");
        String weekday = scanner.next();

        System.out.print("Enter duration in weeks of the java course:");
        int duration = scanner.nextInt();

        double pi = 3.14159;


        System.out.println("Your intials is:"+ initials );
        System.out.println("Population in country" + country );
        System.out.println("Population on earth:"+ earth );
        System.out.println("Day of the week:"+weekday );
        System.out.println("Duration of the java course:"+duration);
        System.out.println("The mathematical numbers of PI:" + pi );

    }
}
