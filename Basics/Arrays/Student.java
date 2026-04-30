import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] listOfMarks;

    public Student(String name, int[] listOfMarks) {
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfMarks() {
        return Array.getLength(listOfMarks);
        //return listOfMarks.length;
    }

    public int getTotalSumOfMarks() {
        int sumOfMarks = 0;
        for (int mark:listOfMarks) {
            sumOfMarks += mark;
        }

        return sumOfMarks;
    }

    public int getMaximumMark() {
        int max = listOfMarks[0];
        for (int mark: listOfMarks){
            if (mark > max) {
                max = mark;
            }
        }

        return max;
    }

    public int getMinimumMark() {
        int min = listOfMarks[0];
        for (int mark: listOfMarks){
            if (mark < min) {
                min = mark;
            }
        }

        return min;
    }

    public BigDecimal getAverageMarks() {
        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 2, RoundingMode.UP);
    }

    public static void main(String[] args) {
        int [] marks = {70,60,49,88,76,57,98,36};

        Student student = new Student("Victor", marks);
        System.out.println("Student Name: " + student.getName());
        System.out.println();

        int number = student.getNumberOfMarks();
        System.out.println("Number of Marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of Marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum Mark: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum Mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average Marks: " + average);
    }
}