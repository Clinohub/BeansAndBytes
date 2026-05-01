import java.util.Arrays;

public class DaysOfWeekArray {

    public static void main(String[] args) {
        DaysOfWeekArray daysOfWeekArray = new DaysOfWeekArray();

        String[] arrayOfDaysOfTheWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String longestString = daysOfWeekArray.daysOfWeek(arrayOfDaysOfTheWeek);
        System.out.println(longestString);

        String daysOfWeekBackwards = Arrays.toString(daysOfWeekArray.daysOfWeekReverse(arrayOfDaysOfTheWeek));
        System.out.println(daysOfWeekBackwards);
    }
}