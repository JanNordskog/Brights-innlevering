package sprint1;

import java.util.Scanner;

public class CodingChallenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SECONDS_PER_MINUTE = 60;
        final int SECONDS_PER_HOUR = 60 * SECONDS_PER_MINUTE;
        final int SECONDS_PER_DAY = 24 * SECONDS_PER_HOUR;
        final int SECONDS_PER_YEAR = 365 * SECONDS_PER_DAY;

        System.out.print("seconds available? ");
        long totalSeconds = scanner.nextLong();

        long years = totalSeconds / SECONDS_PER_YEAR;
        long days = totalSeconds % SECONDS_PER_YEAR / SECONDS_PER_DAY;
        long hours = totalSeconds % SECONDS_PER_DAY / SECONDS_PER_HOUR;
        long minutes = totalSeconds % SECONDS_PER_HOUR / SECONDS_PER_MINUTE;
        long seconds = totalSeconds % SECONDS_PER_MINUTE;

        System.out.println(years + " years and " + days + " days and " + hours + " hours and "
                + minutes + " minutes and " + seconds + " seconds");
    }
}
