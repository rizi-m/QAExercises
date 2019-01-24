package library.source;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.of;
import static java.util.Optional.empty;

import static java.util.stream.Collectors.toList;

public class Library {
	
	List<Book> books = new ArrayList<>();
	List<PrintMedia> newsPapers = new ArrayList<>();
	List<PrintMedia> magazines = new ArrayList<>();
	List<Person> people = new ArrayList<>();
	
	public List<Book> getBooks() {
		return books;
	}

	public List<PrintMedia> getNewsPapers() {
		return newsPapers;
	}

	public List<PrintMedia> getMagazines() {
		return magazines;
	}

	public List<Person> getPeople() {
		return people;
	}

	public Optional<Book> checkOut(Book book) {
		if (books.contains(book)) {
			books.remove(book);
			return of(book);
		}
		return empty();
	}
	
	public void checkIn(Book book) {
		books.add(book);
	}
	
	public void add(Book book) {
		checkIn(book);
	}
	
	public void add(PrintMedia item) {
		switch (item.getType()) {
		case NEWS_PAPER: newsPapers.add(item);
			break;
		case MAGAZINE: magazines.add(item);
			break;
		}
	}
		
	public Optional<Book> remove(Book book) {
		return checkOut(book);
	}
	
	public Optional<PrintMedia> remove(PrintMedia item) {
		switch (item.getType()) {
			case NEWS_PAPER: return removePrintMedia(item, newsPapers);
			case MAGAZINE: return removePrintMedia(item, magazines);
		}
		return empty();
	}

	private Optional<PrintMedia> removePrintMedia(PrintMedia item, List<PrintMedia> items) {
		if (items.contains(item)) {
			items.remove(item);
			return of(item);
		}
		return empty();
	}
	

	
	public boolean update(Book book, Modifier<Book> modifier) {
		boolean isBookUpdated = books.contains(book);
		Book modified = modifier.modiy(book);
		books = books.stream()
				.map(bookElement -> (book.equals(bookElement)) ? modified : bookElement)
				.collect(toList());
		return isBookUpdated;
	}
	
	
	public boolean update(PrintMedia item, Modifier<PrintMedia> modifier) {
		switch (item.getType()) {
			case NEWS_PAPER: return updatePrintMedia(item, newsPapers, modifier);
			case MAGAZINE: return updatePrintMedia(item, magazines, modifier);
		}
		return false;
	}
	

	private boolean updatePrintMedia(PrintMedia item, List<PrintMedia> items, Modifier<PrintMedia> modifier) {
		PrintMedia modified = modifier.modiy(item);
		boolean isItemUpdated = items.contains(item);
		items = items.stream()
				.map(newspaper -> (modified.equals(newspaper)) ? modified : newspaper)
				.collect(toList());
		return isItemUpdated;
	}


	public boolean register(Person person) {
		if (!people.contains(person)) {
			people.add(person);
			return true;
		}
		return false;
	}
	
	public Optional<Person> delete(Person person) {
		if (people.contains(person)) {
			people.remove(person);
			return of(person);
		}
		return empty();
	}
	
	public boolean update(Person person, Modifier<Person> modifier) {
		boolean isPersonUpdated = people.contains(person);
		Person modified = modifier.modiy(person);
		people = people.stream()
				.map(personElement -> (person.equals(personElement)) ? modified : personElement)
				.collect(toList());
		return isPersonUpdated;
	}
	
}


interface Modifier<T> {
	public T modiy(T o);
}


