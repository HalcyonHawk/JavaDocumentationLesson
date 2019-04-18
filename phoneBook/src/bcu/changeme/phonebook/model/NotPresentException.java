package bcu.changeme.phonebook.model;

/**
 * Thrown when trying to get, update or remove an entry from the phone book, but no entry of that name exists.
 */
public class NotPresentException extends Exception {
	private final String name;

	/**
	 * Creates a {@code NotPresentException}, given the person's name.
	 * @param name the name of the person not present in the phone book
	 */
	public NotPresentException(String name) {
		this.name = name;
	}

	/**
	 * Returns name of person not present in the phone book.
	 * @return name the name of the person not present in the phone book
	 */
	public String getName() {
		return name;
	}
}
