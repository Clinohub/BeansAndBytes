//Defining a Point class to represent a point in 2-dimensional space
public class Point {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        this.x = getX() + dx;
        this.y = getY() + dy;
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        // Your code here
        int xDifference = getX() - other.getX();
        int yDifference = getY() - other.getY();
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    public static void main(String[] args) {
        //Point p1 = new Point(3, 4);
        //Point p2 = new Point(6, 8);
        Point p3 = new Point(0,0);
        Point p4 = new Point(-3,-4);

        //p1.move(0, 0);  // After this move, the point p1 should be at (4, 5)
        //System.out.println(p1.getX());
        //System.out.println(p1.getY());

        double distance = p3.distanceTo(p4);  // The distance from p1 to p2 should be sqrt((6-4)^2 + (8-5)^2) = sqrt(4+9) = sqrt(13) ≈ 3.60555
        System.out.println(distance);

    }
}