public class NumberUtils {

	public int getLastDigit(int number) {

		/**
         * This method takes an integer and returns its last digit.
         * If the number is negative, it returns -1.
         * If the number is zero, it returns 0.
         * @param number: an integer
         * @return last digit of number, or -1 if number is negative, or 0 if number is zero.
         */

		if (number < 0)
			return -1;

		return number % 10;
	}

	public static void main(String[] args) {
		NumberUtils numberUtils = new NumberUtils();

		//Test for getLastDigit(arg) method
		//Normal Cases
		int actual = numberUtils.getLastDigit(1234);
		System.out.println(actual);

		actual = numberUtils.getLastDigit(7);
		System.out.println(actual);

		actual = numberUtils.getLastDigit(84);
		System.out.println(actual);

		actual = numberUtils.getLastDigit(6389);
		System.out.println(actual);

		actual = numberUtils.getLastDigit(84127);
		System.out.println(actual);

		//Edge Cases
		actual = numberUtils.getLastDigit(-1234);
		System.out.println(actual);

		actual = numberUtils.getLastDigit(0);
		System.out.println(actual);
	}
} 
