package bcu.harvardreferencing;

/**
 * Interface to show the different type of authors.
 * <p>Either an authors full name is needed for an individual author or a cite name for an institutional author.
 * An example of an individual author is Charles Dickens and an institutional author could be Oracle.</p>
 *
 * @author Andrew Kay
 */
public interface Author {
    /**
     * Return the authors full name.
     * @return authors full name
     */
    public String fullName();

    /**
     * Return the authors name formatted for citations.
     * @return authors name formatted for citations
     */
    public String citeName();
}
