package library.source;


public class Book extends LibraryItem{
	
	private String author;
	private int chapters;
	

	
	public Book(String name, String author, String publisher, String datePublished, int chapters, int numberOfPages) {
		super(name, publisher, datePublished, numberOfPages);
		checkInputs(chapters);
		this.author = author;
		this.chapters = chapters;
	}
	
	private static void checkInputs(int chapters) {
		Utils.checkPositive(chapters, "number of chapters");
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Book) {
			Book other = (Book) obj;
			return this.author.equals(other.getAuthor()) &&
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
