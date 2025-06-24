public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}