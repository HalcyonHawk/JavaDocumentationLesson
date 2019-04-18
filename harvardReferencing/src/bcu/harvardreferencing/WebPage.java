package bcu.harvardreferencing;

import java.util.List;

/**
 * Model of a web page harvard reference.
 * <p>Stores values that only a web page has as well as details that all publications have.</p>
 *
 * @author Andrew Kay
 */
public class WebPage extends Publication {
    private final String url;
    private final String dateAccessed;

    /**
     * Constructor to make a model of a web page using the publisher class.
     * @param authors authors of the web page
     * @param title title of the web page
     * @param year year the web page was published or last updated
     * @param url link to the web page
     * @param dateAccessed data the user accessed the web page as it may get updated
     */
    public WebPage(
        List<Author> authors, String title, int year,
        String url, String dateAccessed
    ) {
        super(authors, title, year);
        this.url = url;
        this.dateAccessed = dateAccessed;
    }

    /**
     * Returns a url link to the web page being referenced.
     * @return url link to the web page
     */
    public String getURL() {
        return url;
    }

    /**
     * Returns the date the web page was accessed.
     * @return date the user accessed the web page
     */
    public String getDateAccessed() {
        return dateAccessed;
    }

    /**
     * Creates a harvard style reference for a web page.
     * Uses the reference format from publication, then adds the format for a web page.
     * @return reference of the web page
     */
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " Available at: " + url;
        reference += " [Accessed " + dateAccessed + "].";
        
        return reference;
    }
}
