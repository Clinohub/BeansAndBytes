import java.util.Scanner;

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


    public static void main(String[] args) {
        int[] arrayNumbers =  {-1,-2,-3,-4,-5};

        ArrayMagic arrayMagic = new ArrayMagic();
        boolean actual = arrayMagic.doesHaveElementGreaterThan(arrayNumbers, -3);
        System.out.println(actual);
    }
}
