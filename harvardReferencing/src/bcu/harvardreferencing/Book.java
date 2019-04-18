package bcu.harvardreferencing;

import java.util.List;

/**
 * Model of a book harvard reference.
 * <p>Stores values that only a book has as well as details that all publications have.</p>
 *
 * @author Andrew Kay
 */
public class Book extends Publication {
    private final String publisher;

    /**
     * Constructor to make a model of a book using the publisher class.
     * @param authors authors of the book
     * @param title title of the book
     * @param year year the book was published
     * @param publisher publisher of the book
     */
    public Book(
        List<Author> authors, String title, int year,
        String publisher
    ) {
        super(authors, title, year);
        this.publisher = publisher;
    }

    /**
     * Returns the publisher of the book being referenced.
     * @return publisher of the book
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Creates a harvard style reference for a book.
     * Uses the reference format from publication, then adds the format for a book.
     * @return reference of the book
     */
    @Override
    public String harvardReference() {
        return super.harvardReference() + " " + publisher + ".";
    }
}
