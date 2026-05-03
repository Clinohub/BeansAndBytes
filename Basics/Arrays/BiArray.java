public class BiArray {

    private int[] array1;
    private int[] array2;

    /**
     * Initializes a new BiArray with two integer arrays.
     * 
     * @param array1
     * @param array2
     */
    public BiArray (int[] array1, int... array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    /**
     *  This method calculates the sum of the elements in the provided array
     * 
     * @param array integer array
     * @return the sum of array elements
     */
    private int calculateSum(int[] array) {
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
    public boolean areSumsEqual() {
        int sum1 = this.calculateSum(array1);
        int sum2 = this.calculateSum(array2);

        if (sum1 == sum2) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5, 6};
        int[] _array = {21};

        BiArray biArray = new BiArray(myarray, _array);

        boolean actual = biArray.areSumsEqual();
        System.out.println(actual);
    }
}
