package singleton;

public class SingletonDemo {

	public static void main(String[] args) 
	{
		Singleton singleton =Singleton.getInstance();
		Singleton singleton1 =Singleton.getInstance();
		singleton.show();
		singleton1.show();
	}

}
