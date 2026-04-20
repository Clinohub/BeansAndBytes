public class NumberUtils {

	private int number;
	
	/**
	 * Constructs a new NumberUtils with a number.
	 * 
	 * <p>This constructor initializes the internal state needed for
	 * subsequent calculations.</p>
	 * 
	 * @param number integer number
	 */
	public NumberUtils (int number) {
		this.number = number;
	}


	/**
	 * Returns the number used for internal calculations.
	 * 
	 * @return the integer value of the number
	 */
	public int getNumber() {
		return this.number;
	}


	/**
     * Calculates the last digit of a number.
	 * 
	 * <p>This method retrieves the last digit of a number by calling
	 * {@link #getNumber()}.</p>
	 * 
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 0.
     * 
     * @return last digit of number, or -1 if number is negative, or 0 if number is zero.
     */
	public int getLastDigit() {
		if (getNumber() < 0)
			return -1;
		return getNumber() % 10;
	}

	/**
	 * Calculates the number of digits in a number.
	 * 
     * <p>This method determines the number of digits in a given integer by calling 
	 * {@link #getNumber()}.</p>
	 * 
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
	 * 
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
	public int getNumberOfDigits() {
		if (getNumber() < 0)
		    return -1;

	    int numberOfDigits = 0;
		int digits = getNumber();

	    do {
		    digits /= 10;
		    numberOfDigits++;
	    } while (digits != 0);

	    return numberOfDigits;
    }


	/**
     * This method calculates the sum of digits in a given integer.
	 * 
	 * <p>This method computes the sum of digits in a given integer by calling 
	 * {@link #getNumber()}.</p>
	 * 
     * If the number is negative, it returns -1 as the sum of digits for a negative number is undefined.
     * If the number is zero, it returns 0 as the sum of digits of 0 is 0.
     *
     * @return sum of digits in number, or -1 if number is negative, or 0 if number is zero.
     */
	public int getSumOfDigits() {
		if (getNumber() < 0)
			return -1;

		int sumOfDigits = 0;
		int integerNumber = getNumber();

		do {
			sumOfDigits += (integerNumber % 10);
			integerNumber /= 10;
		} while (integerNumber != 0);

		return sumOfDigits;
	}


	/**
     * This method reverses a given integer.
	 * 
	 * <p>This method calculates the reverse of a number by calling
	 * {@link #getNumber()}.</p>
	 * 
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * 
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
	public int reverseNumber () {
		if (getNumber() < 0)
			return -1;

		int reversedNumber = 0;
		int integerNumber = getNumber();

		do {
			reversedNumber *= 10;
			reversedNumber += (integerNumber % 10);
			integerNumber /= 10;
		} while (integerNumber != 0);

		return reversedNumber;
	}

	public static void main(String[] args) {
		NumberUtils numberUtils;

		// Normal Cases
		numberUtils = new NumberUtils(1234);
		System.out.println("Number: " + numberUtils.getNumber());

		int actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(7);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(-1);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(100000);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(55555);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();



		//Edge Cases
		numberUtils = new NumberUtils(-1234);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(0);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();


		numberUtils = new NumberUtils(987654321);
		System.out.println("Number: " + numberUtils.getNumber());

		actual = numberUtils.getLastDigit();
		System.out.println("Last Digit: " + actual);

		actual = numberUtils.getNumberOfDigits();
	    System.out.println("Number of Digits: " + actual);

		actual = numberUtils.getSumOfDigits();
		System.out.println("Sum of digits: " + actual);

		actual = numberUtils.reverseNumber();
		System.out.println("Reverse number: " + actual);
		System.out.println();
	}
} 
