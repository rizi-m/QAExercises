package library.source;

public class Person {
	
	private String name;
	private String dateOfBirth;
	private String ssn;
	
	public Person(String name, String ssn, String dateOfBirth) {
		checkInputs(dateOfBirth);
		this.name = name;
		this.ssn = ssn;
		this.dateOfBirth = dateOfBirth;
	}
	
	private static void checkInputs(String dateOfBirth) {
		Utils.checkDate(dateOfBirth);
	}
	
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public Person setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public String getSsn() {
		return ssn;
	}

	public Person setSsn(String ssn) {
		this.ssn = ssn;
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
		if (obj instanceof Person) {
			Person other = (Person) obj;
			return this.name.equals(other.name) &&
					this.ssn.equals(other.ssn) &&
					this.dateOfBirth.equals(other.dateOfBirth);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
