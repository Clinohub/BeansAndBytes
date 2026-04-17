public class LeapYearChecker {
	public boolean isLeapYear(int year) {
		if (year < 1)
			return false;

		if (year % 4 != 0)
			return false;

		if (year % 100 != 0)
			return true;

		if (year % 400 == 0)
			return true;

		return false;
	}

	public static void main(String[] args) {
		LeapYearChecker leapYearChecker = new LeapYearChecker();
		// Normal cases
		boolean actual = leapYearChecker.isLeapYear(2000);
		System.out.println(actual);
		actual = leapYearChecker.isLeapYear(2004);
		System.out.println(actual);
		actual = leapYearChecker.isLeapYear(2400);
		System.out.println(actual);
		actual = leapYearChecker.isLeapYear(2001);
		System.out.println(actual);
		actual = leapYearChecker.isLeapYear(1900);
		System.out.println(actual);
		// Edge cases
		actual = leapYearChecker.isLeapYear(-1);
		System.out.println(actual);
		actual = leapYearChecker.isLeapYear(0);
		System.out.println(actual);
	}
}
