package bcu.changeme.phonebook.model;
//Java documentation. Use /** instead of /* for multiline comments

/**
 * Models a single entry in the phone book.
 *
 * <p>A phone book entry has a name and a phone number.</p>
 *
 * @author Tilly Davies and Hubert Dudowicz
 * @see PhoneBook
 */
public class PhoneBookEntry {
	private final String name;
	private String phoneNumber;

	/**
	 * Creates a phone book entry.
	 * @param name the person's name
	 * @param phoneNumber the person's phone number
	 */
	public PhoneBookEntry(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}

	/**
	 * Returns the person's name.
	 * @return the person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the person's phone number.
	 * @return the person's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the person's phone number.
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
