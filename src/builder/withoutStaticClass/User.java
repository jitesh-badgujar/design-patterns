package builder.withoutStaticClass;

public class User 
{
	int id;
	String firstName;
	String lastName;
	int age;
	
	public User() 
	{
		
	}

	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public String getLastName() {
		return lastName;
	}

	public User withId(int id) {
		this.id = id;
		return this;
	}

	public User withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public User withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public User withAge(int age) {
		this.age = age;
		return this;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
