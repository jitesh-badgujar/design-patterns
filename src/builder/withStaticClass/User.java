package builder.withStaticClass;


public class User
{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public User(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public static class UserBuilder
	{
		private  int id;
		private  int age;
		private  String firstName;
		private  String lastName;

		public UserBuilder withId(int id) {
			this.id = id;
			return this;
		}

		public UserBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder withLastName(String lastName) {
			this.lastName=lastName;
			return this;
		}

		public UserBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		

		public User build()
		{
			return new User(id, firstName, lastName, age);
		}
	}
	@Override
	public String toString() {
		return "UserBuilder [id=" + id + ", age=" + age + ", lastName=" + lastName + ", firstName=" + firstName
				+ "]";
	}
	
}
