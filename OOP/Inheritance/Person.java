public class Person extends Object {
  private String name = "Twiga Stationers";
  private String phone = "+254 7095600000";
  private String email = "twiga@kasuku.co.ke";

  public String toString() {
    return String.format("Person\nName: %s\nPhone: %s\nEmail: %s\n",
          name, phone, email);
  }
}