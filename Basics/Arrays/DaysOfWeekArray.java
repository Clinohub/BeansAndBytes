import java.util.Arrays;

public class DaysOfWeekArray {
 
    String daysOfWeek (String... daysOfWeek) {
        String day = daysOfWeek[0];
        for (String dayOfWeek: daysOfWeek) {
            if (dayOfWeek.length() > day.length()) {
                day = dayOfWeek;
            }
        }
        
        return day;
    }


    String[] daysOfWeekReverse (String... daysOfWeek) {
        int j = daysOfWeek.length;
        String dayReverse[] = new String[j];

        for (int i = 0; i < daysOfWeek.length; i++) {
            dayReverse[i] = daysOfWeek[--j]; 
        }

        return dayReverse;
    }

    public static void main(String[] args) {
        DaysOfWeekArray daysOfWeekArray = new DaysOfWeekArray();

        String[] arrayOfDaysOfTheWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String longestString = daysOfWeekArray.daysOfWeek(arrayOfDaysOfTheWeek);
        System.out.println(longestString);

        String daysOfWeekBackwards = Arrays.toString(daysOfWeekArray.daysOfWeekReverse(arrayOfDaysOfTheWeek));
        System.out.println(daysOfWeekBackwards);
    }
}