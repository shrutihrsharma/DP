package singleton.ex1;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		System.out.println("The Singleton is created..");
	}

	public static Singleton instance() {
		if (instance == null) {
			instance= new Singleton();
			return instance;
			
		} else {
			return instance;
		}
	}
}
