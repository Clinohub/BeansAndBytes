import java.util.Arrays;

public class DaysOfWeekArray {
    String[] daysOfWeek;

    public DaysOfWeekArray(String... daysOfWeekArray) {
        this.daysOfWeek = daysOfWeekArray;
    }


    String[] getDays() {
        return this.daysOfWeek;
    }

 
    String daysOfWeek() {
        String day = getDays()[0];
        for (String dayOfWeek: getDays()) {
            if (dayOfWeek.length() > day.length()) {
                day = dayOfWeek;
            }
        }
        
        return day;
    }


    String[] daysOfWeekReverse() {
        int j = getDays().length;
        String dayReverse[] = new String[j];

        for (int i = 0; i < getDays().length; i++) {
            dayReverse[i] = getDays()[--j]; 
        }

        return dayReverse;
    }

    public static void main(String[] args) {
        String[] arrayOfDaysOfTheWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        DaysOfWeekArray daysOfWeekArray = new DaysOfWeekArray(arrayOfDaysOfTheWeek);

        String longestString = daysOfWeekArray.daysOfWeek();
        System.out.println(longestString);

        String daysOfWeekBackwards = Arrays.toString(daysOfWeekArray.daysOfWeekReverse());
        System.out.println(daysOfWeekBackwards);
    }
}