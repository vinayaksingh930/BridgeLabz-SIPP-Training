abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

public class Library {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(1, "Java Programming", "Author Prachi");
        LibraryItem item2 = new Magazine(2, "Ai/ML", "Author Vinayak");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");
    }
}