package library.source;

public abstract class LibraryItem {
	
	static int id;
	
	private int numberOfPages;
	private String datePublished;
	private String name;
	private String publisher;
	

	
	public LibraryItem(String name, String publisher, String datePublished, int numberOfPages) {
		checkInputs(datePublished, numberOfPages);
		this.name = name;
		this.publisher = publisher;
		this.datePublished = datePublished;
		this.numberOfPages = numberOfPages;
	}
	
	private static void checkInputs(String date, int numberOfPages) {
		Utils.checkPositive(numberOfPages, "number of pages");
		Utils.checkDate(date);
	}
	
	public static int getId() {
		return id;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public LibraryItem setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
		return this;
	}
	public String getDatePublished() {
		return datePublished;
	}
	public LibraryItem setDatePublished(String datePublished) {
		this.datePublished = datePublished;
		return this;
	}
	public String getName() {
		return name;
	}
	public LibraryItem setName(String name) {
		this.name = name;
		return this;
	}
	public String getPublisher() {
		return publisher;
	}
	public LibraryItem setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}
	
}
