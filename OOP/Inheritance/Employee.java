import java.math.BigDecimal;

public class Employee extends Person {
  private String title = "Games";
  private String employer = "Maze Puzzle";
  private String employeeGrade = "Superior";
  private BigDecimal salary = new BigDecimal("96");

  public String toString() {
    return String.format("%sEmployee\nTitle: %s\nEmployer: %s\nGrade: %s"
            ,super.toString(), title, employer, employeeGrade);
  }
}