import java.util.Arrays;

public class AnimalRunner {
  public static void main(String[] args) {
    Animal[] animals = new Animal[] {new Cat(), new Dog()};

    for (Animal animal: animals ) {
      animal.bark();
    }
  }
}