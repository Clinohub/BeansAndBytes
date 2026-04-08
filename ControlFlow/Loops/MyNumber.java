public class MyNumber {

	private int number;

	public MyNumber(int number) {
		if (number >= 0)
			this.number = number;
	}

	int getMyNumber() {
		return number;
	}

	boolean isPrime() {
		if (number < 2)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	int sumUptoN() {
		int sumUptoN = 0;

		for (int i = 0; i < number; i++)
			sumUptoN += i;

		return sumUptoN;
	}

	int sumOfDivisors() {
		int sumOfDivisors = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sumOfDivisors += i;
				if ( i == (number / i))
					sumOfDivisors += i;
			}
		}

		return sumOfDivisors; 	
	}

	void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
	}
	}
	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		int sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding "+ number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();

		System.out.print("\n");
		number = new MyNumber(37);
		isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding " + number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();

		System.out.print("\n");
		number = new MyNumber(25);
		isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding "+ number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();

		System.out.print("\n");
		number = new MyNumber(11);
		isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding "+ number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();

		System.out.print("\n");
		number = new MyNumber(0);
		isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding "+ number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();
		
		System.out.print("\n");
		number = new MyNumber(-6);
		isPrime = number.isPrime();
		System.out.println("My Number: "+ number.getMyNumber());
		System.out.print("\n");
		System.out.println("isPrime "+ isPrime);
		System.out.print("\n");
		sum = number.sumUptoN();
		System.out.println("Sum of values upto but excluding "+ number.getMyNumber()+ ": " + sum);
		System.out.print("\n");
		sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of its divisors: " + sumOfDivisors);
		System.out.print("\n");
		number.printANumberTriangle();
	}
}
