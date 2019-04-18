package bcu.harvardreferencing;

/**
 * Model of an individual author.
 * <p>Can be used to make a list of individual authors.</p>
 *
 * @author Andrew Kay
 */
public class IndividualAuthor implements Author {
    private final String lastName;
    private final String initials;

    /**
     * Authors name made by setting the last name and initials of first name and any middle names
     * @param lastName authors last name
     * @param initials authors initials except for last name
     */
    public IndividualAuthor(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }

    /**
     * Authors name formatted for referencing
     * <p>This is done by showing the last name followed
     * by initials of first name and any middle names. For example Kunth, D.</p>
     * @return Authors full name
     */
    @Override
    public String fullName() {
        return lastName + ", " + initials;
    }

    /**
     * Authors name formatted for a citation.
     * @return the authors last name
     */
    @Override
    public String citeName() {
        return lastName;
    }
}
