abstract class Shape {
  protected String name;
  
  // Constructor to initialize name of the shape
  public Shape(String name) {
    this.name = name;
  }

  // Abstract method to calculate area of the shape
  // To be implemented by subclasses
  public abstract double calculateArea();
}

class Circle extends Shape {
  private double radius;

  // Constructor to initialize name and radius of the circle
  public Circle(String name, double radius) {
    super(name); // Call parent class constructor to set name
    this.radius = radius;
  }
    
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle (String name, double length, double width) {
    super(name);
    this.width = width;
    this.length = length;
  }
    
  public double calculateArea() {
    return length * width;
  }
}

class ShapeRunner {
    public static void main(String[] args) {
      Circle circle = new Circle("Circle", 5.0);
      Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

      double actual = circle.calculateArea();
      System.out.printf("Area of circle: %.2f", actual).println();

      actual = rectangle.calculateArea();
      System.out.printf("Area of rectangle: %.2f", actual).println();
    }
}