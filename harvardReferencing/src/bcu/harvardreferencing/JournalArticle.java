package bcu.harvardreferencing;

import java.util.List;

/**
 * Model of a journal article harvard reference.
 * <p>Stores values that only a journal article has as well as details that all publications have.</p>
 *
 * @author Andrew Kay
 */
public class JournalArticle extends Publication {
    private final String journalName;
    private final int volume;
    private final int issue;
    private final int pageFrom;
    private final int pageTo;

    /**
     * Constructor to make a model of a journal article using the publisher class.
     * <p>Takes the author, title and year from Publication. Also has features only a journal article has.</p>
     * @param authors list of the authors of the journal article
     * @param title of the journal article
     * @param year the journal article was published
     * @param journalName name of the journal article
     * @param volume volume of the journal article
     * @param issue issue number of the journal article
     * @param pageFrom page of the journal article the reference starts from
     * @param pageTo page of the journal article the reference ends at
     */
    public JournalArticle(
        List<Author> authors, String title, int year,
        String journalName, int volume, int issue, int pageFrom, int pageTo
    ) {
        super(authors, title, year);
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
        this.pageFrom = pageFrom;
        this.pageTo = pageTo;
    }

    /**
     * Returns the name of the journal article.
     * @return name of the journal article
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * Returns the volume of the journal article.
     * @return volume of the journal article
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Returns the issue number of the journal article.
     * @return issue of the journal article
     */
    public int getIssue() {
        return issue;
    }

    /**
     * Returns the starting page of the reference of the journal article.
     * @return page reference starts in journal article
     */
    public int getPageFrom() {
        return pageFrom;
    }

    /**
     * Returns the ending page of the reference of the journal article.
     * @return page reference ends in journal article
     */
    public int getPageTo() {
        return pageTo;
    }

    /**
     * Creates a harvard style reference for a journal article.
     * Uses the reference format from publication, then adds the format for a journal article.
     * @return reference of the journal article
     */
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " " + journalName + ", ";
        reference += volume + "(" + issue + "), ";
        reference += "pp. " + pageFrom + "-" + pageTo + ".";
        
        return reference;
    }
}
