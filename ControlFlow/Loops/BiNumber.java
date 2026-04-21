public class BiNumber {

	private int number1;
	private int number2;

	/**
     * Initializes a new BiNumber with two numbers.
	 * 
     * @param number1 The first number.
     * @param number2 The second number.
     */
	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}


	/**
	 * Returns the first number.
	 * 
	 * @return the integer value of the first number
	 */
	public int getNumber1() {
		return this.number1;
	}


	/**
	 * Returns the second number.
	 * 
	 * @return the integer value of the first number
	 */
	public int getNumber2() {
		return this.number2;
	}


	/**
     * Calculates the LCM of two numbers.
	 * 
	 * <p>This method determines the Least Common Multiple of two number by calling
	 * {@link #getNumber1()} and {@link #getNumber2()}.</p>
	 * 
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 0.
     * 
     * @return LCM, or -1 if number is negative, or 0 if number is zero.
     */
	public int calculateLCM() {
		if (getNumber1() < 0 || getNumber2() < 0)
			return -1;

		if (getNumber1() == 0 || getNumber2() == 0)
			return 0;

		return getNumber1() * getNumber2() / calculateGCD();
	}


	/**
     * Calculates the GCD of two numbers.
	 * 
	 * <p>This method determines the Greatest Common Divisor of two number by calling
	 * {@link #getNumber1()} and {@link #getNumber2()}.</p>
	 * 
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 0.
     * 
     * @return GCD, or -1 if number is negative, or 0 if number is zero.
     */
	public int calculateGCD() {
		if (getNumber1() < 0 || getNumber2() < 0) {
            return -1;
        }

        if (getNumber1() == 0 || getNumber2() == 0) {
            return 0;
        }

        int temp = 0;
        int GCD = getNumber1();
        int remainder = getNumber2();

        while (remainder != 0) {
            temp = remainder;
            remainder = GCD % remainder;
            GCD = temp;
        }

        return GCD;
	}

	public static void main(String[] args) {
		BiNumber biNumber;

		// Normal Case
		biNumber = new BiNumber(15, 20);
		String biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		int actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(60, 0);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();

		biNumber = new BiNumber(37, 19);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);;

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(10, 10);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(1, 1);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(-14, 48);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();



		// Edge Case
		biNumber = new BiNumber(0, 0);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(-48, -60);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();


		biNumber = new BiNumber(0, -10);
		biNumbers = "Numbers: " + biNumber.getNumber1() +","+ biNumber.getNumber2();
		System.out.println(biNumbers);

		actual = biNumber.calculateGCD(); 
		System.out.println("GCD: " + actual);

		actual = biNumber.calculateLCM(); 
		System.out.println("LCM: " + actual);
		System.out.println();
	}
} 
