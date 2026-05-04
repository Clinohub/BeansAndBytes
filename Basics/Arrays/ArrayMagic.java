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

        int max = array[0];
        int secondMax = array[1];

        for (int element: array) {
            if (element > max) {
                secondMax = max;
                max = element;
            }

            if (element < secondMax && secondMax == max) {
                secondMax = element;
            }
                

            if (element > secondMax && element != max) {
                secondMax = element;
            }

        }

        if (max == secondMax) {
            return -1;
        }

        return secondMax;
    }


    /**
     * Method checks if an array is sorted and
     * 
     * returns true if sorted or is empty
     * otherwise false
     * 
     * @param array
     * @return boolean
     */
    public boolean isSorted(int[] array) {
        if (array.length <= 1) {
            return true;
        }

        int max = array[0];
        for (int element: array) {
            if (element >= max) {
                max = element;
            }
            else {
                return false;
            }
        }
        return true;
    }


    /**
     * Reverses an array
     * 
     * The method takes an array of integer and return
     * an integer array that holds element in reverse order
     * 
     * if array is empty return empty array
     * 
     * @param array integer array
     * @return integer array
     */
    public int[] reverseArray(int[] array) {
        int end = array.length -1;

        int[] reversedArray = new int[array.length];
        for (int start = 0; start <= end; start++,end--) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
        }

        return reversedArray;
    }


    public static void main(String[] args) {
        int[] arrayNumbers =  {1000000, 2000000, 3000000};

        ArrayMagic arrayMagic = new ArrayMagic();
        boolean actual = arrayMagic.doesHaveElementGreaterThan(arrayNumbers, 3);
        System.out.println("Has greater than " + 3 + ": " + actual);

        int yeah = arrayMagic.findSecondLargestElement(arrayNumbers);
        System.out.println("Second Largest: " + yeah);

        boolean arraySort = arrayMagic.isSorted(arrayNumbers);
        System.out.println("Sorted: " + arraySort);

        int[] reverse = arrayMagic.reverseArray(arrayNumbers);
        System.out.println("Reversed Array: " + Arrays.toString(reverse));
    }
}
