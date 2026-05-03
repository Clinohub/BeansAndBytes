public class BiArray {

    /**
     *  This method calculates the sum of the elements in the provided array
     * 
     * @param array integer array
     * @return the sum of array elements
     */
    public int calculateSum(int[] array) {
        int sum = 0;

        for (int element: array) {
            sum += element;
        }

        return sum;
    }

    
    /**
     * Compares the sum of two integer arrays
     * 
     * <p>This method calcualtes the sum of array1 and array2 by calling
     * {@link #calculateSum(int[])}.</p>
     * 
     * if the sums are equal, it returns true
     * if the sums are not equal, it returns false
     * 
     * @param array1 integer array
     * @param array2 integer array
     * @return true if they are equal, and false otherwise.
     */
    public boolean areSumsEqual(int[] array1, int[] array2) {
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        if (sum1 == sum2) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5, 6};
        int[] _array = {21};
        BiArray biArray = new BiArray();

        int summyarray = biArray.calculateSum(myarray);
        int sum_array = biArray.calculateSum(_array);
        System.out.print(summyarray);
        System.out.print('-');
        System.out.println(sum_array);

        boolean actual = biArray.areSumsEqual(myarray, _array);
        System.out.println(actual);
    }
}
