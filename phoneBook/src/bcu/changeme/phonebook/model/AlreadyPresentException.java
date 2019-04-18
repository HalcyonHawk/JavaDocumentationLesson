package bcu.changeme.phonebook.model;

/**
 * Thrown when trying to add an entry to the phone book, but an entry of that name is already present.
 * <p>The name may already be present with different capitalisation</p>
 */
public class AlreadyPresentException extends Exception {
	private final String name;

	/**
	 * Creates an {@code AlreadyPresentException}, given the person's name.
	 * @param name the name that is already present in the phone book
	 */
	public AlreadyPresentException(String name) {
		this.name = name;
	}

	/**
	 * Returns name of person who was already present.
	 * @return the name of person who was already present
	 */
	public String getName() {
		return name;
	}
}
