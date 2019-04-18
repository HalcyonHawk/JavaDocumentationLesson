package bcu.harvardreferencing;

import java.util.Collections;
import java.util.List;

/**
 * Model a publication harvard reference.
 * <p>Creates a harvard style reference for a publication by formatting any authors
 * then displaying the results in the order needed for harvard referencing. This works by
 * storing the authors, title and year.</p>
 *
 * @author Andrew Kay
 */
public class Publication {
    private final List<Author> authors;
    private final String title;
    private final int year;

    /**
     *Adds a publication.
     * @param authors one or more authors for that publication
     * @param title title of the publication
     * @param year publication was published
     * @throws IllegalArgumentException throws error if no author entered
     */
    public Publication(List<Author> authors, String title, int year) {
        if(authors.isEmpty()) {
            throw new IllegalArgumentException("Empty authors list");
        }
        
        this.authors = authors;
        this.title = title;
        this.year = year;
    }

    /**
     * Returns a list of authors for the publication. This can be many authors or one.
     * @return list of authors
     */
    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    /**
     * Returns the title of the publication.
     * @return title of the publication
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns year publication was made.
     * @return year of publication
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a string in harvard reference format. This is done by listing the authors, then the year and title.
     * @return harvard reference string of the authors followed by the year and title
     */
    public String harvardReference() {
        return authorNames() + " (" + year + ") " + title + ".";
    }

    /**
     * Formats the list of authors.
     * @return authors name formatted for referencing
     */
    public String authorNames() {
        String nameString = "";
        
        int secondLast = authors.size() - 2;
        for(int i = 0; i < authors.size(); i++) {
            nameString += authors.get(i).fullName();
            if(i < secondLast) {
                nameString += ", ";
            } else if(i == secondLast) {
                nameString += " and ";
            }
        }
        
        return nameString;
    }
}
