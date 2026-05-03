import java.util.Arrays;

public class ArrayMagic {
    
    /**
     * This checks if element of array is greater than an input number.
     * 
     * @param array integer array
     * @param number integer number
     * @return true if any element of array is greater otherwise false
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        if (array.length == 0) {
            return false;
        }

        for (int element: array) {
            if (element > number) {
                return true;
            }
        }

        return false;
    }


        /**
     * This checks for second largest element in an array.
     * 
     * @param array integer array
     * 
     * @return the second largest element in that array otherwise -1 or if array has less than 2 unique elements
     */
    public int findSecondLargestElement(int[] array) {
        if (array.length < 2) {
            return -1;
        }

        Arrays.sort(array);
        int max = array[0];
        int secondMax = max;

        for (int element: array) {
            if (element > max) {
                secondMax = max;
                max = element;
            }
        }

        if (max == secondMax) {
            return -1;
        }

        return secondMax;
    }


    public static void main(String[] args) {
        int[] arrayNumbers =  {Integer.MAX_VALUE, Integer.MIN_VALUE};

        ArrayMagic arrayMagic = new ArrayMagic();
        boolean actual = arrayMagic.doesHaveElementGreaterThan(arrayNumbers, -3);
        System.out.println(actual);

        int yeah = arrayMagic.findSecondLargestElement(arrayNumbers);
        System.out.println(yeah);
    }
}
