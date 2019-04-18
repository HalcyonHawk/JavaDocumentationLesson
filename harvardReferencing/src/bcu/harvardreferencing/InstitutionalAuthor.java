package bcu.harvardreferencing;

/**
 * Model of an institutional author.
 * <p>Only need a name as it is the name of a company.</p>
 *
 * @author Andrew Kay
 */
public class InstitutionalAuthor implements Author {
    private final String name;

    /**
     * Institutional author name. For example, Oracle.
     * @param name name of institutional author
     */
    public InstitutionalAuthor(String name) {
        this.name = name;
    }

    /**
     * Institutional author full name. This is the same as the cite name.
     *@return name of institutional author
     */
    @Override
    public String fullName() {
        return name;
    }

    /**
     * Institutional author cite name. This is the same as the full name.
     *@return name of institutional author
     */
    @Override
    public String citeName() {
        return name;
    }
}
