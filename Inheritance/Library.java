class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println(title + " " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(name + " " + bio);
    }
}
public class Library {
    public static void main(String[] args) {
        Book book1 = new Author("Effective Java", 2008, "Joshua Bloch", "Java programming expert");
        Book book2 = new Author("Clean Code", 2008, "Robert C. Martin", "Software craftsmanship advocate");

        book1.displayInfo(); 
        book2.displayInfo(); 
    }
}