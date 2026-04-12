public class Square {
	private int side;

	public Square(int side){
		if (side > 0) {
			this.side = side;
		} else {
			this.side = -1;
		}
	}

	public int calculateArea() {
		if (side > 0) {
			return side * side;
		} else {
			return -1;
		}
	}

	public int calculatePerimeter() {
		if (side > 0) {
			return 4 * side;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Square square = new Square(0);
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter());
	}

}
