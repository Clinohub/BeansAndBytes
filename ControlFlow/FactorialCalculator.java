public class FactorialCalculator {

	public int calculateFactorial(int number) {
		int result = number;

		if (number < 0)
			return -1;
		else if (number == 0 || number == 1)
			return 1;
		else {
			for (int i = number - 1; i > 1; i--) {
				result *= i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FactorialCalculator factorialCalculator = new FactorialCalculator();

		int actual = factorialCalculator.calculateFactorial(0);
		System.out.println(actual);
		actual = factorialCalculator.calculateFactorial(1);
		System.out.println(actual);
		actual = factorialCalculator.calculateFactorial(2);
		System.out.println(actual);
		actual = factorialCalculator.calculateFactorial(5);
		System.out.println(actual);
		actual = factorialCalculator.calculateFactorial(-1);
		System.out.println(actual);
	}
} 
