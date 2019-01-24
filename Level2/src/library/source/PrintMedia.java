package library.source;

public class PrintMedia extends LibraryItem {
	
	private String dateReleased;
	private PrintMediaType type;
	
	public PrintMedia(String name, String publisher, String datePublished, int numberOfPages, PrintMediaType type,
			String dateReleased) {
		super(name, publisher, datePublished, numberOfPages);
		checkInputs(dateReleased);
		this.type = type;
		this.dateReleased = dateReleased;
	}
	
	private static void checkInputs(String dateReleased) {
		Utils.checkDate(dateReleased);
	}

	public String getDateReleased() {
		return dateReleased;
	}
	
	public PrintMedia setDateReleased(String dateReleased) {
		this.dateReleased = dateReleased;
		return this;
	}
	
	public PrintMediaType getType() {
		return type;
	}
	
	public PrintMedia setType(PrintMediaType type) {
		this.type = type;
		return this;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof PrintMedia) {
			PrintMedia other = (PrintMedia) obj;
			return this.type == other.getType() &&
					this.dateReleased.equals(other.getDateReleased()) &&
					this.getName().equals(other.getName()) &&
					this.getPublisher().equals(other.getPublisher()) &&
					this.getDatePublished().equals(other.getDatePublished());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}

enum PrintMediaType {
	NEWS_PAPER,
	MAGAZINE
}