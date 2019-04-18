package bcu.changeme.phonebook.model;

import java.util.*;

/**
 * This class models a phone book, which stores a phone number associated with
 * each name.
 *
 * <p>The phone book stores single phone number for each name.</p>
 * <p>Names are case-insensitive when used to get, update or remove an
 * entry, but the phone book stores names with their original capitalisation.
 * </p>
 * <p>For example, calling {@code phoneBook.addEntry("Alice", "555-1234")} and then
 * {@code phoneBook.getEntry("alice")} returns the entry which has name {@code "Alice"} capitalised</p>
 *
 * @author Tilly Davies and Hubert Dudowicz
 * @see PhoneBookEntry
 */
public class PhoneBook {
	private final Map<String, PhoneBookEntry> entries = new HashMap<>();

	//default constructor described in documentation. Then written in code so it can be documented correctly
    /**
     * Creates empty phone book.
     */
	public PhoneBook(){

    }

	/**
	 * Adds an entry to the phone book, given the name and phone number.
	 * @param name the person's name
	 * @param phoneNumber the person's phone number
	 * @throws AlreadyPresentException if that name is already present
	 */
	public void addEntry(String name, String phoneNumber) throws AlreadyPresentException {
		String key = name.toUpperCase();
		if(entries.containsKey(key)) {
			throw new AlreadyPresentException(name);
		}
		
		PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);
		entries.put(key, entry);
	}
	
	/**
	 * Gets an entry from the phone book, given the name.
	 * @param name the person's name
	 * @return Phone book entry that matches name given
	 * @throws NotPresentException if that name is not present
	 */
	public PhoneBookEntry getEntry(String name) throws NotPresentException {
		String key = name.toUpperCase();
		requireKeyExists(key);
		return entries.get(key);
	}
	
	/**
	 * Updates an entry, given the name and a new phone number.
	 * @param name the person's name
	 * @param phoneNumber the person's phone number
	 * @throws NotPresentException if that name is not present
	 */
	public void updateEntry(String name, String phoneNumber) throws NotPresentException {
		getEntry(name).setPhoneNumber(phoneNumber);
	}
	
	/**
	 * Removes an entry from the phone book, given the name.
	 * @param name the person's name
	 * @throws NotPresentException if that name is not present
	 */
	public void removeEntry(String name) throws NotPresentException {
		String key = name.toUpperCase();
		requireKeyExists(key);
		entries.remove(key);
	}
	
	/**
	 * Returns list of names in the phone book
	 * <p>The list returned is in alphabetical order and is unmodifiable</p>
	 * @return list of all names
	 */
	public List<String> getAllNames() {
		List<String> names = new ArrayList<>();
		for(PhoneBookEntry entry : entries.values()) {
			names.add(entry.getName());
		}
		Collections.sort(names);
		return Collections.unmodifiableList(names);
	}
	
	private void requireKeyExists(String key) throws NotPresentException {
		if(!entries.containsKey(key)) {
			throw new NotPresentException(key);
		}
	}
}
