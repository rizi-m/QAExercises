package library.source;

public class Main {
	public static void main(String[] args) {
		
		Library lib = new Library();
		PrintMedia item1 = new PrintMedia("Magazine", "Publisher", "01/01/1990", 20, PrintMediaType.MAGAZINE, "01/10/2000");
		PrintMedia item2 = new PrintMedia("Magazine1", "Publisher", "01/01/1990", 20, PrintMediaType.MAGAZINE, "01/10/2000");
		PrintMedia item3 = new PrintMedia("Magazine2", "Publisher", "01/01/1990", 20, PrintMediaType.MAGAZINE, "01/10/2000");
		PrintMedia item4 = new PrintMedia("Magazine3", "Publisher", "01/01/1990", 20, PrintMediaType.MAGAZINE, "01/10/2000");
		PrintMedia item5 = new PrintMedia("Magazine4", "Publisher", "01/01/1990", 20, PrintMediaType.MAGAZINE, "01/10/2000");
		Book book0 = new Book("Great Book", "Writer4", "Pengwin", "01/01/2016", 4, 30);
		Book book1 = new Book("Great Book1", "Write3r", "Pengwin", "01/01/2016", 4, 30);
		Book book2 = new Book("Great Book2", "Writer2", "Pengwin", "01/01/2016", 4, 30);
		Book book3 = new Book("Great Book3", "Write4r", "Pengwin", "01/01/2016", 4, 30);
		Book book4 = new Book("Great Boo4", "Writer1", "Pengwin", "01/01/2016", 4, 30);
		lib.add(item1);
		lib.add(item2);
		lib.add(item3);
		lib.add(item4);
		lib.add(item5);
		System.out.println(lib.getMagazines());
		lib.update(item1, (item) -> (PrintMedia) item.setName("Changed Mag"));
		System.out.println(lib.getMagazines());
		lib.remove(item1);
		System.out.println(lib.getMagazines());
		
		lib.add(book1);
		lib.add(book2);
		lib.add(book3);
		lib.add(book0);
		lib.add(book4);
		
		Person p1 = new Person("person1", "1010101d01d01d0", "12/01/1996");
		Person p2 = new Person("person2", "12f31d01d01d03f", "01/01/1996");
		Person p3 = new Person("person3", "10101023d01d0f2", "01/01/1996");
		Person p4 = new Person("person4", "1010f23d01d01d0", "01/01/1996");
		 
		lib.register(p1);
		lib.register(p2);
		lib.register(p3);
		lib.register(p4);
		
		System.out.println(lib.getPeople());
		
		lib.update(p3, person -> person.setName("Changed name"));
		
		System.out.println(lib.getPeople());
		
		lib.delete(p2);
		
		System.out.println(lib.getPeople());
	}
	
}
