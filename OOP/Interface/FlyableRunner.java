import java.util.Arrays;

public class FlyableRunner {
  public static void main(String[] args) {
    Flyable[] flyingObjects = new Flyable[] {new Bird(), new Aeroplane()};

    for (Flyable flyingObject: flyingObjects) {
      flyingObject.fly();
    }
  }
}