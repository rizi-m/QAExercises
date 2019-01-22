import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old working as " + jobTitle;
	}
	
	public static Person findPersonByName(ArrayList<Person> people, String name) {
		for(Person person : people) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("Rizwan Mahmood", 22, "Software Developer");
		Person person2 = new Person("Patrick S", 22, "Senior Consultant");
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		Person foundPerson = Person.findPersonByName(people, "Rizwan Mahmood");
		System.out.println(foundPerson);
	}
}
