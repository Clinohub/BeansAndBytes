import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

    /**
     * This method takes two integer arguments, calculates the multiples 
     * of a number upto a limit specified and return a list 
     * of a given number with values less than a specified limit.
     * 
     * If number or limit is less than or eual to 0, it returns empty string
     * 
     * @param number The number to find multiples of.
     * @param limit The upper bound for the multiples
     * @return list
     */
    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> list = new ArrayList<>();

        if (number <= 0 || limit <= 0) {
            return list;
        }

        int multiple = number;
        for (int i = 2; multiple < limit; i++) {
            list.addLast(multiple);
            multiple = number * i;
        }
        return list;
    }


    public static void main(String[] args) {
        NumberMagic numberMagic = new NumberMagic();

        int multipleNumber = 1;
        int upper = 10;
        List<Integer> multipleList = numberMagic.determineMultiples(multipleNumber, upper);
        System.out.println(multipleList);
    }
}
