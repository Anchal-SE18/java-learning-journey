// Program to print Calendar 2026.

public class Calendar2026 {

    public static void main(String[] args) {

        int year = 2026;

        // Names of months
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        // Number of days in each month (2026 is NOT leap year)
        int[] daysInMonth = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // January 1, 2026 is Thursday (4)
        int startingDay = 4;

        // Print calendar for all months
        for (int i = 0; i < 12; i++) {

            System.out.println("\n\n------------ " + months[i] + " " + year + " ------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print spaces for the first day
            for (int j = 0; j < startingDay; j++) {
                System.out.print("    ");
            }

            // Print all days of the month
            for (int day = 1; day <= daysInMonth[i]; day++) {
                System.out.printf("%3d ", day);

                // Move to next line after Saturday
                if ((day + startingDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // Update starting day for next month
            startingDay = (startingDay + daysInMonth[i]) % 7;
        }
    }
}
