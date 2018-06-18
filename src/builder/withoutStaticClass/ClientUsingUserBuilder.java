package builder.withoutStaticClass;

public class ClientUsingUserBuilder {

	public static void main(String[] args) 
	{
		User user1= new User().withFirstName("Jitesh").withAge(27);
		
		User user2= new User().withFirstName("Jitesh").withLastName("Badgujar").withId(123);
		
		System.out.println("User 1:"+user1);
		
		System.out.println("User 2:"+user2);
	}

}
