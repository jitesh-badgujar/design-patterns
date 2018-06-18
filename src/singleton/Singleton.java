package singleton;

public class Singleton 
{
	public static Singleton singleton=null;
	
	private Singleton()
	{
		System.out.println("Singleton private constructor called!");
	}
	public static Singleton getInstance()
	{
		if(singleton==null)
		{
			singleton= new Singleton();
		}
		return singleton;
	}
	public static void show()
	{
		System.out.println("Show method called");
	}
}
