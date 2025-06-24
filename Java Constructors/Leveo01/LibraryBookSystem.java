public class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
        }
    }
}