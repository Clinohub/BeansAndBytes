public class Fan {

  private String make;
  private double radius;
  private String color;
  private boolean isOn = false;
  private String status = "Off";
  private byte speed = 0; // levels 0 - 5

  public Fan(String make, double radius, String color) {
    this.make = make;
    this.radius = radius;
    this.color = color;
  }

  public String toString() {
    return String.format(
      "Manufacturer: %s\nRadius: %.2f\nColour: %s\nStatus: %s\nSpeed: %d",
      make, radius, color, status, speed
    );
  }

  void switchOn() {
    if (isOn == false) {
      isOn = true;
      status = "On";
      speed = ((byte)1);
    }
  }

  void switchOff() {
    if (isOn == true) {
      isOn = false;
      status = "Off";
      speed = ((byte)0);
    }
  }

  void changeSpeed() {
    if (!(speed >= 5)) {
      speed += ((byte)1);
    }
  }

  public static void main(String[] args) {

    Fan fan = new Fan("Ramtons", 3.14, "grey");

    System.out.println(fan);
    System.out.println();

    fan.switchOn();

    System.out.println(fan);
    System.out.println();

    fan.changeSpeed();

    System.out.println(fan);
    System.out.println();
    
  }
}