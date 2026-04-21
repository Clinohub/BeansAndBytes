public class PerfectNumberChecker {
	
	public boolean isPerfectNumber (int number) {

		int sumOfDivisors = 1;

		if (number <= 1)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				sumOfDivisors += i;
		}

		return number == sumOfDivisors;

	}

	public static void main(String[] args) {
		PerfectNumberChecker checker = new PerfectNumberChecker();

		// Test for positive perfect numbers
		boolean actual = checker.isPerfectNumber(6);
		System.out.println(actual);
		actual = checker.isPerfectNumber(28);
		System.out.println(actual);
                // Test for non-perfect numbers
		actual = checker.isPerfectNumber(27);
		System.out.println(actual);
		actual = checker.isPerfectNumber(100);
		System.out.println(actual);
		actual = checker.isPerfectNumber(0);
		System.out.println(actual);
		actual = checker.isPerfectNumber(-6);
		System.out.println(actual);
		// Edge test case
		actual = checker.isPerfectNumber(2);
		System.out.println(actual);
	}
}
