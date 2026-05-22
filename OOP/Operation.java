public interface Operation {
  int perform (int number1, int number2);

  public class Add implements Operation {
    public int perform (int number1, int number2) {
      return number1 + number2;
    }
  }

  public class Subtract implements Operation {
    public int perform (int number1, int number2) {
      return number1 - number2;
    }
  }

  public class Divide implements Operation {
    public int perform (int number1, int number2) {
      if (number2 == 0) {
        return -1;
      }
      
      return number1 / number2;
    }
  }

  public static void main(String[] args) {
    Add adder = new Add();
    Subtract subtractor = new Subtract();
    Divide divider = new Divide();

    int actual = adder.perform(5, 3);
    System.out.println(actual);

    actual = subtractor.perform(5, 3);
    System.out.println(actual);

    actual = divider.perform(10, 2);
    System.out.println(actual);

    actual = divider.perform(10, 0);
    System.out.println(actual);
  }
}