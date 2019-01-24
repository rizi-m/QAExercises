package main;
import java.util.ArrayList;

public class WorkingPerson {
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

	public WorkingPerson(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old working as " + jobTitle;
	}
	
	public static WorkingPerson findPersonByName(ArrayList<WorkingPerson> people, String name) {
		for(WorkingPerson person : people) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		WorkingPerson person1 = new WorkingPerson("Rizwan Mahmood", 22, "Software Developer");
		WorkingPerson person2 = new WorkingPerson("Patrick S", 22, "Senior Consultant");
		
		ArrayList<WorkingPerson> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		
		for(WorkingPerson person : people) {
			System.out.println(person);
		}
		
		WorkingPerson foundPerson = WorkingPerson.findPersonByName(people, "Rizwan Mahmood");
		System.out.println(foundPerson);
	}
}
