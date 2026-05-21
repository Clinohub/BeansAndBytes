import java.util.ArrayList;

public class Book {
  // states
  private int id;
  private String name;
  private String author;
  private ArrayList<Review> reviews = new ArrayList<>();
  
  // constructor
  public Book(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public String toString() {
    return String.format("Book Name: %s\nID: %d\nAuthor: %s\nReview:\n%s",
        name, id, author, reviews);
  }

  public void addReview(Review review) {
    this.reviews.add(review);
  }
}