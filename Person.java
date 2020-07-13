package CSC143ClassProject;

public class Person {
	
	// For encapsulation, it is good to keep class attributes private.
	private String name; 
	private String age;
	
	// You will need at least one constructor
	public Person() {
		this.name = "Unknown"; 
	}
	
	public Person(String personName) {
		this.name = personName;
	}
	
	
	// Since 'name' is private, you need accessor and mutator methods.
	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String personName) {
		this.name = personName;
	}
	
	// It's good to have a "String representation" for your object.
	// Since this class only has a name attribute right now:
	public String toString() {
		return("My name is: " + this.name);
	}

}
