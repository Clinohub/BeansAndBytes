import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    public Student(String name, int... listOfMarks) {
        this.name = name;

        for (int mark: listOfMarks)
            this.listOfMarks.add(mark);
    }

    public String toString() {
        return name + "-" + listOfMarks;
    }


    public void addNewMark(int mark) {
        listOfMarks.add(mark);
    }


    public void removeMarkAtIndex(int index) {
        listOfMarks.remove(index);
    }

    public int getNumberOfMarks() {
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {
        int sumOfMarks = 0;
        for (int mark:listOfMarks) {
            sumOfMarks += mark;
        }

        return sumOfMarks;
    }

    public int getMaximumMark() {
        int max = listOfMarks.getFirst();
        for (int mark: listOfMarks){
            if (mark > max) {
                max = mark;
            }
        }

        return max;
    }

    public int getMinimumMark() {
        int min = listOfMarks.getFirst();
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

        Student student = new Student("Victor", 70,60,49,88,76,57,98,36);
        System.out.println("Student Name: " + student);
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

        student.addNewMark(100);
        System.out.println("Student Name: " + student);
        System.out.println();

        student.removeMarkAtIndex(1);
        System.out.println("Student Name: " + student);
        System.out.println();
    }
}