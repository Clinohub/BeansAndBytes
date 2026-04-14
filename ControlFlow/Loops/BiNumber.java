public class BiNumber {

	/**
        * Constructor that initializes the two numbers.
     	* @param number1: The first number.
     	* @param number2: The second number.
     	*/

	private int number1;
	private int number2;

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int calculateLCM() {
		if (number1 < 0 || number2 < 0)
			return -1;

		if (number1 == 0 || number2 == 0)
			return 0;

		int LCM = number1;
		int max = number1;
		if (LCM < number2) {
			LCM = number2;
			max = number2;
		}

		while (!(LCM % number1 == 0 && LCM % number2 == 0)) {
			LCM += max;
		}

		return LCM;
	}

	public static void main(String[] args) {
		BiNumber biNumber;

		// Test for LCM
		biNumber = new BiNumber(15, 20); // 60
		int actual = biNumber.calculateLCM(); 
		System.out.println(actual);
		
		biNumber = new BiNumber(0, 20); // 0
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(-15, 20); // -1
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(10, 10); // 10
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(9, 6); // 18
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(-10, -20); // -1
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(0, 0); // 0
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(10, -20); // -1
                actual = biNumber.calculateLCM();
		System.out.println(actual);
		
		biNumber = new BiNumber(0, 10); // 0
                actual = biNumber.calculateLCM();
		System.out.println(actual);
	}
} 
