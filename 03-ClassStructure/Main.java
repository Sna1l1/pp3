
import java.text.DateFormatSymbols;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket(4, 24, 2.5);     
        CinemaTicket t2 = new CinemaTicket(2, 55, 5.0);
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        // System.out.println(MyCalendar.monthName());
    }

    public class MathClass {
        static void Main() {
            System.out.println("The larger of two numbers: 34 and 49 is " + Math.max(34, 49));
            System.out.println("PI number is " + Math.PI);
            System.out.println("Absolute value of -17 is " + Math.abs(-17));
            System.out.println("Square root of the expression: nine divided by two is " + Math.sqrt(9.0 / 2.0));
            System.out.println("Random number in the range <0.0,1.0) is " + Math.random());
            System.out.println("Integer random number in the range <0,10> is " + (int) (Math.random() * 11));
            System.out.println("Sin of 90 degrees is " + Math.sin(Math.toRadians(90)));

        }
    }

    public class MyCalendar {
        static int year = 2023;
        static int month = 4;
        static int day = 9;

        /*
         * Returns date
         * in the form yyyy-mm-dd
         */
        static String myDate() {
            LocalDate myDate = LocalDate.of(year, month, day);
            return myDate.toString();
        }

        /*
         * Returns the number of days
         * from the beginning of year
         */

        static long days() {
            // Date d1 = new GregorianCalendar(year, 1, 1).getTime();
            // Date d2 = new GregorianCalendar(year, month, day).getTime();
            LocalDate d1 = LocalDate.of(year, 1, 1);
            LocalDate d2 = LocalDate.of(year, month, day);
            Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
            long diffDays = diff.toDays();

            // long difference = d2.getTime() - d1.getTime();

            // long difference_In_Days
            // = (difference
            // / (1000 * 60 * 60 * 24))
            // % 365;
            return diffDays;
        }

        static String monthName() {
            return new DateFormatSymbols(Locale.US).getMonths()[month - 1];
        }

        /*
         * Returns month name
         */
    }
}
