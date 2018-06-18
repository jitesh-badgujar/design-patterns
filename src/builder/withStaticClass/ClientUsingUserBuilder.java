package builder.withStaticClass;

public class ClientUsingUserBuilder {

	public static void main(String[] args) 
	{
		User user1= new User.UserBuilder().withFirstName("Jitesh").withAge(27).build();
		
		User user2= new User.UserBuilder().withFirstName("Jitesh").withLastName("Badgujar").withId(123).build();
		
		System.out.println("User 1:"+user1);
		
		System.out.println("User 2:"+user2);
	}

}
