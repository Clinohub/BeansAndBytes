public class TriangleValidator {

	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 > 0 && angle2 > 0 && angle3 > 0) 
			return (angle1 + angle2 + angle3) == 180;

		return false;
	}

	private boolean pythagoreanTheorem(int hyp, int opp, int adj) {
		return ((hyp*hyp) == (opp*opp + adj*adj));
	}

	public boolean isRightAngled(int side1, int side2, int side3) {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
			return false;

		if (pythagoreanTheorem(side1, side2, side3))
			;
		else if (pythagoreanTheorem(side2, side1, side3))
			;
		else if (pythagoreanTheorem(side3, side2, side1))
			;
		else
			return false;

		return true;
			
	}

	public static void main(String[] args) {
		TriangleValidator validator = new TriangleValidator();
		// normal case test
		boolean actual = validator.isValidTriangle(60, 60, 60);
		System.out.println(actual);
		// sum of angles is not 180
		actual = validator.isValidTriangle(90, 90, 90);
		System.out.println(actual);
		// one angle is 0
		actual = validator.isValidTriangle(0, 90, 90);
		System.out.println(actual);
		// one angle is negative
		actual = validator.isValidTriangle(-60, 120, 120);
		System.out.println(actual);
		// all angles are negative
		actual = validator.isValidTriangle(-60, -60, -60);
		System.out.println(actual);
		System.out.println();
		

		// Test case: right angled triangle
		actual = validator.isRightAngled(3,4,5);
		System.out.println(actual);
		// Test case: right angled triangle
		actual = validator.isRightAngled(5,12,13);
		System.out.println(actual);
		// Test case: right angled triangle
		actual = validator.isRightAngled(3,3,3);
		System.out.println(actual);
		// Test case: right angled triangle
		actual = validator.isRightAngled(-3,4,5);
		System.out.println(actual);
		// Test case: right angled triangle
		actual = validator.isRightAngled(0,4,5);
		System.out.println(actual);
	}
}
