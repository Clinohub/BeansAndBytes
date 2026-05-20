public class Rectangle {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public long area() {
    return (long)length * width;
  }

  public long perimeter() {
    return ((long)length + width) * 2;
  }

  
  public static void main(String[] args) {

    int maxi = 2_147_483_647;
    Rectangle rectangle = new Rectangle(maxi, maxi);

    System.out.println("Area: "+ rectangle.area());

    System.out.println("Perimeter: "+ rectangle.perimeter());
    
  }
}