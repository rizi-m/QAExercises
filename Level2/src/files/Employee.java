package files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private String name;
	private String occupation;
	private int age;
	
	public Employee(String name, String occupation, int age) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name+","+occupation+","+age;
	}
	
	public static void writeEmployeesToFile(ArrayList<Employee> employees, String file) {
		try {
			FileWriter writer = new FileWriter(file);
			for(Employee employee : employees) {
				writer.write(employee + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public static List<String> readEmployeesFromFile(String fileName) {
		Path filePath = Paths.get(fileName);
		try {
			return Files.readAllLines(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList();
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rizwan", "Software Developer", 22));
		employees.add(new Employee("Patrick", "Senior Consultant", 22));
		employees.add(new Employee("Bob", "Builder", 30));
		employees.add(new Employee("Luca", "Security Expert", 45));
		employees.add(new Employee("Robert", "Database Designer", 27));
		
		writeEmployeesToFile(employees, "employees.txt");
		
		
		
	}
	

}