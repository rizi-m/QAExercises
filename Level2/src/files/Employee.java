package files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;



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
	
	public static void writeEmployeesToFile(List<Employee> employees, String file) {
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
	
	public static List<Employee> readEmployeesFromFile(String fileName) {
		Path filePath = Paths.get(fileName);
		try {
			List<String> employeeData = Files.readAllLines(filePath);
			return employeeData.stream()
					.map(Employee::csvToObject)
					.collect(toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList();
	}
	
	private static Employee csvToObject(String csv) {
		String[] splitCSV = csv.split(",");
		String name = splitCSV[0];
		String occupation = splitCSV[1];
		int age = Integer.parseInt(splitCSV[2]);
		return new Employee(name, occupation, age);
	}
	
	public static void main(String[] args) {
		String file = "employees.txt";
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rizwan", "Software Developer", 22));
		employees.add(new Employee("Patrick", "Senior Consultant", 22));
		employees.add(new Employee("Bob", "Builder", 30));
		employees.add(new Employee("Luca", "Security Expert", 45));
		employees.add(new Employee("Robert", "Database Designer", 27));
		
		writeEmployeesToFile(employees, file);
		
		List<Employee> employeesFromFile = readEmployeesFromFile(file);
		employeesFromFile.forEach(System.out::println);
		
	}
	

	
}
